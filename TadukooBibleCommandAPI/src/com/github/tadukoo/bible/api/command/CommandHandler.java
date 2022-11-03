package com.github.tadukoo.bible.api.command;

import com.github.tadukoo.bible.api.bible.Settings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandHandler{
	private final Settings settings;
	
	public CommandHandler(Settings settings){
		this.settings = settings;
	}
	
	public List<String> handleCommand(String fullCommand){
		if(!fullCommand.startsWith("/")){
			throw new IllegalArgumentException("Not a command. Commands start with /");
		}
		String[] parts = fullCommand.split(" ");
		String baseCommand = parts[0].substring(1);
		EnumCmdAliases base = EnumCmdAliases.baseFromString(baseCommand);
		if(base == null){
			throw new IllegalArgumentException("Command '" + baseCommand + "' not recognized");
		}
		ArrayList<String> args = new ArrayList<>(Arrays.asList(parts).subList(1, parts.length));
		switch(base){
			case BIBLE:
				try{
					Command command = CommandEnum.getCommand(args.get(0));
					if(command == null){
						throw new IllegalArgumentException("Unknown Bible command: " + args.get(0));
					}
					command.setSettings(settings);
					return command.runCommand(args);
				}catch(Throwable t){
					t.printStackTrace();
				}
			default:
				throw new IllegalArgumentException("Command " + base + " not found.");
		}
	}
}
