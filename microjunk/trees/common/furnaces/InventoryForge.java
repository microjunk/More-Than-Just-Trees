package microjunk.trees.common.furnaces;

import net.minecraft.inventory.InventoryBasic;

class InventoryForge extends InventoryBasic
{
    /** Container of this anvil's block. */
    final ContainerForge theContainer;

    InventoryForge(ContainerForge par1ContainerForge, String par2Str, int par3)
    {
        super(par2Str, par3);
        this.theContainer = par1ContainerForge;
    }

    /**
     * Called when an the contents of an Inventory change, usually
     */
    public void onInventoryChanged()
    {
        super.onInventoryChanged();
        this.theContainer.onCraftMatrixChanged(this);
    }
}