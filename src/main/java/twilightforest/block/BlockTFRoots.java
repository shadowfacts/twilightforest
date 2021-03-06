package twilightforest.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import twilightforest.block.enums.RootVariant;
import twilightforest.client.ModelRegisterCallback;
import twilightforest.client.ModelUtils;
import twilightforest.item.TFItems;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockTFRoots extends Block implements ModelRegisterCallback {

	public static final PropertyEnum<RootVariant> VARIANT = PropertyEnum.create("variant", RootVariant.class);

	public BlockTFRoots() {
		super(Material.WOOD);
		this.setCreativeTab(TFItems.creativeTab);
        this.setHardness(2.0F);
        this.setSoundType(SoundType.WOOD);
	}

	@Override
	public BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, VARIANT);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(VARIANT).ordinal();
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(VARIANT, RootVariant.values()[meta]);
	}

    @Override
    public Item getItemDropped(IBlockState state, Random random, int j)
    {
    	switch (state.getValue(VARIANT)) {
		default:
    	case ROOT:
    		return Items.STICK;
    	case LIVEROOT :
    		return TFItems.liveRoot;
    	}
    }
    
    @Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		if (state.getValue(VARIANT) == RootVariant.ROOT) {
			return 3 + random.nextInt(2);
		} else {
			return super.quantityDropped(state, fortune, random);
		}
	}
    
    @Override
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List<ItemStack> par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
    }

    @SideOnly(Side.CLIENT)
    @Override
	public void registerModel() {
		ModelUtils.registerToStateSingleVariant(this, VARIANT);
	}

}
