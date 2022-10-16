package com.apedev.apecraft.weapons;

import com.apedev.apecraft.ApecraftMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class PickaxeBase extends PickaxeItem {
    public PickaxeBase(Tier toolMaterial) {
        super(toolMaterial, 1, -2.2f, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    }
}
