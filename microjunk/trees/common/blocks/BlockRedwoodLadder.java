package microjunk.trees.common.blocks;

import static net.minecraftforge.common.ForgeDirection.EAST;
import static net.minecraftforge.common.ForgeDirection.NORTH;
import static net.minecraftforge.common.ForgeDirection.SOUTH;
import static net.minecraftforge.common.ForgeDirection.WEST;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRedwoodLadder extends BlockLadder
{
    public BlockRedwoodLadder(int par1, int par2)
    {
        super(par1, par2); //makes the block look and act like redstone,torches etc
        this.setCreativeTab(Trees.tabTreeBlocks); //puts it in the decoration tab
    }

    //give the block a flat block bound area
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        int var5 = par1World.getBlockMetadata(par2, par3, par4);
        float var6 = 0.125F;

        if (var5 == 2)
        {
            this.setBlockBounds(0.0F, 0.0F, 1.0F - var6, 1.0F, 1.0F, 1.0F);
        }

        if (var5 == 3)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var6);
        }

        if (var5 == 4)
        {
            this.setBlockBounds(1.0F - var6, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }

        if (var5 == 5)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, var6, 1.0F, 1.0F);
        }

        return super.getCollisionBoundingBoxFromPool(par1World, par2, par3, par4);
    }

    @SideOnly(Side.CLIENT)

   //this deals with the blockbounds. dont wory bout this
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        int var5 = par1World.getBlockMetadata(par2, par3, par4);
        float var6 = 0.125F;

        if (var5 == 2)
        {
            this.setBlockBounds(0.0F, 0.0F, 1.0F - var6, 1.0F, 1.0F, 1.0F);
        }

        if (var5 == 3)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var6);
        }

        if (var5 == 4)
        {
            this.setBlockBounds(1.0F - var6, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }

        if (var5 == 5)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, var6, 1.0F, 1.0F);
        }

        return super.getSelectedBoundingBoxFromPool(par1World, par2, par3, par4);
    }

    //this makes the block so its not solid. this means that torches can't be placed on it and such
    public boolean isOpaqueCube()
    {
        return false;
    }

    //this tells the game that its not a normal 16x16x16 block
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    //this pulls a render type. you can look into this more if you want. leave it at 8 for a normal ladder
    public int getRenderType()
    {
        return 8;
    }

    //like the torch this checks to see if the ladder can be placed 
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return par1World.isBlockSolidOnSide(par2 - 1, par3, par4, EAST ) ||
               par1World.isBlockSolidOnSide(par2 + 1, par3, par4, WEST ) ||
               par1World.isBlockSolidOnSide(par2, par3, par4 - 1, SOUTH) ||
               par1World.isBlockSolidOnSide(par2, par3, par4 + 1, NORTH);
    }

    //this checks to see if the block is solid when placed
    public void updateBlockMetadata(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8)
    {
        int var9 = par1World.getBlockMetadata(par2, par3, par4);

        if ((var9 == 0 || par5 == 2) && par1World.isBlockSolidOnSide(par2, par3, par4 + 1, NORTH))
        {
            var9 = 2;
        }

        if ((var9 == 0 || par5 == 3) && par1World.isBlockSolidOnSide(par2, par3, par4 - 1, SOUTH))
        {
            var9 = 3;
        }

        if ((var9 == 0 || par5 == 4) && par1World.isBlockSolidOnSide(par2 + 1, par3, par4, WEST))
        {
            var9 = 4;
        }

        if ((var9 == 0 || par5 == 5) && par1World.isBlockSolidOnSide(par2 - 1, par3, par4, EAST))
        {
            var9 = 5;
        }

        par1World.setBlockMetadataWithNotify(par2, par3, par4, var9);
    }

    //tells the block to break if its atached block is gone. 
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        int var6 = par1World.getBlockMetadata(par2, par3, par4);
        boolean var7 = false;

        if (var6 == 2 && par1World.isBlockSolidOnSide(par2, par3, par4 + 1, NORTH))
        {
            var7 = true;
        }

        if (var6 == 3 && par1World.isBlockSolidOnSide(par2, par3, par4 - 1, SOUTH))
        {
            var7 = true;
        }

        if (var6 == 4 && par1World.isBlockSolidOnSide(par2 + 1, par3, par4, WEST))
        {
            var7 = true;
        }

        if (var6 == 5 && par1World.isBlockSolidOnSide(par2 - 1, par3, par4, EAST))
        {
            var7 = true;
        }

        if (!var7)
        {
            this.dropBlockAsItem(par1World, par2, par3, par4, var6, 0);
            par1World.setBlockWithNotify(par2, par3, par4, 0);
        }

        super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
    }

    //this tells the game how many should be dropped
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    @Override
    //this tells the game that this block is a ladder
    public boolean isLadder(World world, int x, int y, int z)
    {
        return true;
    }
    //gets texture file
    public String getTextureFile()
    {
    	return "/microjunk/trees/common/aart/Blocks.png";
    }
    //this tells the block what texture to use from the sprite sheet. one thing to note is that if you make the
    //torch bigger then what it should be you can get some interesting results with the shape of the block
    //changing. 
    //@SideOnly(Side.CLIENT) //Client side only
    public int getBlockTextureFromSide(int i)
    { //Tells it which texture from the sprite sheet
    return 32;
    }
}

