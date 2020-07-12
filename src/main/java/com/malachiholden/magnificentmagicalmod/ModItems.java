package com.malachiholden.magnificentmagicalmod;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MagnificentMagicalMod.MOD_ID);
    public static final RegistryObject<Item> SILVER_BLOCK = ITEMS.register("silver_block", ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEWTER_BLOCK = ITEMS.register("pewter_block", ()->new Item(new Item.Properties()));
}