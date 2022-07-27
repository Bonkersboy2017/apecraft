package com.apedev.apecraft.registry.entities;

import com.apedev.apecraft.client.ApecraftClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class LangarmurEntityRenderer extends MobEntityRenderer<LangarmurEntity, LangarmurEntityModel> {

    public LangarmurEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new LangarmurEntityModel(context.getPart(ApecraftClient.MODEL_LANGURMUR_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(LangarmurEntity entity) {
        return new Identifier("apecraft", "textures/entity/langarmur.png");
    }

}

