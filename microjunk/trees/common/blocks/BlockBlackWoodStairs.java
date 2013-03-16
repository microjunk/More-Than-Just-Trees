package microjunk.trees.common.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBlackWoodStairs extends BlockStairs
{
        /** The block that is used as model for the stair. */
        private  Block modelBlock;
        public BlockBlackWoodStairs(int par1,Block modelBlockx,int par2)
        {
                super(par1, modelBlockx, par2);
                blockIndexInTexture = par2;
                this.modelBlock = modelBlockx;
                this.setLightOpacity(0);
                this.setCreativeTab(Trees.tabTreeBlocks);
        }
        //this deals with the block texture. 
        @Override
        public int getBlockTextureFromSideAndMetadata(int par1, int par2)
        {
            return blockIndexInTexture;
        }

      //gets texture file
        public String getTextureFile()
        {
        	return "/microjunk/trees/common/aart/Blocks.png";
        }

        @SideOnly(Side.CLIENT) //Client side only
        public int getBlockTextureFromSide(int i)
        { //Tells it which texture from the sprite sheet
        	return 10;
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
