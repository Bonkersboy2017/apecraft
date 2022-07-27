package com.apedev.apecraft.registry.entities;

import com.apedev.apecraft.client.ApecraftClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BonoboEntityRenderer extends MobEntityRenderer<BonoboEntity, BonoboEntityModel> {

    public BonoboEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new BonoboEntityModel(context.getPart(ApecraftClient.MODEL_BONOBO_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(BonoboEntity entity) {
        return new Identifier("apecraft", "textures/entity/bonobo.png");
    }
}
