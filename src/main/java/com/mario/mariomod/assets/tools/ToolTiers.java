package com.mario.mariomod.assets.tools;

import java.util.function.Supplier;

import com.mario.mariomod.util.RegistryHandler;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ToolTiers implements IItemTier {
  
  // Attack Damage = BaseOfAllItems(1.0) + BaseOfClass(3.0) + AddDamage(8.0)
  // Attack Speed = BaseOfAllItems(4.0) = No Cooldown + AddAttackSpeed(0.0)
  //   Subtract to add cooldown, addition might not do anything
  
  // Base Enum Stats
  NORA(1650, 9.0f, 3.0f, 3, 20, () -> {
    return Ingredient.fromItems(RegistryHandler.NORA_BLOCK.get());
  });

  private final int maxUses;
  private final float efficiency;
  private final float attackDamage;
  private final int harvestLevel;
  private final int enchantability;
  private final Supplier<Ingredient> repairMaterial;
  
  ToolTiers(int maxUses, float efficiency, float attackDamage, int harvestLevel, int enchantability, Supplier<Ingredient> repairMaterial) {
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
