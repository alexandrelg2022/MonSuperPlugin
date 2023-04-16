package fr.alexandrelg2022.monSuperPlugin;

import fr.alexandrelg2022.monSuperPlugin.events.OnJoin;
import fr.alexandrelg2022.monSuperPlugin.events.OnQuit;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    PluginManager pm;

    @Override
    public void onEnable() {
        super.onEnable();

        /* It's importing the events using PluginManager */
        pm = getServer().getPluginManager();
        pm.registerEvents(new OnJoin(), this);
        pm.registerEvents(new OnQuit(), this);

        /* It's importing the commands */

    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
