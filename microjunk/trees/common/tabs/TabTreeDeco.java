package microjunk.trees.common.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import microjunk.trees.common.Trees;
import net.minecraft.block.BlockFlower;
import net.minecraft.creativetab.CreativeTabs;

public class TabTreeDeco extends CreativeTabs 
{

	public TabTreeDeco(int par1, String par2Str)
    {
            super(par1, par2Str);
    }
    
    //sets the image for the creative tab
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
       //there is a diference between items and blocks. will give an example of both
            return Trees.lilly.blockID;//items
           // return Yourmod.YourBlock.BlockID; for if you want to use a block
    }

    //sets the title/name for the creative tab
    public String getTranslatedTabLabel()
    {
     return "Deco";
    }
	
}
