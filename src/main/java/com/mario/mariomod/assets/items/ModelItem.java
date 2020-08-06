package com.mario.mariomod.assets.items;

import com.mario.mariomod.MarioMod;

import net.minecraft.item.Item;

public class ModelItem extends Item {

  public ModelItem() {
    super(new Item.Properties()
                  .group(MarioMod.TAB)
                  .maxStackSize(1)
    );
  }
}
