package multifood.blocks.treeblocks.limon;

import java.util.List;
import java.util.Random;

import multifood.creativetabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LimonLog extends BlockRotatedPillar
{
	@SideOnly(Side.CLIENT)
	private Icon limonLogTopIcon;
	@SideOnly(Side.CLIENT)
	private Icon limonLogBottomIcon;
	
	public LimonLog(int par1)
	{
		super(par1, Material.wood);
		this.setCreativeTab(ModTabs.mfTab);
		this.setUnlocalizedName("limonlog");
		this.setHardness(2.8F);
		this.setStepSound(Block.soundWoodFootstep);
	}
	
	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random par1Random)
	{
		return 1;
	}
	
	/**
	 * Called on server worlds only when the block has been replaced by a
	 * different block ID, or the same block with a different metadata value,
	 * but before the new metadata value is set. Args: World, x, y, z, old block
	 * ID, old metadata
	 */
	@Override
	public void breakBlock(World par1World, int par2, int par3, int par4,
			int par5, int par6)
	{
		byte b0 = 4;
		int j1 = b0 + 1;
		
		if (par1World.checkChunksExist(par2 - j1, par3 - j1, par4 - j1, par2
				+ j1, par3 + j1, par4 + j1))
		{
			for (int k1 = -b0; k1 <= b0; ++k1)
			{
				for (int l1 = -b0; l1 <= b0; ++l1)
				{
					for (int i2 = -b0; i2 <= b0; ++i2)
					{
						int j2 = par1World.getBlockId(par2 + k1, par3 + l1,
								par4 + i2);
						
						if (Block.blocksList[j2] != null)
						{
							Block.blocksList[j2].beginLeavesDecay(par1World,
									par2 + k1, par3 + l1, par4 + i2);
						}
					}
				}
			}
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * The icon for the side of the block.
	 */
	protected Icon getSideIcon(int par1)
	{
		return this.blockIcon;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * The icon for the tops and bottoms of the block.
	 */
	protected Icon getEndIcon(int par1)
	{
		return this.limonLogTopIcon;
	}
	
	/**
	 * returns a number between 0 and 3
	 */
	public static int limitToValidMetadata(int par0)
	{
		return par0 & 3;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
	 */
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs,
			List par3List)
	{
		par3List.add(new ItemStack(par1, 1, 0));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.limonLogTopIcon = par1IconRegister
				.registerIcon("awmf:limonlog_top");
		this.limonLogBottomIcon = par1IconRegister
				.registerIcon("awmf:limonlog_top");
		this.blockIcon = par1IconRegister.registerIcon("awmf:limonlog_side");
	}
	
	@Override
	public boolean canSustainLeaves(World world, int x, int y, int z)
	{
		return true;
	}
	
	@Override
	public boolean isWood(World world, int x, int y, int z)
	{
		return true;
	}
}
