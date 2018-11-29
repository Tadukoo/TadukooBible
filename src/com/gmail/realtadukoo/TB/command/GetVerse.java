package com.gmail.realtadukoo.TB.command;

import java.util.ArrayList;

import com.gmail.realtadukoo.TB.VerseReading;
import com.gmail.realtadukoo.TB.Enums.Bible.BibleReference;

public class GetVerse extends Command{
	
	@Override
	public String[] runCommand(ArrayList<String> args){
		BibleReference ref = ArgumentParsing.isBibleReference(args);
		String verse = VerseReading.getVerse(ref);
		System.out.println(verse);
		return new String[]{verse};
	}
}
