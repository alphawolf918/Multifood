package multifood;

import multifood.blocks.Blocks;
import multifood.creativetabs.ModTabs;
import multifood.items.Items;
import multifood.lib.ModInfo;
import multifood.lib.Recipes;
import multifood.managers.Managers;
import multifood.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(channels = { ModInfo.CHANNEL }, clientSideRequired = true,
		serverSideRequired = true)
public class MFMod {
	@SidedProxy(clientSide = ModInfo.PROXY_LOCATION + ".ClientProxy",
			serverSide = ModInfo.PROXY_LOCATION
					+ ".CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModTabs.init();
		Managers.init();
		Blocks.init();
		Items.init();
		Recipes.init();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
	}
}