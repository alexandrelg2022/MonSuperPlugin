package fr.alexandrelg2022.monSuperPlugin.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * The class that manages the player quit event
 * @author AlexandreLG2022
 * @version 1.0
 * @see <a href="https://hub.spigotmc.org/javadocs/spigot/org/bukkit/event/Listener.html">Listener Documentation</a>
 * @since 2023-04-16
 */
public class OnQuit implements Listener {

    /**
     * This function is called once a player quit the server
     * @param e {@link PlayerQuitEvent}
     * @see <a href="https://hub.spigotmc.org/javadocs/spigot/org/bukkit/event/player/PlayerQuitEvent.html">PlayerQuitEvent Documentation</a>
     * @since 1.0
     */
    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        e.setQuitMessage("");

        /* It's sending the welcome message to the server */
        Bukkit.getServer().broadcastMessage("§8§l[§c§l-§8§l] §e" + e.getPlayer().getDisplayName());
    }

}
