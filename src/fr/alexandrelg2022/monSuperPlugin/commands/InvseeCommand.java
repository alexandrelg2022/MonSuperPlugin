package fr.alexandrelg2022.monSuperPlugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InvseeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;

        if (strings.length == 0) {
            player.sendMessage("§c§lErreur §7: §cMerci de préciser un joueur en premier arguement!");
            return false;
        }

        Player target = Bukkit.getServer().getPlayer(strings[0]);
        if (target == null) {
            player.sendMessage("§c§lErreur §7: §cLe joueur §e" + strings[0] + "§c n'a pas pu être trouvé!");
            return false;
        }

        player.openInventory(target.getInventory());

        return false;
    }
}
