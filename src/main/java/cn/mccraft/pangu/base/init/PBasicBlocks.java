package cn.mccraft.pangu.base.init;

import cn.mccraft.pangu.core.block.PGBlock;
import cn.mccraft.pangu.core.loader.annotation.RegBlock;
import cn.mccraft.pangu.core.loader.creativetabs.SharedCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

@SharedCreativeTab("panguBase")
public interface PBasicBlocks {

    @RegBlock(value = {"copper", "ore"}, oreDict = {"oreCopper"})
    Block COPPER_ORE = new PGBlock(Material.ROCK).setHarvestLevelR("pickaxe", 1).setSoundType(SoundType.STONE).setHardness(3.0F).setResistance(5.0F);

    @RegBlock(value = {"tin", "ore"}, oreDict = {"oreTin"})
    Block TIN_ORE = new PGBlock(Material.ROCK).setHarvestLevelR("pickaxe", 1).setSoundType(SoundType.STONE).setHardness(3.0F).setResistance(5.0F);

    @RegBlock(value = {"silver", "ore"}, oreDict = {"oreSilver"})
    Block SILVER_ORE = new PGBlock(Material.ROCK).setHarvestLevelR("pickaxe", 1).setSoundType(SoundType.STONE).setHardness(3.0F).setResistance(5.0F);

    @RegBlock(value = {"copper", "block"}, oreDict = {"blockCopper"})
    Block COPPER_BLOCK = new PGBlock(Material.IRON).setHarvestLevelR("pickaxe", 1).setSoundType(SoundType.STONE).setHardness(3.0F).setResistance(10.0F);

    @RegBlock(value = {"tin", "block"}, oreDict = {"blockTin"})
    Block TIN_BLOCK = new PGBlock(Material.IRON).setHarvestLevelR("pickaxe", 1).setSoundType(SoundType.STONE).setHardness(3.0F).setResistance(10.0F);

    @RegBlock(value = {"bronze", "block"}, oreDict = {"blockBronze"})
    Block BRONZE_BLOCK = new PGBlock(Material.IRON).setHarvestLevelR("pickaxe", 1).setSoundType(SoundType.STONE).setHardness(3.0F).setResistance(10.0F);

    @RegBlock(value = {"silver", "block"}, oreDict = {"blockSilver"})
    Block SILVER_BLOCK = new PGBlock(Material.IRON).setHarvestLevelR("pickaxe", 2).setSoundType(SoundType.STONE).setHardness(3.0F).setResistance(10.0F);
}
