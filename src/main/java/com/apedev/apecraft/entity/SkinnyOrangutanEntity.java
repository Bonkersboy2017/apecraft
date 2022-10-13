package com.apedev.apecraft.entity;

import com.apedev.apecraft.items.RegisterItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.recipe.Ingredient;
import net.minecraft.world.World;

public class SkinnyOrangutanEntity extends BaseMonke {
    public SkinnyOrangutanEntity(EntityType<? extends SkinnyOrangutanEntity> entityType, World world) {
        super(entityType, world);
    }

    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 1));
        this.goalSelector.add(4, new TemptGoal(this, 0.7D, Ingredient.ofItems(RegisterItems.TWINE), false));
        this.goalSelector.add(6, new WanderAroundFarGoal(this, 0.4D));
        this.goalSelector.add(7, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(8, new LookAroundGoal(this));
    }
}