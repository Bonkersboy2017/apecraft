package com.apedev.apecraft.registry.entities;

import com.apedev.apecraft.client.ApecraftClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class GeorgeEntityRenderer extends MobEntityRenderer<GeorgeEntity, GeorgeEntityModel> {

    public GeorgeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new GeorgeEntityModel(context.getPart(ApecraftClient.MODEL_GEORGE_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(GeorgeEntity entity) {
        return new Identifier("apecraft", "textures/entity/george.png");
    }

}