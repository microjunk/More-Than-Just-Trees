package microjunk.trees.common.blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import microjunk.trees.common.Trees;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockWalnutWoodSlab extends TreesSlabs
{
	
	public BlockWalnutWoodSlab(int par1, boolean par2)
	{
		super(par1, par2, Material.wood);
		//this.setCreativeTab(Trees.tabTreeBlocks);
		setLightOpacity(0);
	}

	public int idDropped(int par1, Random par2Random, int par3)
	{
		return Trees.walnutWoodSingleSlab.blockID;
	}

	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
	{
		if(par1World.getBlockId(par2, par3 - 1, par4) == Trees.walnutWoodSingleSlab.blockID)
		{
			par1World.setBlockWithNotify(par2, par3, par4, 0);
			par1World.setBlockWithNotify(par2, par3 - 1, par4, Trees.walnutWoodDoubleSlab.blockID);
		}
		if(par1World.getBlockId(par2, par3 + 1, par4) == Trees.walnutWoodSingleSlab.blockID)
		{
			par1World.setBlockWithNotify(par2, par3, par4, 0);
			par1World.setBlockWithNotify(par2, par3 + 1, par4, Trees.walnutWoodDoubleSlab.blockID);
		}
	}

	protected ItemStack createStackedBlock(int par1)
	{
		return new ItemStack(Trees.walnutWoodSingleSlab.blockID, 2, par1 & 7);
	}

	public String getFullSlabName(int var1)
	{
		return null;
	}

	//gets texture file
	public String getTextureFile()
	{
		return "/microjunk/trees/common/aart/Blocks.png";
	}

	@SideOnly(Side.CLIENT) //Client side only
	public int getBlockTextureFromSide(int i)
	{ 
		return 16;
	}

}