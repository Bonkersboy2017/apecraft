package com.apedev.apecraft.registry.entities;

import com.apedev.apecraft.client.ApecraftClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class ChimpanzeeEntityRenderer extends MobEntityRenderer<ChimpanzeeEntity, ChimpanzeeEntityModel> {

    public ChimpanzeeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new ChimpanzeeEntityModel(context.getPart(ApecraftClient.MODEL_CHIMPANZEE_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(ChimpanzeeEntity entity) {
        return new Identifier("apecraft", "textures/entity/chimpanzee.png");
    }
}
