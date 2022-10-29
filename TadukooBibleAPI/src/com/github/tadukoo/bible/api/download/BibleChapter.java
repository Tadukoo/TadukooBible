package com.github.tadukoo.bible.api.download;

import com.github.tadukoo.bible.api.Bible.BibleReference;
import com.github.tadukoo.bible.api.download.retrieval.RetrieveChapterFromSite;

import java.util.Map;

public class BibleChapter{
	private final BibleReference ref;
	private final RetrieveChapterFromSite retriever;
	private Map<Integer, String> verses;
	
	public BibleChapter(BibleReference ref, RetrieveChapterFromSite retriever){
		this.ref = ref;
		this.retriever = retriever;
	}
	
	public BibleReference getRef(){
		return ref;
	}
	
	public RetrieveChapterFromSite getRetriever(){
		return retriever;
	}
	
	public Map<Integer, String> getVerses(){
		return verses;
	}
	
	public void setVerses(Map<Integer, String> verses){
		this.verses = verses;
	}
}
