package microjunk.trees.client;

import org.lwjgl.opengl.GL11;

import microjunk.trees.common.furnaces.ContainerGemMachine;
import microjunk.trees.common.furnaces.ContainerIceMachine;
import microjunk.trees.common.furnaces.TileEntityGemMachine;
import microjunk.trees.common.furnaces.TileEntityIceMachine;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;

public class GuiGemMachine extends GuiContainer
{
    private TileEntityGemMachine gemMachineInventory;

    public GuiGemMachine(InventoryPlayer par1InventoryPlayer, TileEntityGemMachine par2TileEntityGemMachine)
    {
        super(new ContainerGemMachine(par1InventoryPlayer, par2TileEntityGemMachine));
        this.gemMachineInventory = par2TileEntityGemMachine;
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        this.fontRenderer.drawString(StatCollector.translateToLocal("gemMachine"), 60, 6, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        int var4 = this.mc.renderEngine.getTexture("/microjunk/trees/common/aart/furnace.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(var4);
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
        int var7;

        if (this.gemMachineInventory.isBurning())
        {
            var7 = this.gemMachineInventory.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(var5 + 56, var6 + 36 + 12 - var7, 176, 12 - var7, 14, var7 + 2);
        }

        var7 = this.gemMachineInventory.getCookProgressScaled(24);
        this.drawTexturedModalRect(var5 + 79, var6 + 34, 176, 14, var7 + 1, 16);
    }
}