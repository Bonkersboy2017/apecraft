package com.apedev.apecraft.entity;

import com.apedev.apecraft.items.RegisterItems;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public class BaseMonke extends PathfinderMob {

    public BaseMonke(EntityType<? extends BaseMonke> entityType, Level world) {
        super(entityType, world);
        this.xpReward = 3;
        this.getNavigation().setCanFloat(true);
        this.setPathfindingMalus(BlockPathTypes.UNPASSABLE_RAIL, 0.0F);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.2));
        this.goalSelector.addGoal(4, new TemptGoal(this, 0.7D, Ingredient.of(RegisterItems.TWINE), false));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 0.4D));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
    }

    public static AttributeSupplier.Builder addAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 10.0)
                .add(Attributes.MOVEMENT_SPEED, 0.25F)
                .add(Attributes.KNOCKBACK_RESISTANCE, 0.55F)
                .add(Attributes.ATTACK_KNOCKBACK, 1.25);
    }

    @Override
    public boolean checkSpawnObstruction(LevelReader world) {
        return super.checkSpawnObstruction(world) && world.noCollision(this, this.getType().getDimensions().makeBoundingBox(this.position()));
    }

    public static <T extends BaseMonke> boolean spawnRestriction(EntityType<T> type, LevelReader world, MobSpawnType reason, BlockPos pos, RandomSource random) {
        return true;
    }

    @Override
    public float getWalkTargetValue(BlockPos pos, LevelReader world) {
        return 0.0F;
    }

    @Contract("null->false")
    public boolean isValidTarget(@Nullable Entity entity) {
        return entity instanceof LivingEntity livingEntity
                && this.level == entity.level
                && EntitySelector.NO_CREATIVE_OR_SPECTATOR.test(entity)
                && !this.isAlliedTo(entity)
                && livingEntity.getType() != EntityType.ARMOR_STAND
                && livingEntity.getType() != this.getType()
                && !livingEntity.isInvulnerable()
                && !livingEntity.isDeadOrDying()
                && this.level.getWorldBorder().isWithinBounds(livingEntity.getBoundingBox());
    }
}
