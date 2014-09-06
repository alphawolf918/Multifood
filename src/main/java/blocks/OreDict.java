package multifood.blocks;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {
	
	public static void init() {
		// Logs
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.bpalmLog, 1));
		OreDictionary
				.registerOre("logWood", new ItemStack(Blocks.gfruitLog, 1));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.lemonLog, 1));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.limeLog, 1));
		OreDictionary.registerOre("logWood", new ItemStack(Blocks.limonLog, 1));
		OreDictionary
				.registerOre("logWood", new ItemStack(Blocks.orangeLog, 1));
		OreDictionary
				.registerOre("logWood", new ItemStack(Blocks.cherryLog, 1));
		
		// Planks
		OreDictionary.registerOre("plankWood", new ItemStack(
				Blocks.gfruitPlanks, 1));
		OreDictionary.registerOre("plankWood", new ItemStack(
				Blocks.lemonPlanks, 1));
		OreDictionary.registerOre("plankWood", new ItemStack(
				Blocks.limePlanks, 1));
		OreDictionary.registerOre("plankWood", new ItemStack(
				Blocks.limonLeaves, 1));
		OreDictionary.registerOre("plankWood", new ItemStack(
				Blocks.orangePlanks, 1));
		OreDictionary.registerOre("plankWood", new ItemStack(
				Blocks.bpalmPlanks, 1));
		OreDictionary.registerOre("plankWood", new ItemStack(
				Blocks.cherryPlanks, 1));
		
		// Leaves
		OreDictionary.registerOre("treeLeaves", new ItemStack(
				Blocks.bpalmLeaves, 1));
		OreDictionary.registerOre("treeLeaves", new ItemStack(
				Blocks.gfruitLeaves, 1));
		OreDictionary.registerOre("treeLeaves", new ItemStack(
				Blocks.lemonLeaves, 1));
		OreDictionary.registerOre("treeLeaves", new ItemStack(
				Blocks.limeLeaves, 1));
		OreDictionary.registerOre("treeLeaves", new ItemStack(
				Blocks.limonLeaves, 1));
		OreDictionary.registerOre("treeLeaves", new ItemStack(
				Blocks.orangeLeaves, 1));
		OreDictionary.registerOre("treeLeaves", new ItemStack(
				Blocks.cherryLeaves, 1));
		
		// Saplings
		OreDictionary.registerOre("treeSapling", new ItemStack(
				Blocks.gfruitSapling, 1));
		OreDictionary.registerOre("treeSapling", new ItemStack(
				Blocks.lemonSapling, 1));
		OreDictionary.registerOre("treeSapling", new ItemStack(
				Blocks.limeSapling, 1));
		OreDictionary.registerOre("treeSapling", new ItemStack(
				Blocks.limonSapling, 1));
		OreDictionary.registerOre("treeSapling", new ItemStack(
				Blocks.orangeSapling, 1));
		OreDictionary.registerOre("treeSapling", new ItemStack(
				Blocks.cherrySapling, 1));
	}
}