package com.github.tadukoo.bible.api.Command;

import java.io.IOException;
import java.util.ArrayList;

public class CommandHandler{
	
	public String[] handleCommand(String command) throws IOException{
		if(!command.startsWith("/")){
			throw new IllegalArgumentException("Not a command. Commands start with /");
		}
		String[] parts = command.split(" ");
		EnumCmdAliases base = EnumCmdAliases.baseFromString(parts[0].substring(1, parts[0].length()));
		ArrayList<String> args = new ArrayList<String>();
		for(int i = 1; i < parts.length; i++){
			args.add(parts[i]);
		}
		switch(base){
			case BIBLE:
				if(args.get(0).equalsIgnoreCase("get")){
					args.remove(0);
					return new GetVerse().runCommand(args);
				}else if(args.get(0).equalsIgnoreCase("download")){
					args.remove(0);
					return new DownloadCommand().runCommand(args);
				}else if(args.get(0).equalsIgnoreCase("downloadtran")){
					args.remove(0);
					return new DownloadTranCommand().runCommand(args);
				}else if(args.get(0).equalsIgnoreCase("missing")){
					args.remove(0);
					return new FindMissing().runCommand(args);
				}else{
					throw new IllegalArgumentException("Unknown Bible command!");
				}
			default:
				throw new IllegalArgumentException("Command not found.");
		}
	}
}
