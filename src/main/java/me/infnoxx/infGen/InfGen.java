package me.infnoxx.infGen;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main plugin class for InfGen.
 */
public class InfGen extends JavaPlugin {

    private InfGenAPI infGenAPI;

    @Override
    public void onEnable() {
        getLogger().info("InfGen enabled!");
        // Initialize API
        infGenAPI = new InfGenAPI(this);
    }

    @Override
    public void onDisable() {
        getLogger().info("InfGen disabled!");
    }

    /**
     * Get the API instance for generating void worlds.
     *
     * @return InfGenAPI instance.
     */
    public InfGenAPI getInfGenAPI() {
        return infGenAPI;
    }
}
