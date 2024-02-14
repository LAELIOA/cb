package com.laelioa.cbmod.init;

import com.laelioa.cbmod.Reference;
import net.minecraft.item.Item;

public class CbItems {
    public static Item init(Item item, String name) {
        return item.setRegistryName(Reference.MODID, name);
    }
}
