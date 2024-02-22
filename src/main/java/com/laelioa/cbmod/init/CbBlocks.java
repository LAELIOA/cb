package com.laelioa.cbmod.init;

import com.laelioa.cbmod.blocks.BlockAsphalt;
import com.laelioa.cbmod.blocks.inception.BlockCarpet;
import com.laelioa.cbmod.items.ItemBlockAsphalt;
import com.laelioa.cbmod.items.inception.ItemBlockCarpet;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class CbBlocks {
    // Road
    public static final Block ASPHALT;

    // Inception
    public static final Block INC_CARPET;

    static {
        // Road
        ASPHALT = new BlockAsphalt();

        // Inception
        INC_CARPET = new BlockCarpet();
    }

    public static void registerBlocks(IForgeRegistry<Block> registry) {
        // Road
        registry.register(ASPHALT);

        // Inception
        registry.register(INC_CARPET);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        // Road
        registry.register(new ItemBlockAsphalt());

        // Inception
        registry.register(new ItemBlockCarpet());
    }
}
