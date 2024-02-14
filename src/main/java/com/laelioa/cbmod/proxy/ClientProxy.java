package com.laelioa.cbmod.proxy;

import com.laelioa.cbmod.Reference;
import com.laelioa.cbmod.init.CbBlocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit() {
        super.preInit();
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void postInit() {
        super.postInit();
    }

    @Override
    public void registerBlockModels() {
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(CbBlocks.ASPHALT), 0, new ModelResourceLocation(
                        Reference.MODID + ":asphalt", "inventory"
                )
        );
    }
}
