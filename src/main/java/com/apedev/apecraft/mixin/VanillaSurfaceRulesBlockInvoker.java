package com.apedev.apecraft.mixin;


import net.minecraft.block.Block;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.minecraft.world.gen.surfacebuilder.VanillaSurfaceRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(VanillaSurfaceRules.class)
public interface VanillaSurfaceRulesBlockInvoker {
    @Invoker("block")
    public static MaterialRules.MaterialRule invokeBlock(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
