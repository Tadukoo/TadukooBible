package com.github.tadukoo.bible.api.Command;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.tadukoo.bible.api.Constants.EnumBible;
import com.github.tadukoo.bible.api.Constants.EnumTranslation;
import com.github.tadukoo.bible.api.Bible.BibleReference;

public class ArgumentParsing{
	
	public static Map<String, Object> parseArgsUsingFormatString(String format, List<String> args){
		Map<String, Object> objs = new HashMap<String, Object>();
		
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
				EnumTranslation tran = isTranslation(args);
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
	
	public static BibleReference isBibleReference(List<String> args){
		BibleReference ref = BibleReference.builder()
											.book(isBibleBook(args))
											.chapter(isChapter(args))
											.verse(isVerse(args))
											.translation(isTranslation(args))
											.build();
		return verifyReference(ref)?ref:null;
	}
	
	public static boolean verifyReference(BibleReference ref){
		if(ref.getBook() == null || ref.getChapter() < 1 || ref.getVerse() < 1 || ref.getTranslation() == null){
			return false;
		}
		EnumBible book = ref.getBook();
		if(ref.getChapter() > book.getNumChapters()){
			return false;
		}
		if(ref.getVerse() > book.getNumVersesInChp(ref.getChapter())){
			return false;
		}
		// TODO: Check if verse is missing in Translation
		return true;
	}
	
	public static EnumBible isBibleBook(List<String> args){
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
	
	public static int isChapter(List<String> args){
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
	
	public static int isVerse(List<String> args){
		int v = Integer.parseInt(args.get(0));
		args.remove(0);
		return v;
	}
	
	public static EnumTranslation isTranslation(List<String> args){
		EnumTranslation tran = EnumTranslation.fromAbbreviation(args.get(0));
		args.remove(0);
		return tran;
	}
}
