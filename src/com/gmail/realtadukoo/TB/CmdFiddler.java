package com.gmail.realtadukoo.TB;

import java.util.ArrayList;

import com.gmail.realtadukoo.TB.Enums.EnumCmdAliases;

/**
 * This class will take a command and fiddle it to be the correct format for CmdHandler to handle.
 * 
 * @author Logan Ferree
 * @version 1.0
 */
public class CmdFiddler{
	
	public static String fiddle(String command){
		String[] pieces = command.split(" ");
		String com = pieces[0];
		for(String s: EnumCmdAliases.BIBLE.aliases()){
			if(com.equalsIgnoreCase("/" + s)){
				com = "/bible";
				String type = pieces[1];
				if(type.equalsIgnoreCase("get")){
					ArrayList<String> args = new ArrayList<String>();
					for(int i = 2; i < pieces.length; i++){
						args.add(pieces[i]);
					}
				}
			}
		}
		
		return command;
	}
}
