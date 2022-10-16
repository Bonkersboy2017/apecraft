package com.apedev.apecraft.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;

public class BigMonke extends BaseMonke {

    public BigMonke(EntityType<? extends BigMonke> entityType, Level world) {
        super(entityType, world);
    }

    public static AttributeSupplier.Builder addAttributes() {
        return BaseMonke.addAttributes()
                .add(Attributes.MAX_HEALTH, 15.0F);
    }
}
