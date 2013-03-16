package microjunk.trees.common.blocks;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockAlphaGrass extends Block
{

	public BlockAlphaGrass(int i, int j)
	{
		
		super(i, j, Material.ground);
		this.setCreativeTab(Trees.tabTreeBlocks);
		this.setStepSound(soundGrassFootstep);
		this.setHardness(0.6F);
		this.setResistance(1F);
		
	}
	
    public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Blocks.png";
    }
	
    public int getBlockTextureFromSide(int i)
	{
		
		switch(i)
		{
		
		case 0: return 2;
		case 1: return 1;
		default: return 2;
		
		}
		
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
        return Trees.alphaGrass.blockID;
    }
    
}
