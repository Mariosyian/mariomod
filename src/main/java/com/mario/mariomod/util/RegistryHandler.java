package com.mario.mariomod.util;

import com.mario.mariomod.MarioMod;
import com.mario.mariomod.assets.blocks.BlockItemBase;
import com.mario.mariomod.assets.blocks.NoraBlock;
import com.mario.mariomod.assets.items.ItemBase;
import com.mario.mariomod.assets.tools.Tiers;

import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
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
  public static final RegistryObject<Item> NORA_STICK = ITEMS.register("nora_stick", ItemBase::new);
  
  //Blocks
  public static final RegistryObject<Block> NORA_BLOCK = BLOCKS.register("nora_block", NoraBlock::new);
 
  // Block Items -- Held in hand/inventory -- MUST MIRROR BLOCKS ABOVE
  public static final RegistryObject<Item> NORA_BLOCK_BLOCKITEM = ITEMS.register("nora_block", () -> new BlockItemBase(NORA_BLOCK.get()));
  
  // Tools
  public static final RegistryObject<SwordItem> NORA_SWORD = ITEMS.register("nora_sword", () -> {
    return new SwordItem(Tiers.NORA, 8, 0.0f, new Item.Properties().group(MarioMod.TAB));    
  });
  
  public static final RegistryObject<PickaxeItem> NORA_PICKAXE = ITEMS.register("nora_pickaxe", () -> {
    return new PickaxeItem(Tiers.NORA, 2, 0.0f, new Item.Properties().group(MarioMod.TAB));    
  });
  
  public static final RegistryObject<AxeItem> NORA_AXE = ITEMS.register("nora_axe", () -> {
    return new AxeItem(Tiers.NORA, 3, 0.0f, new Item.Properties().group(MarioMod.TAB));    
  });
  
  public static final RegistryObject<ShovelItem> NORA_SHOVEL = ITEMS.register("nora_shovel", () -> {
    return new ShovelItem(Tiers.NORA, 1, 0.0f, new Item.Properties().group(MarioMod.TAB));    
  });
  
  public static final RegistryObject<HoeItem> NORA_HOE = ITEMS.register("nora_hoe", () -> {
    return new HoeItem(Tiers.NORA, 0.0f, new Item.Properties().group(MarioMod.TAB));    
  });
}
