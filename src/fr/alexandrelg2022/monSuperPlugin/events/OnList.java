package fr.alexandrelg2022.monSuperPlugin.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class OnList implements Listener {

    @EventHandler
    public void onList(ServerListPingEvent e) {
        /* It's updating the server info on the list */
        e.setMotd("§eSwadar = §aP§dD §8| §6No Homo Ici");
        e.setMaxPlayers(999);
    }

}
