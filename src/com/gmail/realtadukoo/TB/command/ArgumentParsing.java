package com.gmail.realtadukoo.TB.command;

import java.util.ArrayList;

import com.gmail.realtadukoo.TB.Enums.EnumTranslations;
import com.gmail.realtadukoo.TB.Enums.Bible.BibleReference;
import com.gmail.realtadukoo.TB.Enums.Bible.EnumBible;

public class ArgumentParsing{
	
	public static BibleReference isBibleReference(ArrayList<String> args){
		BibleReference ref = new BibleReference();
		ref.setBook(isBibleBook(args));
		ref.setChapter(isChapter(args));
		ref.setVerse(isVerse(args));
		ref.setTranslation(isTranslation(args));
		//verify ref
		return ref;
	}
	
	public static EnumBible isBibleBook(ArrayList<String> args){
		EnumBible book = EnumBible.fromString(args.get(0));
		if(book != null){
			args.remove(0);
		}else{
			book = EnumBible.fromString(args.get(0) + " " + args.get(1));
			if(book != null){
				args.remove(0);
				args.remove(0);
			}else{
				book = EnumBible.fromString(args.get(0) + " " + args.get(1) + " " + args.get(2));
				if(book != null){
					args.remove(0);
					args.remove(0);
					args.remove(0);
				}
			}
		}
		return book;
	}
	
	public static int isChapter(ArrayList<String> args){
		if(args.get(0).contains(":")){
			String[] pieces = args.get(0).split(":");
			args.remove(0);
			args.add(0, pieces[1]);
			return Integer.parseInt(pieces[0]);
		}else{
			int chp = Integer.parseInt(args.get(0));
			args.remove(0);
			return chp;
		}
	}
	
	public static int isVerse(ArrayList<String> args){
		int v = Integer.parseInt(args.get(0));
		args.remove(0);
		return v;
	}
	
	public static EnumTranslations isTranslation(ArrayList<String> args){
		EnumTranslations tran = EnumTranslations.fromAbbreviation(args.get(0));
		args.remove(0);
		return tran;
	}
}
