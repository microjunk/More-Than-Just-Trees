package microjunk.trees.common.mobs;

import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

class ContainerPunSheep extends Container
{
    final EntityPunSheep field_90034_a;

    ContainerPunSheep(EntityPunSheep par1EntityPunSheep)
    {
        this.field_90034_a = par1EntityPunSheep;
    }

    public boolean canInteractWith(EntityPlayer par1EntityPlayer)
    {
        return false;
    }
}
