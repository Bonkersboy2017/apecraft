package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.ChimpanzeeBruteEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class ChimpanzeeBruteEntityRenderer extends MobEntityRenderer<ChimpanzeeBruteEntity, ChimpanzeeBruteEntityModel> {

    public ChimpanzeeBruteEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new ChimpanzeeBruteEntityModel(context.getPart(ApecraftClient.MODEL_CHIMPANZEE_BRUTE_LAYER)), 0.6F);
    }

    @Override
    public Identifier getTexture(ChimpanzeeBruteEntity entity) {
        return ApecraftMod.id("textures/entity/chimpanzee_brute.png");
    }
}
