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

    ArmorItem N_HELMET = new ArmorItem(ArmorTiers.NORA, EquipmentSlotType.HEAD, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<ArmorItem> NORA_HELMET = ITEMS.register("armor/nora_helmet", () -> { return N_HELMET; });
    
    ArmorItem N_CHEST = new ArmorItem(ArmorTiers.NORA, EquipmentSlotType.CHEST, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<ArmorItem> NORA_CHEST = ITEMS.register("armor/nora_chest", () -> { return N_CHEST; });
    
    ArmorItem N_LEGGINGS = new ArmorItem(ArmorTiers.NORA, EquipmentSlotType.LEGS, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<ArmorItem> NORA_LEGGINGS = ITEMS.register("armor/nora_leggings", () -> { return N_LEGGINGS; });
    
    ArmorItem N_BOOTS = new ArmorItem(ArmorTiers.NORA, EquipmentSlotType.FEET, new Item.Properties().group(MarioMod.TAB));
    RegistryObject<ArmorItem> NORA_BOOTS = ITEMS.register("armor/nora_boots", () -> { return N_BOOTS; });
  }
  
}
