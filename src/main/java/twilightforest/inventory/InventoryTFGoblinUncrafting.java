package twilightforest.inventory;

import net.minecraft.util.text.ITextComponent;
import twilightforest.TwilightForestMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

import java.util.Arrays;


public class InventoryTFGoblinUncrafting implements IInventory {

	private ItemStack[] contents = new ItemStack[9];
	public int numberOfInputItems;
	public int uncraftingCost;
	public int recraftingCost;


	public InventoryTFGoblinUncrafting(ContainerTFUncrafting containerTFGoblinCrafting) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSizeInventory() {
		return 9;
	}

	@Override
	public ItemStack getStackInSlot(int var1) {
		return contents[var1];
	}

	@Override
	public ItemStack decrStackSize(int slotNum, int amount) {
		if (this.contents[slotNum] != null)
		{
			ItemStack takenStack;

			if (this.contents[slotNum].stackSize <= amount)
			{
				takenStack = this.contents[slotNum];
				this.contents[slotNum] = null;

				//this.eventHandler.onCraftMatrixChanged(this);
				return takenStack;
			}
			else
			{
				takenStack = this.contents[slotNum].splitStack(amount);

				//System.out.println("Stack size in slot " + slotNum + " is now " + this.contents[slotNum].stackSize);

				if (this.contents[slotNum].stackSize == 0)
				{
					this.contents[slotNum] = null;
				}

				//this.eventHandler.onCraftMatrixChanged(this);
				return takenStack;
			}
		}
		else
		{
			return null;
		}

	}

	@Override
	public ItemStack removeStackFromSlot(int par1) {
		if (this.contents[par1] != null)
		{
			ItemStack var2 = this.contents[par1];
			this.contents[par1] = null;
			return var2;
		}
		else
		{
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int par1, ItemStack par2ItemStack) {
		this.contents[par1] = par2ItemStack;

		if (par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit())
		{
			par2ItemStack.stackSize = this.getInventoryStackLimit();
		}

		this.markDirty();
	}

	@Override
	public String getName() {
		return "twilightforest.goblincrafting";
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public void markDirty() { }

	@Override
	public boolean isUsableByPlayer(EntityPlayer var1) {
		return !TwilightForestMod.disableUncrafting;
	}

	@Override
	public void openInventory(EntityPlayer player) { }

	@Override
	public void closeInventory(EntityPlayer player) { }

	@Override
	public boolean isItemValidForSlot(int par1, ItemStack par2ItemStack)
    {
        return false;
    }

	@Override
	public int getField(int id) {
		return 0;
	}

	@Override
	public void setField(int id, int value) {

	}

	@Override
	public int getFieldCount() {
		return 0;
	}

	@Override
	public void clear() {
		Arrays.fill(contents, null);
	}

	@Override
	public boolean hasCustomName() {
		return false;
	}

	@Override
	public ITextComponent getDisplayName() {
		return null;
	}

}
