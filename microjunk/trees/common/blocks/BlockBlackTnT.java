package microjunk.trees.common.blocks;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class BlockBlackTnT extends Block
{
    public BlockBlackTnT(int par1, int par2)
    {
        super(par1, par2, Material.tnt);
        this.setCreativeTab(Trees.tabTreeBlocks);
    }
    
    public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Blocks.png";
    }

    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public int getBlockTextureFromSide(int par1)
    {
        return par1 == 0 ? 21 : (par1 == 1 ? 20 : this.blockIndexInTexture);
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        super.onBlockAdded(var1, var2, var3, var4);

        if (var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
        {
            this.onBlockDestroyedByPlayer(var1, var2, var3, var4, 1);
            var1.setBlockWithNotify(var2, var3, var4, 0);
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        if (var5 > 0 && Block.blocksList[var5].canProvidePower() && var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
        {
            //this.onBlockDestroyedByPlayer(var1, var2, var3, var4, 1);
            //var1.setBlockWithNotify(var2, var3, var4, 0);
        	
        	EntityBlackTnTPrimed entityblacktntprimed = new EntityBlackTnTPrimed(var1, (float)var2 + 0.5F, (float)var3 + 0.5F, (float)var4 + 0.5F);
            entityblacktntprimed.fuse = 0;
            var1.spawnEntityInWorld(entityblacktntprimed);
        	
        }
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random var1)
    {
        return 1;
    }

    /**
     * Called upon the block being destroyed by an explosion
     */
    public void onBlockDestroyedByExplosion(World var1, int var2, int var3, int var4)
    {
        if (!var1.isRemote)
        {
            //EntityBlackTnTPrimed var5 = new EntityBlackTnTPrimed(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F));
            //var5.fuse = var1.rand.nextInt(var5.fuse / 4) + var5.fuse / 8;
            //var1.spawnEntityInWorld(var5);
        	
        	EntityBlackTnTPrimed var5 = new EntityBlackTnTPrimed(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F));
            var5.fuse = 0;
            var1.spawnEntityInWorld(var5);
        	
        }
    }

    /**
     * Called right before the block is destroyed by a player.  Args: world, x, y, z, metaData
     */
    public void onBlockDestroyedByPlayer(World var1, int var2, int var3, int var4, int var5)
    {
        //if (!var1.isRemote && (var5 & 1) == 1)
        //{
        //    EntityBlackTnTPrimed var6 = new EntityBlackTnTPrimed(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F));
        //    var1.spawnEntityInWorld(var6);
        //    var1.playSoundAtEntity(var6, "random.fuse", 1.0F, 1.0F);
        //}
    	
    	if(var1.isRemote)
        {
            return;
        }
        if((var5 & 1) == 0)
        {
            dropBlockAsItem_do(var1, var2, var3, var4, new ItemStack(Trees.blackTnT, 1, 0));
        } else
        {
        	EntityBlackTnTPrimed var6 = new EntityBlackTnTPrimed(var1, (float)var2 + 0.5F, (float)var3 + 0.5F, (float)var4 + 0.5F);
            var1.spawnEntityInWorld(var6);
            var1.playSoundAtEntity(var6, "random.fuse", 1.0F, 1.0F);
        }
    	
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5, int var6, float var7, float var8, float var9)
    {
        //if (var5.getCurrentEquippedItem() != null && var5.getCurrentEquippedItem().itemID == Item.flintAndSteel.itemID)
        //{
        //    this.onBlockDestroyedByPlayer(var1, var2, var3, var4, 1);
        //    var1.setBlockWithNotify(var2, var3, var4, 0);
        //    return true;
        //}
        //else
        //{
            return super.onBlockActivated(var1, var2, var3, var4, var5, var6, var7, var8, var9);
        //}
    }
    
    public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
        if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.flintAndSteel.itemID)
        {
            world.setBlockMetadata(i, j, k, 1);
        }
        super.onBlockClicked(world, i, j, k, entityplayer);
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World var1, int var2, int var3, int var4, Entity var5)
    {
        if (var5 instanceof EntityArrow && !var1.isRemote)
        {
            EntityArrow var6 = (EntityArrow)var5;

            if (var6.isBurning())
            {
                this.onBlockDestroyedByPlayer(var1, var2, var3, var4, 1);
                var1.setBlockWithNotify(var2, var3, var4, 0);
            }
        }
    }

    /**
     * Return whether this block can drop from an explosion.
     */
    public boolean canDropFromExplosion(Explosion var1)
    {
        return false;
    }
}