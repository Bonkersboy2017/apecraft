package com.apedev.apecraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.world.World;

public class BigMonke extends BaseMonke {

    public BigMonke(EntityType<? extends BigMonke> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder addAttributes() {
        return BaseMonke.addAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 15.0F);
    }
}
