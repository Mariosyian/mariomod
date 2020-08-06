package com.mario.mariomod.assets.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ModelBlock extends Block {

  public ModelBlock() {
    super(Block.Properties.create(Material.WOOD)
              .hardnessAndResistance(3.0f, 1.0f)
              .sound(SoundType.GLASS)
              .harvestLevel(0)
              .harvestTool(ToolType.PICKAXE)
    );
  }
}
