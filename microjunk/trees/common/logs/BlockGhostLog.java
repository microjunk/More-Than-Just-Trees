package microjunk.trees.common.logs;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockGhostLog extends Block
{
    public BlockGhostLog(int par1)
    {
        super(par1, Material.wood);
        this.setCreativeTab(Trees.tabWood);
    }
    
    public int getRenderBlockPass()
    {
        return 1;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        int var3 = par2 & 12;
        int var4 = par2 & 3;
        return var3 == 0 && (par1 == 1 || par1 == 0) ? 60 : (var3 == 4 && (par1 == 5 || par1 == 4) ? 60 : (var3 == 8 && (par1 == 2 || par1 == 3) ? 60 : (var4 == 1 ? 24 : (var4 == 2 ? 25 : (var4 == 3 ? 26 : 44)))));
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
    
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
    		 if (par5Entity instanceof EntityLiving) 
    		 {
    		 ((EntityLiving) par5Entity).addPotionEffect(new PotionEffect(Potion.confusion.getId(), 100, 1));
    		 }
    }

    public String getTextureFile() //this specifies the texture path. 
    {
     return "/microjunk/trees/common/aart/Trees.png";
    }

}

