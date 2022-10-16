package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.GeorgeEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GeorgeEntityRenderer extends MobRenderer<GeorgeEntity, GeorgeEntityModel> {

    public GeorgeEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new GeorgeEntityModel(context.bakeLayer(ApecraftClient.MODEL_GEORGE_LAYER)), 4.0F);
    }

    @Override
    public ResourceLocation getTextureLocation(GeorgeEntity entity) {
        return ApecraftMod.id("textures/entity/george.png");
    }

}