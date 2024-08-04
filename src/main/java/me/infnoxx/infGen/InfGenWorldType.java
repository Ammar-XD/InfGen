package me.infnoxx.infGen;

import org.bukkit.WorldType;

/**
 * Enum representing custom world types for InfGen.
 */
public enum InfGenWorldType {
    VOID;

    /**
     * Converts the custom world type to the corresponding Bukkit WorldType.
     *
     * @return The Bukkit WorldType.
     */
    public WorldType toBukkitType() {
        return WorldType.FLAT; // Using FLAT as a stand-in for VOID
    }
}
