package com.mario.mariomod.util;

import com.mario.mariomod.MarioMod;
import com.mario.mariomod.assets.tools.ToolTiers;

import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ToolRegistry {


  @SuppressWarnings("unused")
  public static void init() {
    DeferredRegister<Item> ITEMS = RegistryHandler.ITEMS;

    // lang ID tool.nora_sword
    SwordItem N_SWORD = new SwordItem(ToolTiers.NORA, 8, 0.0f, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<SwordItem> NORA_SWORD = ITEMS.register("tool/nora_sword", () -> { return N_SWORD; });
    
    PickaxeItem N_PIACKE = new PickaxeItem(ToolTiers.NORA, 2, 0.0f, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<PickaxeItem> NORA_PICKAXE = ITEMS.register("tool/nora_pickaxe", () -> { return N_PIACKE; });
    
    AxeItem N_AXE = new AxeItem(ToolTiers.NORA, 3, 0.0f, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<AxeItem> NORA_AXE = ITEMS.register("tool/nora_axe", () -> { return N_AXE; });
    
    ShovelItem N_SHOVEL = new ShovelItem(ToolTiers.NORA, 1, 0.0f, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<ShovelItem> NORA_SHOVEL = ITEMS.register("tool/nora_shovel", () -> { return N_SHOVEL; });
    
    HoeItem N_HOE = new HoeItem(ToolTiers.NORA, 0.0f, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<HoeItem> NORA_HOE = ITEMS.register("tool/nora_hoe", () -> { return N_HOE; });
  }
  
}
