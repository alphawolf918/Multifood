package multifood.managers;

import cpw.mods.fml.common.registry.GameRegistry;

public class Managers {
	public static void init() {
		GameRegistry.registerWorldGenerator(new EventManager());
	}
}