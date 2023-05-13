package fr.alexandrelg2022.monSuperPlugin.events;

import org.bukkit.Bukkit;
import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.entity.Player;
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
        e.setCancelled(true);

        /* It's saving the player & the message into a variable */
        Player player = e.getPlayer();
        String msg = " §7: §r" + e.getMessage();

        /* It's allowing the colors code if the player is OP */
        if (player.isOp()) msg.replaceAll("&", "§");

        /* It's looping all the connected players */
        for (Player loopedPlayer : Bukkit.getOnlinePlayers()) {
            /* It's tagging the user & pinging it if the messages contains his username */
            String customMsg = msg.replaceAll(loopedPlayer.getDisplayName(), "§b§l@" + loopedPlayer.getDisplayName() + "§r");
            if (msg.contains(loopedPlayer.getDisplayName())) loopedPlayer.playNote(
                    loopedPlayer.getLocation(),
                    Instrument.PLING,
                    Note.natural(1, Note.Tone.A)
            );

            /* It's sending the message to the looped player */
            loopedPlayer.sendMessage("§7>> §e" + player.getDisplayName() + customMsg);
        }
    }

}
