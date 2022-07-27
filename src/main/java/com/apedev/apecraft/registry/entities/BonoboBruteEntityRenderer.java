package com.apedev.apecraft.registry.entities;

import com.apedev.apecraft.client.ApecraftClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BonoboBruteEntityRenderer extends MobEntityRenderer<BonoboBruteEntity, BonoboBruteEntityModel> {

    public BonoboBruteEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new BonoboBruteEntityModel(context.getPart(ApecraftClient.MODEL_BONOBO_BRUTE_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(BonoboBruteEntity entity) {
        return new Identifier("apecraft", "textures/entity/bonobo_brute.png");
    }
}
