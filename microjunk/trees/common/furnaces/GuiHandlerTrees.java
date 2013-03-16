package microjunk.trees.common.furnaces;

import microjunk.trees.client.GuiExtruder;

import microjunk.trees.client.GuiForge;
import microjunk.trees.client.GuiGemMachine;
import microjunk.trees.client.GuiIceMachine;
import microjunk.trees.client.GuiSmithsCrafting;
import microjunk.trees.client.GuiSpiritTable;
import microjunk.trees.client.GuiTreeTrunk;
import microjunk.trees.common.Trees;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandlerTrees implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{

		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

		switch(id)
		{

		case 0: return new ContainerExtruder(player.inventory, (TileEntityExtruder) tile_entity);
		case 1: return id == 1 && world.getBlockId(x, y, z) == Trees.smithsBench.blockID ? new ContainerSmithsBench(player.inventory, world, x, y, z) : null;
		case 2: return new ContainerSpiritTable(player.inventory, (world), x, y, z);
		case 3: return new ContainerTreeTrunk(player.inventory, (TileEntityTreeTrunk) tile_entity);
		case 4: return new ContainerForge(player.inventory, (world), x, y, z, player);
		case 5: return new ContainerIceMachine(player.inventory, (TileEntityIceMachine) tile_entity);
		case 6: return new ContainerGemMachine(player.inventory, (TileEntityGemMachine) tile_entity);

		}
		return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
		{

			TileEntity tile_entity = world.getBlockTileEntity(x, y, z);

			switch(id)
			{

			case 0: return new GuiExtruder(player.inventory, (TileEntityExtruder) tile_entity);
			case 1: return id == 1 && world.getBlockId(x, y, z) == Trees.smithsBench.blockID ? new GuiSmithsCrafting(player.inventory, world, x, y, z) : null;
			case 2: return new GuiSpiritTable(player.inventory, (world), x, y, z);
			case 3: return new GuiTreeTrunk(player.inventory, (TileEntityTreeTrunk) tile_entity);
			case 4: return new GuiForge(player.inventory, (world), x, y, z);
			case 5: return new GuiIceMachine(player.inventory, (TileEntityIceMachine) tile_entity);
			case 6: return new GuiGemMachine(player.inventory, (TileEntityGemMachine) tile_entity);

			}

			return null;

		}
		
}
