package twilightforest.block;

import java.util.List;

import net.minecraft.block.BlockLog;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import twilightforest.block.enums.WoodVariant;
import twilightforest.client.ModelRegisterCallback;
import twilightforest.client.ModelUtils;
import twilightforest.item.TFItems;

public class BlockTFLog extends BlockLog implements ModelRegisterCallback {

    public static final PropertyEnum<WoodVariant> VARIANT = PropertyEnum.create("variant", WoodVariant.class);

	protected BlockTFLog() {
		this.setHardness(2.0F);
		this.setCreativeTab(TFItems.creativeTab);
		this.setDefaultState(this.getDefaultState().withProperty(LOG_AXIS, EnumAxis.Y));
	}

    @Override
    public BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, VARIANT, LOG_AXIS);
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, WoodVariant.values()[meta & 3]);

        switch (meta & 0b1100)
        {
            case 0:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.X);
                break;
            case 8:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z);
                break;
            default:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
        }

        return iblockstate;
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        int i = state.getValue(VARIANT).ordinal();

        switch (state.getValue(LOG_AXIS))
        {
            case X:
                i |= 4;
                break;
            case Y:
                i |= 0;
                break;
            case Z:
                i |= 8;
                break;
            case NONE:
                i |= 12;
        }

        return i;
    }

	@Override
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List<ItemStack> par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
        par3List.add(new ItemStack(par1, 1, 2));
        par3List.add(new ItemStack(par1, 1, 3));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModel() {
	    ModelUtils.registerToStateSingleVariant(this, VARIANT);
    }
}
