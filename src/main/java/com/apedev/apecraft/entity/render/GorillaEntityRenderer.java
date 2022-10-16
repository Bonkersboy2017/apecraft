package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.GorillaEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GorillaEntityRenderer extends MobRenderer<GorillaEntity, GorillaEntityModel> {

    public GorillaEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new GorillaEntityModel(context.bakeLayer(ApecraftClient.MODEL_GORILLA_ENTITY)), 1.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(GorillaEntity entity) {
        return ApecraftMod.id("textures/entity/gorilla.png");
    }
}



