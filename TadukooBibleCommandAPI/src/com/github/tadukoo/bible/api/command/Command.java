package com.github.tadukoo.bible.api.command;

import com.github.tadukoo.bible.api.bible.Settings;
import com.github.tadukoo.bible.api.command.constants.BaseCommands;

import java.util.List;
import java.util.Map;

public abstract class Command{
	protected BaseCommands baseCommand;
	protected Settings settings;
	private final String formatString;
	
	public Command(String formatString){
		this.formatString = formatString;
	}
	
	public void setBaseCommand(BaseCommands baseCommand){
		this.baseCommand = baseCommand;
	}
	
	public void setSettings(Settings settings){
		this.settings = settings;
	}
	
	public String getFormatString(){
		return formatString;
	}
	
	protected Map<String, Object> getArgsAsObjects(List<String> args){
		return ArgumentParsing.parseArgsUsingFormatString(formatString, args);
	}
	
	public abstract List<String> runCommand(List<String> args) throws Throwable;
}
