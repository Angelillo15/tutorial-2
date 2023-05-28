package es.angelillo15.firstplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class FirstPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("Hola mundo desde console sender");
        getLogger().info("Hola mundo desde el logger");
    }

    @Override
    public void onDisable() {
        getLogger().info("Adios gracias por usar mi plugin :)");
    }
}
