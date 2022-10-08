package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.BonoboEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BonoboEntityRenderer extends MobEntityRenderer<BonoboEntity, BonoboEntityModel> {

    public BonoboEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new BonoboEntityModel(context.getPart(ApecraftClient.MODEL_BONOBO_LAYER)), 0.6F);
    }

    @Override
    public Identifier getTexture(BonoboEntity entity) {
        return ApecraftMod.id("textures/entity/bonobo.png");
    }
}
