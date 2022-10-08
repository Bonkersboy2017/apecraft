package com.apedev.apecraft.entity.render;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.client.ApecraftClient;
import com.apedev.apecraft.entity.ChimpanzeeEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class ChimpanzeeEntityRenderer extends MobEntityRenderer<ChimpanzeeEntity, ChimpanzeeEntityModel> {

    public ChimpanzeeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new ChimpanzeeEntityModel(context.getPart(ApecraftClient.MODEL_CHIMPANZEE_LAYER)), 0.6F);
    }

    @Override
    public Identifier getTexture(ChimpanzeeEntity entity) {
        return ApecraftMod.id("textures/entity/chimpanzee.png");
    }
}
