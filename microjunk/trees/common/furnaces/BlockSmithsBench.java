package microjunk.trees.common.furnaces;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.src.ModLoader;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockSmithsBench extends Block
{
	
      public BlockSmithsBench(int par1, int par2)
      {
             super(par1, par2, Material.wood);
             blockIndexInTexture = 59;
             this.setCreativeTab(Trees.tabTreeThings);
      }

/**
* Returns the block texture based on the side being looked at. Args: side
*/
      
      public int getBlockTextureFromSide(int par1)
      {
          return par1 == 1 ? this.blockIndexInTexture - 16 : (par1 == 1 ? Block.planks.getBlockTextureFromSide(0) : (par1 != 2 && par1 != 4 ? this.blockIndexInTexture : this.blockIndexInTexture + 1));
      }

      public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9)
      {
          if (!player.isSneaking())
          {
              player.openGui(Trees.instance, 1, var1, var2, var3, var4);
              return true;
          }
          else
          {
              return false;
          }
      }


}

