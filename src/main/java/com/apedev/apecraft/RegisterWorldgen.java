package com.apedev.apecraft;

import com.apedev.apecraft.blocks.RegisterBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.block.Blocks;
import net.minecraft.client.sound.MusicType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.MegaPineFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;

public class RegisterWorldgen {

    public static final RegistryKey<Biome> REDWOOD = register("redwood");

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, ApecraftMod.id(name));
    }

    public static void registerBiomes() {
        register(REDWOOD, createRedwood());
    }

    private static RegistryEntry<Biome> register(RegistryKey<Biome> key, Biome biome) {
        return BuiltinRegistries.add(BuiltinRegistries.BIOME, key, biome);
    }

    public static Biome createRedwood() {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(spawnSettings);


        spawnSettings.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.CHIMPANZEE, 10, 1, 1));
        spawnSettings.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.GORILLA, 10, 1, 1));
        spawnSettings.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.BONOBO, 10, 1, 1));
        spawnSettings.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.ORANGUTAN, 10, 1, 1));
        spawnSettings.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(ModEntities.SKINNY_ORANGUTAN, 10, 1, 1));
        GenerationSettings.Builder featureSettings = new GenerationSettings.Builder();

        featureSettings.feature(GenerationStep.Feature.VEGETAL_DECORATION, TREES_REDWOOD);
        featureSettings.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.PATCH_GRASS_NORMAL);
//        featureSettings.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.FLOWER_PLAIN);
        featureSettings.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.BROWN_MUSHROOM_SWAMP);
        featureSettings.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.RED_MUSHROOM_SWAMP);
        DefaultBiomeFeatures.addPlainsTallGrass(featureSettings);
        DefaultBiomeFeatures.addDefaultOres(featureSettings);
        DefaultBiomeFeatures.addDefaultDisks(featureSettings);
        DefaultBiomeFeatures.addExtraDefaultFlowers(featureSettings);
//        DefaultBiomeFeatures.addDefaultGrass(featureSettings);
        DefaultBiomeFeatures.addLandCarvers(featureSettings);
        DefaultBiomeFeatures.addAmethystGeodes(featureSettings);
        DefaultBiomeFeatures.addDungeons(featureSettings);
//        DefaultBiomeFeatures.addMineables(featureSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(featureSettings);
        DefaultBiomeFeatures.addSprings(featureSettings);
//


        BiomeModifications.create(new Identifier(ApecraftMod.MOD_ID + "redwood"))
                .add(ModificationPhase.ADDITIONS, BiomeSelectors.includeByKey(REDWOOD), ctx -> {});

        return (new Biome.Builder())
                .precipitation(Biome.Precipitation.NONE)
                .temperature(0.6F)
                .downfall(0.9F)
                .effects((new BiomeEffects.Builder())
                        .grassColorModifier(BiomeEffects.GrassColorModifier.DARK_FOREST)
                        .foliageColor(6975545)
                        .waterColor(0xadd8e6)
                        .waterFogColor(0xadd8e6)
                        .fogColor(12638463)
                        .skyColor(12638463)
                        .music(MusicType.GAME)
                        .build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(featureSettings.build())
                .build();

    }

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> REDWOOD_TREE = ConfiguredFeatures.register("redwood_tree", Feature.TREE, new TreeFeatureConfig.Builder(BlockStateProvider.of(RegisterBlocks.REDWOOD_LOG), new GiantTrunkPlacer(19, 14, 0), BlockStateProvider.of(RegisterBlocks.REDWOOD_LEAVES), new MegaPineFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(1), ConstantIntProvider.create(17)), new TwoLayersFeatureSize(1, 0, 3)).ignoreVines().build());

    public static final RegistryEntry<PlacedFeature> TREES_REDWOOD = PlacedFeatures.register("trees_redwood", RegisterWorldgen.REDWOOD_TREE, VegetationPlacedFeatures.modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(8, 0.1f, 1), Blocks.OAK_SAPLING));
}





