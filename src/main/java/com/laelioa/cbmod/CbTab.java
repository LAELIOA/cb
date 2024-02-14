package com.laelioa.cbmod;

import com.laelioa.cbmod.init.CbBlocks;
import com.laelioa.cbmod.init.CbItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CbTab extends CreativeTabs {
    private String label;

    public CbTab(String label) {
        super(label);
        this.label = label;
    }

    @Override
    public ItemStack getTabIconItem() {
        switch (label) {
            case "road":
                return new ItemStack(Item.getItemFromBlock(CbBlocks.ASPHALT));
        }
        return null;
    }
}
