package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.KingKongEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class KingKongEntityRenderer extends MobRenderer<KingKongEntity, KingKongEntityModel> {

    public KingKongEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new KingKongEntityModel(context.bakeLayer(ApecraftClient.MODEL_KINGKONG_LAYER)), 3.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(KingKongEntity entity) {
        return ApecraftMod.id("textures/entity/kingkong.png");
    }
}
