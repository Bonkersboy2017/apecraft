package com.apedev.apecraft.registry.entities.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.registry.entities.BakulaEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BakulaEntityRenderer extends MobEntityRenderer<BakulaEntity, BakulaEntityModel> {

    public BakulaEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new BakulaEntityModel(context.getPart(ApecraftClient.MODEL_BAKULA_LAYER)), 1.3F);
    }

    @Override
    public Identifier getTexture(BakulaEntity entity) {
        return ApecraftMod.id("textures/entity/bakula.png");
    }
}
