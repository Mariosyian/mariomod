package com.mario.mariomod.assets.armor;

import java.util.function.Supplier;

import com.mario.mariomod.MarioMod;
import com.mario.mariomod.util.RegistryHandler;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum ArmorTiers implements IArmorMaterial {
  
  // nora_layer_0 for texture
  NORA(MarioMod.MODID + ":nora", 35, new int[] { 12, 18, 24, 6 }, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.5f, () -> {
    return Ingredient.fromItems(RegistryHandler.NORA_BLOCK.get());
  });
  
  private static final int[] MAX_DAMAGE = new int[] { 13, 10, 30, 8 };
  
  private final String name;
  private final int maxDamageMultiplier;
  private final int[] damageReductionMultiplier;
  private final int enchantability;
  private final SoundEvent soundEvent;
  private final float toughness;
  private final Supplier<Ingredient> repairMaterial;

  ArmorTiers(String name, int maxDamageMultiplier, int[] damageReductionMultiplier, int enchantability,
             SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial) {
    this.name = name;
    this.maxDamageMultiplier = maxDamageMultiplier;
    this.damageReductionMultiplier = damageReductionMultiplier;
    this.enchantability = enchantability;
    this.soundEvent = soundEvent;
    this.toughness = toughness;
    this.repairMaterial = repairMaterial;
  }
  
  @Override
  public int getDurability(EquipmentSlotType slotIn) {
    return MAX_DAMAGE[slotIn.getIndex()] * this.maxDamageMultiplier;
  }

  @Override
  public int getDamageReductionAmount(EquipmentSlotType slotIn) {
    return this.damageReductionMultiplier[slotIn.getIndex()];
  }

  @Override
  public int getEnchantability() {
    return this.enchantability;
  }

  @Override
  public SoundEvent getSoundEvent() {
    return this.soundEvent;
  }

  @Override
  public Ingredient getRepairMaterial() {
    return this.repairMaterial.get();
  }

  @OnlyIn(Dist.CLIENT)
  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public float getToughness() {
    return this.toughness;
  }

}
