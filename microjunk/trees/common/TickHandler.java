package microjunk.trees.common;

import java.util.EnumSet;

import microjunk.trees.common.travel.EntityLavaBoat;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandler implements ITickHandler 
{
	
	/* Used to determine if player moved in OnTickInGame method to determine if light should be updated */
	public int lastPlayerX = 0; 
	public int lastPlayerY = 0;
	public int lastPlayerZ = 0;

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData)
	{				
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData)
	{
		if (type.equals(EnumSet.of(TickType.RENDER)))
		{
			onRenderTick();
		}
		else if (type.equals(EnumSet.of(TickType.CLIENT)))
		{
			Minecraft mc = Minecraft.getMinecraft();
			GuiScreen guiscreen = Minecraft.getMinecraft().currentScreen;
          
            if (guiscreen != null)
            {
                onTickInGUI(mc, guiscreen);
            } else {
                onTickInGame(mc);
            }
            }	
	}

	@Override
	public EnumSet<TickType> ticks()
	{
		return EnumSet.of(TickType.RENDER, TickType.CLIENT);
	}

	@Override
	public String getLabel()
	{
		return null;
	}
	
	public void onRenderTick()
    {
    
    }

    public void onTickInGUI(Minecraft mc, GuiScreen guiscreen)
    {
    
    }
	
    /**
	 * This method runs every tick of game
	 * 
	 * Village greeting - Checks, if player entered or left village and if so, writes chat message.
	 * 
	 * Lantern light updating - Checks if player moved or switched to or from lantern item and updates
	 * light accordingly.
	 */
	public void onTickInGame(Minecraft mc)
	{		
		World world = mc.theWorld;
		
		/* .: Lantern light updating :. */
		try /* Player switched to another item */
		{
 			if(Trees.instance.blackTorchEquipped && (mc.thePlayer.inventory.getCurrentItem()).itemID != Trees.blackTorch.itemID)
 			{
 				for(int i = -2; i<3; i++)
 				{
 					for(int j = -2; j<3; j++)
 	 				{
 						for(int k = -2; k<3; k++)
 		 				{
 		 				world.updateLightByType(EnumSkyBlock.Block, (int)mc.thePlayer.posX + i, (int)mc.thePlayer.posY + j, (int)mc.thePlayer.posZ + k);
 		 				}
 	 				}
 				}
 				Trees.instance.blackTorchEquipped = false;
 			} 
		}
		catch(NullPointerException e){}
		
		try /* Player holds lantern - emit light */
		{
			if((mc.thePlayer.inventory.getCurrentItem()).itemID == Trees.blackTorch.itemID)
			{ 				
				if(mc.thePlayer != null)
				{ 	        	
					if((int)mc.thePlayer.posX != lastPlayerX || (int)mc.thePlayer.posY != lastPlayerY || (int)mc.thePlayer.posZ != lastPlayerZ)
					{	        		 							
						world.setLightValue(EnumSkyBlock.Block, (int)mc.thePlayer.posX, (int)mc.thePlayer.posY, (int)mc.thePlayer.posZ, 15);    	
						world.updateLightByType(EnumSkyBlock.Block, lastPlayerX, lastPlayerY, lastPlayerZ);						
						System.out.println("updating light in "+(int)mc.thePlayer.posX+" "+(int)mc.thePlayer.posY+" "+(int)mc.thePlayer.posZ);
						Trees.instance.blackTorchEquipped = true;
					}
					lastPlayerX = (int)mc.thePlayer.posX;
					lastPlayerY = (int)mc.thePlayer.posY;
					lastPlayerZ = (int)mc.thePlayer.posZ;
				}
			}
		}
		catch(NullPointerException e) /* Player removed lantern or switched to empty field in inventory */
		{
			for(int i = -2; i<3; i++)
			{
				for(int j = -2; j<3; j++)
 				{
					for(int k = -2; k<3; k++)
	 				{
	 				world.updateLightByType(EnumSkyBlock.Block, (int)mc.thePlayer.posX + i, (int)mc.thePlayer.posY + j, (int)mc.thePlayer.posZ + k);
	 				}
 				}
			}
		}
	}
}