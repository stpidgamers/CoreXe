package me.nitrogen.xecore;

import me.nitrogen.xecore.Commands.*;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("[!] Enabling CoreXe v1.0.0...");
        this.getCommand("Gma").setExecutor((CommandExecutor)new GmaCommand());
        this.getCommand("Fly").setExecutor((CommandExecutor)new FlyCommand());
        this.getCommand("Gmc").setExecutor((CommandExecutor)new GmcCommand());
        this.getCommand("Gms").setExecutor((CommandExecutor)new GmsCommand());
        this.getCommand("Gmsp").setExecutor((CommandExecutor)new GmspCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("[!] Disabling CoreXe v1.0.0...");
    }
}
