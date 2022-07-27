package com.apedev.apecraft.worldgen;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.RegisterWorldgen;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class ModBiomes {
    public static final RegistryKey<Biome> REDWOOD_KEY= registerBiomeKeys("redwood");

    private static RegistryKey<Biome> registerBiomeKeys(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(ApecraftMod.MOD_ID, name));
    }

    public static void registerBiomes() {
        register(REDWOOD_KEY, RegisterWorldgen.createBreakthrpugh());




    }


    private static RegistryEntry<Biome> register(RegistryKey<Biome> key, Biome biome) {
        return BuiltinRegistries.add(BuiltinRegistries.BIOME, key, biome);
    }
}