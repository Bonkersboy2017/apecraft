package com.apedev.apecraft;

import com.apedev.apecraft.registry.RegisterEntities;
import com.apedev.apecraft.registry.RegisterBlocks;
import com.apedev.apecraft.worldgen.ModFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.biome.OverworldBiomes;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.Musics;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaPineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class RegisterWorldgen {

    public static final ResourceKey<Biome> REDWOOD = register("redwood");

    private static ResourceKey<Biome> register(String name) {
        return ResourceKey.create(Registry.BIOME_REGISTRY, ApecraftMod.id(name));
    }

    public static void registerBiomes() {
        register(REDWOOD, createRedwood());
    }

    private static void register(ResourceKey<Biome> key, Biome biome) {
        BuiltinRegistries.register(BuiltinRegistries.BIOME, key, biome);
    }

    public static Biome createRedwood() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.commonSpawns(spawnSettings);


        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(RegisterEntities.CHIMPANZEE, 10, 1, 1));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(RegisterEntities.GORILLA, 10, 1, 1));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(RegisterEntities.BONOBO, 10, 1, 1));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(RegisterEntities.ORANGUTAN, 10, 1, 1));
        spawnSettings.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(RegisterEntities.SKINNY_ORANGUTAN, 10, 1, 1));
        BiomeGenerationSettings.Builder featureSettings = new BiomeGenerationSettings.Builder();

        featureSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TREES_REDWOOD);
        featureSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_GRASS_NORMAL);
//        featureSettings.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.FLOWER_PLAIN);
        featureSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.BROWN_MUSHROOM_SWAMP);
        featureSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.RED_MUSHROOM_SWAMP);
        BiomeDefaultFeatures.addPlainGrass(featureSettings);
        BiomeDefaultFeatures.addDefaultOres(featureSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(featureSettings);
        BiomeDefaultFeatures.addWarmFlowers(featureSettings);
//        DefaultBiomeFeatures.addDefaultGrass(featureSettings);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(featureSettings);
        BiomeDefaultFeatures.addDefaultCrystalFormations(featureSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(featureSettings);
//        DefaultBiomeFeatures.addMineables(featureSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(featureSettings);
        BiomeDefaultFeatures.addDefaultSprings(featureSettings);
//

        return new Biome.BiomeBuilder()
                .precipitation(Biome.Precipitation.NONE)
                .temperature(0.6F)
                .downfall(0.9F)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .grassColorModifier(BiomeSpecialEffects.GrassColorModifier.DARK_FOREST)
                        .foliageColorOverride(6975545)
                        .waterColor(4699130)
                        .waterFogColor(334139)
                        .fogColor(12638463)
                        .skyColor(OverworldBiomes.calculateSkyColor(0.6F))
                        .backgroundMusic(Musics.GAME)
                        .build()
                )
                .mobSpawnSettings(spawnSettings.build())
                .generationSettings(featureSettings.build())
                .build();
    }

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> REDWOOD_TREE = ModFeatures.register("redwood_tree", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(RegisterBlocks.REDWOOD_LOG), new GiantTrunkPlacer(19, 14, 0), BlockStateProvider.simple(RegisterBlocks.REDWOOD_LEAVES), new MegaPineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), ConstantInt.of(17)), new TwoLayersFeatureSize(1, 0, 3)).ignoreVines().build());

    public static final Holder<PlacedFeature> TREES_REDWOOD = ModFeatures.register("trees_redwood", RegisterWorldgen.REDWOOD_TREE, VegetationPlacements.treePlacement(PlacementUtils.countExtra(8, 0.1f, 1), Blocks.OAK_SAPLING));
}





