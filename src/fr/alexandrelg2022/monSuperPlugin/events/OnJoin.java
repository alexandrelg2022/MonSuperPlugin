package fr.alexandrelg2022.monSuperPlugin.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnJoin implements Listener {

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
