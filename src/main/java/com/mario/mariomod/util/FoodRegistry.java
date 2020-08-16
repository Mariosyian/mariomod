package com.mario.mariomod.util;

import com.mario.mariomod.assets.foods.FriedEgg;
import com.mario.mariomod.assets.foods.Salad;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class FoodRegistry {
  
  @SuppressWarnings("unused")
  public static void init() {
    DeferredRegister<Item> ITEMS = RegistryHandler.ITEMS;

    RegistryObject<Salad> SALAD = ITEMS.register("food/salad", Salad::new);
    RegistryObject<FriedEgg> FRIED_EGG = ITEMS.register("food/fried_egg", FriedEgg::new);
  }

}
