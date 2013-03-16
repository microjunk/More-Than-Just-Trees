package microjunk.trees.common.biomes;

import java.util.Random;

import microjunk.trees.common.Trees;
import microjunk.trees.common.worldgentrees.WorldGenGhostTrees;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeAfterLifeDesert extends BiomeGenBase 
{
	
	public BiomeAfterLifeDesert(int i)
	{
		
		super(i);
		this.setBiomeName("Afterlife Desert");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		//this.theBiomeDecorator.treesPerChunk = 3;
		this.fillerBlock = (byte)Block.sandStone.blockID;
		this.topBlock = (byte)Block.sand.blockID;
		//this.createBiomeDecorator();
		this.maxHeight = 0.2F;
		this.minHeight = 0.1F;
		this.theBiomeDecorator.deadBushPerChunk = 3;
		this.theBiomeDecorator.cactiPerChunk = 2;

	}
	
	public WorldGenerator getRandomWorldGenForGrass(Random par1Random)
    {
        return new WorldGenTallGrass(Block.dirt.blockID, 1);
    }
	
}