package me.nitrogen.xecore.Commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmaCommand implements CommandExecutor {
    boolean toggled;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        if (commandSender instanceof Player) {
            if (player.isOp()){
                player.sendMessage("§eYour gamemode has been updated to §3Adventure§e.");
                player.setGameMode(GameMode.ADVENTURE);
                if (!toggled){
                    player.setGameMode(GameMode.SPECTATOR);
                    toggled = true;
                }else{
                    player.setGameMode(GameMode.SURVIVAL);
                    toggled = false;
                }
            }



        }





        return true;
    }


}