package com.laelioa.cbmod.init;

import com.laelioa.cbmod.ComfortBox;
import com.laelioa.cbmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegistryHandler {
    @Mod.EventBusSubscriber(modid = Reference.MODID)
    public static class Blocks {
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            CbBlocks.registerBlocks(event.getRegistry());
        }
    }

    @Mod.EventBusSubscriber(modid = Reference.MODID)
    public static class Items {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            CbBlocks.registerItemBlocks(event.getRegistry());
        }
    }

    @Mod.EventBusSubscriber(modid = Reference.MODID)
    public static class Models {
        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            ComfortBox.proxy.registerBlockModels();
        }
    }
}
