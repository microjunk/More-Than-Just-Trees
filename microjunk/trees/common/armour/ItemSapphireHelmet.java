package microjunk.trees.common.armour;

import microjunk.trees.common.Trees;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class ItemSapphireHelmet extends ItemArmor implements IArmorTextureProvider
{

	public ItemSapphireHelmet(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.setCreativeTab(Trees.tabArmor);
		
	}
	
	public String getTextureFile()
	{
		
        return "/microjunk/trees/common/aart/Items.png";
        
    }
	
	public String getArmorTextureFile(ItemStack par1)
	{
        if ( par1.itemID == Trees.sapphireHelmet.itemID|| par1.itemID == Trees.sapphirePlate.itemID|| par1.itemID == Trees.sapphireBoots.itemID)
        {
                return "/microjunk/trees/common/armor/sapphire_1.png";
        }
        if(par1.itemID== Trees.sapphireLegs.itemID)
        {
                return "/microjunk/trees/common/armor/sapphire_2.png";
        }
        return "/microjunk/trees/common/armor/sapphire_2.png";
	}   
	
}
