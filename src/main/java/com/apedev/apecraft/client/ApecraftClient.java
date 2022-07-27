package com.apedev.apecraft.client;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.ModEntities;
import com.apedev.apecraft.registry.entities.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ApecraftClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_BONOBO_LAYER = new EntityModelLayer(new Identifier(ApecraftMod.MOD_ID, "bonobo"), "main");
    public static final EntityModelLayer MODEL_BONOBO_BRUTE_LAYER = new EntityModelLayer(new Identifier(ApecraftMod.MOD_ID, "bonobo_brute"), "main");
    public static final EntityModelLayer MODEL_CHIMPANZEE_LAYER = new EntityModelLayer(new Identifier(ApecraftMod.MOD_ID, "chimpanzee"), "main");
    public static final EntityModelLayer MODEL_CHIMPANZEE_BRUTE_LAYER = new EntityModelLayer(new Identifier(ApecraftMod.MOD_ID, "chimpanzee_brute"), "main");
    public static final EntityModelLayer MODEL_ALBINO_CHIMPANZEE_LAYER = new EntityModelLayer(new Identifier(ApecraftMod.MOD_ID, "albino_chimpanzee"), "main");
    public static final EntityModelLayer MODEL_ALBINO_GORILLA_ENTITY = new EntityModelLayer(new Identifier(ApecraftMod.MOD_ID, "albino_gorilla"), "main");
    public static final EntityModelLayer MODEL_GORILLA_ENTITY = new EntityModelLayer(new Identifier(ApecraftMod.MOD_ID, "gorilla"), "main");
    public static final EntityModelLayer MODEL_ORANGUTAN_LAYER = new EntityModelLayer(new Identifier(ApecraftMod.MOD_ID, "orangutan"), "main");
    public static final EntityModelLayer MODEL_SKINNY_ORANGUTAN_LAYER = new EntityModelLayer(new Identifier(ApecraftMod.MOD_ID, "skinny_orangutan"), "main");
    public static final EntityModelLayer MODEL_GIGANTOPITHECUS_LAYER = new EntityModelLayer(new Identifier(ApecraftMod.MOD_ID, "gigantopithecus"), "main");
    public static final EntityModelLayer MODEL_KINGKONG_LAYER = new EntityModelLayer(new Identifier(ApecraftMod.MOD_ID, "kingkong"), "main");
    public static final EntityModelLayer MODEL_GEORGE_LAYER = new EntityModelLayer(new Identifier(ApecraftMod.MOD_ID, "george"), "main");
    public static final EntityModelLayer MODEL_LANGURMUR_LAYER = new EntityModelLayer(new Identifier(ApecraftMod.MOD_ID, "langarmur"), "main");
    public static final EntityModelLayer MODEL_BAKULA_LAYER = new EntityModelLayer(new Identifier(ApecraftMod.MOD_ID, "bakula"), "main");
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.BONOBO, BonoboEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_BONOBO_LAYER, BonoboEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.BONOBO_BRUTE, BonoboBruteEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_BONOBO_BRUTE_LAYER, BonoboBruteEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.CHIMPANZEE, ChimpanzeeEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_CHIMPANZEE_LAYER, ChimpanzeeEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.CHIMPANZEE_BRUTE, ChimpanzeeBruteEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_CHIMPANZEE_BRUTE_LAYER, ChimpanzeeBruteEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.ALBINO_CHIMPANZEE, AlbinoChimpanzeeEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_ALBINO_CHIMPANZEE_LAYER, AlbinoChimpanzeeEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_ALBINO_GORILLA_ENTITY, AlbinoGorillaEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.ALBINO_GORILLA, AlbinoGorillaEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_GORILLA_ENTITY, GorillaEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.GORILLA, GorillaEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_ORANGUTAN_LAYER, OrangutanEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.ORANGUTAN, OrangutanEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_SKINNY_ORANGUTAN_LAYER, SkinnyOrangutanEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.SKINNY_ORANGUTAN, SkinnyOrangutanEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_GIGANTOPITHECUS_LAYER, GigantopithecusEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.GIGANTOPITHECUS, GigantopithecusEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_KINGKONG_LAYER, KingKongEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.KINGKONG, KingKongEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_GEORGE_LAYER, GeorgeEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.GEORGE, GeorgeEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_LANGURMUR_LAYER, LangarmurEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.LANGARMUR, LangarmurEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_BAKULA_LAYER, BakulaEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.BAKULA, BakulaEntityRenderer::new);


    }
}
