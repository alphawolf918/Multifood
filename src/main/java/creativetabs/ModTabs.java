package multifood.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModTabs {
	public static CreativeTabs mfTab = new MFTab(
			CreativeTabs.getNextID(),
			"multifood");
	
	public static void init() {
		LanguageRegistry.instance().addStringLocalization(
				"itemGroup." + "multifood", "en_US", "Multifood");
	}
}