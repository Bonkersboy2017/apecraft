package com.apedev.apecraft.registry.entities.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.registry.entities.BonoboBruteEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BonoboBruteEntityRenderer extends MobEntityRenderer<BonoboBruteEntity, BonoboBruteEntityModel> {

    public BonoboBruteEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new BonoboBruteEntityModel(context.getPart(ApecraftClient.MODEL_BONOBO_BRUTE_LAYER)), 0.6F);
    }

    @Override
    public Identifier getTexture(BonoboBruteEntity entity) {
        return ApecraftMod.id("textures/entity/bonobo_brute.png");
    }
}
