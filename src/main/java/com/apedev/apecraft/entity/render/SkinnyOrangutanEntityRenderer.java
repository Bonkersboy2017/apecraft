package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.SkinnyOrangutanEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SkinnyOrangutanEntityRenderer extends MobRenderer<SkinnyOrangutanEntity, SkinnyOrangutanEntityModel> {

    public SkinnyOrangutanEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new SkinnyOrangutanEntityModel(context.bakeLayer(ApecraftClient.MODEL_SKINNY_ORANGUTAN_LAYER)), 0.9F);
    }

    @Override
    public ResourceLocation getTextureLocation(SkinnyOrangutanEntity entity) {
        return ApecraftMod.id("textures/entity/skinny_orangutan.png");
    }
}

