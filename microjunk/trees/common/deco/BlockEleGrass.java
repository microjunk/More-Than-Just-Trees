package microjunk.trees.common.deco;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockEleGrass extends CTFlower
{

    public BlockEleGrass(int i, int j)
    {
        super(i, j, Material.plants);
        this.setTickRandomly(true);
        this.setCreativeTab(Trees.tabTreeDeco);
    }
    
    public int getTextureSize()
    {
    	return 128;
    }
    
    public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/HD_flowers.png";
    }

    //public int colorMultiplier(IBlockAccess iblockaccess, int i, int j, int k)
    //{
    //    iblockaccess.getWorldChunkManager().func_4069_a(i, k, 1, 1);
    //    double d = iblockaccess.getWorldChunkManager().temperature[0];
    //    double d1 = iblockaccess.getWorldChunkManager().humidity[0];
    //    return ColorizerGrass.getGrassColor(d, d1);
    //}

    public int idDropped(int i, Random random)
    {
        if(random.nextInt(30) == 0)
        {
            return Trees.eleGrass.blockID;
        } else
        {
            return -1;
        }
    }

    public boolean canPlaceBlockAt(World world, int i, int j, int k)
    {
        return super.canPlaceBlockAt(world, i, j, k) && canThisPlantGrowOnThisBlockID(world.getBlockId(i, j - 1, k)) && world.getBlockId(i, j + 1, k) == 0;
    }

    public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
    {
        if(world.getBlockId(i, j + 1, k) == 0)
        {
            world.setBlockWithNotify(i, j + 1, k, Trees.eleGrassTop.blockID);
        }
    }

    public void onNeighborBlockChange(World world, int i, int j, int k, int l)
    {
        if(!canBlockStay(world, i, j, k))
        {
            dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), l);
            world.setBlockWithNotify(i, j, k, 0);
        }
        if(world.getBlockId(i, j + 1, k) == 0)
        {
            dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), l);
            world.setBlockWithNotify(i, j, k, 0);
        }
    }

    public boolean canBlockStay(World world, int i, int j, int k)
    {
        return canThisPlantGrowOnThisBlockID(world.getBlockId(i, j - 1, k));
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

    public void updateTick(World world, int i, int j, int k, Random random)
    {
        if(random.nextInt(15) == 0)
        {
            int l = (i + random.nextInt(3)) - 1;
            int i1 = (j + random.nextInt(2)) - random.nextInt(2);
            int j1 = (k + random.nextInt(3)) - 1;
            if(world.isAirBlock(l, i1, j1) && canBlockStay(world, l, i1, j1))
            {
                i += random.nextInt(3) - 1;
                k += random.nextInt(3) - 1;
                if(world.isAirBlock(l, i1, j1) && canBlockStay(world, l, i1, j1))
                {
                    world.setBlockWithNotify(l, i1, j1, Trees.eleGrassTop.blockID);
                }
            }
        }
    }

    public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
    {
        if(entity instanceof EntityPlayer)
        {
            entity.motionX *= 0.40000000000000002D;
            entity.motionZ *= 0.40000000000000002D;
        }
    }
}
