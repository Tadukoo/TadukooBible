package com.github.tadukoo.bible.api.command;

import com.github.tadukoo.util.StringUtil;

public enum CommandEnum{
	GET_VERSE("get", new GetVerse()),
	DOWNLOAD("download", new DownloadCommand()),
	DOWNLOAD_TRAN("downloadtran", new DownloadTranCommand()),
	MISSING("missing", new FindMissing());
	
	private final String commandString;
	private final Command command;
	
	CommandEnum(String commandString, Command command){
		this.commandString = commandString;
		this.command = command;
	}
	
	public static Command getCommand(String command){
		for(CommandEnum cmd: values()){
			if(StringUtil.equalsIgnoreCase(command, cmd.commandString)){
				return cmd.command;
			}
		}
		return null;
	}
}
