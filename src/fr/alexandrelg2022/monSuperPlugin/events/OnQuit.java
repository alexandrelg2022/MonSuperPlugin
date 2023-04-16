package fr.alexandrelg2022.monSuperPlugin.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnQuit implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        e.setQuitMessage("");
        Bukkit.getServer().broadcastMessage("§8§l[§c§l-§8§l] §e" + e.getPlayer().getDisplayName());
    }

}
