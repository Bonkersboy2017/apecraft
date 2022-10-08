package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.KingKongEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class KingKongEntityRenderer extends MobEntityRenderer<KingKongEntity, KingKongEntityModel> {

    public KingKongEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new KingKongEntityModel(context.getPart(ApecraftClient.MODEL_KINGKONG_LAYER)), 3.5F);
    }

    @Override
    public Identifier getTexture(KingKongEntity entity) {
        return ApecraftMod.id("textures/entity/kingkong.png");
    }
}
