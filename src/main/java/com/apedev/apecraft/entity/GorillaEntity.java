package com.apedev.apecraft.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class GorillaEntity extends BigMonke {
    public GorillaEntity(EntityType<? extends GorillaEntity> entityType, Level world) {
        super(entityType, world);
    }
}