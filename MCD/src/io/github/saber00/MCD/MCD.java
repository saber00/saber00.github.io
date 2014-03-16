package io.github.saber00.MCD;

import org.bukkit.plugin.java.JavaPlugin;

public final class MCD extends JavaPlugin {
   
	public void onEnable(){
		getLogger().info("onEnable has been invoked!");
	}
 
	public void onDisable(){
		getLogger().info("onDisable has been invoked!");
	}
}
