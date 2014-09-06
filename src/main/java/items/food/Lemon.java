package multifood.items.food;

import multifood.creativetabs.ModTabs;
import multifood.lib.ModInfo;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Lemon extends ItemFood {
	public Lemon(int par1) {
		super(par1, 4, 10, false);
		this.setCreativeTab(ModTabs.mfTab);
		this.setUnlocalizedName("lemon");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "lemon");
	}
}