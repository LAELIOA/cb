package com.laelioa.cbmod.init;

import com.laelioa.cbmod.blocks.BlockAsphalt;
import com.laelioa.cbmod.items.ItemBlockAsphalt;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class CbBlocks {
    public static final Block ASPHALT;

    static {
        ASPHALT = new BlockAsphalt();
    }

    public static void registerBlocks(IForgeRegistry<Block> registry) {
        registry.register(ASPHALT);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.register(CbItems.init(new ItemBlockAsphalt(), "asphalt"));
    }
}
