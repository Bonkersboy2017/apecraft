package com.apedev.apecraft.worldgen;

import com.apedev.apecraft.RegisterWorldgen;
import com.apedev.apecraft.blocks.RegisterBlocks;
import com.mojang.serialization.Codec;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.BlockState;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.util.FeatureContext;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class ApecraftPlants {

    public static final BananaFeature BT_BANANA = new BananaFeature(ProbabilityConfig.CODEC);
    public static final RegistryEntry<ConfiguredFeature<ProbabilityConfig, ?>> BT_BANANA_CONFIGURED = ConfiguredFeatures.register("bt_banana", BT_BANANA, new ProbabilityConfig(0.1F));
    public static final RegistryEntry<PlacedFeature> BT_BANANA_PLACED = PlacedFeatures.register("bt_banana_placed", BT_BANANA_CONFIGURED, RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static void registerAll(String modid) {
        Registry.register(Registry.FEATURE, new Identifier(modid, "bt_banana"), BT_BANANA);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(RegisterWorldgen.REDWOOD),
                GenerationStep.Feature.TOP_LAYER_MODIFICATION, BT_BANANA_PLACED.getKey().get());

    }

    private static void generate(FeatureContext<ProbabilityConfig> context, BlockState state) {
        StructureWorldAccess world = context.getWorld();
        BlockPos topPos = world.getTopPosition(Heightmap.Type.OCEAN_FLOOR_WG, context.getOrigin());
        assert world.getBlockState(topPos).isAir();
        world.setBlockState(topPos, state, 3);
    }

    private static class BananaFeature extends Feature<ProbabilityConfig> {
        public BananaFeature(Codec<ProbabilityConfig> configCodec) {
            super(configCodec);
        }


        @Override
        public boolean generate(FeatureContext<ProbabilityConfig> context) {
            ApecraftPlants.generate(context, RegisterBlocks.BANANA_BRANCH.getDefaultState());
            return true;
        }


    }
}
