package com.apedev.apecraft;

import com.apedev.apecraft.registry.entities.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {

    public static final EntityType<BonoboEntity> BONOBO = Registry.register(Registry.ENTITY_TYPE, new Identifier(ApecraftMod.MOD_ID, "bonobo"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BonoboEntity::new).dimensions(EntityDimensions.fixed(2F, 3F)).build());
    public static final EntityType<BonoboBruteEntity> BONOBO_BRUTE = Registry.register(Registry.ENTITY_TYPE, new Identifier(ApecraftMod.MOD_ID, "bonobo_brute"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BonoboBruteEntity::new).dimensions(EntityDimensions.fixed(2F, 3F)).build());
    public static final EntityType<ChimpanzeeEntity> CHIMPANZEE = Registry.register(Registry.ENTITY_TYPE, new Identifier(ApecraftMod.MOD_ID, "chimpanzee"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ChimpanzeeEntity::new).dimensions(EntityDimensions.fixed(2F, 3F)).build());
    public static final EntityType<ChimpanzeeBruteEntity> CHIMPANZEE_BRUTE = Registry.register(Registry.ENTITY_TYPE, new Identifier(ApecraftMod.MOD_ID, "chimpanzee_brute"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ChimpanzeeBruteEntity::new).dimensions(EntityDimensions.fixed(2F, 3F)).build());
    public static final EntityType<AlbinoChimpanzeeEntity> ALBINO_CHIMPANZEE = Registry.register(Registry.ENTITY_TYPE, new Identifier(ApecraftMod.MOD_ID, "albino_chimpanzee"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, AlbinoChimpanzeeEntity::new).dimensions(EntityDimensions.fixed(2F, 3F)).build());
    public static final EntityType<AlbinoGorillaEntity> ALBINO_GORILLA = Registry.register(Registry.ENTITY_TYPE, new Identifier(ApecraftMod.MOD_ID, "albino_gorilla"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, AlbinoGorillaEntity::new).dimensions(EntityDimensions.fixed(2F, 3F)).build());
    public static final EntityType<OrangutanEntity> ORANGUTAN = Registry.register(Registry.ENTITY_TYPE, new Identifier(ApecraftMod.MOD_ID, "orangutan"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, OrangutanEntity::new).dimensions(EntityDimensions.fixed(2F, 3F)).build());
    public static final EntityType<SkinnyOrangutanEntity> SKINNY_ORANGUTAN = Registry.register(Registry.ENTITY_TYPE, new Identifier(ApecraftMod.MOD_ID, "skinny_orangutan"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SkinnyOrangutanEntity::new).dimensions(EntityDimensions.fixed(2F, 3F)).build());
    public static final EntityType<GigantopithecusEntity> GIGANTOPITHECUS = Registry.register(Registry.ENTITY_TYPE, new Identifier(ApecraftMod.MOD_ID, "gigantopithecus"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GigantopithecusEntity::new).dimensions(EntityDimensions.fixed(2F, 3F)).build());
    public static final EntityType<GorillaEntity> GORILLA = Registry.register(Registry.ENTITY_TYPE, new Identifier(ApecraftMod.MOD_ID, "gorilla"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GorillaEntity::new).dimensions(EntityDimensions.fixed(2F, 3F)).build());
    public static final EntityType<KingKongEntity> KINGKONG = Registry.register(Registry.ENTITY_TYPE, new Identifier(ApecraftMod.MOD_ID, "kingkong"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, KingKongEntity::new).dimensions(EntityDimensions.fixed(8F, 6F)).build());
    public static final EntityType<GeorgeEntity> GEORGE = Registry.register(Registry.ENTITY_TYPE, new Identifier(ApecraftMod.MOD_ID, "george"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GeorgeEntity::new).dimensions(EntityDimensions.fixed(8F, 6F)).build());
    public static final EntityType<LangarmurEntity> LANGARMUR = Registry.register(Registry.ENTITY_TYPE, new Identifier(ApecraftMod.MOD_ID, "langarmur"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, LangarmurEntity::new).dimensions(EntityDimensions.fixed(2F, 3F)).build());
    public static final EntityType<BakulaEntity> BAKULA = Registry.register(Registry.ENTITY_TYPE, new Identifier(ApecraftMod.MOD_ID, "bakula"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BakulaEntity::new).dimensions(EntityDimensions.fixed(2F, 3F)).build());

    public static void registerAll() {
        FabricDefaultAttributeRegistry.register(BONOBO, BonoboEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(BONOBO_BRUTE, BonoboBruteEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(CHIMPANZEE, ChimpanzeeEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(CHIMPANZEE_BRUTE, ChimpanzeeBruteEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(ALBINO_CHIMPANZEE, AlbinoChimpanzeeEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(ALBINO_GORILLA, AlbinoGorillaEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(GORILLA, GorillaEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(ORANGUTAN, OrangutanEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(SKINNY_ORANGUTAN, SkinnyOrangutanEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(GIGANTOPITHECUS, SkinnyOrangutanEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(KINGKONG, KingKongEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(GEORGE, GeorgeEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(LANGARMUR, LangarmurEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(BAKULA, BakulaEntity.createMobAttributes());
    }}
