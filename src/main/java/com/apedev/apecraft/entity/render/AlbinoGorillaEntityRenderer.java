package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.AlbinoGorillaEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AlbinoGorillaEntityRenderer extends MobRenderer<AlbinoGorillaEntity, AlbinoGorillaEntityModel> {

    public AlbinoGorillaEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new AlbinoGorillaEntityModel(context.bakeLayer(ApecraftClient.MODEL_ALBINO_GORILLA_ENTITY)), 1.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(AlbinoGorillaEntity entity) {
        return ApecraftMod.id("textures/entity/albino_gorilla.png");
    }
}

