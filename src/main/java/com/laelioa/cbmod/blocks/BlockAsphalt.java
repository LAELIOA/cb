package com.laelioa.cbmod.blocks;

import com.laelioa.cbmod.ComfortBox;
import com.laelioa.cbmod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class BlockAsphalt extends Block {
    private static final PropertyEnum<AsphaltType> TYPE = PropertyEnum.create("type", AsphaltType.class);

    public BlockAsphalt() {
        super(Material.ROCK);
        setRegistryName(Reference.MODID, "asphalt");
        setUnlocalizedName("asphalt_unlocalized");
        setCreativeTab(ComfortBox.roadTab);
    }

    @Nonnull
    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, TYPE);
    }

    @Nonnull
    @Override
    @SuppressWarnings("deprecation")
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(TYPE, AsphaltType.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(TYPE).ordinal();
    }

    @Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
        for (AsphaltType type : AsphaltType.values()) {
            items.add(new ItemStack(this, 1, type.ordinal()));
        }
    }

    @Nonnull
    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(this, 1, getMetaFromState(state));
    }

    public enum AsphaltType implements IStringSerializable {
        DEFAULT,
        NEW,
        WHITE,
        YELLOW,
        WHITE_LINE,
        YELLOW_LINE,
        DOUBLE_WHITE_LINE,
        DOUBLE_YELLOW_LINE,
        SLANTED_WHITE_LINE,
        SLANTED_YELLOW_LINE,
        SLANTED_DOUBLE_WHITE_LINE,
        SLANTED_DOUBLE_YELLOW_LINE;

        public static AsphaltType byMetadata(int meta) {
            if (meta < 0 || meta >= values().length) {
                meta = 0;
            }
            return values()[meta];
        }

        @Nonnull
        @Override
        public String getName() {
            return name().toLowerCase();
        }
    }
}
