package me.nitrogen.xecore.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    boolean isFlying = false;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        if (commandSender instanceof Player) {
            if (player.isOp()){
                player.sendMessage("§eYou've toggled your §3Fly§e.");
                if (!isFlying){
                    player.setFlying(true);
                    isFlying = true;
                }else{
                    player.setFlying(false);
                    isFlying = false;
                }
            }
        }













        return true;
    }
}
