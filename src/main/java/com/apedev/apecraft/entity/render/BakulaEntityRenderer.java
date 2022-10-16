package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.BakulaEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BakulaEntityRenderer extends MobRenderer<BakulaEntity, BakulaEntityModel> {

    public BakulaEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new BakulaEntityModel(context.bakeLayer(ApecraftClient.MODEL_BAKULA_LAYER)), 1.3F);
    }

    @Override
    public ResourceLocation getTextureLocation(BakulaEntity entity) {
        return ApecraftMod.id("textures/entity/bakula.png");
    }
}
