package com.mario.mariomod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mario.mariomod.util.RegistryHandler;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MarioMod.MODID)
public class MarioMod {
  // Directly reference a log4j logger.
  private static final Logger LOGGER = LogManager.getLogger();
  private static final String VERSION = "1.15.2-1.0.0";

  public static final String MODID = "mariomod";
  
  public MarioMod() {
    FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

    RegistryHandler.init();
    
    // Register ourselves for server and other game events we are interested in
    MinecraftForge.EVENT_BUS.register(this);
  }

  private void setup(final FMLCommonSetupEvent event) {
    LOGGER.info("~~~~~~~ mario~ mod -- " + VERSION + " ~~~~~~~");
  }

  private void doClientStuff(final FMLClientSetupEvent event) {
  }
  
  public static final ItemGroup TAB = new ItemGroup("marioTab") {
    @Override
    public ItemStack createIcon() {
      return new ItemStack(RegistryHandler.NORA_STICK.get());
    }
  };
}
