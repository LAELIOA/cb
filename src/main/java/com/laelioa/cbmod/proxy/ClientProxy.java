package com.laelioa.cbmod.proxy;

import com.laelioa.cbmod.Reference;
import com.laelioa.cbmod.blocks.BlockAsphalt;
import com.laelioa.cbmod.blocks.inception.BlockMarble;
import com.laelioa.cbmod.init.CbBlocks;
import net.minecraft.block.Block;
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
            registerModel("asphalt/asphalt_" + type.getName(), CbBlocks.ASPHALT, type.ordinal());
        }

        for (int meta = 0; meta < 16; meta++) {
            registerModel("inception/carpet/inc_carpet_" + meta, CbBlocks.INC_CARPET, meta);
        }

        for (int meta = 0; meta < 2; meta++) {
            registerModel("inception/carpet/inc_carpet0_" + meta, CbBlocks.INC_CARPET0, meta);
        }

        registerModel("inception/inc_asphalt", CbBlocks.INC_ASPHALT, 0);

        for (BlockMarble.MarbleType type : BlockMarble.MarbleType.values()) {
            registerModel("inception/marble/inc_marble_" + type.getName(), CbBlocks.INC_MARBLE, type.ordinal());
        }
    }

    private void registerModel(String path, Block block, int meta) {
        ResourceLocation resourceLocation = new ResourceLocation(Reference.MODID, path);
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(resourceLocation, "inventory");
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, modelResourceLocation);
    }
}
