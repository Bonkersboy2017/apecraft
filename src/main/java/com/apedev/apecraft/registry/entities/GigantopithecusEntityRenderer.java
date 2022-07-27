package com.apedev.apecraft.registry.entities;

import com.apedev.apecraft.client.ApecraftClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class GigantopithecusEntityRenderer extends MobEntityRenderer<GigantopithecusEntity, GigantopithecusEntityModel> {

    public GigantopithecusEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new GigantopithecusEntityModel(context.getPart(ApecraftClient.MODEL_GIGANTOPITHECUS_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(GigantopithecusEntity entity) {
        return new Identifier("apecraft", "textures/entity/gigantopithecus.png");
    }
}
