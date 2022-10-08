package com.apedev.apecraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class GorillaEntity extends BigMonke {
    public GorillaEntity(EntityType<? extends GorillaEntity> entityType, World world) {
        super(entityType, world);
    }
}