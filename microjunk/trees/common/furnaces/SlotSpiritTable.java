package microjunk.trees.common.furnaces;

import net.minecraft.inventory.InventoryBasic;

class SlotSpiritTable extends InventoryBasic  
{  
        /** The brewing stand this slot belongs to. */  
        final ContainerSpiritTable container;  
        SlotSpiritTable(ContainerSpiritTable par1ContainerSpiritTable, String par2Str, int par3)  
        {  
                super(par2Str, par3);  
                this.container = par1ContainerSpiritTable;  
        }  
        /**  
         * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended. *Isn't  
         * this more of a set than a get?*  
         */  
        public int getInventoryStackLimit()  
        {  
                return 1;  
        }  
        /**  
         * Called when an the contents of an Inventory change, usually  
         */  
        public void onInventoryChanged()  
        {  
                super.onInventoryChanged();  
                this.container.onCraftMatrixChanged(this);  
        }  
}
