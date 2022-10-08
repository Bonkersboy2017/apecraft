package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.AlbinoGorillaEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class AlbinoGorillaEntityRenderer extends MobEntityRenderer<AlbinoGorillaEntity, AlbinoGorillaEntityModel> {

    public AlbinoGorillaEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new AlbinoGorillaEntityModel(context.getPart(ApecraftClient.MODEL_ALBINO_GORILLA_ENTITY)), 1.2F);
    }

    @Override
    public Identifier getTexture(AlbinoGorillaEntity entity) {
        return ApecraftMod.id("textures/entity/albino_gorilla.png");
    }
}

