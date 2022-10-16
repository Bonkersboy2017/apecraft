package com.apedev.apecraft;

import com.apedev.apecraft.registry.RegisterEntities;
import com.apedev.apecraft.registry.RegisterBlocks;
import com.apedev.apecraft.items.RegisterItems;
import com.apedev.apecraft.worldgen.ApecraftPlants;
import com.apedev.apecraft.worldgen.ModFeatures;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ApecraftMod implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static ResourceLocation getID(String path) {
        return new ResourceLocation(MOD_ID, path);
    }


    public static final String MOD_ID = "apecraft";
    public static final CreativeModeTab ITEM_GROUP = FabricItemGroupBuilder.build(new ResourceLocation(MOD_ID, "general"), () -> new ItemStack(RegisterItems.BANANA));

    @Override
    public void onInitialize() {
        RegisterEntities.registerAll();
        RegisterBlocks.registerAll();
        RegisterItems.registerAll();
        ModFeatures.registerAll();
        RegisterWorldgen.registerBiomes();
        ApecraftPlants.registerAll(MOD_ID);
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.


    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
