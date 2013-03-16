package microjunk.trees.common.blocks;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBalckIce extends Block
{

	public BlockBalckIce(int i, int j)
	{
		
		super(i, j, Material.ice);
		setLightOpacity(0);
		slipperiness = 1.5F;
		this.setCreativeTab(Trees.tabTreeBlocks);
		
	}
	
	public int getRenderBlockPass()
    {
        return 0;
    }

    
    public boolean isOpaqueCube()
    {
        return false;
    }

    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Blocks.png";
    }
	
}

