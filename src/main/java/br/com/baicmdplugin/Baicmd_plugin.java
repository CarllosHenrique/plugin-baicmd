package br.com.baicmdplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Baicmd_plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("Baicmd ON!!!");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("Baicmd OFF!!!");
    }
}
