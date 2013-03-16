package microjunk.trees.common.weapons;

import microjunk.trees.common.Trees;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class ItemPurpleBow extends Item
{
    public ItemPurpleBow(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setMaxDamage(384);
        this.setCreativeTab(Trees.tabTreeCombat);
    }
    
  //The pulling back texture of the bow, you can change this to whatever you want, for example 8 textures or something
    public int getIconIndex(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
    {
        if (usingItem != null && usingItem.getItem().itemID == Trees.purpleBow.itemID)
        {
            int k = usingItem.getMaxItemUseDuration() - useRemaining;
            if (k >= 18) return 144;//The return values are
            if (k >  13) return 160;//the icon indexes (in the /Tutorial/Items.png file)
            if (k >   0) return 176;
        }
        return getIconIndex(stack);
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
    {
        int var5 = this.getMaxItemUseDuration(var1) - var4;
        ArrowLooseEvent var6 = new ArrowLooseEvent(var3, var1, var5);
        MinecraftForge.EVENT_BUS.post(var6);

        if (!var6.isCanceled())
        {
            boolean var7 = var3.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, var1) > 0;

            if (var7 || var3.inventory.hasItem(Trees.purpleArrow.itemID))
            {
                float var8 = (float)var5 / 20.0F;
                var8 = 1.0F;

                if ((double)var8 < 0.1D)
                {
                    return;
                }

                if (var8 > 1.0F)
                {
                    var8 = 1.0F;
                }

                EntityPurpleArrow var9 = new EntityPurpleArrow(var2, var3, var8 * 2.0F);

                if (var8 == 1.0F)
                {
                    var9.setIsCritical(true);
                }

                int var10 = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, var1);

                if (var10 > 0)
                {
                    var9.setDamage(var9.getDamage() + (double)var10 * 0.5D + 0.5D);
                }

                int var11 = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, var1);

                if (var11 > 0)
                {
                    var9.setKnockbackStrength(var11);
                }

                if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, var1) > 0)
                {
                    var9.setFire(100);
                }

                var1.damageItem(1, var3);
                var2.playSoundAtEntity(var3, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var8 * 0.5F);

                if (var7)
                {
                    var9.canBePickedUp = 2;
                }
                else
                {
                    var3.inventory.consumeInventoryItem(Trees.purpleArrow.itemID);
                }

                if (!var2.isRemote)
                {
                    var2.spawnEntityInWorld(var9);
                }
            }
        }
    }

    public ItemStack onFoodEaten(ItemStack var1, World var2, EntityPlayer var3)
    {
        return var1;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack var1)
    {
        return 72000;
    }
    
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        ArrowNockEvent var4 = new ArrowNockEvent(var3, var1);
        MinecraftForge.EVENT_BUS.post(var4);

        if (var4.isCanceled())
        {
            return var4.result;
        }
        else
        {
            if (var3.capabilities.isCreativeMode || var3.inventory.hasItem(Trees.purpleArrow.itemID))
            {
                var3.setItemInUse(var1, this.getMaxItemUseDuration(var1));
            }

            return var1;
        }
    }
    
    public String getTextureFile() 
    {
        return "/microjunk/trees/common/aart/Items.png";
    }

    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    public int getItemEnchantability()
    {
        return 1;
    }
}