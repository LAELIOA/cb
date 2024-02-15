package com.laelioa.cbmod;

import com.laelioa.cbmod.init.CbBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CbTab extends CreativeTabs {
    private final String LABEL;

    public CbTab(String label) {
        super(label);
        LABEL = label;
    }

    @Override
    public ItemStack getTabIconItem() {
        switch (LABEL) {
            case "road":
                return new ItemStack(Item.getItemFromBlock(CbBlocks.ASPHALT));
            default:
                return null;
        }
    }
}
