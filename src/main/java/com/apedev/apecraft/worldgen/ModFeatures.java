package com.apedev.apecraft.worldgen;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.blocks.RegisterBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class ModFeatures {
    private static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OVERWORLD_MUDSTONE_CONFIGURED = register("overworld_mudstone",
            Feature.ORE,
            new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    RegisterBlocks.MUDSTONE.getDefaultState(),
                    9 // vein size
            )
    );

    private static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OVERWORLD_SILVER_ORE_CONFIGURED = register("overworld_silver_ore",
            Feature.ORE,
            new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    RegisterBlocks.SILVER_ORE.getDefaultState(),
                    9 // vein size
            )
    );

    public static final RegistryEntry<PlacedFeature> OVERWORLD_MUDSTONE_PLACED = register("overworld_mudstone",
            OVERWORLD_MUDSTONE_CONFIGURED,
            CountPlacementModifier.of(20), // number of veins per chunk
            SquarePlacementModifier.of(), // spreading horizontally
            HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
    );

    public static RegistryEntry<PlacedFeature> OVERWORLD_SILVER_ORE_PLACED_FEATURE = register("overworld_silver_ore",
            OVERWORLD_SILVER_ORE_CONFIGURED,
            CountPlacementModifier.of(20), // number of veins per chunk
            SquarePlacementModifier.of(), // spreading horizontally
            HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
    );

    public static <FC extends FeatureConfig, F extends Feature<FC>> RegistryEntry<ConfiguredFeature<FC, ?>> register(@NotNull String id, F feature, @NotNull FC config) {
        return registerExact(BuiltinRegistries.CONFIGURED_FEATURE, id, new ConfiguredFeature<>(feature, config));
    }

    public static <V extends T, T> RegistryEntry<V> registerExact(Registry<T> registry, String id, V value) {
        return (RegistryEntry<V>) BuiltinRegistries.add(registry, ApecraftMod.id(id), value);
    }

    public static RegistryEntry<PlacedFeature> register(@NotNull String id, RegistryEntry<? extends ConfiguredFeature<?, ?>> registryEntry, @NotNull List<PlacementModifier> modifiers) {
        return BuiltinRegistries.add(BuiltinRegistries.PLACED_FEATURE, ApecraftMod.id(id), new PlacedFeature(RegistryEntry.upcast(registryEntry), List.copyOf(modifiers)));
    }

    public static RegistryEntry<PlacedFeature> register(@NotNull String id, RegistryEntry<? extends ConfiguredFeature<?, ?>> registryEntry, @NotNull PlacementModifier... modifiers) {
        return register(id, registryEntry, List.of(modifiers));
    }

    public static void registerAll() {
    }
}
