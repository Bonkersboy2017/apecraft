package com.apedev.apecraft.worldgen;

import com.apedev.apecraft.blocks.RegisterBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.Arrays;

public class ModFeatures {
    private static ConfiguredFeature<?, ?> OVERWORLD_MUDSTONE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    RegisterBlocks.MUDSTONE.getDefaultState(),
                    9)); // vein size

    private static ConfiguredFeature<?, ?> OVERWORLD_SILVER_ORE_CONFIGURED_FEATURE = new ConfiguredFeature
            (Feature.ORE, new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    RegisterBlocks.SILVER_ORE.getDefaultState(),
                    9)); // vein size

    public static PlacedFeature OVERWORLD_MUDSTONE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_MUDSTONE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(20), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))));

    public static PlacedFeature OVERWORLD_SILVER_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_SILVER_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(20), // number of veins per chunk
                    SquarePlacementModifier.of(), // spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))));

    public static void registerAll() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("apecraft", "overworld_mudstone"), OVERWORLD_MUDSTONE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("apecraft", "overworld_mudstone"), OVERWORLD_MUDSTONE_PLACED_FEATURE);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("apecraft", "overworld_silver_ore"), OVERWORLD_SILVER_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("apecraft", "overworld_silver_ore"), OVERWORLD_SILVER_ORE_PLACED_FEATURE);
    }
}
