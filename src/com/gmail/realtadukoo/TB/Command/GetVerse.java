package com.gmail.realtadukoo.TB.Command;

import java.util.ArrayList;
import java.util.HashMap;

import com.gmail.realtadukoo.TB.VerseReading;
import com.gmail.realtadukoo.TB.Bible.BibleReference;

public class GetVerse extends Command{
	
	public GetVerse(){
		super("<Reference:bible reference>");
	}
	
	@Override
	public String[] runCommand(ArrayList<String> args){
		HashMap<String, Object> objs = getArgsAsObjects(args);
		BibleReference ref = (BibleReference) objs.get("Reference");
		String verse = VerseReading.getVerse(ref);
		return new String[]{verse};
	}
}
