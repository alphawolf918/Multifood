package multifood.items.potions;

import multifood.creativetabs.ModTabs;
import multifood.lib.ModInfo;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Lemonade extends Item {
	public Lemonade(int par1) {
		super(par1);
		this.setUnlocalizedName("lemonade");
		this.setCreativeTab(ModTabs.mfTab);
		this.setMaxStackSize(1);
	}
	
	@Override
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer)
	{
		if (!par3EntityPlayer.capabilities.isCreativeMode)
		{
			--par1ItemStack.stackSize;
		}
		
		if (!par3EntityPlayer.capabilities.isCreativeMode)
		{
			if (par1ItemStack.stackSize <= 0)
			{
				return new ItemStack(Item.glassBottle);
			}
			
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(
					Item.glassBottle));
		}
		
		return par1ItemStack;
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
		return 22;
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.drink;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer)
	{
		par3EntityPlayer.setItemInUse(par1ItemStack,
				this.getMaxItemUseDuration(par1ItemStack));
		PotionEffect pe = new PotionEffect(Potion.regeneration.id, 360, 4,
				false);
		par3EntityPlayer.addPotionEffect(pe);
		return par1ItemStack;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "lemonade");
	}
}