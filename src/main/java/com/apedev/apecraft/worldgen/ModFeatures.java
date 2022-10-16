package com.apedev.apecraft.worldgen;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.registry.RegisterBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ModFeatures {
    private static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_MUDSTONE_CONFIGURED = register("overworld_mudstone",
            Feature.ORE,
            new OreConfiguration(
                    OreFeatures.STONE_ORE_REPLACEABLES,
                    RegisterBlocks.MUDSTONE.defaultBlockState(),
                    9 // vein size
            )
    );

    private static final Holder<ConfiguredFeature<OreConfiguration, ?>> OVERWORLD_SILVER_ORE_CONFIGURED = register("overworld_silver_ore",
            Feature.ORE,
            new OreConfiguration(
                    OreFeatures.STONE_ORE_REPLACEABLES,
                    RegisterBlocks.SILVER_ORE.defaultBlockState(),
                    9 // vein size
            )
    );

    public static final Holder<PlacedFeature> OVERWORLD_MUDSTONE_PLACED = register("overworld_mudstone",
            OVERWORLD_MUDSTONE_CONFIGURED,
            CountPlacement.of(20), // number of veins per chunk
            InSquarePlacement.spread(), // spreading horizontally
            HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(64))
    );

    public static Holder<PlacedFeature> OVERWORLD_SILVER_ORE_PLACED_FEATURE = register("overworld_silver_ore",
            OVERWORLD_SILVER_ORE_CONFIGURED,
            CountPlacement.of(20), // number of veins per chunk
            InSquarePlacement.spread(), // spreading horizontally
            HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(64))
    );

    public static <FC extends FeatureConfiguration, F extends Feature<FC>> Holder<ConfiguredFeature<FC, ?>> register(@NotNull String id, F feature, @NotNull FC config) {
        return registerExact(BuiltinRegistries.CONFIGURED_FEATURE, id, new ConfiguredFeature<>(feature, config));
    }

    public static <V extends T, T> Holder<V> registerExact(Registry<T> registry, String id, V value) {
        return (Holder<V>) BuiltinRegistries.register(registry, ApecraftMod.id(id), value);
    }

    public static Holder<PlacedFeature> register(@NotNull String id, Holder<? extends ConfiguredFeature<?, ?>> registryEntry, @NotNull List<PlacementModifier> modifiers) {
        return BuiltinRegistries.register(BuiltinRegistries.PLACED_FEATURE, ApecraftMod.id(id), new PlacedFeature(Holder.hackyErase(registryEntry), List.copyOf(modifiers)));
    }

    public static Holder<PlacedFeature> register(@NotNull String id, Holder<? extends ConfiguredFeature<?, ?>> registryEntry, @NotNull PlacementModifier... modifiers) {
        return register(id, registryEntry, List.of(modifiers));
    }

    public static void registerAll() {
    }
}
