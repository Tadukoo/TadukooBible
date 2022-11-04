package com.github.tadukoo.bible.api.command;

import com.github.tadukoo.bible.api.bible.Settings;
import com.github.tadukoo.bible.api.command.constants.BaseCommands;
import com.github.tadukoo.util.logger.EasyLogger;

import java.util.List;
import java.util.Map;

/**
 * Represents a Command that can be entered to perform some function.
 *
 * @author Logan Ferree (Tadukoo)
 * @version 2.0-Alpha1
 */
public abstract class Command{
	/** The string representing the format of this command */
	private final String formatString;
	/** The {@link EasyLogger logger} being used by this command */
	protected EasyLogger logger;
	/** The {@link Settings} being used for this command */
	protected Settings settings;
	/** The {@link BaseCommands base command} being used for this command */
	protected BaseCommands baseCommand;
	
	/**
	 * Constructs a new {@link Command} using the given parameters
	 *
	 * @param formatString The string representing the format of this command
	 */
	public Command(String formatString){
		this.formatString = formatString;
	}
	
	/**
	 * @return The string representing the format of this command
	 */
	public String getFormatString(){
		return formatString;
	}
	
	/**
	 * Sets the {@link EasyLogger logger} being used by this command
	 *
	 * @param logger The {@link EasyLogger logger} being used by this command
	 */
	public void setLogger(EasyLogger logger){
		this.logger = logger;
	}
	
	/**
	 * Sets the {@link Settings} being used for this command
	 *
	 * @param settings The {@link Settings} being used for this command
	 */
	public void setSettings(Settings settings){
		this.settings = settings;
	}
	
	/**
	 * Sets the {@link BaseCommands base command} being used for this command
	 *
	 * @param baseCommand The {@link BaseCommands base command} being used for this command
	 */
	public void setBaseCommand(BaseCommands baseCommand){
		this.baseCommand = baseCommand;
	}
	
	protected Map<String, Object> getArgsAsObjects(List<String> args){
		return ArgumentParsing.parseArgsUsingFormatString(formatString, args);
	}
	
	public abstract List<String> runCommand(List<String> args) throws Throwable;
}
