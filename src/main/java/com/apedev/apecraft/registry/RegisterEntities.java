package com.apedev.apecraft.registry;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.entity.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;

public class RegisterEntities {

    public static final EntityType<BonoboEntity> BONOBO = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("bonobo"), FabricEntityTypeBuilder.createMob().entityFactory(BonoboEntity::new).spawnGroup(MobCategory.CREATURE).defaultAttributes(BonoboEntity::addAttributes).dimensions(EntityDimensions.fixed(0.8F, 2F)).build());
    public static final EntityType<BonoboBruteEntity> BONOBO_BRUTE = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("bonobo_brute"), FabricEntityTypeBuilder.createMob().entityFactory(BonoboBruteEntity::new).spawnGroup(MobCategory.CREATURE).defaultAttributes(BonoboBruteEntity::addAttributes).dimensions(EntityDimensions.fixed(0.8F, 2F)).build());
    public static final EntityType<ChimpanzeeEntity> CHIMPANZEE = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("chimpanzee"), FabricEntityTypeBuilder.createMob().entityFactory(ChimpanzeeEntity::new).spawnGroup(MobCategory.CREATURE).defaultAttributes(ChimpanzeeEntity::addAttributes).dimensions(EntityDimensions.fixed(0.8F, 2F)).build());
    public static final EntityType<ChimpanzeeBruteEntity> CHIMPANZEE_BRUTE = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("chimpanzee_brute"), FabricEntityTypeBuilder.createMob().entityFactory(ChimpanzeeBruteEntity::new).spawnGroup(MobCategory.CREATURE).defaultAttributes(ChimpanzeeBruteEntity::addAttributes).dimensions(EntityDimensions.fixed(0.8F, 2F)).build());
    public static final EntityType<AlbinoChimpanzeeEntity> ALBINO_CHIMPANZEE = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("albino_chimpanzee"), FabricEntityTypeBuilder.createMob().entityFactory(AlbinoChimpanzeeEntity::new).spawnGroup(MobCategory.CREATURE).defaultAttributes(AlbinoChimpanzeeEntity::addAttributes).dimensions(EntityDimensions.fixed(0.8F, 3F)).build());
    public static final EntityType<AlbinoGorillaEntity> ALBINO_GORILLA = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("albino_gorilla"), FabricEntityTypeBuilder.createMob().entityFactory(AlbinoGorillaEntity::new).spawnGroup(MobCategory.CREATURE).defaultAttributes(AlbinoGorillaEntity::addAttributes).dimensions(EntityDimensions.fixed(1.6F, 2F)).build());
    public static final EntityType<OrangutanEntity> ORANGUTAN = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("orangutan"), FabricEntityTypeBuilder.createMob().entityFactory(OrangutanEntity::new).spawnGroup(MobCategory.CREATURE).defaultAttributes(OrangutanEntity::addAttributes).dimensions(EntityDimensions.fixed(2F, 2.5F)).build());
    public static final EntityType<SkinnyOrangutanEntity> SKINNY_ORANGUTAN = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("skinny_orangutan"), FabricEntityTypeBuilder.createMob().entityFactory(SkinnyOrangutanEntity::new).spawnGroup(MobCategory.CREATURE).defaultAttributes(SkinnyOrangutanEntity::addAttributes).dimensions(EntityDimensions.fixed(1.2F, 2.2F)).build());
    public static final EntityType<GigantopithecusEntity> GIGANTOPITHECUS = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("gigantopithecus"), FabricEntityTypeBuilder.createMob().entityFactory(GigantopithecusEntity::new).spawnGroup(MobCategory.CREATURE).defaultAttributes(GigantopithecusEntity::addAttributes).dimensions(EntityDimensions.fixed(1.6F, 3F)).build());
    public static final EntityType<GorillaEntity> GORILLA = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("gorilla"), FabricEntityTypeBuilder.createMob().entityFactory(GorillaEntity::new).spawnGroup(MobCategory.CREATURE).defaultAttributes(GorillaEntity::addAttributes).dimensions(EntityDimensions.fixed(1.6F, 2.2F)).build());
    public static final EntityType<KingKongEntity> KINGKONG = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("kingkong"), FabricEntityTypeBuilder.createMob().entityFactory(KingKongEntity::new).spawnGroup(MobCategory.CREATURE).defaultAttributes(KingKongEntity::addAttributes).dimensions(EntityDimensions.fixed(5.5F, 5.5F)).build());
    public static final EntityType<GeorgeEntity> GEORGE = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("george"), FabricEntityTypeBuilder.createMob().entityFactory(GeorgeEntity::new).spawnGroup(MobCategory.CREATURE).defaultAttributes(GeorgeEntity::addAttributes).dimensions(EntityDimensions.fixed(6F, 6F)).build());
    public static final EntityType<LangarmurEntity> LANGARMUR = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("langarmur"), FabricEntityTypeBuilder.createMob().entityFactory(LangarmurEntity::new).spawnGroup(MobCategory.CREATURE).defaultAttributes(LangarmurEntity::addAttributes).dimensions(EntityDimensions.fixed(1F, 2.5F)).build());
    public static final EntityType<BakulaEntity> BAKULA = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("bakula"), FabricEntityTypeBuilder.createMob().entityFactory(BakulaEntity::new).spawnGroup(MobCategory.CREATURE).defaultAttributes(BakulaEntity::addAttributes).dimensions(EntityDimensions.fixed(1.8F, 2.5F)).build());

    public static void registerAll() {
        SpawnPlacements.register(BONOBO, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnPlacements.register(BONOBO_BRUTE, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnPlacements.register(CHIMPANZEE, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnPlacements.register(CHIMPANZEE_BRUTE, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnPlacements.register(ALBINO_CHIMPANZEE, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnPlacements.register(ALBINO_GORILLA, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnPlacements.register(GORILLA, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnPlacements.register(KINGKONG, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnPlacements.register(GEORGE, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnPlacements.register(LANGARMUR, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnPlacements.register(BAKULA, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
    }
}
