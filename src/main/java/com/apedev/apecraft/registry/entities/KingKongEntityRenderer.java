package com.apedev.apecraft.registry.entities;

import com.apedev.apecraft.client.ApecraftClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class KingKongEntityRenderer extends MobEntityRenderer<KingKongEntity, KingKongEntityModel> {

    public KingKongEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new KingKongEntityModel(context.getPart(ApecraftClient.MODEL_KINGKONG_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(KingKongEntity entity) {
        return new Identifier("apecraft", "textures/entity/kingkong.png");
    }
}
