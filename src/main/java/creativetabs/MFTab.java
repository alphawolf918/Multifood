package multifood.creativetabs;

import multifood.items.Items;
import net.minecraft.creativetab.CreativeTabs;

public class MFTab extends CreativeTabs {
	
	public MFTab(int par1, String par2Str) {
		super(par1, par2Str);
	}
	
	@Override
	public int getTabIconItemIndex() {
		return Items.banana.itemID;
	}
}