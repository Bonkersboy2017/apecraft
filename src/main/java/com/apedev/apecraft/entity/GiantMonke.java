package com.apedev.apecraft.entity;

import com.apedev.apecraft.items.RegisterItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.recipe.Ingredient;
import net.minecraft.world.World;

public class GiantMonke extends BigMonke {
    public GiantMonke(EntityType<? extends GiantMonke> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 1));
        this.goalSelector.add(4, new TemptGoal(this, 0.7D, Ingredient.ofItems(RegisterItems.TWINE), false));
        this.goalSelector.add(6, new WanderAroundFarGoal(this, 0.4D));
        this.goalSelector.add(7, new LookAtEntityGoal(this, PlayerEntity.class, 16.0F));
        this.goalSelector.add(8, new LookAroundGoal(this));
    }

    public static DefaultAttributeContainer.Builder addAttributes() {
        return BigMonke.addAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 35.0F);
    }
}
