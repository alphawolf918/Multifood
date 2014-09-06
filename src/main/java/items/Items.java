package multifood.items;

import multifood.items.food.Banana;
import multifood.items.food.Cherry;
import multifood.items.food.Grape;
import multifood.items.food.Grapefruit;
import multifood.items.food.Lemon;
import multifood.items.food.Lime;
import multifood.items.food.Limon;
import multifood.items.food.Orange;
import multifood.items.food.Strawberry;
import multifood.items.potions.Lemonade;
import multifood.lib.Ids;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	
	public static Item banana;
	public static Item lemon;
	public static Item lime;
	public static Item orange;
	public static Item cherry;
	public static Item limon;
	public static Item grapefruit;
	public static Item strawberry;
	public static Item grape;
	
	public static Item lemonade;
	
	public static void init() {
		banana = new Banana(Ids.bananaID);
		lemon = new Lemon(Ids.lemonID);
		lime = new Lime(Ids.limeID);
		orange = new Orange(Ids.orangeID);
		cherry = new Cherry(Ids.cherryID);
		limon = new Limon(Ids.limonID);
		grapefruit = new Grapefruit(Ids.grapefruitID);
		lemonade = new Lemonade(Ids.lemonadeID);
		strawberry = new Strawberry(Ids.strawberryID);
		grape = new Grape(Ids.grapeID);
		addNames();
	}
	
	public static void addNames() {
		LanguageRegistry.addName(banana, "Banana");
		LanguageRegistry.addName(lime, "Lime");
		LanguageRegistry.addName(lemon, "Lemon");
		LanguageRegistry.addName(orange, "Orange");
		LanguageRegistry.addName(cherry, "Cherry");
		LanguageRegistry.addName(limon, "Limon");
		LanguageRegistry.addName(grapefruit, "Grapefruit");
		LanguageRegistry.addName(strawberry, "Strawberry");
		LanguageRegistry.addName(grape, "Grape");
		
		LanguageRegistry.addName(lemonade, "Lemon Aid");
	}
}