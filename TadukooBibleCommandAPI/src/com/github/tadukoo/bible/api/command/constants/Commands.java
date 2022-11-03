package com.github.tadukoo.bible.api.command.constants;

import com.github.tadukoo.bible.api.command.Command;
import com.github.tadukoo.bible.api.command.DownloadCommand;
import com.github.tadukoo.bible.api.command.DownloadTranCommand;
import com.github.tadukoo.bible.api.command.FindMissing;
import com.github.tadukoo.bible.api.command.GetVerse;
import com.github.tadukoo.util.ListUtil;
import com.github.tadukoo.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains the Commands used in Tadukoo Bible
 *
 * @author Logan Ferree (Tadukoo)
 * @version 2.0-Alpha1
 */
public enum Commands{
	/**
	 * The command to get verses
	 * <br>Command: get
	 * <br>Aliases: getVerse, verseGet, readVerse, verseRead, readV, vRead
	 * <br>Command Class: {@link GetVerse}
	 */
	GET_VERSE("get",
			ListUtil.createList("getVerse", "verseGet", "readVerse", "verseRead", "readV", "vRead"),
			new GetVerse()),
	/**
	 * The command to download verses
	 * <br>Command: download
	 * <br>Aliases: none
	 * <br>Command Class: {@link DownloadCommand}
	 */
	DOWNLOAD("download", new DownloadCommand()),
	/**
	 * The command to download an entire translation
	 * <br>Command: downloadTran
	 * <br>Aliases: none
	 * <br>Command Class: {@link DownloadTranCommand}
	 */
	DOWNLOAD_TRAN("downloadTran", new DownloadTranCommand()),
	/**
	 * The command to find missing verses in a translation
	 * <br>Command: missing
	 * <br>Aliases: none
	 * <br>Command Class: {@link FindMissing}
	 */
	MISSING("missing", new FindMissing());
	
	/** The standard string used for the command */
	private final String commandString;
	/** The aliases for the command */
	private final List<String> aliases;
	/** The {@link Command} class for the command */
	private final Command command;
	
	/**
	 * Constructs a new {@link Commands} object using the given parameters
	 *
	 * @param commandString The standard string used for the command
	 * @param command The {@link Command} class for the command
	 */
	Commands(String commandString, Command command){
		this.commandString = commandString;
		this.aliases = new ArrayList<>();
		this.command = command;
	}
	
	/**
	 * Constructs a new {@link Commands} object using the given parameters
	 *
	 * @param commandString The standard string used for the command
	 * @param aliases The aliases for the command
	 * @param command The {@link Command} class for the command
	 */
	Commands(String commandString, List<String> aliases, Command command){
		this.commandString = commandString;
		this.aliases = aliases;
		this.command = command;
	}
	
	/**
	 * Gets the {@link Command} class for the {@link Commands} object represented by the given command string.
	 * This could be a match on the {@link #commandString} or an {@link #aliases alias}
	 *
	 * @param command The command string to match to a {@link Commands} object
	 * @return The {@link Command} for the found {@link Commands} object, or null if none was found
	 */
	public static Command getCommand(String command){
		for(Commands cmd: values()){
			if(StringUtil.equalsIgnoreCase(command, cmd.commandString) ||
					StringUtil.equalsAnyIgnoreCase(command, cmd.aliases.toArray(new String[0]))){
				return cmd.command;
			}
		}
		return null;
	}
}
