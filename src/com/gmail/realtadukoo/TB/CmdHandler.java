package com.gmail.realtadukoo.TB;

import java.io.IOException;

import com.gmail.realtadukoo.TB.Enums.EnumBible;
import com.gmail.realtadukoo.TB.Enums.EnumCmdAliases;

public class CmdHandler{
	
	public static String[] handleCommand(String command) throws IOException{
		if(command.startsWith("/")){
			String[] parts = command.split(" ");
			for(String s: EnumCmdAliases.BIBLE.aliases()){
				if(parts[0].equalsIgnoreCase("/" + s)){
					if(parts[1].equalsIgnoreCase("get")){
						EnumBible book = EnumBible.fromString(parts[2]);
						int chp = Integer.parseInt(parts[3]);
						int v = Integer.parseInt(parts[4]);
						String verse = VerseReading.getVerse(book, chp, v);
						System.out.println(verse);
						return new String[]{verse};
					}
				}
			}
			throw new IllegalArgumentException("Command not found.");
		}else{
			throw new IllegalArgumentException("Not a command. Commands start with /");
		}
	}
}