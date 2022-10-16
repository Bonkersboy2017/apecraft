package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.OrangutanEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class OrangutanEntityRenderer extends MobRenderer<OrangutanEntity, OrangutanEntityModel> {

    public OrangutanEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new OrangutanEntityModel(context.bakeLayer(ApecraftClient.MODEL_ORANGUTAN_LAYER)), 1.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(OrangutanEntity entity) {
        return ApecraftMod.id("textures/entity/orangutan.png");
    }
}

