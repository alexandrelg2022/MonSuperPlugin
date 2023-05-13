package fr.alexandrelg2022.monSuperPlugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.regex.Pattern;

public class NickCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!s.equalsIgnoreCase("nick")) return false;

        /* It's storing the player into a variable */
        Player player = (Player) commandSender;

        /* It's resetting user nickname if no args and already nick named */
        if (strings.length == 0 || strings[0].length() == 0 && (!player.getCustomName().equalsIgnoreCase(player.getName()))) {
            setNickname(player, player.getName());
            player.sendMessage("§a§lSuccès! §aNickname supprimé avec succès.");
            return true;
        }

        /* It's checking that the argument 0 is not empty */
        if (strings.length == 0 || strings[0].length() == 0) {
            player.sendMessage("§c§lErreur §c: vous devez fournir un pseudonyme en premier argument.");
            return false;
        }
        String nickname = strings[0];

        /* It's checking that the username is valid using regex */
        if (!Pattern.matches("[a-zA-Z0-9_]{2,16}", nickname)) {
            player.sendMessage("§c§lErreur §c: le pseudonyme saisi est invalide.");
            return false;
        }

        /* It's checking that the nickname is different that the player name */
        if (nickname.equalsIgnoreCase(player.getCustomName())) {
            player.sendMessage("§c§lErreur §c: vous possédez déjà ce pseudo.");
            return false;
        }

        /* It's defining the new player name */
        setNickname(player, nickname);
        player.sendMessage("§a§lSuccès! §aVotre nouveau pseudonyme est désormais §e" + player.getDisplayName());

        return true;
    }

    public void setNickname(Player player, String nickname) {
        /* It's defining the new name in the server */
        player.setCustomName(nickname);
        player.setDisplayName(nickname);
        player.setPlayerListName(nickname);

        /* It's importing configuration */


        /* It's deleting the nickname if it's a nick reset */

        /* It's defining the new nickname if it's a new name */

        /* It's saving the configuration */
    }

}
