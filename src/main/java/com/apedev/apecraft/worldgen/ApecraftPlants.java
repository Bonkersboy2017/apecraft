package com.apedev.apecraft.worldgen;

import com.apedev.apecraft.RegisterWorldgen;
import com.apedev.apecraft.registry.RegisterBlocks;
import com.mojang.serialization.Codec;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ApecraftPlants {

    public static final BananaFeature BT_BANANA = new BananaFeature(ProbabilityFeatureConfiguration.CODEC);
    public static final Holder<ConfiguredFeature<ProbabilityFeatureConfiguration, ?>> BT_BANANA_CONFIGURED = FeatureUtils.register("bt_banana", BT_BANANA, new ProbabilityFeatureConfiguration(0.1F));
    public static final Holder<PlacedFeature> BT_BANANA_PLACED = PlacementUtils.register("bt_banana_placed", BT_BANANA_CONFIGURED, RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static void registerAll(String modid) {
        Registry.register(Registry.FEATURE, new ResourceLocation(modid, "bt_banana"), BT_BANANA);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(RegisterWorldgen.REDWOOD),
                GenerationStep.Decoration.TOP_LAYER_MODIFICATION, BT_BANANA_PLACED.unwrapKey().orElseThrow());

    }

    private static void generate(FeaturePlaceContext<ProbabilityFeatureConfiguration> context, BlockState state) {
        WorldGenLevel world = context.level();
        BlockPos topPos = world.getHeightmapPos(Heightmap.Types.OCEAN_FLOOR_WG, context.origin());
        assert world.getBlockState(topPos).isAir();
        world.setBlock(topPos, state, 3);
    }

    private static class BananaFeature extends Feature<ProbabilityFeatureConfiguration> {
        public BananaFeature(Codec<ProbabilityFeatureConfiguration> configCodec) {
            super(configCodec);
        }


        @Override
        public boolean place(FeaturePlaceContext<ProbabilityFeatureConfiguration> context) {
            ApecraftPlants.generate(context, RegisterBlocks.BANANA_BRANCH.defaultBlockState());
            return true;
        }


    }
}
