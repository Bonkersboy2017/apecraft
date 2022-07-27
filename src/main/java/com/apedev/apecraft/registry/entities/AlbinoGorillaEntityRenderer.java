package com.apedev.apecraft.registry.entities;

import com.apedev.apecraft.client.ApecraftClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class AlbinoGorillaEntityRenderer extends MobEntityRenderer<AlbinoGorillaEntity, AlbinoGorillaEntityModel> {

    public AlbinoGorillaEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new AlbinoGorillaEntityModel(context.getPart(ApecraftClient.MODEL_ALBINO_GORILLA_ENTITY)), 0.5f);
    }

    @Override
    public Identifier getTexture(AlbinoGorillaEntity entity) {
        return new Identifier("apecraft", "textures/entity/albino_gorilla.png");
    }
}

