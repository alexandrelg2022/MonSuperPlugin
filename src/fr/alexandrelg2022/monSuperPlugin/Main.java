package fr.alexandrelg2022.monSuperPlugin;

import fr.alexandrelg2022.monSuperPlugin.events.OnJoin;
import fr.alexandrelg2022.monSuperPlugin.events.OnQuit;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * This class is the main application instance
 * it implements the events listeners & the minecraft commands
 * it also stores the services such as database & configuration
 * @author AlexandreLG2022
 * @version 1.0
 * @see <a href="https://hub.spigotmc.org/javadocs/spigot/org/bukkit/plugin/java/JavaPlugin.html">JavaPlugin Documentation</a>
 * @since 2023-04-16
 */
public class Main extends JavaPlugin {

    PluginManager pluginManager;

    /**
     * The onEnable function is executed at the plugin's launch
     * @see <a href="https://hub.spigotmc.org/javadocs/spigot/org/bukkit/plugin/java/JavaPlugin.html#onEnable()">Documentation</a>
     * @since 1.0
     */
    @Override
    public void onEnable() {
        super.onEnable();

        /* It's importing the events using PluginManager */
        pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(new OnJoin(), this);
        pluginManager.registerEvents(new OnQuit(), this);

        /* It's importing the commands */

    }

    /**
     * The onDisable function is executed at the plugin's end
     * @see <a href="https://hub.spigotmc.org/javadocs/spigot/org/bukkit/plugin/java/JavaPlugin.html#onDisable()">Documentation</a>
     * @since 1.0
     */
    @Override
    public void onDisable() {
        super.onDisable();
    }
}
