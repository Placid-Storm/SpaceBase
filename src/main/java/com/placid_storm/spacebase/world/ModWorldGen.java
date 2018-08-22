package com.placid_storm.spacebase.world;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModWorldGen {

    public static final String DIM_NAME = "space";
    public static final int DIM_ID = findFreeDimensionID();
    public static final DimensionType DIM_TYPE = DimensionType.register(DIM_NAME, "_"+DIM_NAME, DIM_ID, WorldProviderSpace.class, true);
    public static final WorldType WORLD_TYPE = new WorldTypeSpace();

    /**
     * Register dimensions.
     */
    public static final void registerDimensions()
    {
        DimensionManager.registerDimension(DIM_ID, DIM_TYPE);
    }

    private static int findFreeDimensionID()
    {
        for (int i=2; i<Integer.MAX_VALUE; i++)
        {
            if (!DimensionManager.isDimensionRegistered(i))
            {
                // DEBUG
                System.out.println("Found free dimension ID = "+i);
                return i;
            }
        }

        // DEBUG
        System.out.println("ERROR: Could not find free dimension ID");
        return null;
    }

    /**
     * Register world generators.
     */
    public static void registerWorldGenerators()
    {
        // DEBUG
        System.out.println("Registering world generators");
        GameRegistry.registerWorldGenerator(new WorldGenShrine(), 10);
    }
}
