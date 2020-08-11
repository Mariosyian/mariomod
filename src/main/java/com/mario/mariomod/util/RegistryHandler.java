package com.mario.mariomod.util;

import com.mario.mariomod.MarioMod;
import com.mario.mariomod.assets.blocks.BlockItemBase;
import com.mario.mariomod.assets.blocks.NoraBlock;
import com.mario.mariomod.assets.items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
  
  public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MarioMod.MODID);
  public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MarioMod.MODID);
  
  public static void init() {
    ArmorRegistry.init();
    ToolRegistry.init();
    
    ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
  }

  // Items
  public static final RegistryObject<Item> NORA_STICK = ITEMS.register("nora_stick", ItemBase::new);
  
  //Blocks
  public static final RegistryObject<Block> NORA_BLOCK = BLOCKS.register("nora_block", NoraBlock::new);
 
  // Block Items -- Held in hand/inventory -- MUST MIRROR BLOCKS ABOVE
  public static final RegistryObject<Item> NORA_BLOCK_BLOCKITEM = ITEMS.register("nora_block", () -> new BlockItemBase(NORA_BLOCK.get()));
}
