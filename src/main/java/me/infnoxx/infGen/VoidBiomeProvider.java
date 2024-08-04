package me.infnoxx.infGen;

import org.bukkit.block.Biome;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.WorldInfo;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Provides the THE_VOID biome for the void world.
 */
public class VoidBiomeProvider extends BiomeProvider {

    @Override
    public @NotNull Biome getBiome(@NotNull WorldInfo worldInfo, int x, int y, int z) {
        return Biome.THE_VOID; // Use THE_VOID biome
    }

    @Override
    public @NotNull List<Biome> getBiomes(@NotNull WorldInfo worldInfo) {
        return List.of(Biome.THE_VOID); // Only THE_VOID biome is available
    }
}
