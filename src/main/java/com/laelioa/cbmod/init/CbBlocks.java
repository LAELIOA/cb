package com.laelioa.cbmod.init;

import com.laelioa.cbmod.blocks.Asphalt;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class CbBlocks {
    public static final Block ASPHALT;

    static {
        ASPHALT = new Asphalt();
    }

    public static void registerBlocks(IForgeRegistry<Block> registry) {
        registry.register(ASPHALT);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.register(CbItems.init(new ItemBlock(ASPHALT), "asphalt"));
    }
}
