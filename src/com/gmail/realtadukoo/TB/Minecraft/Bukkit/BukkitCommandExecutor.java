package com.gmail.realtadukoo.TB.Minecraft.Bukkit;

import java.io.IOException;
import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.gmail.realtadukoo.TB.CmdFiddler;
import com.gmail.realtadukoo.TB.CmdHandler;

public class BukkitCommandExecutor implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args){
		String command = "/" + cmd.getName();
		for(int i = 0; i < args.length; i++){
			command += " " + args[i];
		}
		try{
			String[] thing = CmdHandler.handleCommand(CmdFiddler.fiddle(command));
			sender.sendMessage(ChatColor.GREEN + thing[0]);
			return true;
		}catch(IOException e){
			BukkitMain.plugin().getLogger().log(Level.SEVERE, ChatColor.RED + "IOException with "
					+ "command " + command);
			return false;
		}
	}
}
