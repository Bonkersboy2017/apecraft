package com.apedev.apecraft.entity;

import com.apedev.apecraft.items.RegisterItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public class BaseMonke extends PathAwareEntity {

    public BaseMonke(EntityType<? extends BaseMonke> entityType, World world) {
        super(entityType, world);
        this.experiencePoints = 3;
        this.getNavigation().setCanSwim(true);
        this.setPathfindingPenalty(PathNodeType.UNPASSABLE_RAIL, 0.0F);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 1.2));
        this.goalSelector.add(4, new TemptGoal(this, 0.7D, Ingredient.ofItems(RegisterItems.TWINE), false));
        this.goalSelector.add(6, new WanderAroundFarGoal(this, 0.4D));
        this.goalSelector.add(7, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(8, new LookAroundGoal(this));
    }

    public static DefaultAttributeContainer.Builder addAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25F)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 0.55F)
                .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 1.25);
    }

    @Override
    public boolean canSpawn(WorldView world) {
        return super.canSpawn(world) && world.isSpaceEmpty(this, this.getType().getDimensions().getBoxAt(this.getPos()));
    }

    public static <T extends BaseMonke> boolean spawnRestriction(EntityType<T> type, WorldView world, SpawnReason reason, BlockPos pos, Random random) {
        return true;
    }

    @Override
    public float getPathfindingFavor(BlockPos pos, WorldView world) {
        return 0.0F;
    }

    @Contract("null->false")
    public boolean isValidTarget(@Nullable Entity entity) {
        return entity instanceof LivingEntity livingEntity
                && this.world == entity.world
                && EntityPredicates.EXCEPT_CREATIVE_OR_SPECTATOR.test(entity)
                && !this.isTeammate(entity)
                && livingEntity.getType() != EntityType.ARMOR_STAND
                && livingEntity.getType() != this.getType()
                && !livingEntity.isInvulnerable()
                && !livingEntity.isDead()
                && this.world.getWorldBorder().contains(livingEntity.getBoundingBox());
    }
}
