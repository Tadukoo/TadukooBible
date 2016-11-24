package com.gmail.realtadukoo.TB;

import java.util.ArrayList;

import com.gmail.realtadukoo.TB.Enums.EnumBible;
import com.gmail.realtadukoo.TB.Enums.EnumBibleChps;
import com.gmail.realtadukoo.TB.Enums.EnumCmdAliases;

/**
 * This class will take a command and fiddle it to be the correct format for CmdHandler to 
 * handle.
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
					command = fiddleWithGet(args);
				}
			}
		}
		
		return command;
	}
	
	private static String fiddleWithGet(ArrayList<String> args){
		int length = args.size();
		String book;
		int chp, v;
		if(args.get(length - 1).contains(":")){
			String chpV = args.remove(length - 1);
			String[] chpAV = chpV.split(":");
			args.add(chpAV[0]);
			args.add(chpAV[1]);
		}
		if(length == 5){
			book = args.get(0) + args.get(1) + args.get(2);
			chp = Integer.parseInt(args.get(3));
			v = Integer.parseInt(args.get(4));
		}else if(length == 4){
			book = args.get(0) + args.get(1);
			chp = Integer.parseInt(args.get(2));
			v = Integer.parseInt(args.get(3));
		}else if(length == 3){
			book = args.get(0);
			chp = Integer.parseInt(args.get(1));
			v = Integer.parseInt(args.get(2));
		}else{
			throw new IllegalArgumentException("Invalid arguments amount.");
		}
		book = EnumBible.fromString(book).book();
		if(chp > EnumBibleChps.fromString(book).getChps().length){
			throw new IllegalArgumentException("Chapter doesn't exist.");
		}
		if(v > EnumBibleChps.fromString(book).getNum(chp)){
			throw new IllegalArgumentException("Verse doesn't exist.");
		}
		
		return "/bible get " + book + " " + chp + " " + v;
	}
}
