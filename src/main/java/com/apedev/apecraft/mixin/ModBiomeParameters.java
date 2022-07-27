package com.apedev.apecraft.mixin;

import com.apedev.apecraft.RegisterWorldgen;
import com.apedev.apecraft.worldgen.ModBiomes;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import net.minecraft.world.biome.source.util.VanillaBiomeParameters;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;

import static org.objectweb.asm.Opcodes.GETSTATIC;


@Mixin(VanillaBiomeParameters.class)
public abstract class ModBiomeParameters {

    @Shadow
    @Final
    private RegistryKey<Biome>[][] uncommonBiomes;

    @Shadow
    @Final
    private MultiNoiseUtil.ParameterRange nearInlandContinentalness;

    @Shadow
    @Final
    private MultiNoiseUtil.ParameterRange farInlandContinentalness;

    @Shadow
    @Final
    private final MultiNoiseUtil.ParameterRange[] erosionParameters = new MultiNoiseUtil.ParameterRange[]{MultiNoiseUtil.ParameterRange.of(-1.0F, -0.78F), MultiNoiseUtil.ParameterRange.of(-0.78F, -0.375F), MultiNoiseUtil.ParameterRange.of(-0.375F, -0.2225F), MultiNoiseUtil.ParameterRange.of(-0.2225F, 0.05F), MultiNoiseUtil.ParameterRange.of(0.05F, 0.45F), MultiNoiseUtil.ParameterRange.of(0.45F, 0.55F), MultiNoiseUtil.ParameterRange.of(0.55F, 1.0F)};

    @Shadow
    @Final
    private final MultiNoiseUtil.ParameterRange defaultParameter = MultiNoiseUtil.ParameterRange.of(-1.0F, 1.0F);

    @Shadow
    @Final
    private MultiNoiseUtil.ParameterRange nonFrozenTemperatureParameters;

    @Shadow
    @Final
    private MultiNoiseUtil.ParameterRange riverContinentalness;

    @Shadow
    private void writeBiomeParameters(Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> parameters, MultiNoiseUtil.ParameterRange temperature, MultiNoiseUtil.ParameterRange humidity, MultiNoiseUtil.ParameterRange continentalness, MultiNoiseUtil.ParameterRange erosion, MultiNoiseUtil.ParameterRange weirdness, float offset, RegistryKey<Biome> biome) {
        parameters.accept(Pair.of(MultiNoiseUtil.createNoiseHypercube(temperature, humidity, continentalness, erosion, MultiNoiseUtil.ParameterRange.of(0.0F), weirdness, offset), biome));
        parameters.accept(Pair.of(MultiNoiseUtil.createNoiseHypercube(temperature, humidity, continentalness, erosion, MultiNoiseUtil.ParameterRange.of(1.0F), weirdness, offset), biome));
    }


    @Inject(method = "<init>", at = @At("TAIL"))
    private void injectBiomes(CallbackInfo ci) {
        uncommonBiomes[1][0] = ModBiomes.REDWOOD_KEY;
    }

    @Inject(method = "writeBiomesNearRivers", at = @At("TAIL"))
    private void injectMangroveNearRivers(Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> parameters, MultiNoiseUtil.ParameterRange weirdness, CallbackInfo ci) {
        this.writeBiomeParameters(parameters, this.nonFrozenTemperatureParameters, this.defaultParameter, MultiNoiseUtil.ParameterRange.combine(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosionParameters[6], weirdness, 0.0F, ModBiomes.REDWOOD_KEY);
    }

    @Inject(method = "writeRiverBiomes", at = @At("TAIL"))
    private void injectMangroveRiverBiomes(Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> parameters, MultiNoiseUtil.ParameterRange weirdness, CallbackInfo ci) {
        this.writeBiomeParameters(parameters, this.nonFrozenTemperatureParameters, this.defaultParameter, MultiNoiseUtil.ParameterRange.combine(this.riverContinentalness, this.farInlandContinentalness), this.erosionParameters[6], weirdness, 0.0F, ModBiomes.REDWOOD_KEY);
    }

    @Inject(method = "writeMixedBiomes", at = @At("TAIL"))
    private void injectMangroveMixedBiomes(Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> parameters, MultiNoiseUtil.ParameterRange weirdness, CallbackInfo ci) {
        this.writeBiomeParameters(parameters, this.nonFrozenTemperatureParameters, this.defaultParameter, MultiNoiseUtil.ParameterRange.combine(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosionParameters[6], weirdness, 0.0F, ModBiomes.REDWOOD_KEY);
    }

}