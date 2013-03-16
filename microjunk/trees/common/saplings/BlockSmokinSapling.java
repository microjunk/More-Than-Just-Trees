package microjunk.trees.common.saplings;

import java.util.Random;

import microjunk.trees.common.Trees;
import microjunk.trees.common.worldgentrees.WorldGenSmokinTrees;
import net.minecraft.block.BlockFlower;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

// Referenced classes of package net.minecraft.src:
//                      BlockFlower, World, WorldGenTaiga2, WorldGenForest, 
//                      WorldGenTrees, WorldGenBigTree, WorldGenerator

public class BlockSmokinSapling extends BlockFlower
{

        public BlockSmokinSapling(int i, int j)
        {
                super(i, j);
                float f = 0.4F;
                setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
                this.setCreativeTab(Trees.tabLeaves);
        }


        public void updateTick(World world, int i, int j, int k, Random random)
        {
                if(world.isRemote)
                {
                        return;
                }
                super.updateTick(world, i, j, k, random);

                if(world.getBlockLightValue(i, j + 1, k) >= 9 && random.nextInt(7) == 0)
                {
                        int l = world.getBlockMetadata(i, j, k);
                        if((l & 8) == 0)
                        {
                                world.setBlockMetadataWithNotify(i, j, k, l | 8);
                        } else
                        {
                                growTree(world, i, j, k, random);
                        }
                }
        }

        public int getBlockTextureFromSideAndMetadata(int i, int j)
        {
                j &= 3;
                if(j == 1)
                {
                        return 17;  //63
                }
                if(j == 2)
                {
                        return 17; //79
                } else
                {
                        //return super.getBlockTextureFromSideAndMetadata(i, j);
                 return 17;
                }
        }

        public void growTree(World world, int i, int j, int k, Random random)
        {
                int l = world.getBlockMetadata(i, j, k) & 3;
                world.setBlock(i, j, k, 0);
                Object obj = null;
                obj = new WorldGenSmokinTrees(false);//Change to your own tree's gen class
                if(!((WorldGenerator) (obj)).generate(world, random, i, j, k))
                {
                        world.setBlockAndMetadata(i, j, k, blockID, l);
                }
        }

        public int damageDropped(int i)
        {
                return i & 3;
        }

        public String getTextureFile()
        {
         return ("/microjunk/trees/common/aart/Trees.png");
        }


        public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par2, float par3, float par4, float par5)
        {
           ItemStack equipped = entityplayer.getCurrentEquippedItem();
           if (equipped == null)
           {
                return false;
           }
           if ((equipped.getItem() == Item.dyePowder) && (equipped.getItemDamage() == 15)) //if bone meal
           {
                growTree(world, i, j, k, world.rand);
                equipped.stackSize -= 1;
           }
           return false;
        }


}