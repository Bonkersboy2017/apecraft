package com.apedev.apecraft.registry.entities;

import com.apedev.apecraft.client.ApecraftClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BakulaEntityRenderer extends MobEntityRenderer<BakulaEntity, BakulaEntityModel> {

    public BakulaEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new BakulaEntityModel(context.getPart(ApecraftClient.MODEL_BAKULA_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(BakulaEntity entity) {
        return new Identifier("apecraft", "textures/entity/bakula.png");
    }
}
