package com.apedev.apecraft.mixin;

import com.apedev.apecraft.RegisterWorldgen;
import com.mojang.datafixers.util.Pair;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.OverworldBiomeBuilder;


@Mixin(OverworldBiomeBuilder.class)
public final class VanillaBiomeParametersMixin {

    @Shadow
    private void addSurfaceBiome(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> parameters, Climate.Parameter temperature, Climate.Parameter humidity, Climate.Parameter continentalness, Climate.Parameter erosion, Climate.Parameter weirdness, float offset, ResourceKey<Biome> biome) {
        parameters.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(0.0F), weirdness, offset), biome));
        parameters.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(1.0F), weirdness, offset), biome));
        throw new AssertionError("Mixin injection failed.");
    }

    @Shadow
    @Final
    private Climate.Parameter[] erosions;

    @Shadow
    @Final
    private Climate.Parameter nearInlandContinentalness;

    @Shadow
    @Final
    private Climate.Parameter farInlandContinentalness;

    @Shadow
    @Final
    private Climate.Parameter inlandContinentalness;

    @Shadow @Final private Climate.Parameter[] humidities;

    @Shadow @Final private Climate.Parameter[] temperatures;

    @Inject(method = "addLowSlice", at = @At("TAIL"))
    private void injectBiomesNearRivers(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> parameters, Climate.Parameter weirdness, CallbackInfo ci) {
        this.addSurfaceBiome(
                parameters,
                Climate.Parameter.span(this.temperatures[2], this.temperatures[4]),
                Climate.Parameter.span(this.humidities[1], this.humidities[4]),
                Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness),
                this.erosions[3],
                weirdness,
                0.0F,
                RegisterWorldgen.REDWOOD
        );
    }

    @Inject(method = "addValleys", at = @At("TAIL"))
    private void injectRiverBiomes(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> parameters, Climate.Parameter weirdness, CallbackInfo ci) {
        this.addSurfaceBiome(
                parameters,
                Climate.Parameter.span(this.temperatures[2], this.temperatures[4]),
                Climate.Parameter.span(this.humidities[1], this.humidities[4]),
                Climate.Parameter.span(this.inlandContinentalness, this.farInlandContinentalness),
                this.erosions[3],
                weirdness,
                0.0F,
                RegisterWorldgen.REDWOOD
        );
    }

    @Inject(method = "addMidSlice", at = @At("TAIL"))
    private void injectMixedBiomes(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> parameters, Climate.Parameter weirdness, CallbackInfo ci) {
        this.addSurfaceBiome(
                parameters,
                Climate.Parameter.span(this.temperatures[2], this.temperatures[4]),
                Climate.Parameter.span(this.humidities[1], this.humidities[4]),
                Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness),
                this.erosions[3],
                weirdness,
                0.0F,
                RegisterWorldgen.REDWOOD
        );
    }

}