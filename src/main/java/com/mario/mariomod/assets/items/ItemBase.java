package com.mario.mariomod.assets.items;

import com.mario.mariomod.MarioMod;

import net.minecraft.item.Item;

public class ItemBase extends Item {

  public ItemBase() {
    super(new Item.Properties()
                  .group(MarioMod.TAB)
                  .maxStackSize(64)
    );
  }
}
