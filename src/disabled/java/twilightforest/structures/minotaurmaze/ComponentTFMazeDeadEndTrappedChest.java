package twilightforest.structures.minotaurmaze;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;

public class ComponentTFMazeDeadEndTrappedChest extends ComponentTFMazeDeadEndChest {

	public ComponentTFMazeDeadEndTrappedChest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComponentTFMazeDeadEndTrappedChest(int i, int x, int y, int z, EnumFacing rotation) {
		super(i, x, y, z, rotation);
	}

	@Override
	public boolean addComponentParts(World world, Random rand, StructureBoundingBox sbb) {		
		// normal chest room
		super.addComponentParts(world, rand, sbb);
		
		// add tripwire hooks
		this.setBlockState(world, Blocks.TRIPWIRE_HOOK, getHookMeta(3), 1, 1, 2, sbb);
		this.setBlockState(world, Blocks.TRIPWIRE_HOOK, getHookMeta(1), 4, 1, 2, sbb);
		
		// add string
		this.setBlockState(world, Blocks.TRIPWIRE, 0, 2, 1, 2, sbb);
		this.setBlockState(world, Blocks.TRIPWIRE, 0, 3, 1, 2, sbb);
		
		// TNT!
		this.setBlockState(world, Blocks.TNT, 0, 0, 0, 2, sbb);
		this.setBlockState(world, AIR, 0, -1, 2, sbb);
		this.setBlockState(world, AIR, 1, -1, 2, sbb);
		this.setBlockState(world, Blocks.TNT, 0, 2, 0, 4, sbb);
		this.setBlockState(world, Blocks.TNT, 0, 3, 0, 4, sbb);
		this.setBlockState(world, Blocks.TNT, 0, 2, 0, 3, sbb);
		this.setBlockState(world, Blocks.TNT, 0, 3, 0, 3, sbb);

		return true;
	}
	
	/**
	 * Gets the metadata necessary to make stairs facing the proper direction.
	 * 
	 * @param dir
	 * @return
	 */
	protected int getHookMeta(int dir) 
	{
		return(this.getCoordBaseMode() + dir) % 4;
	}
}
