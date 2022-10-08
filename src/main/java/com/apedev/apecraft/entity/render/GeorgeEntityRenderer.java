package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.GeorgeEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class GeorgeEntityRenderer extends MobEntityRenderer<GeorgeEntity, GeorgeEntityModel> {

    public GeorgeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new GeorgeEntityModel(context.getPart(ApecraftClient.MODEL_GEORGE_LAYER)), 4.0F);
    }

    @Override
    public Identifier getTexture(GeorgeEntity entity) {
        return ApecraftMod.id("textures/entity/george.png");
    }

}