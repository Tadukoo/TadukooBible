package com.github.tadukoo.bible.api.Command;

import java.util.List;
import java.util.Map;

public abstract class Command{
	private final String formatString;
	
	public Command(String formatString){
		this.formatString = formatString;
	}
	
	public String getFormatString(){
		return formatString;
	}
	
	protected Map<String, Object> getArgsAsObjects(List<String> args){
		return ArgumentParsing.parseArgsUsingFormatString(formatString, args);
	}
	
	public abstract List<String> runCommand(List<String> args);
}
