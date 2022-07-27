package com.apedev.apecraft.registry.entities;

import com.apedev.apecraft.client.ApecraftClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class GorillaEntityRenderer extends MobEntityRenderer<GorillaEntity, GorillaEntityModel> {

    public GorillaEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new GorillaEntityModel(context.getPart(ApecraftClient.MODEL_GORILLA_ENTITY)), 0.5f);
    }

    @Override
    public Identifier getTexture(GorillaEntity entity) {
        return new Identifier("apecraft", "textures/entity/gorilla.png");
    }}



