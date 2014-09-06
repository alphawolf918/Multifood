package multifood.blocks;

import multifood.blocks.plants.PlantGrape;
import multifood.blocks.plants.PlantStrawberry;
import multifood.blocks.treeblocks.bpalm.BPalmLeaves;
import multifood.blocks.treeblocks.bpalm.BPalmLog;
import multifood.blocks.treeblocks.bpalm.BPalmPlanks;
import multifood.blocks.treeblocks.bpalm.BPalmSapling;
import multifood.blocks.treeblocks.cherry.CherryLeaves;
import multifood.blocks.treeblocks.cherry.CherryLog;
import multifood.blocks.treeblocks.cherry.CherryPlanks;
import multifood.blocks.treeblocks.cherry.CherrySapling;
import multifood.blocks.treeblocks.grapefruit.GrapefruitLeaves;
import multifood.blocks.treeblocks.grapefruit.GrapefruitLog;
import multifood.blocks.treeblocks.grapefruit.GrapefruitPlanks;
import multifood.blocks.treeblocks.grapefruit.GrapefruitSapling;
import multifood.blocks.treeblocks.lemon.LemonLeaves;
import multifood.blocks.treeblocks.lemon.LemonLog;
import multifood.blocks.treeblocks.lemon.LemonPlanks;
import multifood.blocks.treeblocks.lemon.LemonSapling;
import multifood.blocks.treeblocks.lime.LimeLeaves;
import multifood.blocks.treeblocks.lime.LimeLog;
import multifood.blocks.treeblocks.lime.LimePlanks;
import multifood.blocks.treeblocks.lime.LimeSapling;
import multifood.blocks.treeblocks.limon.LimonLeaves;
import multifood.blocks.treeblocks.limon.LimonLog;
import multifood.blocks.treeblocks.limon.LimonPlanks;
import multifood.blocks.treeblocks.limon.LimonSapling;
import multifood.blocks.treeblocks.orange.OrangeLeaves;
import multifood.blocks.treeblocks.orange.OrangeLog;
import multifood.blocks.treeblocks.orange.OrangePlanks;
import multifood.blocks.treeblocks.orange.OrangeSapling;
import multifood.lib.Ids;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockWood;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	
	public static Block bpalmLeaves = new BPalmLeaves(Ids.bpalmLeavesID);
	public static BPalmLog bpalmLog = new BPalmLog(Ids.bpalmLogID);
	public static BlockWood bpalmPlanks = new BPalmPlanks(Ids.bpalmPlanksID);
	public static BlockSapling bpalmSapling = new BPalmSapling(
			Ids.bpalmSaplingID);
	
	public static Block cherryLeaves = new CherryLeaves(Ids.cherryLeavesID);
	public static CherryLog cherryLog = new CherryLog(Ids.cherryLogID);
	public static BlockWood cherryPlanks = new CherryPlanks(Ids.cherryPlanksID);
	public static BlockSapling cherrySapling = new CherrySapling(
			Ids.cherrySaplingID);
	
	public static Block limonLeaves = new LimonLeaves(Ids.limonLeavesID);
	public static Block limonLog = new LimonLog(Ids.limonLogID);
	public static Block limonPlanks = new LimonPlanks(Ids.limonPlanksID);
	public static Block limonSapling = new LimonSapling(Ids.limonSaplingID);
	
	public static Block orangeLeaves = new OrangeLeaves(Ids.orangeLeavesID);
	public static Block orangeLog = new OrangeLog(Ids.orangeLogID);
	public static Block orangePlanks = new OrangePlanks(Ids.orangePlanksID);
	public static Block orangeSapling = new OrangeSapling(Ids.orangeSaplingID);
	
	public static Block lemonLeaves = new LemonLeaves(Ids.lemonLeavesID);
	public static Block lemonLog = new LemonLog(Ids.lemonLogID);
	public static Block lemonPlanks = new LemonPlanks(Ids.lemonPlanksID);
	public static Block lemonSapling = new LemonSapling(Ids.lemonSaplingID);
	
	public static Block limeLeaves = new LimeLeaves(Ids.limeLeavesID);
	public static Block limeLog = new LimeLog(Ids.limeLogID);
	public static Block limePlanks = new LimePlanks(Ids.limePlanksID);
	public static Block limeSapling = new LimeSapling(Ids.limeSaplingID);
	
	public static Block gfruitLeaves = new GrapefruitLeaves(Ids.gfruitLeavesID);
	public static Block gfruitLog = new GrapefruitLog(Ids.gfruitLogID);
	public static Block gfruitPlanks = new GrapefruitPlanks(Ids.gfruitPlanksID);
	public static Block gfruitSapling = new GrapefruitSapling(
			Ids.gfruitSaplingID);
	
	public static Block strawberryPlant = new PlantStrawberry(
			Ids.strawberryBlockID);
	public static Block grapePlant = new PlantGrape(Ids.grapeBlockID);
	
	public static void init() {
		addName(bpalmLeaves, "Bananapalm Leaves");
		addName(bpalmLog, "Bananapalm Log");
		addName(bpalmPlanks, "Bananapalm Planks");
		addName(bpalmSapling, "Bananapalm Sapling");
		
		addName(cherryLeaves, "Cherrytree Leaves");
		addName(cherryLog, "Cherrytree Log");
		addName(cherryPlanks, "Cherrytree Planks");
		addName(cherrySapling, "Cherrytree Sapling");
		
		addName(limonLeaves, "Limon Leaves");
		addName(limonLog, "Limon Log");
		addName(limonPlanks, "Limon Planks");
		addName(limonSapling, "Limon Sapling");
		
		addName(orangeLeaves, "Oran Leaves");
		addName(orangeLog, "Oran Log");
		addName(orangePlanks, "Oran Planks");
		addName(orangeSapling, "Oran Sapling");
		
		addName(lemonLeaves, "Lemonsour Leaves");
		addName(lemonLog, "Lemonsour Log");
		addName(lemonPlanks, "Lemonsour Planks");
		addName(lemonSapling, "Lemonsour Sapling");
		
		addName(limeLeaves, "Lyme Leaves");
		addName(limeLog, "Lyme Log");
		addName(limePlanks, "Lyme Planks");
		addName(limeSapling, "Lyme Sapling");
		
		addName(gfruitLeaves, "G-Fruit Leaves");
		addName(gfruitLog, "G-Fruit Log");
		addName(gfruitPlanks, "G-Fruit Planks");
		addName(gfruitSapling, "G-Fruit Sapling");
		
		OreDict.init();
	}
	
	public static void addName(Block block, String name) {
		GameRegistry.registerBlock(block, name);
		LanguageRegistry.addName(block, name);
	}
}