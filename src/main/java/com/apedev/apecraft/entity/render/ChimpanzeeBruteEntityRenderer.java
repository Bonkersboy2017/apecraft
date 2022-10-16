package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.ChimpanzeeBruteEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ChimpanzeeBruteEntityRenderer extends MobRenderer<ChimpanzeeBruteEntity, ChimpanzeeBruteEntityModel> {

    public ChimpanzeeBruteEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new ChimpanzeeBruteEntityModel(context.bakeLayer(ApecraftClient.MODEL_CHIMPANZEE_BRUTE_LAYER)), 0.6F);
    }

    @Override
    public ResourceLocation getTextureLocation(ChimpanzeeBruteEntity entity) {
        return ApecraftMod.id("textures/entity/chimpanzee_brute.png");
    }
}
