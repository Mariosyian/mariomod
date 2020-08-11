package com.mario.mariomod.util;

import com.mario.mariomod.MarioMod;
import com.mario.mariomod.assets.armor.ArmorTiers;
import com.mario.mariomod.assets.blocks.BlockItemBase;
import com.mario.mariomod.assets.blocks.NoraBlock;
import com.mario.mariomod.assets.items.ItemBase;
import com.mario.mariomod.assets.tools.ToolTiers;

import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
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
  private static final SwordItem N_SWORD = new SwordItem(ToolTiers.NORA, 8, 0.0f, new Item.Properties().group(MarioMod.TAB));
  public static final RegistryObject<SwordItem> NORA_SWORD = ITEMS.register("nora_sword", () -> { return N_SWORD; });
  
  private static final PickaxeItem N_PIACKE = new PickaxeItem(ToolTiers.NORA, 2, 0.0f, new Item.Properties().group(MarioMod.TAB));
  public static final RegistryObject<PickaxeItem> NORA_PICKAXE = ITEMS.register("nora_pickaxe", () -> { return N_PIACKE; });
  
  private static final AxeItem N_AXE = new AxeItem(ToolTiers.NORA, 3, 0.0f, new Item.Properties().group(MarioMod.TAB));
  public static final RegistryObject<AxeItem> NORA_AXE = ITEMS.register("nora_axe", () -> { return N_AXE; });
  
  private static final ShovelItem N_SHOVEL = new ShovelItem(ToolTiers.NORA, 1, 0.0f, new Item.Properties().group(MarioMod.TAB));
  public static final RegistryObject<ShovelItem> NORA_SHOVEL = ITEMS.register("nora_shovel", () -> { return N_SHOVEL; });
  
  private static final HoeItem N_HOE = new HoeItem(ToolTiers.NORA, 0.0f, new Item.Properties().group(MarioMod.TAB));
  public static final RegistryObject<HoeItem> NORA_HOE = ITEMS.register("nora_hoe", () -> { return N_HOE; });
  
  // Armor
  private static final ArmorItem N_HELMET = new ArmorItem(ArmorTiers.NORA, EquipmentSlotType.HEAD, new Item.Properties().group(MarioMod.TAB));
  public static final RegistryObject<ArmorItem> NORA_HELMET = ITEMS.register("armor/nora_helmet", () -> { return N_HELMET; });
  
  private static final ArmorItem N_CHEST = new ArmorItem(ArmorTiers.NORA, EquipmentSlotType.CHEST, new Item.Properties().group(MarioMod.TAB));
  public static final RegistryObject<ArmorItem> NORA_CHEST = ITEMS.register("armor/nora_chest", () -> { return N_CHEST; });
  
  private static final ArmorItem N_LEGGINGS = new ArmorItem(ArmorTiers.NORA, EquipmentSlotType.LEGS, new Item.Properties().group(MarioMod.TAB));
  public static final RegistryObject<ArmorItem> NORA_LEGGINGS = ITEMS.register("armor/nora_leggings", () -> { return N_LEGGINGS; });
  
  private static final ArmorItem N_BOOTS = new ArmorItem(ArmorTiers.NORA, EquipmentSlotType.FEET, new Item.Properties().group(MarioMod.TAB));
  public static final RegistryObject<ArmorItem> NORA_BOOTS = ITEMS.register("armor/nora_boots", () -> { return N_BOOTS; });
}
