package com.laelioa.cbmod;

import com.laelioa.cbmod.init.CbBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class CbTab extends CreativeTabs {
    private final String LABEL;

    public CbTab(String label) {
        super(label);
        LABEL = label;
    }

    @Nonnull
    @Override
    public ItemStack getTabIconItem() {
        switch (LABEL) {
            case "road":
                return new ItemStack(CbBlocks.ASPHALT, 1, 4);
            default:
                return new ItemStack(Items.AIR);
        }
    }
}
