package com.mario.mariomod.assets.foods;

import com.mario.mariomod.MarioMod;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class Salad extends Item {

  public Salad() {
    super(new Item.Properties()
                  .group(MarioMod.TAB)
                  .food(new Food.Builder()
                          .hunger(10)
                          .saturation(1.5f)
                          .effect(() -> { return new EffectInstance(Effects.HEALTH_BOOST, 200, 0); }, 0.5f)
                        .build())
                  .maxStackSize(1));
  }

  @Override
  public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
    super.onItemUseFinish(stack, worldIn, entityLiving);
    return new ItemStack(Items.BOWL);
 }
}
