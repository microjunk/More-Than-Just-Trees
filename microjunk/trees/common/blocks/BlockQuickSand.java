package microjunk.trees.common.blocks;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockQuickSand extends Block
{
    public BlockQuickSand(int i, int j)
    {
        super(i, j, Material.sand);
        this.setCreativeTab(Trees.tabTreeBlocks);
    }
    
    

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
    {
        entity.motionX = 0.0D;
        entity.motionY = 0.070000000745058064D;
        entity.fallDistance = 0.0F;
        entity.motionZ = 0.0D;
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
    {
        return null;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int i, Random random, int j)
    {
        return Trees.quickSand.blockID;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random)
    {
        return 1;
    }
    
    public String getTextureFile()
    {
    	return "/microjunk/trees/common/aart/Blocks.png";
    }
    
}
