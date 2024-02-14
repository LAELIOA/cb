package com.laelioa.cbmod.blocks;

import com.laelioa.cbmod.ComfortBox;
import com.laelioa.cbmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Asphalt extends Block {
    public Asphalt() {
        super(Material.ROCK);
        setRegistryName(Reference.MODID, "asphalt");
        setUnlocalizedName("asphalt_unlocalized");
        setCreativeTab(ComfortBox.roadTab);
    }
}
