package microjunk.trees.common.blocks;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPeanutwoodOre extends Block
{

	public BlockPeanutwoodOre(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setCreativeTab(Trees.tabTreeBlocks);
    }
	
	public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Blocks.png";
    }
	
}
