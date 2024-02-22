package com.laelioa.cbmod.proxy;

import com.laelioa.cbmod.Reference;
import com.laelioa.cbmod.blocks.BlockAsphalt;
import com.laelioa.cbmod.init.CbBlocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
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
        for (BlockAsphalt.AsphaltType type : BlockAsphalt.AsphaltType.values()) {
            ResourceLocation resourceLocation = new ResourceLocation(Reference.MODID, "asphalt/asphalt_" + type.getName());
            ModelResourceLocation modelResourceLocation = new ModelResourceLocation(resourceLocation, "inventory");
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CbBlocks.ASPHALT), type.ordinal(), modelResourceLocation);
        }

        for (int meta = 0; meta < 16; meta++) {
            ResourceLocation resourceLocation = new ResourceLocation(Reference.MODID, "inception/carpet/inc_carpet_" + meta);
            ModelResourceLocation modelResourceLocation = new ModelResourceLocation(resourceLocation, "inventory");
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(CbBlocks.INC_CARPET), meta, modelResourceLocation);
        }
    }
}
