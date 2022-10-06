package com.apedev.apecraft.mixin;

import com.apedev.apecraft.RegisterWorldgen;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import net.minecraft.world.biome.source.util.VanillaBiomeParameters;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;


@Mixin(VanillaBiomeParameters.class)
public final class ModBiomeParameters {

    @Shadow
    private void writeBiomeParameters(Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> parameters, MultiNoiseUtil.ParameterRange temperature, MultiNoiseUtil.ParameterRange humidity, MultiNoiseUtil.ParameterRange continentalness, MultiNoiseUtil.ParameterRange erosion, MultiNoiseUtil.ParameterRange weirdness, float offset, RegistryKey<Biome> biome) {
        parameters.accept(Pair.of(MultiNoiseUtil.createNoiseHypercube(temperature, humidity, continentalness, erosion, MultiNoiseUtil.ParameterRange.of(0.0F), weirdness, offset), biome));
        parameters.accept(Pair.of(MultiNoiseUtil.createNoiseHypercube(temperature, humidity, continentalness, erosion, MultiNoiseUtil.ParameterRange.of(1.0F), weirdness, offset), biome));
    }

    @Shadow @Final private MultiNoiseUtil.ParameterRange nonFrozenTemperatureParameters;

    @Shadow @Final private MultiNoiseUtil.ParameterRange defaultParameter;

    @Shadow @Final private MultiNoiseUtil.ParameterRange[] erosionParameters;

    @Shadow @Final private MultiNoiseUtil.ParameterRange nearInlandContinentalness;

    @Shadow @Final private MultiNoiseUtil.ParameterRange farInlandContinentalness;

    @Shadow @Final private MultiNoiseUtil.ParameterRange riverContinentalness;

    @Inject(method = "writeLowBiomes", at = @At("TAIL"))
    private void injectBiomesNearRivers(Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> parameters, MultiNoiseUtil.ParameterRange weirdness, CallbackInfo ci) {
        this.writeBiomeParameters(
                parameters,
                this.nonFrozenTemperatureParameters,
                this.defaultParameter,
                MultiNoiseUtil.ParameterRange.combine(this.nearInlandContinentalness, this.farInlandContinentalness),
                this.erosionParameters[6],
                weirdness,
                0.0F,
                RegisterWorldgen.REDWOOD
        );
    }

    @Inject(method = "writeValleyBiomes", at = @At("TAIL"))
    private void injectRiverBiomes(Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> parameters, MultiNoiseUtil.ParameterRange weirdness, CallbackInfo ci) {
        this.writeBiomeParameters(
                parameters,
                this.nonFrozenTemperatureParameters,
                this.defaultParameter,
                MultiNoiseUtil.ParameterRange.combine(this.riverContinentalness, this.farInlandContinentalness),
                this.erosionParameters[6],
                weirdness,
                0.0F,
                RegisterWorldgen.REDWOOD
        );
    }

    @Inject(method = "writeMidBiomes", at = @At("TAIL"))
    private void injectMixedBiomes(Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> parameters, MultiNoiseUtil.ParameterRange weirdness, CallbackInfo ci) {
        this.writeBiomeParameters(
                parameters,
                this.nonFrozenTemperatureParameters,
                this.defaultParameter,
                MultiNoiseUtil.ParameterRange.combine(this.nearInlandContinentalness, this.farInlandContinentalness),
                this.erosionParameters[6],
                weirdness,
                0.0F,
                RegisterWorldgen.REDWOOD
        );
    }

}