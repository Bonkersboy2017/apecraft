package com.apedev.apecraft.registry.entities;

import com.apedev.apecraft.client.ApecraftClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class AlbinoChimpanzeeEntityRenderer extends MobEntityRenderer<AlbinoChimpanzeeEntity, AlbinoChimpanzeeEntityModel> {

    public AlbinoChimpanzeeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new AlbinoChimpanzeeEntityModel(context.getPart(ApecraftClient.MODEL_ALBINO_CHIMPANZEE_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(AlbinoChimpanzeeEntity entity) {
        return new Identifier("apecraft", "textures/entity/albino_chimpanzee.png");
    }
}
