package com.placid_storm.spacebase.world;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.Chunk;

public class WorldProviderSpace extends WorldProvider {
    @Override
    public DimensionType getDimensionType() {
        return ModWorldGen.DIM_TYPE;
    }

    /**
     * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
     *
     * @return true, if is surface world
     */
    @Override
    public boolean isSurfaceWorld()
    {
        return true;
    }
    /*======================================= Forge Start =========================================*/
    /* (non-Javadoc)
     * @see net.minecraft.world.WorldProvider#canDoLightning(net.minecraft.world.chunk.Chunk)
     */
    @Override
    public boolean canDoLightning(net.minecraft.world.chunk.Chunk chunk)
    {
        return false;
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.WorldProvider#canDoRainSnowIce(net.minecraft.world.chunk.Chunk)
     */
    @Override
    public boolean canDoRainSnowIce(Chunk chunk)
    {
        return false;
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.WorldProvider#canSnowAt(net.minecraft.util.math.BlockPos, boolean)
     */
    @Override
    public boolean canSnowAt(BlockPos pos, boolean checkLight)
    {
        return false;
    }
}
