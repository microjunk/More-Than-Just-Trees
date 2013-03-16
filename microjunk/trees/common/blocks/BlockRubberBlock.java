package microjunk.trees.common.blocks;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class BlockRubberBlock extends Block
{

	public BlockRubberBlock(int i, int j)
	{
		
		super(i, j, Material.rock);
		this.setCreativeTab(Trees.tabTreeBlocks);
		
		
	}
	
	public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Blocks.png";
    }
	
	public void onEntityWalking(World world, int x, int y, int z, Entity entity)
	{
		
		entity.motionY += 1.7;
		
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
        return this.blockID;
    }
	
	
	
}