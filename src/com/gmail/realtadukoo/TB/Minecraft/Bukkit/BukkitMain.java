package com.gmail.realtadukoo.TB.Minecraft.Bukkit;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitMain extends JavaPlugin{
	private static BukkitMain plugin;
	private CommandExecutor cmdExec;
	
	@Override
	public void onDisable(){
		
	}
	
	@Override
	public void onEnable(){
		plugin = this;
		cmdExec = new BukkitCommandExecutor();
		
		getCommand("bible").setExecutor(cmdExec);
	}
	
	public static BukkitMain plugin(){
		return plugin;
	}
}
