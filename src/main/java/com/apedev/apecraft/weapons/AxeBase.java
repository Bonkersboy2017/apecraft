package com.apedev.apecraft.weapons;



import com.apedev.apecraft.ApecraftMod;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem {
    public AxeBase(ToolMaterial toolMaterial) {
        super(toolMaterial, 1, -2.2f, new Item.Settings().group(ApecraftMod.ITEM_GROUP));
    }
}
