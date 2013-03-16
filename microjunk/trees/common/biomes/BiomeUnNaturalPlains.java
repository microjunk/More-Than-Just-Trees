package microjunk.trees.common.biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeUnNaturalPlains extends BiomeGenBase 
{

	public BiomeUnNaturalPlains(int i)
	{
		
		super(i);
		this.setBiomeName("UnNatural Plains");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.fillerBlock = (byte)Block.netherrack.blockID;
		this.topBlock = (byte)Block.dirt.blockID;
		this.maxHeight = 0.2F;
		this.minHeight = 0.15F;
		
	}
	
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return (WorldGenerator)(par1Random.nextInt(1) == 0 ? new WorldGenShrub(3, 0) : (par1Random.nextInt(2) == 0 ? new WorldGenShrub(3, 0) : false));
    }
	
	public WorldGenerator getRandomWorldGenForGrass(Random par1Random)
    {
        return par1Random.nextInt(4) == 0 ? new WorldGenTallGrass(Block.tallGrass.blockID, 2) : new WorldGenTallGrass(Block.tallGrass.blockID, 1);
    }
	
}
