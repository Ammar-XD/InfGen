package me.infnoxx.infGen;

import org.bukkit.World;
import org.bukkit.WorldCreator;

/**
 * API class for InfGen, handling world generation.
 */
public class InfGenAPI {

    private final InfGen plugin;

    public InfGenAPI(InfGen plugin) {
        this.plugin = plugin;
    }

    /**
     * Generates a void world with the specified name.
     *
     * @param worldName The name of the world to generate.
     * @param environment The environment for the world (e.g., NORMAL, NETHER, THE_END).
     * @param worldType The type of the world (currently only supports VOID).
     * @return The generated world, or null if generation failed.
     */
    public World generateVoidWorld(String worldName, World.Environment environment, InfGenWorldType worldType) {
        if (worldType != InfGenWorldType.VOID) {
            plugin.getLogger().warning("Only VOID type is supported. Using VOID type.");
            worldType = InfGenWorldType.VOID;
        }

        WorldCreator creator = new WorldCreator(worldName);
        creator.environment(environment);
        creator.type(worldType.toBukkitType());
        creator.generator(new VoidChunkGenerator());

        World world = creator.createWorld();
        if (world != null) {
            plugin.getLogger().info("Void world '" + worldName + "' generated successfully.");
        } else {
            plugin.getLogger().severe("Failed to generate void world '" + worldName + "'.");
        }
        return world;
    }
}
