package multifood.worldgen;

import java.util.Random;

import multifood.blocks.Blocks;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenOrangeTree extends WorldGenerator {
	
	protected int[] GetValidSpawnBlocks() {
		return new int[] { Block.grass.blockID, Block.dirt.blockID };
	}
	
	public boolean LocationIsValidSpawn(World world, int i, int j, int k) {
		int distanceToAir = 0;
		int checkID = world.getBlockId(i, j, k);
		
		while (checkID != 0) {
			distanceToAir++;
			checkID = world.getBlockId(i, j + distanceToAir, k);
		}
		
		if (distanceToAir > 3) {
			return false;
		}
		j += distanceToAir - 1;
		
		int blockID = world.getBlockId(i, j, k);
		int blockIDAbove = world.getBlockId(i, j + 1, k);
		int blockIDBelow = world.getBlockId(i, j - 1, k);
		for (int x : GetValidSpawnBlocks()) {
			if (blockIDAbove != 0) {
				return false;
			}
			if (blockID == x) {
				return true;
			} else if (blockID == Block.stone.blockID
					&& blockIDBelow == x) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean generate(World world, Random random, int i, int j, int k) {
		// check that each corner is one of the valid spawn blocks
		if (!LocationIsValidSpawn(world, i, j, k)) {
			return false;
		}
		
		int currentY = j;
		int rand = random.nextInt(6);
		int logVert = (rand >= 5) ? rand : 5;
		
		for (int x = 0; x < logVert; x++) {
			world.setBlock(i, j + x, k, Blocks.orangeLog.blockID);
			if (x >= 2) {
				world.setBlock(i + 1, j + x, k, Blocks.orangeLeaves.blockID);
				world.setBlock(i - 1, j + x, k, Blocks.orangeLeaves.blockID);
				
				world.setBlock(i + 1, j + x, k - 1, Blocks.orangeLeaves.blockID);
				world.setBlock(i - 1, j + x, k + 1, Blocks.orangeLeaves.blockID);
				
				world.setBlock(i, j + x, k - 1, Blocks.orangeLeaves.blockID);
				world.setBlock(i, j + x, k + 1, Blocks.orangeLeaves.blockID);
				
				world.setBlock(i + 1, j + x, k + 1, Blocks.orangeLeaves.blockID);
				world.setBlock(i - 1, j + x, k - 1, Blocks.orangeLeaves.blockID);
			}
			currentY = j + x;
		}
		
		int treeTop = currentY + 1;
		world.setBlock(i, treeTop, k, Blocks.orangeLeaves.blockID);
		world.setBlock(i + 1, treeTop, k, Blocks.orangeLeaves.blockID);
		world.setBlock(i - 1, treeTop, k, Blocks.orangeLeaves.blockID);
		world.setBlock(i, treeTop, k + 1, Blocks.orangeLeaves.blockID);
		world.setBlock(i, treeTop, k - 1, Blocks.orangeLeaves.blockID);
		world.setBlock(i, treeTop + 1, k, Blocks.orangeLeaves.blockID);
		
		return true;
	}
}