package com.gmail.realtadukoo.TB;

import java.util.ArrayList;

import com.gmail.realtadukoo.TB.Enums.EnumBible;
import com.gmail.realtadukoo.TB.Enums.EnumBibleAliases;
import com.gmail.realtadukoo.TB.Enums.EnumBibleChps;
import com.gmail.realtadukoo.TB.Enums.EnumCmdAliases;
import com.gmail.realtadukoo.TB.Enums.EnumTranslations;

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
					command = "/bible get " + fiddleForBookChpVTran(args);
				}else if(type.equalsIgnoreCase("download")){
					ArrayList<String> args = new ArrayList<String>();
					for(int i = 2; i < pieces.length; i++){
						args.add(pieces[i]);
					}
					command = "/bible download " + fiddleForBookChpVTran(args);
				}
			}
		}
		
		return command;
	}
	
	private static String fiddleForBookChpVTran(ArrayList<String> args){
		int length = args.size();
		String book, tran;
		int chp, v;
		if(args.get(length - 2).contains(":")){
			String chpV = args.remove(length - 2);
			tran = args.remove(length - 2);
			String[] chpAV = chpV.split(":");
			args.add(chpAV[0]);
			args.add(chpAV[1]);
			args.add(tran);
			length = args.size();
		}
		if(length == 6){
			book = args.get(0) + args.get(1) + args.get(2);
			chp = Integer.parseInt(args.get(3));
			v = Integer.parseInt(args.get(4));
			tran = args.get(5);
		}else if(length == 5){
			book = args.get(0) + args.get(1);
			chp = Integer.parseInt(args.get(2));
			v = Integer.parseInt(args.get(3));
			tran = args.get(4);
		}else if(length == 4){
			book = args.get(0);
			chp = Integer.parseInt(args.get(1));
			v = Integer.parseInt(args.get(2));
			tran = args.get(3);
		}else{
			throw new IllegalArgumentException("Invalid arguments amount.");
		}
		EnumBible ebook = EnumBible.fromString(EnumBibleAliases.getBookFromAlias(book));
		if(ebook == null){
			throw new IllegalArgumentException("Book doesn't exist.");
		}
		book = ebook.book().replaceAll(" ", "");
		
		if(chp > EnumBibleChps.fromString(book).getChps().length){
			throw new IllegalArgumentException("Chapter doesn't exist.");
		}
		if(v > EnumBibleChps.fromString(book).getNum(chp)){
			throw new IllegalArgumentException("Verse doesn't exist.");
		}
		
		if(EnumTranslations.fromAbbreviation(tran) == null){
			throw new IllegalArgumentException("Translation not found.");
		}
		
		return book + " " + chp + " " + v + " " + tran;
	}
}
