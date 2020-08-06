package com.mario.mariomod.util;

import com.mario.mariomod.MarioMod;
import com.mario.mariomod.assets.blocks.BlockItemBase;
import com.mario.mariomod.assets.blocks.ModelBlock;
import com.mario.mariomod.assets.items.ModelItem;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
  
  private static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MarioMod.MODID);
  public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MarioMod.MODID);
  
  public static void init() {
    ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
  }

  // Items
  public static final RegistryObject<Item> MODEL_ITEM = ITEMS.register("model_item", ModelItem::new);
  
  //Blocks
  public static final RegistryObject<Block> MODEL_BLOCK = BLOCKS.register("model_block", ModelBlock::new);
 
  // Block Items -- Held in hand/inventory
  public static final RegistryObject<Item> MODEL_BLOCK_ITEM = ITEMS.register("model_block", () -> new BlockItemBase(MODEL_BLOCK.get()));
}
