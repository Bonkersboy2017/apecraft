package com.apedev.apecraft.weapons;

import com.apedev.apecraft.ApecraftMod;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem {
    public ShovelBase(ToolMaterial toolMaterial) {
        super(toolMaterial, 1, -2.2f, new Item.Settings().group(ApecraftMod.ITEM_GROUP));
    }
}
