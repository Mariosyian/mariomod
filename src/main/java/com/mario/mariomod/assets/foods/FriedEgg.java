package com.mario.mariomod.assets.foods;

import com.mario.mariomod.MarioMod;

import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class FriedEgg extends Item {

  public FriedEgg() {
    super(new Item.Properties()
                  .group(MarioMod.TAB)
                  .food(new Food.Builder()
                          .hunger(5)
                          .saturation(1.0f)
                        .build())
                  .maxStackSize(64));
  }
}
