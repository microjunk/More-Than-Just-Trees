package microjunk.trees.common.deco;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class BlockFlameCactus extends Block
{
	private float height;

    public BlockFlameCactus(int i, int j)
    {
        super(i, j, Material.plants);
        this.setTickRandomly(true);
        float f = 0.2F;
        this.setCreativeTab(Trees.tabTreeDeco);
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
    }
    
    public int getTextureSize()
    {
    	return 128;
    }
    
    public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/HD_flowers.png";
    }

    public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
    	onEntityCollidedWithBlock(world, i, j, k, entityplayer);
    }

    public void onEntityCollidedWithBlock(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
        if(entityplayer.getHealth() > 0)
        {
        	entityplayer.attackEntityFrom(DamageSource.inFire, 4);
            //entityplayer.fire = 300;
        }
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

    public boolean canPlaceBlockAt(World world, int i, int j, int k)
    {
        return super.canPlaceBlockAt(world, i, j, k) && canThisPlantGrowOnThisBlockID(world.getBlockId(i, j - 1, k));
    }

    protected boolean canThisPlantGrowOnThisBlockID(int i)
    {
        return i == Block.netherrack.blockID || i == Block.sand.blockID;
    }

    public void onNeighborBlockChange(World world, int i, int j, int k, int l)
    {
        if(!canBlockStay(world, i, j, k))
        {
            dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), l);
            world.setBlockWithNotify(i, j, k, 0);
        }
    }

    public boolean canBlockStay(World world, int i, int j, int k)
    {
        return canThisPlantGrowOnThisBlockID(world.getBlockId(i, j - 1, k));
    }

    public void randomDisplayTick(World world, int i, int j, int k, Random random)
    {
        world.spawnParticle("lava", i+0.5, j+1.0, k+0.5, 0.0D, 0.25D, 0.0D);
        world.spawnParticle("smoke", i+0.5, j+1.0, k+0.5, 0.0D, 0.25D, 0.0D);
        world.spawnParticle("flame", i+0.5, j+1.0, k+0.5, 0.0D, 0.25D, 0.0D);
    }
}
