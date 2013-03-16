package microjunk.trees.common.deco;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import microjunk.trees.common.Trees;

public class BlockTwilightRose extends CTFlower
{
		
		public BlockTwilightRose(int i, int j) 
        {
                super(i, j);
                this.setCreativeTab(Trees.tabTreeDeco);
                this.setTickRandomly(true);
        }
 
        public int getTextureSize()
        {
        	return 128;
        }
        
        public String getTextureFile()
        {
         return "/microjunk/trees/common/aart/HD_flowers.png";
        }
        
        /*public int tickRate()
        {
            return 10;
        }*/
        public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
        {
        	if (!par1World.isRemote)
            {
                long var6 = par1World.getWorldTime();
        		if(par1World.getBlockLightValue_do(par2, par3, par4,true)<10.0F || (par1World.canBlockSeeTheSky(par2, par3, par4) && var6 > 12000))
        		{
        			//var1.setBlockWithNotify(var2, var3, var4, blockID);
        			this.setLightValue(1F);
        		}
        		else
        		{
        			//var1.setBlockWithNotify(var2, var3, var4, blockID);
        			this.setLightValue(0F);
        		}
            }
            return par9;
        }        
        @Override
        public void updateTick(World var1, int var2, int var3, int var4, Random var5)
        {
        	this.onBlockPlaced(var1, var2, var3, var4,0,0F,0F,0F,0);
        }
        
        //public void randomDisplayTick(World var1, int var2, int var3, int var4, Random var5)
        //{
        //    this.updateTick(var1, var2, var3, var4, var5);
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
