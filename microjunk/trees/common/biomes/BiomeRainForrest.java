package microjunk.trees.common.biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeRainForrest extends BiomeGenBase
{
	
	public BiomeRainForrest(int i)
	{
		
		super(i);
		this.setBiomeName("Rain Forest");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(EntityOcelot.class, 5, 4, 4));
		this.fillerBlock = (byte)Block.dirt.blockID;
		this.fillerBlock = (byte)Block.cobblestoneMossy.blockID;
		this.topBlock = (byte)Block.grass.blockID;
		this.maxHeight = 0.15F;
		this.minHeight = 0.1F;
		
	}
	
	/*public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return (WorldGenerator)(par1Random.nextInt(5) == 0 ? this.worldGenRainTrees : this.worldGenRainTrees);
    }*/
	
}
