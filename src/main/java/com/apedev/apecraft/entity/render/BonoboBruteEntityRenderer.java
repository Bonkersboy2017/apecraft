package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.BonoboBruteEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BonoboBruteEntityRenderer extends MobRenderer<BonoboBruteEntity, BonoboBruteEntityModel> {

    public BonoboBruteEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new BonoboBruteEntityModel(context.bakeLayer(ApecraftClient.MODEL_BONOBO_BRUTE_LAYER)), 0.6F);
    }

    @Override
    public ResourceLocation getTextureLocation(BonoboBruteEntity entity) {
        return ApecraftMod.id("textures/entity/bonobo_brute.png");
    }
}
