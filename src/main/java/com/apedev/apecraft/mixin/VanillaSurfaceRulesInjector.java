package com.apedev.apecraft.mixin;

import com.apedev.apecraft.RegisterWorldgen;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.noise.NoiseParametersKeys;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(net.minecraft.world.gen.surfacebuilder.VanillaSurfaceRules.class)
public class VanillaSurfaceRulesInjector {

    private static MaterialRules.MaterialRule block(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }

    @Inject(method = "createOverworldSurfaceRule", at = @At("RETURN"), cancellable = true)
    private static void createOverworldSurfaceRule(CallbackInfoReturnable<MaterialRules.MaterialRule> cir) {
        cir.setReturnValue(MaterialRules.sequence(MaterialRules.condition(
                MaterialRules.STONE_DEPTH_FLOOR,
                MaterialRules.sequence(
                        MaterialRules.condition(
                                MaterialRules.biome(RegisterWorldgen.REDWOOD),
                                block(Blocks.GRASS_BLOCK)
                        ),
                        MaterialRules.condition(
                                MaterialRules.biome(RegisterWorldgen.REDWOOD),
                                MaterialRules.condition(
                                        MaterialRules.aboveY(YOffset.fixed(62), 0),
                                        MaterialRules.condition(
                                                MaterialRules.not(MaterialRules.aboveY(YOffset.fixed(63), 0)),
                                                MaterialRules.condition(
                                                        MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SWAMP, 0.1D),
                                                        block(Blocks.WATER)
                                                )
                                        )
                                )
                        )
                )
        ), cir.getReturnValue()));
    }
}
