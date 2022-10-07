package com.apedev.apecraft.registry.entities.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.registry.entities.SkinnyOrangutanEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class SkinnyOrangutanEntityRenderer extends MobEntityRenderer<SkinnyOrangutanEntity, SkinnyOrangutanEntityModel> {

    public SkinnyOrangutanEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new SkinnyOrangutanEntityModel(context.getPart(ApecraftClient.MODEL_SKINNY_ORANGUTAN_LAYER)), 0.9F);
    }

    @Override
    public Identifier getTexture(SkinnyOrangutanEntity entity) {
        return ApecraftMod.id("textures/entity/skinny_orangutan.png");
    }
}

