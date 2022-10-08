package com.apedev.apecraft.weapons;

import com.apedev.apecraft.items.RegisterItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialSilver implements ToolMaterial {

    @Override
    public int getDurability() {
        return 200;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0f;
    }

    @Override
    public float getAttackDamage() {
        return 1.5f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 5;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RegisterItems.SILVER_INGOT);
    }
}
