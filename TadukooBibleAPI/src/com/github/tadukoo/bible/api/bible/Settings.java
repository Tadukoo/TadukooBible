package com.github.tadukoo.bible.api.bible;

import com.github.tadukoo.bible.api.download.retrieval.RetrieveChapterFromSite;
import com.github.tadukoo.bible.api.download.retrieval.RetrieveChapterFromSiteBH;
import com.github.tadukoo.bible.api.storage.VerseFileStorage;
import com.github.tadukoo.bible.api.storage.VerseStorage;

public class Settings{
	private final VerseStorage verseStorage;
	private final RetrieveChapterFromSite verseRetriever;
	
	public Settings(){
		verseStorage = new VerseFileStorage("test-bible/");
		verseRetriever = new RetrieveChapterFromSiteBH();
	}
	
	public VerseStorage getVerseStorage(){
		return verseStorage;
	}
	
	public RetrieveChapterFromSite getVerseRetriever(){
		return verseRetriever;
	}
}
