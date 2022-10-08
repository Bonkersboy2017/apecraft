package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.OrangutanEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class OrangutanEntityRenderer extends MobEntityRenderer<OrangutanEntity, OrangutanEntityModel> {

    public OrangutanEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new OrangutanEntityModel(context.getPart(ApecraftClient.MODEL_ORANGUTAN_LAYER)), 1.5F);
    }

    @Override
    public Identifier getTexture(OrangutanEntity entity) {
        return ApecraftMod.id("textures/entity/orangutan.png");
    }
}

