package com.github.tadukoo.bible.api.command;

import java.util.List;
import java.util.Map;

import com.github.tadukoo.bible.api.bible.BibleReference;
import com.github.tadukoo.bible.api.verse.VerseRetrieval;
import com.github.tadukoo.util.ListUtil;

public class GetVerse extends Command{
	
	public GetVerse(){
		// Format only requires a Bible Reference object
		super("<Reference:bible reference>");
	}
	
	@Override
	public List<String> runCommand(List<String> args) throws Throwable{
		// Get arguments
		Map<String, Object> objs = getArgsAsObjects(args);
		BibleReference ref = (BibleReference) objs.get("Reference");
		
		// Do work
		VerseRetrieval retrieval = new VerseRetrieval(settings);
		return ListUtil.createList(retrieval.getVerse(ref));
	}
}
