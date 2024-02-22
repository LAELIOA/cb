package com.laelioa.cbmod.blocks.inception;

import com.laelioa.cbmod.ComfortBox;
import com.laelioa.cbmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInception extends Block {
    public BlockInception(String name) {
        super(Material.ROCK);
        setRegistryName(Reference.MODID, name);
        setUnlocalizedName(name + "_unlocalized");
        setCreativeTab(ComfortBox.incTab);
    }
}
