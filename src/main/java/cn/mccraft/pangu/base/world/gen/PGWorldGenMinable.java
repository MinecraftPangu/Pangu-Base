package cn.mccraft.pangu.base.world.gen;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

import java.util.Random;

public class PGWorldGenMinable extends WorldGenerator {

    private final int frequency;
    private final int highest, lowest;
    private final WorldGenMinable gen;

    public PGWorldGenMinable(int frequency, int highest, int lowest, int size, IBlockState oreBlock){
        this(frequency, highest,lowest,size,oreBlock,null);
    }

    public PGWorldGenMinable(int frequency, int highest, int lowest, int size, IBlockState oreBlock, Predicate<IBlockState> predicate){
        this.frequency = frequency;
        this.highest = highest;
        this.lowest = lowest;
        if(predicate==null) gen = new WorldGenMinable(oreBlock, size);
        else gen = new WorldGenMinable(oreBlock, size, predicate);
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos position) {
        if (!TerrainGen.generateOre(world, rand, this, position, OreGenEvent.GenerateMinable.EventType.CUSTOM))
            return true;

        for (int i = 0; i < frequency; i++) {
            int x= position.getX() + rand.nextInt(16);
            int y = rand.nextInt(highest - lowest) + lowest;
            int z = position.getZ() + rand.nextInt(16);
            BlockPos pos = new BlockPos(x,y,z);
            gen.generate(world, rand, pos);
        }
        return true;
    }

    static class CustomPredicate implements Predicate<IBlockState> {
        private final IBlockState block;

        private CustomPredicate(IBlockState block) {
            this.block = block;
        }

        public boolean apply(IBlockState p_apply_1_) {
            return p_apply_1_ != null && p_apply_1_.getBlock() == block.getBlock();
        }
    }
}
