package microjunk.trees.common.blocks;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSoftWoodStairs extends BlockStairs
{
    private final Block modelBlock;

    public BlockSoftWoodStairs(int var1, Block var2, int var3)
    {
        super(var1, var2, var3);
        this.blockIndexInTexture = var3;
        this.modelBlock = var2;
        this.setLightOpacity(0);
        this.setCreativeTab(Trees.tabTreeBlocks);
    }
    
    public String getTextureFile()
    {
     return "/microjunk/trees/common/aart/Blocks.png";
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
