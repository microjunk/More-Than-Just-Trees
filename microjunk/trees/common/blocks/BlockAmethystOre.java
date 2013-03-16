package microjunk.trees.common.blocks;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockAmethystOre extends Block
{

	public BlockAmethystOre(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setCreativeTab(Trees.tabTreeBlocks);
    }
	
	public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Blocks.png";
    }
	
	/**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Trees.amethystOre.blockID;
    }
	
}
