package microjunk.trees.common;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SoundEventSounds 
{

	@SideOnly(Side.CLIENT)
	@ForgeSubscribe
    public void onSoundLoad(SoundLoadEvent event)
    {
		
		Minecraft mc = Minecraft.getMinecraft();
        event.manager.soundPoolSounds.addSound("microjunk/animalsounds/common/sounds/frog.ogg", new File(mc.mcDataDir, "resources/mod/as/frog.ogg"));
        event.manager.soundPoolSounds.addSound("microjunk/animalsounds/common/sounds/cat.ogg", new File(mc.mcDataDir, "resources/mod/as/cat.ogg"));
        

    }
	
}
