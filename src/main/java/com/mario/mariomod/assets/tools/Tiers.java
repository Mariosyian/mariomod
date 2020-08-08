package com.mario.mariomod.assets.tools;

import java.util.function.Supplier;

import com.mario.mariomod.util.RegistryHandler;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum Tiers implements IItemTier {
  
  NORA(1650, 9.0f, 3.0f, 3, 20, () -> {
    return Ingredient.fromItems(RegistryHandler.NORA_SWORD.get());
  });

  private final int maxUses;
  private final float efficiency;
  private final float attackDamage;
  private final int harvestLevel;
  private final int enchantability;
  private final Supplier<Ingredient> repairMaterial;
  
  Tiers(int maxUses, float efficiency, float attackDamage, int harvestLevel, int enchantability, Supplier<Ingredient> repairMaterial) {
    this.maxUses = maxUses;
    this.efficiency = efficiency;
    this.attackDamage = attackDamage;
    this.harvestLevel = harvestLevel;
    this.enchantability = enchantability;
    this.repairMaterial = repairMaterial;
  }
  
  @Override
  public int getMaxUses() {
    return this.maxUses;
  }

  @Override
  public float getEfficiency() {
    return this.efficiency;
  }

  @Override
  public float getAttackDamage() {
    return this.attackDamage;
  }

  @Override
  public int getHarvestLevel() {
    return this.harvestLevel;
  }

  @Override
  public int getEnchantability() {
    return this.enchantability;
  }

  @Override
  public Ingredient getRepairMaterial() {
    return this.repairMaterial.get();
  }

}
