package com.apedev.apecraft.registry;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.entity.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Heightmap;

public class RegisterEntities {

    public static final EntityType<BonoboEntity> BONOBO = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("bonobo"), FabricEntityTypeBuilder.createMob().entityFactory(BonoboEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(BonoboEntity::addAttributes).dimensions(EntityDimensions.fixed(0.8F, 2F)).build());
    public static final EntityType<BonoboBruteEntity> BONOBO_BRUTE = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("bonobo_brute"), FabricEntityTypeBuilder.createMob().entityFactory(BonoboBruteEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(BonoboBruteEntity::addAttributes).dimensions(EntityDimensions.fixed(0.8F, 2F)).build());
    public static final EntityType<ChimpanzeeEntity> CHIMPANZEE = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("chimpanzee"), FabricEntityTypeBuilder.createMob().entityFactory(ChimpanzeeEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(ChimpanzeeEntity::addAttributes).dimensions(EntityDimensions.fixed(0.8F, 2F)).build());
    public static final EntityType<ChimpanzeeBruteEntity> CHIMPANZEE_BRUTE = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("chimpanzee_brute"), FabricEntityTypeBuilder.createMob().entityFactory(ChimpanzeeBruteEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(ChimpanzeeBruteEntity::addAttributes).dimensions(EntityDimensions.fixed(0.8F, 2F)).build());
    public static final EntityType<AlbinoChimpanzeeEntity> ALBINO_CHIMPANZEE = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("albino_chimpanzee"), FabricEntityTypeBuilder.createMob().entityFactory(AlbinoChimpanzeeEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(AlbinoChimpanzeeEntity::addAttributes).dimensions(EntityDimensions.fixed(0.8F, 3F)).build());
    public static final EntityType<AlbinoGorillaEntity> ALBINO_GORILLA = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("albino_gorilla"), FabricEntityTypeBuilder.createMob().entityFactory(AlbinoGorillaEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(AlbinoGorillaEntity::addAttributes).dimensions(EntityDimensions.fixed(1.6F, 2F)).build());
    public static final EntityType<OrangutanEntity> ORANGUTAN = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("orangutan"), FabricEntityTypeBuilder.createMob().entityFactory(OrangutanEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(OrangutanEntity::addAttributes).dimensions(EntityDimensions.fixed(2F, 2.5F)).build());
    public static final EntityType<SkinnyOrangutanEntity> SKINNY_ORANGUTAN = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("skinny_orangutan"), FabricEntityTypeBuilder.createMob().entityFactory(SkinnyOrangutanEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(SkinnyOrangutanEntity::addAttributes).dimensions(EntityDimensions.fixed(1.2F, 2.2F)).build());
    public static final EntityType<GigantopithecusEntity> GIGANTOPITHECUS = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("gigantopithecus"), FabricEntityTypeBuilder.createMob().entityFactory(GigantopithecusEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(GigantopithecusEntity::addAttributes).dimensions(EntityDimensions.fixed(1.6F, 3F)).build());
    public static final EntityType<GorillaEntity> GORILLA = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("gorilla"), FabricEntityTypeBuilder.createMob().entityFactory(GorillaEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(GorillaEntity::addAttributes).dimensions(EntityDimensions.fixed(1.6F, 2.2F)).build());
    public static final EntityType<KingKongEntity> KINGKONG = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("kingkong"), FabricEntityTypeBuilder.createMob().entityFactory(KingKongEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(KingKongEntity::addAttributes).dimensions(EntityDimensions.fixed(5.5F, 5.5F)).build());
    public static final EntityType<GeorgeEntity> GEORGE = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("george"), FabricEntityTypeBuilder.createMob().entityFactory(GeorgeEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(GeorgeEntity::addAttributes).dimensions(EntityDimensions.fixed(6F, 6F)).build());
    public static final EntityType<LangarmurEntity> LANGARMUR = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("langarmur"), FabricEntityTypeBuilder.createMob().entityFactory(LangarmurEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(LangarmurEntity::addAttributes).dimensions(EntityDimensions.fixed(1F, 2.5F)).build());
    public static final EntityType<BakulaEntity> BAKULA = Registry.register(Registry.ENTITY_TYPE, ApecraftMod.id("bakula"), FabricEntityTypeBuilder.createMob().entityFactory(BakulaEntity::new).spawnGroup(SpawnGroup.CREATURE).defaultAttributes(BakulaEntity::addAttributes).dimensions(EntityDimensions.fixed(1.8F, 2.5F)).build());

    public static void registerAll() {
        SpawnRestriction.register(BONOBO, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnRestriction.register(BONOBO_BRUTE, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnRestriction.register(CHIMPANZEE, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnRestriction.register(CHIMPANZEE_BRUTE, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnRestriction.register(ALBINO_CHIMPANZEE, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnRestriction.register(ALBINO_GORILLA, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnRestriction.register(GORILLA, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnRestriction.register(KINGKONG, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnRestriction.register(GEORGE, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnRestriction.register(LANGARMUR, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
        SpawnRestriction.register(BAKULA, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BaseMonke::spawnRestriction);
    }
}
