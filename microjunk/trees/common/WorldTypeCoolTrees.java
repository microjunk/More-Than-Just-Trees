package microjunk.trees.common;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;

public class WorldTypeCoolTrees extends WorldType
{
	private BiomeGenBase BiomeGen;

	public WorldTypeCoolTrees(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

	public String getTranslateName()
	{
		return "Black Mountains";
	}

	public WorldChunkManager getChunkManager(World var1)
	{
		return new WorldChunkManagerHell(Trees.theOrient, 0.5F, 0.5F);
	}

}
