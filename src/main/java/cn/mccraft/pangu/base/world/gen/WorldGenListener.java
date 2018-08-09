package cn.mccraft.pangu.base.world.gen;

import cn.mccraft.pangu.base.init.PBasicBlocks;
import cn.mccraft.pangu.core.loader.Load;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;


public class WorldGenListener {

    private final WorldGenerator WORLD_GEN_COPPER_ORE = new PGWorldGenMinable(12, 64, 16, 8, PBasicBlocks.COPPER_ORE.getDefaultState());
    private final WorldGenerator WORLD_GEN_TIN_ORE = new PGWorldGenMinable(8, 64, 16, 8, PBasicBlocks.TIN_ORE.getDefaultState());
    private final WorldGenerator WORLD_GEN_SILVER_ORE = new PGWorldGenMinable(4, 32, 16, 8, PBasicBlocks.SILVER_ORE.getDefaultState());

    @Load
    public static void initWorldGenListener() {
        MinecraftForge.ORE_GEN_BUS.register(new WorldGenListener());
    }

    @SubscribeEvent
    public void onOreGenPost(OreGenEvent.Post event) {
        World world = event.getWorld();
        Random rand = event.getRand();
        BlockPos pos = event.getPos();
        if (world.provider.getDimension() == 0) {
            WORLD_GEN_COPPER_ORE.generate(world, event.getRand(), event.getPos());
            WORLD_GEN_TIN_ORE.generate(event.getWorld(), event.getRand(), event.getPos());
            WORLD_GEN_SILVER_ORE.generate(event.getWorld(), event.getRand(), event.getPos());
        }
    }
}
