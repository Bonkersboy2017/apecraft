package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.AlbinoChimpanzeeEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class AlbinoChimpanzeeEntityRenderer extends MobEntityRenderer<AlbinoChimpanzeeEntity, AlbinoChimpanzeeEntityModel> {

    public AlbinoChimpanzeeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new AlbinoChimpanzeeEntityModel(context.getPart(ApecraftClient.MODEL_ALBINO_CHIMPANZEE_LAYER)), 0.6F);
    }

    @Override
    public Identifier getTexture(AlbinoChimpanzeeEntity entity) {
        return ApecraftMod.id("textures/entity/albino_chimpanzee.png");
    }
}
