package multifood.items.food;

import multifood.blocks.Blocks;
import multifood.creativetabs.ModTabs;
import multifood.lib.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSeedFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Grape extends ItemSeedFood {
	public Grape(int par1) {
		super(par1, 4, 4, Blocks.grapePlant.blockID,
				Block.tilledField.blockID);
		this.setCreativeTab(ModTabs.mfTab);
		this.setUnlocalizedName("grape");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ "grape");
	}
}