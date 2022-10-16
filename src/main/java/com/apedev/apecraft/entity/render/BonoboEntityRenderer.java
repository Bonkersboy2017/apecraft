package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.BonoboEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BonoboEntityRenderer extends MobRenderer<BonoboEntity, BonoboEntityModel> {

    public BonoboEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new BonoboEntityModel(context.bakeLayer(ApecraftClient.MODEL_BONOBO_LAYER)), 0.6F);
    }

    @Override
    public ResourceLocation getTextureLocation(BonoboEntity entity) {
        return ApecraftMod.id("textures/entity/bonobo.png");
    }
}
