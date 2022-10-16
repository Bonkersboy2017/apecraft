package com.apedev.apecraft.items;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.registry.RegisterEntities;
import com.apedev.apecraft.armor.BaseArmor;
import com.apedev.apecraft.armor.SilverArmorMaterial;
import com.apedev.apecraft.food.ModFoodComponents;
import com.apedev.apecraft.weapons.*;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

public class RegisterItems {


    public static final Item TWINE = new Item(new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item SPEAR = new Item(new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item BANANA = new Item(new Item.Properties().tab(ApecraftMod.ITEM_GROUP).food(ModFoodComponents.BANANA));
    public static final Item ALBINO_CHIMPANZEE_SPAWN_EGG = new SpawnEggItem(RegisterEntities.ALBINO_CHIMPANZEE, 0xFCF5E5, 0xFFDEAD, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item ALBINO_GORILLA_SPAWN_EGG = new SpawnEggItem(RegisterEntities.ALBINO_GORILLA, 0xFCF5E5, 0x5c4033, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item BONOBO_SPAWN_EGG = new SpawnEggItem(RegisterEntities.BONOBO, 000, 220220220, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item BONOBO_BRUTE_SPAWN_EGG = new SpawnEggItem(RegisterEntities.BONOBO_BRUTE, 220220220, 000, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item CHIMPANZEE_SPAWN_EGG = new SpawnEggItem(RegisterEntities.CHIMPANZEE, 0x5c4033, 0x5c4033, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item CHIMPANZEE_BRUTE_SPAWN_EGG = new SpawnEggItem(RegisterEntities.CHIMPANZEE_BRUTE, 0xFFDEAD, 0x5c4033, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item GIGANTOPITHECUS_SPAWN_EGG = new SpawnEggItem(RegisterEntities.GIGANTOPITHECUS, 0x5c4033, 0xFFDEAD, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item GORILLA_SPAWN_EGG = new SpawnEggItem(RegisterEntities.GORILLA, 000, 0x808080, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item ORANGUTAN_SPAWN_EGG = new SpawnEggItem(RegisterEntities.ORANGUTAN, 0xFFA500, 0xFFD580, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item SKINNY_ORANGUTAN_SPAWN_EGG = new SpawnEggItem(RegisterEntities.SKINNY_ORANGUTAN, 0xFFD580, 0xFFA500, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item KINGKONG_SPAWN_EGG = new SpawnEggItem(RegisterEntities.KINGKONG, 0xC0C0C0, 0x000000, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item GEORGE_SPAWN_EGG = new SpawnEggItem(RegisterEntities.GEORGE, 0xFFFFFF, 0xFFC0CB, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item LANGARMUR_SPAWN_EGG = new SpawnEggItem(RegisterEntities.LANGARMUR, 0x964B00, 0xFFA500, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item BAKULA_SPAWN_EGG = new SpawnEggItem(RegisterEntities.BAKULA, 0x6a6a6a, 0xa9a9a9, new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item SILVER_INGOT = new Item(new Item.Properties().tab(ApecraftMod.ITEM_GROUP));
    public static final Item SNOW_BERRIES = new Item(new Item.Properties().tab(ApecraftMod.ITEM_GROUP).food(ModFoodComponents.SNOW_BERRIES));
    public static final ArmorMaterial SILVER_ARMOR = new SilverArmorMaterial();

    public static void registerAll() {

        Registry.register(Registry.ITEM, ApecraftMod.id("twine"), TWINE);
        Registry.register(Registry.ITEM, ApecraftMod.id("spear"), SPEAR);
        Registry.register(Registry.ITEM, ApecraftMod.id("banana"), BANANA);
        Registry.register(Registry.ITEM, ApecraftMod.id("albino_chimpanzee_spawn_egg"), ALBINO_CHIMPANZEE_SPAWN_EGG);
        Registry.register(Registry.ITEM, ApecraftMod.id("albino_gorilla_spawn_egg"), ALBINO_GORILLA_SPAWN_EGG);
        Registry.register(Registry.ITEM, ApecraftMod.id("bonobo_spawn_egg"), BONOBO_SPAWN_EGG);
        Registry.register(Registry.ITEM, ApecraftMod.id("bonobo_brute_spawn_egg"), BONOBO_BRUTE_SPAWN_EGG);
        Registry.register(Registry.ITEM, ApecraftMod.id("chimpanzee_brute_spawn_egg"), CHIMPANZEE_BRUTE_SPAWN_EGG);
        Registry.register(Registry.ITEM, ApecraftMod.id("chimpanzee_spawn_egg"), CHIMPANZEE_SPAWN_EGG);
        Registry.register(Registry.ITEM, ApecraftMod.id("gigantopithecus_spawn_egg"), GIGANTOPITHECUS_SPAWN_EGG);
        Registry.register(Registry.ITEM, ApecraftMod.id("gorilla_spawn_egg"), GORILLA_SPAWN_EGG);
        Registry.register(Registry.ITEM, ApecraftMod.id("orangutan_spawn_egg"), ORANGUTAN_SPAWN_EGG);
        Registry.register(Registry.ITEM, ApecraftMod.id("skinny_orangutan_spawn_egg"), SKINNY_ORANGUTAN_SPAWN_EGG);
        Registry.register(Registry.ITEM, ApecraftMod.id("kingkong_spawn_egg"), KINGKONG_SPAWN_EGG);
        Registry.register(Registry.ITEM, ApecraftMod.id("george_spawn_egg"), GEORGE_SPAWN_EGG);
        Registry.register(Registry.ITEM, ApecraftMod.id("langamur_spawn_egg"), LANGARMUR_SPAWN_EGG);
        Registry.register(Registry.ITEM, ApecraftMod.id("bakula_spawn_egg"), BAKULA_SPAWN_EGG);
        Registry.register(Registry.ITEM, ApecraftMod.id("mudstone_pickaxe"), new PickaxeBase(new ToolMaterialMudstone()));
        Registry.register(Registry.ITEM, ApecraftMod.id("mudstone_axe"), new AxeBase(new ToolMaterialMudstone()));
        Registry.register(Registry.ITEM, ApecraftMod.id("mudstone_shovel"), new ShovelBase(new ToolMaterialMudstone()));
        Registry.register(Registry.ITEM, ApecraftMod.id("mudstone_hoe"), new HoeBase(new ToolMaterialMudstone()));
        Registry.register(Registry.ITEM, ApecraftMod.id("mudstone_sword"), new SwordBase(new ToolMaterialMudstone()));
        Registry.register(Registry.ITEM, ApecraftMod.id("silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, ApecraftMod.id("silver_pickaxe"), new PickaxeBase(new ToolMaterialSilver()));
        Registry.register(Registry.ITEM, ApecraftMod.id("silver_axe"), new AxeBase(new ToolMaterialSilver()));
        Registry.register(Registry.ITEM, ApecraftMod.id("silver_shovel"), new ShovelBase(new ToolMaterialSilver()));
        Registry.register(Registry.ITEM, ApecraftMod.id("silver_hoe"), new HoeBase(new ToolMaterialSilver()));
        Registry.register(Registry.ITEM, ApecraftMod.id("silver_sword"), new SwordBase(new ToolMaterialSilver()));
        Registry.register(Registry.ITEM, ApecraftMod.id("silver_helmet"), new BaseArmor(SILVER_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, ApecraftMod.id("silver_chestplate"), new BaseArmor(SILVER_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, ApecraftMod.id("silver_leggings"), new BaseArmor(SILVER_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, ApecraftMod.id("silver_boots"), new BaseArmor(SILVER_ARMOR, EquipmentSlot.FEET));
        Registry.register(Registry.ITEM, ApecraftMod.id("snow_berries"), SNOW_BERRIES);
    }
}
