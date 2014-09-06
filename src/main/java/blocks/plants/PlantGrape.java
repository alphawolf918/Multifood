package multifood.blocks.plants;

import java.util.Random;

import multifood.items.Items;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PlantGrape extends BlockCrops
{
	@SideOnly(Side.CLIENT)
	private Icon[] iconArray;
	
	public PlantGrape(int par1)
	{
		super(par1);
		this.setUnlocalizedName("grapeplant");
		this.setTextureName("grape");
		this.setCreativeTab((CreativeTabs) null);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	 */
	public Icon getIcon(int par1, int par2)
	{
		if (par2 < 7)
		{
			if (par2 == 6)
			{
				par2 = 5;
			}
			
			return this.iconArray[par2 >> 1];
		}
		else
		{
			return this.iconArray[3];
		}
	}
	
	/**
	 * Generate a seed ItemStack for this crop.
	 */
	@Override
	protected int getSeedItem()
	{
		return Items.grape.itemID;
	}
	
	/**
	 * Generate a crop produce ItemStack for this crop.
	 */
	@Override
	protected int getCropItem()
	{
		return Items.grape.itemID;
	}
	
	@Override
	public int quantityDropped(Random par1Random) {
		return par1Random.nextInt(4);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.iconArray = new Icon[4];
		
		for (int i = 0; i < this.iconArray.length; ++i)
		{
			this.iconArray[i] = par1IconRegister
					.registerIcon("awmf:" + this.getTextureName() + "_stage_"
							+ i);
			this.blockIcon = par1IconRegister.registerIcon("awmf:"
					+ this.getTextureName() + "_stage_" + i);
		}
	}
}