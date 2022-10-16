package com.apedev.apecraft.weapons;

import com.apedev.apecraft.ApecraftMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class SwordBase extends SwordItem {
    public SwordBase(Tier toolMaterial) {
        super(toolMaterial, 4, 3.0f, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    }
}
