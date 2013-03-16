package microjunk.trees.common.blocks;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockTender extends Block
{

	public BlockTender(int i, int j)
	{
		
		super (i, j, Material.sand);
		this.setCreativeTab(Trees.tabTreeBlocks);
    }
    
    public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Blocks.png";
    }
	
	public boolean renderAsNormalBlock()
    {
        return false;
    }
	
	
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
		
            int playerfacing = MathHelper.floor_double((double)((par5EntityPlayer.rotationYaw * 4F) / 360f) + 0.5D) &3;
            if(playerfacing == 0)
            {
            	par5EntityPlayer.setPositionAndUpdate(par5EntityPlayer.posX, par5EntityPlayer.posY, par5EntityPlayer.posZ + 40);
            }
            else if(playerfacing == 1)
            {
            	par5EntityPlayer.setPositionAndUpdate(par5EntityPlayer.posX - 40, par5EntityPlayer.posY, par5EntityPlayer.posZ);
            }
            else if(playerfacing == 2)
            {
            	par5EntityPlayer.setPositionAndUpdate(par5EntityPlayer.posX, par5EntityPlayer.posY, par5EntityPlayer.posZ - 40);
            }
            else if(playerfacing == 3)
            {
            	par5EntityPlayer.setPositionAndUpdate(par5EntityPlayer.posX + 40, par5EntityPlayer.posY, par5EntityPlayer.posZ);
            }
       return true;
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

