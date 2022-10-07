package com.apedev.apecraft;

import com.apedev.apecraft.registry.entities.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registry;

public class ModEntities {

    public static final EntityType<BonoboEntity> BONOBO = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("bonobo"), FabricEntityTypeBuilder.createMob().entityFactory(BonoboEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(BonoboEntity::createMobAttributes).dimensions(EntityDimensions.fixed(0.8F, 2F)).build());
    public static final EntityType<BonoboBruteEntity> BONOBO_BRUTE = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("bonobo_brute"), FabricEntityTypeBuilder.createMob().entityFactory(BonoboBruteEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(BonoboBruteEntity::createMobAttributes).dimensions(EntityDimensions.fixed(0.8F, 2F)).build());
    public static final EntityType<ChimpanzeeEntity> CHIMPANZEE = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("chimpanzee"), FabricEntityTypeBuilder.createMob().entityFactory(ChimpanzeeEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(ChimpanzeeEntity::createMobAttributes).dimensions(EntityDimensions.fixed(0.8F, 2F)).build());
    public static final EntityType<ChimpanzeeBruteEntity> CHIMPANZEE_BRUTE = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("chimpanzee_brute"), FabricEntityTypeBuilder.createMob().entityFactory(ChimpanzeeBruteEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(ChimpanzeeBruteEntity::createMobAttributes).dimensions(EntityDimensions.fixed(0.8F, 2F)).build());
    public static final EntityType<AlbinoChimpanzeeEntity> ALBINO_CHIMPANZEE = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("albino_chimpanzee"), FabricEntityTypeBuilder.createMob().entityFactory(AlbinoChimpanzeeEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(AlbinoChimpanzeeEntity::createMobAttributes).dimensions(EntityDimensions.fixed(0.8F, 3F)).build());
    public static final EntityType<AlbinoGorillaEntity> ALBINO_GORILLA = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("albino_gorilla"), FabricEntityTypeBuilder.createMob().entityFactory(AlbinoGorillaEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(AlbinoGorillaEntity::createMobAttributes).dimensions(EntityDimensions.fixed(1.6F, 2F)).build());
    public static final EntityType<OrangutanEntity> ORANGUTAN = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("orangutan"), FabricEntityTypeBuilder.createMob().entityFactory(OrangutanEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(OrangutanEntity::createMobAttributes).dimensions(EntityDimensions.fixed(2F, 2.5F)).build());
    public static final EntityType<SkinnyOrangutanEntity> SKINNY_ORANGUTAN = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("skinny_orangutan"), FabricEntityTypeBuilder.createMob().entityFactory(SkinnyOrangutanEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(SkinnyOrangutanEntity::createMobAttributes).dimensions(EntityDimensions.fixed(1.2F, 2.2F)).build());
    public static final EntityType<GigantopithecusEntity> GIGANTOPITHECUS = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("gigantopithecus"), FabricEntityTypeBuilder.createMob().entityFactory(GigantopithecusEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(GigantopithecusEntity::createMobAttributes).dimensions(EntityDimensions.fixed(1.6F, 3F)).build());
    public static final EntityType<GorillaEntity> GORILLA = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("gorilla"), FabricEntityTypeBuilder.createMob().entityFactory(GorillaEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(GorillaEntity::createMobAttributes).dimensions(EntityDimensions.fixed(1.6F, 2.2F)).build());
    public static final EntityType<KingKongEntity> KINGKONG = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("kingkong"), FabricEntityTypeBuilder.createMob().entityFactory(KingKongEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(KingKongEntity::createMobAttributes).dimensions(EntityDimensions.fixed(5.5F, 5.5F)).build());
    public static final EntityType<GeorgeEntity> GEORGE = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("george"), FabricEntityTypeBuilder.createMob().entityFactory(GeorgeEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(GeorgeEntity::createMobAttributes).dimensions(EntityDimensions.fixed(6F, 6F)).build());
    public static final EntityType<LangarmurEntity> LANGARMUR = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("langarmur"), FabricEntityTypeBuilder.createMob().entityFactory(LangarmurEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(LangarmurEntity::createMobAttributes).dimensions(EntityDimensions.fixed(1.6F, 2.5F)).build());
    public static final EntityType<BakulaEntity> BAKULA = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("bakula"), FabricEntityTypeBuilder.createMob().entityFactory(BakulaEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(BakulaEntity::createMobAttributes).dimensions(EntityDimensions.fixed(1.8F, 2.5F)).build());

    public static void registerAll() {
    }
}
