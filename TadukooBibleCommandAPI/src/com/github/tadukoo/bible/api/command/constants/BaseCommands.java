package com.github.tadukoo.bible.api.command.constants;

import com.github.tadukoo.util.ListUtil;
import com.github.tadukoo.util.StringUtil;

import java.util.List;

/**
 * Represents the base commands that can be run
 *
 * @author Logan Ferree (Tadukoo)
 * @version 2.0-Alpha1
 */
public enum BaseCommands{
	/**
	 * Represents the /bible command
	 * Aliases: b
	 */
	BIBLE("bible", ListUtil.createList("b")),
	/**
	 * Represents the /apocrypha command
	 * Aliases: a
	 */
	APOCRYPHA("apocrypha", ListUtil.createList("a"));
	
	/** The standard string used for the command */
	private final String commandString;
	/** The aliases for the command */
	private final List<String> aliases;
	
	/**
	 * Constructs a new {@link BaseCommands} using the given parameters
	 *
	 * @param commandString The standard string used for the command
	 * @param aliases The aliases for the command
	 */
	BaseCommands(String commandString, List<String> aliases){
		this.commandString = commandString;
		this.aliases = aliases;
	}
	
	/**
	 * Gets the {@link BaseCommands} object represented by the given command string.
	 * This could be a match on the {@link #commandString} or an {@link #aliases alias}
	 *
	 * @param command The command string to match to a {@link BaseCommands} object
	 * @return The found {@link BaseCommands} object, or null if none was found
	 */
	public static BaseCommands getBaseCommand(String command){
		for(BaseCommands cmd: values()){
			if(StringUtil.equalsIgnoreCase(command, cmd.commandString) ||
					StringUtil.equalsAnyIgnoreCase(command, cmd.aliases.toArray(new String[0]))){
				return cmd;
			}
		}
		return null;
	}
}
