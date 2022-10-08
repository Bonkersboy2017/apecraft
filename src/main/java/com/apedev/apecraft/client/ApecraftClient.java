package com.apedev.apecraft.client;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.registry.RegisterEntities;
import com.apedev.apecraft.entity.render.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;

@Environment(EnvType.CLIENT)
public class ApecraftClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_BONOBO_LAYER = new EntityModelLayer(ApecraftMod.id("bonobo"), "main");
    public static final EntityModelLayer MODEL_BONOBO_BRUTE_LAYER = new EntityModelLayer(ApecraftMod.id("bonobo_brute"), "main");
    public static final EntityModelLayer MODEL_CHIMPANZEE_LAYER = new EntityModelLayer(ApecraftMod.id("chimpanzee"), "main");
    public static final EntityModelLayer MODEL_CHIMPANZEE_BRUTE_LAYER = new EntityModelLayer(ApecraftMod.id("chimpanzee_brute"), "main");
    public static final EntityModelLayer MODEL_ALBINO_CHIMPANZEE_LAYER = new EntityModelLayer(ApecraftMod.id("albino_chimpanzee"), "main");
    public static final EntityModelLayer MODEL_ALBINO_GORILLA_ENTITY = new EntityModelLayer(ApecraftMod.id("albino_gorilla"), "main");
    public static final EntityModelLayer MODEL_GORILLA_ENTITY = new EntityModelLayer(ApecraftMod.id("gorilla"), "main");
    public static final EntityModelLayer MODEL_ORANGUTAN_LAYER = new EntityModelLayer(ApecraftMod.id("orangutan"), "main");
    public static final EntityModelLayer MODEL_SKINNY_ORANGUTAN_LAYER = new EntityModelLayer(ApecraftMod.id("skinny_orangutan"), "main");
    public static final EntityModelLayer MODEL_GIGANTOPITHECUS_LAYER = new EntityModelLayer(ApecraftMod.id("gigantopithecus"), "main");
    public static final EntityModelLayer MODEL_KINGKONG_LAYER = new EntityModelLayer(ApecraftMod.id("kingkong"), "main");
    public static final EntityModelLayer MODEL_GEORGE_LAYER = new EntityModelLayer(ApecraftMod.id("george"), "main");
    public static final EntityModelLayer MODEL_LANGURMUR_LAYER = new EntityModelLayer(ApecraftMod.id("langarmur"), "main");
    public static final EntityModelLayer MODEL_BAKULA_LAYER = new EntityModelLayer(ApecraftMod.id("bakula"), "main");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(RegisterEntities.BONOBO, BonoboEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_BONOBO_LAYER, BonoboEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(RegisterEntities.BONOBO_BRUTE, BonoboBruteEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_BONOBO_BRUTE_LAYER, BonoboBruteEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(RegisterEntities.CHIMPANZEE, ChimpanzeeEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_CHIMPANZEE_LAYER, ChimpanzeeEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(RegisterEntities.CHIMPANZEE_BRUTE, ChimpanzeeBruteEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_CHIMPANZEE_BRUTE_LAYER, ChimpanzeeBruteEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(RegisterEntities.ALBINO_CHIMPANZEE, AlbinoChimpanzeeEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_ALBINO_CHIMPANZEE_LAYER, AlbinoChimpanzeeEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_ALBINO_GORILLA_ENTITY, AlbinoGorillaEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(RegisterEntities.ALBINO_GORILLA, AlbinoGorillaEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_GORILLA_ENTITY, GorillaEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(RegisterEntities.GORILLA, GorillaEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_ORANGUTAN_LAYER, OrangutanEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(RegisterEntities.ORANGUTAN, OrangutanEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_SKINNY_ORANGUTAN_LAYER, SkinnyOrangutanEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(RegisterEntities.SKINNY_ORANGUTAN, SkinnyOrangutanEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_GIGANTOPITHECUS_LAYER, GigantopithecusEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(RegisterEntities.GIGANTOPITHECUS, GigantopithecusEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_KINGKONG_LAYER, KingKongEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(RegisterEntities.KINGKONG, KingKongEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_GEORGE_LAYER, GeorgeEntityModel::createBodyLayer);
        EntityRendererRegistry.register(RegisterEntities.GEORGE, GeorgeEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_LANGURMUR_LAYER, LangarmurEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(RegisterEntities.LANGARMUR, LangarmurEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_BAKULA_LAYER, BakulaEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(RegisterEntities.BAKULA, BakulaEntityRenderer::new);


    }
}
