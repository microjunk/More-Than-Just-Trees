package microjunk.trees.common.deco;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.BlockFlower;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlockPoisonbush extends CTFlower
{

    public BlockPoisonbush(int i, int j)
    {
        super(i, j);
        float f = 0.4F;
        this.setCreativeTab(Trees.tabTreeDeco);
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
    }
    
    public int getTextureSize()
    {
    	return 128;
    }
    
    public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/HD_flowers.png";
    }

    public int idDropped(int i, Random random)
    {
        if(random.nextInt(30) == 0)
        {
            return Trees.poisonbush.blockID;
        } else
        {
            return -1;
        }
    }

    public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
    {
        entity.motionX *= 0.40000000000000002D;
        entity.motionZ *= 0.40000000000000002D;
        if(entity instanceof EntityPlayer)
        {
            entity.attackEntityFrom(DamageSource.magic, 20);
        }
    }

}
