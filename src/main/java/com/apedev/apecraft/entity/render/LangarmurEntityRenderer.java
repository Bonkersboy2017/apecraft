package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.LangarmurEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class LangarmurEntityRenderer extends MobEntityRenderer<LangarmurEntity, LangarmurEntityModel> {

    public LangarmurEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new LangarmurEntityModel(context.getPart(ApecraftClient.MODEL_LANGURMUR_LAYER)), 0.9F);
    }

    @Override
    public Identifier getTexture(LangarmurEntity entity) {
        return ApecraftMod.id("textures/entity/langarmur.png");
    }

}

