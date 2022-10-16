package com.apedev.apecraft.armor;

import com.apedev.apecraft.ApecraftMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;

public class BaseArmor extends ArmorItem {
    public BaseArmor(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    }
}
