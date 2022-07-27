package com.apedev.apecraft.registry.entities;

import com.apedev.apecraft.client.ApecraftClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class ChimpanzeeBruteEntityRenderer extends MobEntityRenderer<ChimpanzeeBruteEntity, ChimpanzeeBruteEntityModel> {

    public ChimpanzeeBruteEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new ChimpanzeeBruteEntityModel(context.getPart(ApecraftClient.MODEL_CHIMPANZEE_BRUTE_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(ChimpanzeeBruteEntity entity) {
        return new Identifier("apecraft", "textures/entity/chimpanzee_brute.png");
    }
}
