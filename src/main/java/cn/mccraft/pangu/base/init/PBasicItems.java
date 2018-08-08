package cn.mccraft.pangu.base.init;

import cn.mccraft.pangu.core.item.PGItem;
import cn.mccraft.pangu.core.loader.annotation.RegItem;
import cn.mccraft.pangu.core.loader.creativetabs.SharedCreativeTab;
import net.minecraft.item.Item;

@SharedCreativeTab("panguBase")
public interface PBasicItems {

    @RegItem(value = {"copper", "ingot"}, oreDict = {"ingotCopper"})
    Item COPPER_INGOT = new PGItem();

    @RegItem(value = {"tin", "ingot"}, oreDict = {"ingotTin"})
    Item TIN_INGOT = new PGItem();

    @RegItem(value = {"bronze", "ingot"}, oreDict = {"ingotBronze"})
    Item BRONZE_INGOT = new PGItem();

    @RegItem(value = {"silver", "ingot"}, oreDict = {"ingotSilver"})
    Item SILVER_INGOT = new PGItem();

}
