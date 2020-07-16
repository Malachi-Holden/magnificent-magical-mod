package com.malachiholden.magnificentmagicalmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister <Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MagnificentMagicalMod.MOD_ID);
    public static final RegistryObject<Block> PEWTER_BLOCK=BLOCKS.register("pewter_block",()-> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.5f, 6f).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> SILVER_BLOCK=BLOCKS.register("silver_block",()-> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.5f, 6f).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> COPPER_BLOCK=BLOCKS.register("copper_block",()-> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.5f, 6f).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> BRONZE_BLOCK=BLOCKS.register("bronze_block",()-> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.5f, 6f).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> BRASS_BLOCK=BLOCKS.register("brass_block",()-> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.5f, 6f).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> COPPER_ORE=BLOCKS.register("copper_ore",()-> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> SILVER_ORE=BLOCKS.register("silver_ore",()-> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5f,6f).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> COPPER_CAULDRON=BLOCKS.register("copper_cauldron",()-> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3.5f,6f).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
}
