package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.GigantopithecusEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GigantopithecusEntityRenderer extends MobRenderer<GigantopithecusEntity, GigantopithecusEntityModel> {

    public GigantopithecusEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new GigantopithecusEntityModel(context.bakeLayer(ApecraftClient.MODEL_GIGANTOPITHECUS_LAYER)), 1.2F);
    }

    @Override
    public ResourceLocation getTextureLocation(GigantopithecusEntity entity) {
        return ApecraftMod.id("textures/entity/gigantopithecus.png");
    }
}
