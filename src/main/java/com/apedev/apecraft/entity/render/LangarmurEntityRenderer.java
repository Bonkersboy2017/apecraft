package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.LangarmurEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class LangarmurEntityRenderer extends MobRenderer<LangarmurEntity, LangarmurEntityModel> {

    public LangarmurEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new LangarmurEntityModel(context.bakeLayer(ApecraftClient.MODEL_LANGURMUR_LAYER)), 0.9F);
    }

    @Override
    public ResourceLocation getTextureLocation(LangarmurEntity entity) {
        return ApecraftMod.id("textures/entity/langarmur.png");
    }

}

