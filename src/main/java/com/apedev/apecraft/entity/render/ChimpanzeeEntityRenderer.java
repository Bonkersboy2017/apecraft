package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.ChimpanzeeEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ChimpanzeeEntityRenderer extends MobRenderer<ChimpanzeeEntity, ChimpanzeeEntityModel> {

    public ChimpanzeeEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new ChimpanzeeEntityModel(context.bakeLayer(ApecraftClient.MODEL_CHIMPANZEE_LAYER)), 0.6F);
    }

    @Override
    public ResourceLocation getTextureLocation(ChimpanzeeEntity entity) {
        return ApecraftMod.id("textures/entity/chimpanzee.png");
    }
}
