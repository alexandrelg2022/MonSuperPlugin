package fr.alexandrelg2022.monSuperPlugin.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * The class that manages the player join event
 * @author AlexandreLG2022
 * @version 1.0
 * @see <a href="https://hub.spigotmc.org/javadocs/spigot/org/bukkit/event/Listener.html">Listener Documentation</a>
 * @since 2023-04-16
 */
public class OnJoin implements Listener {

    /**
     * This function is called once a player join the server
     * @param e {@link PlayerJoinEvent}
     * @see <a href="https://hub.spigotmc.org/javadocs/spigot/org/bukkit/event/player/PlayerJoinEvent.html">PlayerJoinEvent Documentation</a>
     * @since 1.0
     */
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        e.setJoinMessage("");

        /* It's storing the player object */
        Player player = e.getPlayer();

        /* It's sending the welcome message to the server */
        Bukkit.getServer().broadcastMessage("§8§l[§a§l+§8§l] §e" + player.getDisplayName());

        /* It's sending the welcome title to the Player */
        player.sendTitle(
                "§k§d|§e§k|§a§k|§r §9§lBienvenue §r§k§d|§e§k|§a§k|",
                "§8Que la bite soit avec toi :)",
                10, 60, 10);
    }

}
