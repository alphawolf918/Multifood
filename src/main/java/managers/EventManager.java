package multifood.managers;

import java.util.Random;

import multifood.worldgen.WorldGenBPalmTree;
import multifood.worldgen.WorldGenCherryTree;
import multifood.worldgen.WorldGenGrapePlant;
import multifood.worldgen.WorldGenGrapefruitTree;
import multifood.worldgen.WorldGenLemonTree;
import multifood.worldgen.WorldGenLimeTree;
import multifood.worldgen.WorldGenOrangeTree;
import multifood.worldgen.WorldGenStrawberryPlant;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class EventManager implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		}
	}
	
	private void generateSurface(World world, Random random, int x, int z) {
		BiomeGenBase currentBiome = world.getBiomeGenForCoords(x, z);
		int y = world.getHeightValue(x, z);
		if (currentBiome.equals(BiomeGenBase.plains)) {
			this.spawnStructure(10, 90, world, random, x, y, z,
					(new WorldGenBPalmTree()));
			this.spawnStructure(20, 80, world, random, x, y, z,
					(new WorldGenCherryTree()));
			this.spawnStructure(20, 80, world, random, x, y, z,
					(new WorldGenLemonTree()));
			this.spawnStructure(10, 100, world, random, x, y, z,
					(new WorldGenLimeTree()));
			this.spawnStructure(1, 150, world, random, x, y, z,
					(new WorldGenStrawberryPlant()));
			this.spawnStructure(1, 150, world, random, x, y, z,
					(new WorldGenGrapePlant()));
		} else if (currentBiome.equals(BiomeGenBase.extremeHills)
				|| currentBiome.equals(BiomeGenBase.extremeHillsEdge)) {
			this.spawnStructure(30, 60, world, random, x, y, z,
					(new WorldGenBPalmTree()));
			this.spawnStructure(30, 60, world, random, x, y, z,
					(new WorldGenCherryTree()));
			this.spawnStructure(30, 60, world, random, x, y, z,
					(new WorldGenLemonTree()));
			this.spawnStructure(10, 150, world, random, x, y, z,
					(new WorldGenLimeTree()));
			this.spawnStructure(1, 150, world, random, x, y, z,
					(new WorldGenStrawberryPlant()));
			this.spawnStructure(1, 150, world, random, x, y, z,
					(new WorldGenGrapePlant()));
		} else if (currentBiome.equals(BiomeGenBase.forest)
				|| currentBiome.equals(BiomeGenBase.forestHills)) {
			this.spawnStructure(30, 40, world, random, x, y, z,
					(new WorldGenCherryTree()));
			this.spawnStructure(10, 60, world, random, x, y, z,
					(new WorldGenOrangeTree()));
			this.spawnStructure(30, 40, world, random, x, y, z,
					(new WorldGenLemonTree()));
			this.spawnStructure(5, 120, world, random, x, y, z,
					(new WorldGenLimeTree()));
			this.spawnStructure(1, 150, world, random, x, y, z,
					(new WorldGenGrapePlant()));
		} else if (currentBiome.equals(BiomeGenBase.swampland)) {
			this.spawnStructure(30, 60, world, random, x, y, z,
					(new WorldGenBPalmTree()));
			this.spawnStructure(30, 60, world, random, x, y, z,
					(new WorldGenLemonTree()));
			this.spawnStructure(10, 60, world, random, x, y, z,
					(new WorldGenLimeTree()));
			this.spawnStructure(1, 150, world, random, x, y, z,
					(new WorldGenStrawberryPlant()));
			this.spawnStructure(1, 150, world, random, x, y, z,
					(new WorldGenGrapePlant()));
		} else if (currentBiome.equals(BiomeGenBase.jungle)
				|| currentBiome.equals(BiomeGenBase.jungleHills)) {
			this.spawnStructure(50, 55, world, random, x, y, z,
					(new WorldGenBPalmTree()));
			this.spawnStructure(50, 55, world, random, x, y, z,
					(new WorldGenOrangeTree()));
			this.spawnStructure(1, 600, world, random, x, y, z,
					(new WorldGenGrapefruitTree()));
			this.spawnStructure(1, 150, world, random, x, y, z,
					(new WorldGenStrawberryPlant()));
			this.spawnStructure(1, 150, world, random, x, y, z,
					(new WorldGenGrapePlant()));
		} else if (currentBiome.equals(BiomeGenBase.ocean)) {
			this.spawnStructure(1, 150, world, random, x, y, z,
					(new WorldGenGrapefruitTree()));
			this.spawnStructure(1, 80, world, random, x, y, z,
					(new WorldGenStrawberryPlant()));
			this.spawnStructure(1, 80, world, random, x, y, z,
					(new WorldGenGrapePlant()));
		}
	}
	
	/**
	 * Spawns a structure in the world
	 * 
	 */
	public static void spawnStructure(int minChance, int maxChance,
			World world,
			Random random, int x, int y, int z, WorldGenerator wg) {
		if (random.nextInt(maxChance) <= minChance) {
			wg.generate(world, random, x, y, z);
		}
	}
}