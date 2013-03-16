package microjunk.trees.common.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeWhitePlains extends BiomeGenBase 
{

	public BiomeWhitePlains(int i)
	{
		
		super(i);
		this.setBiomeName("White Plains");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.fillerBlock = (byte)Block.sandStone.blockID;
		this.topBlock = (byte)Block.sand.blockID;
		this.topBlock = (byte)Block.grass.blockID;
		this.maxHeight = 0.2F;
		this.minHeight = 0.1F;
		
	}
	
}
