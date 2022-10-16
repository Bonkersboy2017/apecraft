package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.AlbinoChimpanzeeEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class AlbinoChimpanzeeEntityRenderer extends MobRenderer<AlbinoChimpanzeeEntity, AlbinoChimpanzeeEntityModel> {

    public AlbinoChimpanzeeEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new AlbinoChimpanzeeEntityModel(context.bakeLayer(ApecraftClient.MODEL_ALBINO_CHIMPANZEE_LAYER)), 0.6F);
    }

    @Override
    public ResourceLocation getTextureLocation(AlbinoChimpanzeeEntity entity) {
        return ApecraftMod.id("textures/entity/albino_chimpanzee.png");
    }
}
