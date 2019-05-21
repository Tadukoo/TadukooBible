package com.gmail.realtadukoo.TB.Command;

import java.util.ArrayList;
import java.util.HashMap;

import com.gmail.realtadukoo.TB.Bible.BibleReference;
import com.gmail.realtadukoo.TB.Bible.EnumBible;
import com.gmail.realtadukoo.TB.Bible.EnumBibleChapters;
import com.gmail.realtadukoo.TB.Bible.EnumTranslations;

public class ArgumentParsing{
	
	public static HashMap<String, Object> parseArgsUsingFormatString(String format, ArrayList<String> args){
		HashMap<String, Object> objs = new HashMap<String, Object>();
		
		// TODO: This
		String[] pieces = format.split("> <");
		for(String arg: pieces){
			arg = arg.replaceAll("<", "");
			arg = arg.replaceAll(">", "");
			String[] argPieces = arg.split(":");
			String name = argPieces[0];
			String argType = argPieces[1];
			if(argType.equalsIgnoreCase("bible reference")){
				BibleReference ref = isBibleReference(args);
				if(ref != null){
					objs.put(name, ref);
				}else{
					// TODO: Throw error?
				}
			}else if(argType.equalsIgnoreCase("translation")){
				EnumTranslations tran = isTranslation(args);
				if(tran != null){
					objs.put(name, tran);
				}else{
					// TODO: Throw error?
				}
			}else{
				// TODO: Throw error?
			}
		}
		
		return objs;
	}
	
	public static BibleReference isBibleReference(ArrayList<String> args){
		BibleReference ref = new BibleReference();
		ref.setBook(isBibleBook(args));
		ref.setChapter(isChapter(args));
		ref.setVerse(isVerse(args));
		ref.setTranslation(isTranslation(args));
		return verifyReference(ref)?ref:null;
	}
	
	public static boolean verifyReference(BibleReference ref){
		if(ref.getBook() == null || ref.getChapter() < 1 || ref.getVerse() < 1 || ref.getTranslation() == null){
			return false;
		}
		EnumBibleChapters echp = EnumBibleChapters.fromBook(ref.getBook().getBook());
		if(ref.getChapter() > echp.getNumChapters()){
			return false;
		}
		if(ref.getVerse() > echp.getNum(ref.getChapter())){
			return false;
		}
		// TODO: Check if verse is missing in Translation
		return true;
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
