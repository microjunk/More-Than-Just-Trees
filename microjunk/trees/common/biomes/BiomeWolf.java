package microjunk.trees.common.biomes;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;

public class BiomeWolf extends BiomeGenBase 
{

	public BiomeWolf(int i)
	{
		
		super(i);
		this.setBiomeName("Wolf");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 5, 4, 4));
		this.fillerBlock = (byte)Block.dirt.blockID;
		this.topBlock = (byte)Block.grass.blockID;
		this.maxHeight = 0.5F;
		this.minHeight = 0.1F;
		
	}
	
}
