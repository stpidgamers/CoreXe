package me.nitrogen.xecore.Commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmcCommand implements CommandExecutor {
    boolean toggled;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        if (player.isOp()){
            if (!toggled){
                player.setGameMode(GameMode.CREATIVE);
                toggled = true;
            }else{
                player.setGameMode(GameMode.SURVIVAL);
                toggled = false;
            }
        }


        return true;
    }
}
