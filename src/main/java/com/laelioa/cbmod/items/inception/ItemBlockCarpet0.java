package com.laelioa.cbmod.items.inception;

import com.laelioa.cbmod.Reference;
import com.laelioa.cbmod.init.CbBlocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ItemBlockCarpet0 extends ItemBlock {
    public ItemBlockCarpet0() {
        super(CbBlocks.INC_CARPET0);
        setRegistryName(Reference.MODID, "inc_carpet0");
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }

    @Nonnull
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "_" + stack.getMetadata();
    }
}
