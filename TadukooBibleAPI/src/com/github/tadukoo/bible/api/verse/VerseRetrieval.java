package com.github.tadukoo.bible.api.verse;

import com.github.tadukoo.bible.api.bible.BibleReference;
import com.github.tadukoo.bible.api.bible.Settings;
import com.github.tadukoo.bible.api.download.retrieval.RetrieveChapterFromSite;
import com.github.tadukoo.bible.api.storage.VerseStorage;
import com.github.tadukoo.util.StringUtil;

import java.util.Map;

public class VerseRetrieval{
	private final VerseStorage verseStorage;
	private final RetrieveChapterFromSite verseRetriever;
	
	public VerseRetrieval(Settings settings){
		this.verseStorage = settings.getVerseStorage();
		this.verseRetriever = settings.getVerseRetriever();
	}
	
	public String getVerse(BibleReference ref) throws Throwable{
		String verse = verseStorage.getVerse(ref);
		if(StringUtil.isBlank(verse)){
			verse = retrieveFromSite(ref);
		}
		return verse;
	}
	
	private String retrieveFromSite(BibleReference ref) throws Throwable{
		// Retrieve the chapter from online
		Map<Integer, String> verses = verseRetriever.getVerses(ref);
		// Store the grabbed verses
		verseStorage.storeVerses(ref, verses);
		// return the verse requested
		return verses.get(ref.getVerse());
	}
}
