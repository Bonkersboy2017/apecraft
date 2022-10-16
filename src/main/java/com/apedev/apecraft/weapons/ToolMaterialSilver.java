package com.apedev.apecraft.weapons;

import com.apedev.apecraft.items.RegisterItems;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class ToolMaterialSilver implements Tier {

    @Override
    public int getUses() {
        return 200;
    }

    @Override
    public float getSpeed() {
        return 7.0f;
    }

    @Override
    public float getAttackDamageBonus() {
        return 1.5f;
    }

    @Override
    public int getLevel() {
        return 3;
    }

    @Override
    public int getEnchantmentValue() {
        return 5;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(RegisterItems.SILVER_INGOT);
    }
}
