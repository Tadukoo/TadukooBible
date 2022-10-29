package com.github.tadukoo.bible.api.download.retrieval;

import com.github.tadukoo.bible.api.bible.BibleReference;

import java.util.regex.Pattern;

public class RetrieveChapterFromSiteBH implements RetrieveChapterFromSite{
	
	private static final Pattern pattern =
			Pattern.compile("<span class=\"reftext\"><a href=\".*/\\d*-\\d*.htm\"(?: target=\"_top\")?>" +
					"<b>(\\d*)</b></a></span>(.*)");
	
	@Override
	public Pattern getPattern(){
		return pattern;
	}
	
	public String getURL(BibleReference ref){
		String book = ref.getBook().getName();
		book = book.toLowerCase();
		book = book.replace(" ", "_");
		if(book.equals("song_of_songs")){
			book = "songs";
		}
		
		return "https://biblehub.com/" + ref.getTranslation().getAbbreviation().toLowerCase() +
				"/" + book + "/" + ref.getChapter() + ".htm";
	}
	
	@Override
	public String performExtraCleanup(String verse){
		return verse;
	}
}
