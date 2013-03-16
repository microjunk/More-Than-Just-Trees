package microjunk.trees.common.worldgentrees;

import java.util.Random;

import microjunk.trees.common.Trees;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenNetherTrees extends WorldGenerator
{
        private final int field_48202_a;
        private final boolean field_48200_b;
        private final int field_48201_c;
        private final int field_48199_d;

        public WorldGenNetherTrees(boolean flag)
        {
                this(flag, 4, 0, 0, false);
        }

        public WorldGenNetherTrees(boolean flag, int i, int j, int k, boolean flag1)
        {
                super(flag);
                field_48202_a = i;
                field_48201_c = j;
                field_48199_d = k;
                field_48200_b = flag1;
        }

        public boolean generate(World world, Random random, int i, int j, int k)
        {
        	System.out.println("generating nether tree");
                int l = random.nextInt(3) + field_48202_a;
                boolean flag = true;

                if (j < 1 || j + l + 1 > 256)
                {
                        return false;
                }

                for (int i1 = j; i1 <= j + 1 + l; i1++)
                {
                        byte byte0 = 1;

                        if (i1 == j)
                        {
                                byte0 = 0;
                        }

                        if (i1 >= (j + 1 + l) - 2)
                        {
                                byte0 = 2;
                        }

                        for (int k1 = i - byte0; k1 <= i + byte0 && flag; k1++)
                        {
                                for (int i2 = k - byte0; i2 <= k + byte0 && flag; i2++)
                                {
                                        if (i1 >= 0 && i1 < 256)
                                        {
                                                int i3 = world.getBlockId(k1, i1, i2);

                                                if (i3 != 0 && i3 != Trees.netherLeaves.blockID && i3 != Block.dirt.blockID && i3 != Trees.netherLog.blockID)
                                                {
                                                        flag = false;
                                                }
                                        }
                                        else
                                        {
                                                flag = false;
                                        }
                                }
                        }
                }

                if (!flag)
                {
                        return false;
                }

                int j1 = world.getBlockId(i, j - 1, k);

                if (j1 != Block.netherrack.blockID && j1 != Block.slowSand.blockID || j >= 256 - l - 1)
                {
                        return false;
                }

                func_50073_a(world, i, j - 1, k, Trees.netherLog.blockID);
                byte byte1 = 3;
                int l1 = 0;

                for (int j2 = (j - byte1) + l; j2 <= j + l; j2++)
                {
                        int j3 = j2 - (j + l);
                        int i4 = (l1 + 1) - j3 / 2;

                        for (int k4 = i - i4; k4 <= i + i4; k4++)
                        {
                                int i5 = k4 - i;

                                for (int k5 = k - i4; k5 <= k + i4; k5++)
                                {
                                        int l5 = k5 - k;

                                        if ((Math.abs(i5) != i4 || Math.abs(l5) != i4 || random.nextInt(2) != 0 && j3 != 0) && !Block.opaqueCubeLookup[world.getBlockId(k4, j2, k5)])
                                        {
                                                setBlockAndMetadata(world, k4, j2, k5, Trees.netherLeaves.blockID, field_48199_d);
                                        }
                                }
                        }
                }

                for (int k2 = 0; k2 < l; k2++)
                {
                        int k3 = world.getBlockId(i, j + k2, k);

                        if (k3 != 0 && k3 != Trees.netherLeaves.blockID)
                        {
                                continue;
                        }

                        setBlockAndMetadata(world, i, j + k2, k, Trees.netherLog.blockID, field_48201_c);

                        if (!field_48200_b || k2 <= 0)
                        {
                                continue;
                        }

                        if (random.nextInt(3) > 0 && world.isAirBlock(i - 1, j + k2, k))
                        {
                                setBlockAndMetadata(world, i - 1, j + k2, k, Block.dirt.blockID, 8);
                        }

                        if (random.nextInt(3) > 0 && world.isAirBlock(i + 1, j + k2, k))
                        {
                                setBlockAndMetadata(world, i + 1, j + k2, k, Block.dirt.blockID, 2);
                        }

                        if (random.nextInt(3) > 0 && world.isAirBlock(i, j + k2, k - 1))
                        {
                                setBlockAndMetadata(world, i, j + k2, k - 1, Block.dirt.blockID, 1);
                        }

                        if (random.nextInt(3) > 0 && world.isAirBlock(i, j + k2, k + 1))
                        {
                                setBlockAndMetadata(world, i, j + k2, k + 1, Block.dirt.blockID, 4);
                        }
                }

                if (field_48200_b)
                {
                        for (int l2 = (j - 3) + l; l2 <= j + l; l2++)
                        {
                                int l3 = l2 - (j + l);
                                int j4 = 2 - l3 / 2;

                                for (int l4 = i - j4; l4 <= i + j4; l4++)
                                {
                                        for (int j5 = k - j4; j5 <= k + j4; j5++)
                                        {
                                                if (world.getBlockId(l4, l2, j5) != Trees.netherLog.blockID)
                                                {
                                                        continue;
                                                }

                                                if (random.nextInt(4) == 0 && world.getBlockId(l4 - 1, l2, j5) == 0)
                                                {
                                                        func_48198_a(world, l4 - 1, l2, j5, 8);
                                                }

                                                if (random.nextInt(4) == 0 && world.getBlockId(l4 + 1, l2, j5) == 0)
                                                {
                                                        func_48198_a(world, l4 + 1, l2, j5, 2);
                                                }

                                                if (random.nextInt(4) == 0 && world.getBlockId(l4, l2, j5 - 1) == 0)
                                                {
                                                        func_48198_a(world, l4, l2, j5 - 1, 1);
                                                }

                                                if (random.nextInt(4) == 0 && world.getBlockId(l4, l2, j5 + 1) == 0)
                                                {
                                                        func_48198_a(world, l4, l2, j5 + 1, 4);
                                                }
                                        }
                                }
                        }
                }

                return true;
        }

        private void func_50073_a(World world, int i, int j, int k, int blockID)
        {

}

private void func_48198_a(World world, int i, int j, int k, int l)
        {
                setBlockAndMetadata(world, i, j, k, Block.dirt.blockID, l);

                for (int i1 = 4; world.getBlockId(i, --j, k) == 0 && i1 > 0; i1--)
                {
                        setBlockAndMetadata(world, i, j, k, Block.dirt.blockID, l);
                }
        }
}
/*public class WorldGenNetherTrees extends WorldGenerator
{
	public WorldGenNetherTrees()
    {
		
    }
	public boolean generate(World world, Random rand, int i, int j, int k)
	{
		/*int j1 = world.getBlockId(i, j - 1, k);
		if(j1 != Block.netherrack.blockID && j1 != Block.dirt.blockID && j1 != Trees.alphaGrass.blockID || j >= 128 - 12 - 1)
        {
        	return false;
        }*/
         /*int x = i-3;
         int z = k - 3;
         System.out.println("generating tree");
         //world.setBlock(x + 3, j + -1, z + 3, Block.dirt.blockID);// keep this
         world.setBlock(x + 3, j + 0, z + 3, Trees.netherLog.blockID);///This sets what your tree will look like
         world.setBlock(x + 3, j + 1, z + 3, Trees.netherLog.blockID);// You should make your own version
         world.setBlock(x + 3, j + 2, z + 3, Trees.netherLog.blockID);
         world.setBlock(x + 3, j + 3, z + 3, Trees.netherLog.blockID);
         world.setBlock(x + 3, j + 4, z + 3, Trees.netherLog.blockID);
         world.setBlock(x + 3, j + 5, z + 3, Trees.netherLog.blockID);
         world.setBlock(x + 2, j + 6, z + 3, Trees.netherLeaves.blockID);
         world.setBlock(x + 3, j + 6, z + 3, Trees.netherLog.blockID);
         world.setBlock(x + 4, j + 6, z + 3, Trees.netherLeaves.blockID);
         world.setBlock(x + 1, j + 7, z + 4, Trees.netherLeaves.blockID);
         world.setBlock(x + 1, j + 7, z + 3, Trees.netherLeaves.blockID);
         world.setBlock(x + 2, j + 7, z + 4, Trees.netherLeaves.blockID);
         world.setBlock(x + 2, j + 7, z + 3, Trees.netherLog.blockID);
         world.setBlock(x + 2, j + 7, z + 2, Trees.netherLeaves.blockID);
         world.setBlock(x + 3, j + 7, z + 4, Trees.netherLeaves.blockID);
         world.setBlock(x + 3, j + 7, z + 3, Trees.netherLog.blockID);
         world.setBlock(x + 4, j + 7, z + 4, Trees.netherLeaves.blockID);
         world.setBlock(x + 4, j + 7, z + 3, Trees.netherLog.blockID);
         world.setBlock(x + 4, j + 7, z + 2, Trees.netherLeaves.blockID);
         world.setBlock(x + 5, j + 7, z + 3, Trees.netherLeaves.blockID);
         world.setBlock(x + 0, j + 8, z + 5, Trees.netherLeaves.blockID);
         world.setBlock(x + 1, j + 8, z + 6, Trees.netherLeaves.blockID);
         world.setBlock(x + 1, j + 8, z + 5, Trees.netherLog.blockID);
         world.setBlock(x + 1, j + 8, z + 4, Trees.netherLog.blockID);
         world.setBlock(x + 1, j + 8, z + 3, Trees.netherLeaves.blockID);
         world.setBlock(x + 2, j + 8, z + 5, Trees.netherLeaves.blockID);
         world.setBlock(x + 2, j + 8, z + 4, Trees.netherLog.blockID);
         world.setBlock(x + 2, j + 8, z + 3, Trees.netherLeaves.blockID);
         world.setBlock(x + 2, j + 8, z + 2, Trees.netherLeaves.blockID);
         world.setBlock(x + 3, j + 8, z + 5, Trees.netherLeaves.blockID);
         world.setBlock(x + 3, j + 8, z + 4, Trees.netherLeaves.blockID);
         world.setBlock(x + 3, j + 8, z + 3, Trees.netherLeaves.blockID);
         world.setBlock(x + 3, j + 8, z + 2, Trees.netherLeaves.blockID);
         world.setBlock(x + 3, j + 8, z + 1, Trees.netherLeaves.blockID);
         world.setBlock(x + 4, j + 8, z + 5, Trees.netherLeaves.blockID);
         world.setBlock(x + 4, j + 8, z + 4, Trees.netherLog.blockID);
         world.setBlock(x + 4, j + 8, z + 3, Trees.netherLog.blockID);
         world.setBlock(x + 4, j + 8, z + 2, Trees.netherLeaves.blockID);
         world.setBlock(x + 5, j + 8, z + 5, Trees.netherLeaves.blockID);
         world.setBlock(x + 5, j + 8, z + 4, Trees.netherLeaves.blockID);
         world.setBlock(x + 5, j + 8, z + 3, Trees.netherLeaves.blockID);
         world.setBlock(x + 5, j + 8, z + 2, Trees.netherLeaves.blockID);
         world.setBlock(x + 0, j + 9, z + 6, Trees.netherLeaves.blockID);
         world.setBlock(x + 0, j + 9, z + 2, Trees.netherLeaves.blockID);
         world.setBlock(x + 1, j + 9, z + 7, Trees.netherLeaves.blockID);
         world.setBlock(x + 1, j + 9, z + 6, Trees.netherLog.blockID);
         world.setBlock(x + 1, j + 9, z + 5, Trees.netherLeaves.blockID);
         world.setBlock(x + 1, j + 9, z + 4, Trees.netherLeaves.blockID);
         world.setBlock(x + 1, j + 9, z + 3, Trees.netherLeaves.blockID);
         world.setBlock(x + 1, j + 9, z + 2, Trees.netherLog.blockID);
         world.setBlock(x + 1, j + 9, z + 1, Trees.netherLeaves.blockID);
         world.setBlock(x + 2, j + 9, z + 6, Trees.netherLeaves.blockID);
         world.setBlock(x + 2, j + 9, z + 5, Trees.netherLeaves.blockID);
         world.setBlock(x + 2, j + 9, z + 4, Trees.netherLeaves.blockID);
         world.setBlock(x + 2, j + 9, z + 3, Trees.netherLog.blockID);
         world.setBlock(x + 2, j + 9, z + 2, Trees.netherLeaves.blockID);
         world.setBlock(x + 3, j + 9, z + 4, Trees.netherLeaves.blockID);
         world.setBlock(x + 3, j + 9, z + 2, Trees.netherLeaves.blockID);
         world.setBlock(x + 3, j + 9, z + 1, Trees.netherLeaves.blockID);
         world.setBlock(x + 4, j + 9, z + 5, Trees.netherLeaves.blockID);
         world.setBlock(x + 4, j + 9, z + 4, Trees.netherLeaves.blockID);
         world.setBlock(x + 4, j + 9, z + 3, Trees.netherLeaves.blockID);
         world.setBlock(x + 4, j + 9, z + 2, Trees.netherLog.blockID);
         world.setBlock(x + 4, j + 9, z + 1, Trees.netherLeaves.blockID);
         world.setBlock(x + 5, j + 9, z + 6, Trees.netherLeaves.blockID);
         world.setBlock(x + 5, j + 9, z + 5, Trees.netherLog.blockID);
         world.setBlock(x + 5, j + 9, z + 4, Trees.netherLeaves.blockID);
         world.setBlock(x + 5, j + 9, z + 3, Trees.netherLeaves.blockID);
         world.setBlock(x + 5, j + 9, z + 2, Trees.netherLog.blockID);
         world.setBlock(x + 5, j + 9, z + 1, Trees.netherLeaves.blockID);
         world.setBlock(x + 6, j + 9, z + 5, Trees.netherLeaves.blockID);
         world.setBlock(x + 6, j + 9, z + 2, Trees.netherLeaves.blockID);
         world.setBlock(x + 0, j + 10, z + 7, Trees.netherLeaves.blockID);
         world.setBlock(x + 0, j + 10, z + 6, Trees.netherLeaves.blockID);
         world.setBlock(x + 0, j + 10, z + 3, Trees.netherLeaves.blockID);
         world.setBlock(x + 0, j + 10, z + 2, Trees.netherLeaves.blockID);
         world.setBlock(x + 0, j + 10, z + 1, Trees.netherLeaves.blockID);
         world.setBlock(x + 1, j + 10, z + 6, Trees.netherLeaves.blockID);
         world.setBlock(x + 1, j + 10, z + 3, Trees.netherLeaves.blockID);
         world.setBlock(x + 1, j + 10, z + 2, Trees.netherLog.blockID);
         world.setBlock(x + 1, j + 10, z + 1, Trees.netherLog.blockID);
         world.setBlock(x + 1, j + 10, z + 0, Trees.netherLeaves.blockID);
         world.setBlock(x + 2, j + 10, z + 3, Trees.netherLeaves.blockID);
         world.setBlock(x + 2, j + 10, z + 2, Trees.netherLeaves.blockID);
         world.setBlock(x + 3, j + 10, z + 3, Trees.netherLeaves.blockID);
         world.setBlock(x + 4, j + 10, z + 2, Trees.netherLeaves.blockID);
         world.setBlock(x + 5, j + 10, z + 5, Trees.netherLeaves.blockID);
         world.setBlock(x + 5, j + 10, z + 4, Trees.netherLeaves.blockID);
         world.setBlock(x + 5, j + 10, z + 2, Trees.netherLeaves.blockID);
         world.setBlock(x + 5, j + 10, z + 1, Trees.netherLeaves.blockID);
         world.setBlock(x + 6, j + 10, z + 6, Trees.netherLeaves.blockID);
         world.setBlock(x + 6, j + 10, z + 5, Trees.netherLeaves.blockID);
         world.setBlock(x + 6, j + 10, z + 4, Trees.netherLeaves.blockID);
         world.setBlock(x + 6, j + 10, z + 1, Trees.netherLeaves.blockID);
         world.setBlock(x + 1, j + 11, z + 2, Trees.netherLeaves.blockID);
         world.setBlock(x + 1, j + 11, z + 1, Trees.netherLeaves.blockID);
         world.setBlock(x + 6, j + 11, z + 6, Trees.netherLeaves.blockID);
         return true;
		}
}*/
