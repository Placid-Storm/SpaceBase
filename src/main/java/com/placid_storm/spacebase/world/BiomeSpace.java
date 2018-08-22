package com.placid_storm.spacebase.world;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;

public class BiomeSpace extends Biome {
    public BiomeSpace() {
        super(new BiomeProperties(ModWorldGen.DIM_NAME)
                .setBaseHeight(1.0F)
                .setHeightVariation(0.2F)
                .setRainDisabled()
                .setTemperature(0.2F)
        );

        topBlock = AIR;
        fillerBlock = AIR;
    }

    public BiomeDecorator createBiomeDecorator(){

        BiomeDecorator biomeDecorator = new BiomeDecoratorSpace();

        biomeDecorator.clayPerChunk = 10;

        return getModdedBiomeDecorator(biomeDecorator);
    }
}
