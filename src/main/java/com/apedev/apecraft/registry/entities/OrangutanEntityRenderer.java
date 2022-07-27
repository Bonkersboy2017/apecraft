package com.apedev.apecraft.registry.entities;

import com.apedev.apecraft.client.ApecraftClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class OrangutanEntityRenderer extends MobEntityRenderer<OrangutanEntity, OrangutanEntityModel> {

    public OrangutanEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new OrangutanEntityModel(context.getPart(ApecraftClient.MODEL_ORANGUTAN_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(OrangutanEntity entity) {
        return new Identifier("apecraft", "textures/entity/orangutan.png");
    }
}

