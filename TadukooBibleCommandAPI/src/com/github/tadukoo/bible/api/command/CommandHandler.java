package com.github.tadukoo.bible.api.command;

import com.github.tadukoo.bible.api.bible.Settings;
import com.github.tadukoo.bible.api.command.constants.BaseCommands;
import com.github.tadukoo.bible.api.command.constants.Commands;
import com.github.tadukoo.util.ListUtil;
import com.github.tadukoo.util.logger.EasyLogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Command Handler handles commands.
 * <br><br>
 * It takes the necessary settings in its constructor, and then you pass command strings to it
 * for it to handle them appropriately.
 *
 * @author Logan Ferree (Tadukoo)
 * @version 2.0-Alpha1
 */
public class CommandHandler{
	/** The {@link EasyLogger logger} to be used by the {@link CommandHandler} and any {@link Command commands} */
	private final EasyLogger logger;
	/** The {@link Settings} to be used by the {@link CommandHandler} and any {@link Command commands} */
	private final Settings settings;
	
	/**
	 * Constructs a new {@link CommandHandler} with the given parameters
	 *
	 * @param logger The {@link EasyLogger logger} to be used by the {@link CommandHandler}
	 * and any {@link Command commands}
	 * @param settings The {@link Settings} to be used by the {@link CommandHandler} and any {@link Command commands}
	 */
	public CommandHandler(EasyLogger logger, Settings settings){
		this.logger = logger;
		this.settings = settings;
	}
	
	/**
	 * Handles the command string that's passed in by doing some parsing to determine which command it is and
	 * then sending to the appropriate class to run its arguments
	 *
	 * @param fullCommand The command string to be run
	 * @return The output of the {@link Command command} that gets run, or an error message
	 */
	public List<String> handleCommand(String fullCommand){
		// Ensure the command starts with a / and split it into parts
		if(!fullCommand.startsWith("/")){
			return ListUtil.createList("Not a command. Commands start with /");
		}
		String[] parts = fullCommand.split(" ");
		
		// Grab the base command from the command string
		String base = parts[0].substring(1);
		BaseCommands baseCommand = BaseCommands.getBaseCommand(base);
		if(baseCommand == null){
			return ListUtil.createList("Command '/" + base + "' not recognized");
		}
		
		// Split the arguments and grab the actual command and set the necessary settings on it
		List<String> args = new ArrayList<>(Arrays.asList(parts).subList(1, parts.length));
		Command command = Commands.getCommand(args.get(0));
		if(command == null){
			return ListUtil.createList("Unknown command: '/" + base + " " + args.get(0) + "'");
		}
		command.setLogger(logger);
		command.setSettings(settings);
		command.setBaseCommand(baseCommand);
		
		// Run the actual command
		try{
			return command.runCommand(args);
		}catch(Throwable t){
			logger.logError("Error in running command " + fullCommand, t);
			return ListUtil.createList("Something went wrong in running the command. " +
					"Check the logs for more information");
		}
	}
}
