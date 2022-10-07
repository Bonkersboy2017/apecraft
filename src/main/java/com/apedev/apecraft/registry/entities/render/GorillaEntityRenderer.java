package com.apedev.apecraft.registry.entities.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.registry.entities.GorillaEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class GorillaEntityRenderer extends MobEntityRenderer<GorillaEntity, GorillaEntityModel> {

    public GorillaEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new GorillaEntityModel(context.getPart(ApecraftClient.MODEL_GORILLA_ENTITY)), 1.2F);
    }

    @Override
    public Identifier getTexture(GorillaEntity entity) {
        return ApecraftMod.id("textures/entity/gorilla.png");
    }}



