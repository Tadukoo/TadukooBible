package com.github.tadukoo.bible.api.command;

import com.github.tadukoo.bible.api.bible.Settings;
import com.github.tadukoo.bible.api.command.constants.BaseCommands;
import com.github.tadukoo.bible.api.command.constants.Commands;
import com.github.tadukoo.util.ListUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandHandler{
	private final Settings settings;
	
	public CommandHandler(Settings settings){
		this.settings = settings;
	}
	
	public List<String> handleCommand(String fullCommand){
		// Ensure the command starts with a / and split it into parts
		if(!fullCommand.startsWith("/")){
			throw new IllegalArgumentException("Not a command. Commands start with /");
		}
		String[] parts = fullCommand.split(" ");
		
		// Grab the base command from the command string
		String base = parts[0].substring(1);
		BaseCommands baseCommand = BaseCommands.getBaseCommand(base);
		if(baseCommand == null){
			throw new IllegalArgumentException("Command '/" + base + "' not recognized");
		}
		
		// Split the arguments and grab the actual command and set the necessary settings on it
		List<String> args = new ArrayList<>(Arrays.asList(parts).subList(1, parts.length));
		Command command = Commands.getCommand(args.get(0));
		if(command == null){
			throw new IllegalArgumentException("Unknown command: /" + base + " " + args.get(0));
		}
		command.setBaseCommand(baseCommand);
		command.setSettings(settings);
		
		try{
			return command.runCommand(args);
		}catch(Throwable t){
			t.printStackTrace();
			return ListUtil.createList("Something went wrong in running the command. " +
					"Check the logs for more information");
		}
	}
}
