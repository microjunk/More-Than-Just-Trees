package microjunk.trees.common.deco;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockWinterbush extends CTFlower
{

    public BlockWinterbush(int i, int j)
    {
        super(i, j, Material.plants);
        this.setCreativeTab(Trees.tabTreeDeco);
        //blockIndexInTexture = j;
    }
    
    public int getTextureSize()
    {
    	return 128;
    }
    
    public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/HD_flowers.png";
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
        return null;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public int getRenderType()
    {
        return 1;
    }

    //public boolean canPlaceBlockAt(World world, int i, int j, int k)
    //{
    //    return super.canPlaceBlockAt(world, i, j, k) && canThisPlantGrowOnThisBlockID(world.getBlockId(i, j - 1, k));
    //}

    //protected boolean canThisPlantGrowOnThisBlockID(int i)
    //{
    //    return i == Block.snow.blockID || i == Block.ice.blockID || i == Block.sand.blockID;
    //}

    //public void onNeighborBlockChange(World world, int i, int j, int k, int l)
    //{
    //    if(!canBlockStay(world, i, j, k))
    //    {
    //        dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), l);
    //        world.setBlockWithNotify(i, j, k, 0);
    //    }
    //}

    //public boolean canBlockStay(World world, int i, int j, int k)
    //{
    //    return canThisPlantGrowOnThisBlockID(world.getBlockId(i, j - 1, k));
    //}

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
