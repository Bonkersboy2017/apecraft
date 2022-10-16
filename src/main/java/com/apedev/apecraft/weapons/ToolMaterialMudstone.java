package com.apedev.apecraft.weapons;


import com.apedev.apecraft.items.RegisterItems;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class ToolMaterialMudstone implements Tier {

    @Override
    public int getUses() {
        return 100;
    }

    @Override
    public float getSpeed() {
        return 5.0f;
    }

    @Override
    public float getAttackDamageBonus() {
        return 1.0f;
    }

    @Override
    public int getLevel() {
        return 2;
    }

    @Override
    public int getEnchantmentValue() {
        return 5;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(RegisterItems.BANANA);
    }
}
