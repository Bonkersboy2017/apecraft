package com.apedev.apecraft.registry.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class KingKongEntity  extends PathAwareEntity {
    public KingKongEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}

