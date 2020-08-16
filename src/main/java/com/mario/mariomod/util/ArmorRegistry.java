package com.mario.mariomod.util;

import com.mario.mariomod.MarioMod;
import com.mario.mariomod.assets.armor.ArmorTiers;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ArmorRegistry {

  
  @SuppressWarnings("unused")
  public static void init() {
    DeferredRegister<Item> ITEMS = RegistryHandler.ITEMS;

    // Nora Armor
    ArmorItem N_HELMET = new ArmorItem(ArmorTiers.NORA, EquipmentSlotType.HEAD, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<ArmorItem> NORA_HELMET = ITEMS.register("armor/nora_helmet", () -> { return N_HELMET; });
    
    ArmorItem N_CHEST = new ArmorItem(ArmorTiers.NORA, EquipmentSlotType.CHEST, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<ArmorItem> NORA_CHEST = ITEMS.register("armor/nora_chest", () -> { return N_CHEST; });
    
    ArmorItem N_LEGGINGS = new ArmorItem(ArmorTiers.NORA, EquipmentSlotType.LEGS, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<ArmorItem> NORA_LEGGINGS = ITEMS.register("armor/nora_leggings", () -> { return N_LEGGINGS; });
    
    ArmorItem N_BOOTS = new ArmorItem(ArmorTiers.NORA, EquipmentSlotType.FEET, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<ArmorItem> NORA_BOOTS = ITEMS.register("armor/nora_boots", () -> { return N_BOOTS; });
    
    // Cobblestone Armor
    ArmorItem COBBLESTONE_HELMET = new ArmorItem(ArmorTiers.CSTONE, EquipmentSlotType.HEAD, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<ArmorItem> CSTONE_HELMET = ITEMS.register("armor/cobblestone_helmet", () -> { return COBBLESTONE_HELMET; });
    
    ArmorItem COBBLESTONE_CHEST = new ArmorItem(ArmorTiers.CSTONE, EquipmentSlotType.CHEST, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<ArmorItem> CSTONE_CHEST = ITEMS.register("armor/cobblestone_chest", () -> { return COBBLESTONE_CHEST; });
    
    ArmorItem COBBLESTONE_LEGGINGS = new ArmorItem(ArmorTiers.CSTONE, EquipmentSlotType.LEGS, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<ArmorItem> CSTONE_LEGGINGS = ITEMS.register("armor/cobblestone_leggings", () -> { return COBBLESTONE_LEGGINGS; });
    
    ArmorItem COBBLESTONE_BOOTS = new ArmorItem(ArmorTiers.CSTONE, EquipmentSlotType.FEET, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<ArmorItem> CSTONE_BOOTS = ITEMS.register("armor/cobblestone_boots", () -> { return COBBLESTONE_BOOTS; });
  }
  
}
