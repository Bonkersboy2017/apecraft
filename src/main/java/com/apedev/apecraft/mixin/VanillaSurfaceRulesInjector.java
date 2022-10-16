package com.apedev.apecraft.mixin;

import com.apedev.apecraft.RegisterWorldgen;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(net.minecraft.data.worldgen.SurfaceRuleData.class)
public class VanillaSurfaceRulesInjector {

    private static SurfaceRules.RuleSource block(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }

    @Inject(method = "overworldLike", at = @At("RETURN"), cancellable = true)
    private static void overworldLike(CallbackInfoReturnable<SurfaceRules.RuleSource> cir) {
        cir.setReturnValue(SurfaceRules.sequence(SurfaceRules.ifTrue(
                SurfaceRules.ON_FLOOR,
                SurfaceRules.sequence(
                        SurfaceRules.ifTrue(
                                SurfaceRules.isBiome(RegisterWorldgen.REDWOOD),
                                block(Blocks.GRASS_BLOCK)
                        ),
                        SurfaceRules.ifTrue(
                                SurfaceRules.isBiome(RegisterWorldgen.REDWOOD),
                                SurfaceRules.ifTrue(
                                        SurfaceRules.yBlockCheck(VerticalAnchor.absolute(62), 0),
                                        SurfaceRules.ifTrue(
                                                SurfaceRules.not(SurfaceRules.yBlockCheck(VerticalAnchor.absolute(63), 0)),
                                                SurfaceRules.ifTrue(
                                                        SurfaceRules.noiseCondition(Noises.SWAMP, 0.1D),
                                                        block(Blocks.WATER)
                                                )
                                        )
                                )
                        )
                )
        ), cir.getReturnValue()));
    }
}
