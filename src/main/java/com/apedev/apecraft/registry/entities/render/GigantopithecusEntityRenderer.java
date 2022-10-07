package com.apedev.apecraft.registry.entities.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.registry.entities.GigantopithecusEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class GigantopithecusEntityRenderer extends MobEntityRenderer<GigantopithecusEntity, GigantopithecusEntityModel> {

    public GigantopithecusEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new GigantopithecusEntityModel(context.getPart(ApecraftClient.MODEL_GIGANTOPITHECUS_LAYER)), 1.2F);
    }

    @Override
    public Identifier getTexture(GigantopithecusEntity entity) {
        return ApecraftMod.id("textures/entity/gigantopithecus.png");
    }
}
