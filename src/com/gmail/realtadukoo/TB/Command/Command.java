package com.gmail.realtadukoo.TB.Command;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Command{
	private String formatString;
	
	public Command(String formatString){
		this.formatString = formatString;
	}
	
	public String getFormatString(){
		return formatString;
	}
	
	protected HashMap<String, Object> getArgsAsObjects(ArrayList<String> args){
		return ArgumentParsing.parseArgsUsingFormatString(formatString, args);
	}
	
	public abstract String[] runCommand(ArrayList<String> args);
}
