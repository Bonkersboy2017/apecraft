package com.apedev.apecraft.registry;

import com.apedev.apecraft.ApecraftMod;
import com.apedev.apecraft.block.BananaBranchBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WoodButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class RegisterBlocks {

    public static final BlockBehaviour.Properties REDWOOD_SETTINGS = FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS);

    public static final Block REDWOOD_LEAVES = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).noOcclusion());
    public static final Block REDWOOD_LEAVES_WITH_PINECONE = new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).noOcclusion());
    public static final Block REDWOOD_LOG = new RotatedPillarBlock(REDWOOD_SETTINGS);
    public static final Block REDWOOD_PLANKS = new Block(REDWOOD_SETTINGS);
    public static final Block MUDSTONE = new DropExperienceBlock(FabricBlockSettings.copyOf(Blocks.STONE).sound(SoundType.STONE));
    public static final Block MUDSTONE_TILES = new Block(FabricBlockSettings.copyOf(Blocks.STONE).sound(SoundType.STONE));
    public static final Block POLISHED_MUDSTONE = new Block(FabricBlockSettings.copyOf(Blocks.STONE).sound(SoundType.STONE));
    public static final Block SILVER_ORE = new DropExperienceBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).sound(SoundType.STONE));
    public static final Block SILVER_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sound(SoundType.STONE));
    public static final Block BANANA_BRANCH = new BananaBranchBlock(FabricBlockSettings.copyOf(Blocks.COCOA).sound(SoundType.BAMBOO));
    public static final Block REDWOOD_STAIRS = new StairBlock(Blocks.OAK_STAIRS.defaultBlockState(), REDWOOD_SETTINGS);
    public static final Block REDWOOD_BUTTON = new WoodButtonBlock(REDWOOD_SETTINGS);
    public static final Block REDWOOD_PRESSURE_PLATE = new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, REDWOOD_SETTINGS);
    public static final Block REDWOOD_SLAB = new SlabBlock(REDWOOD_SETTINGS);


    public static void registerAll() {

        registerBlock(REDWOOD_PLANKS, ApecraftMod.ITEM_GROUP, ApecraftMod.id("redwood_planks"));
        registerBlock(REDWOOD_LOG, ApecraftMod.ITEM_GROUP, ApecraftMod.id("redwood_log"));
        registerBlock(REDWOOD_LEAVES, ApecraftMod.ITEM_GROUP, ApecraftMod.id("redwood_leaves"));
        registerBlock(REDWOOD_LEAVES_WITH_PINECONE, ApecraftMod.ITEM_GROUP, ApecraftMod.id("redwood_leaves_with_pinecone"));
        registerBlock(MUDSTONE, ApecraftMod.ITEM_GROUP, ApecraftMod.id("mudstone"));
        registerBlock(MUDSTONE_TILES, ApecraftMod.ITEM_GROUP, ApecraftMod.id("mudstone_tiles"));
        registerBlock(POLISHED_MUDSTONE, ApecraftMod.ITEM_GROUP, ApecraftMod.id("polished_mudstone"));
        registerBlock(SILVER_ORE, ApecraftMod.ITEM_GROUP, ApecraftMod.id("silver_ore"));
        registerBlock(SILVER_BLOCK, ApecraftMod.ITEM_GROUP, ApecraftMod.id("silver_block"));
        registerBlock(BANANA_BRANCH, ApecraftMod.ITEM_GROUP, ApecraftMod.id("banana_branch"));
        registerBlock(REDWOOD_STAIRS, ApecraftMod.ITEM_GROUP, ApecraftMod.id("redwood_stairs"));
        registerBlock(REDWOOD_BUTTON, ApecraftMod.ITEM_GROUP, ApecraftMod.id("redwood_button"));
        registerBlock(REDWOOD_PRESSURE_PLATE, ApecraftMod.ITEM_GROUP, ApecraftMod.id("redwood_pressure_plate"));
        registerBlock(REDWOOD_SLAB, ApecraftMod.ITEM_GROUP, ApecraftMod.id("redwood_slab"));


    }

    private static void registerBlock(Block block, CreativeModeTab group, ResourceLocation ID) {
        Registry.register(Registry.BLOCK, ID, block);
        Registry.register(Registry.ITEM, ID, new BlockItem(block, new Item.Properties().tab(group)));


    }
}
