package multifood.lib;

import multifood.blocks.Blocks;
import multifood.items.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void init() {
		CraftingRecipes.init();
		SmeltingRecipes.init();
		SawmillRecipes.init();
	}
	
	public static class CraftingRecipes {
		public static void init() {
			planks();
			
			// Limon Sapling
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.limonSapling,
					1), new Object[] {
					Blocks.lemonSapling, Blocks.limeSapling
			});
			
			// Lemonade
			GameRegistry.addShapelessRecipe(new ItemStack(Items.lemonade, 4),
					new Object[] {
							Item.sugar, Items.lemon, Item.glassBottle
					});
		}
		
		public static void planks() {
			// Planks
			GameRegistry.addShapelessRecipe(
					new ItemStack(Blocks.bpalmPlanks, 4), new Object[] {
					Blocks.bpalmLog
					});
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cherryPlanks,
					4), new Object[] {
					Blocks.cherryLog
			});
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.limonPlanks,
					4), new Object[] {
					Blocks.limonLog
			});
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.orangePlanks,
					4), new Object[] {
					Blocks.orangeLog
			});
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.lemonPlanks,
					4), new Object[] {
					Blocks.lemonLog
			});
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.limePlanks,
					4), new Object[] {
					Blocks.limeLog
			});
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gfruitPlanks,
					4), new Object[] {
					Blocks.gfruitLog
			});
		}
	}
	
	public static class SmeltingRecipes {
		public static void init() {
		}
	}
	
	public static class SawmillRecipes {
		public static void init() {
			sawMill(Blocks.bpalmLog, Blocks.bpalmPlanks);
			sawMill(Blocks.gfruitLog, Blocks.gfruitPlanks);
			sawMill(Blocks.cherryLog, Blocks.cherryPlanks);
			sawMill(Blocks.lemonLog, Blocks.lemonPlanks);
			sawMill(Blocks.limeLog, Blocks.limePlanks);
			sawMill(Blocks.limonLog, Blocks.limonPlanks);
			sawMill(Blocks.orangeLog, Blocks.orangePlanks);
		}
		
		public static void sawMill(Block input, Block output) {
			NBTTagCompound spcSend = new NBTTagCompound();
			spcSend.setInteger("energy", 2000);
			spcSend.setCompoundTag("input", new NBTTagCompound());
			spcSend.setCompoundTag("primaryOutput", new NBTTagCompound());
			
			(new ItemStack(input, 1)).writeToNBT(spcSend
					.getCompoundTag("input"));
			(new ItemStack(output, 6)).writeToNBT(spcSend
					.getCompoundTag("primaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion",
					"SawmillRecipe",
					spcSend);
		}
	}
}