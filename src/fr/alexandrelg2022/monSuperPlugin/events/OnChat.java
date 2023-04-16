package fr.alexandrelg2022.monSuperPlugin.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * The class that manages the chat events
 * @author AlexandreLG2022
 * @version 1.0
 * @see <a href="https://hub.spigotmc.org/javadocs/spigot/org/bukkit/event/Listener.html">Listener Documentation</a>
 * @since 2023-04-16
 */
public class OnChat implements Listener {

    /**
     * This function is called once a player send a message in the server chat
     * @param e {@link AsyncPlayerChatEvent}
     * @see <a href="https://hub.spigotmc.org/javadocs/spigot/org/bukkit/event/player/AsyncPlayerChatEvent.html">AsyncPlayerChatEvent Documentation</a>
     * @since 1.0
     */
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {

    }

}
