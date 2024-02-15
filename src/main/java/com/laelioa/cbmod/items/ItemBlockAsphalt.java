package com.laelioa.cbmod.items;

import com.laelioa.cbmod.blocks.BlockAsphalt;
import com.laelioa.cbmod.init.CbBlocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ItemBlockAsphalt extends ItemBlock {
    public ItemBlockAsphalt() {
        super(CbBlocks.ASPHALT);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    @Nonnull
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "." +
                BlockAsphalt.AsphaltType.byMetadata(stack.getMetadata()).getName();
    }
}
