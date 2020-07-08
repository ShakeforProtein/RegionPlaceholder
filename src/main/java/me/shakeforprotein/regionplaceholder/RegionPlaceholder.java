package me.shakeforprotein.regionplaceholder;

import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class RegionPlaceholder extends JavaPlugin {


    public WorldGuard worldGuard;
    public WorldGuardPlugin worldGuardPlugin;
    @Override
    public void onEnable() {

        if(Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null){
            new PapiClass(this).register();
        }

        if(Bukkit.getPluginManager().getPlugin("WorldGuard") != null){
            worldGuard = WorldGuard.getInstance();
            worldGuardPlugin = WorldGuardPlugin.inst();
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }



    /*
        RegionContainer container = WorldGuard.getInstance().getPlatform().getRegionContainer();

            for(World world : Bukkit.getWorlds()){
                RegionManager regionManager = container.get(BukkitAdapter.adapt(world));
                for(String regionName : regionManager.getRegions().keySet()){
                    PlaceholderAPI.reg
                }
            }
     */
}
