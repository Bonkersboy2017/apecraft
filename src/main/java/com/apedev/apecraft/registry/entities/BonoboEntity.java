package com.apedev.apecraft.registry.entities;

import com.apedev.apecraft.items.RegisterItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.recipe.Ingredient;
import net.minecraft.world.World;

public class BonoboEntity extends PathAwareEntity {
    public BonoboEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }


    protected void initGoals() {
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 0.4D));
        this.goalSelector.add(4, new TemptGoal(this, 0.7D, Ingredient.ofItems(RegisterItems.TWINE), false));
    }
}
