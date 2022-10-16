package com.apedev.apecraft.weapons;

import com.apedev.apecraft.ApecraftMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class ShovelBase extends ShovelItem {
    public ShovelBase(Tier toolMaterial) {
        super(toolMaterial, 1, -2.2f, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    }
}
