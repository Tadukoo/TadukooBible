package com.github.tadukoo.bible.api.download.retrieval;

import com.github.tadukoo.bible.api.bible.BibleReference;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RetrieveChapterFromSiteBG implements RetrieveChapterFromSite{
	
	private static final String verseOrChpNumRegex =
			"(?:<span class=\"chapternum\">\\d* </span>|<sup class=\"versenum\">\\d* </sup>)";
	private static final Pattern pattern =
			Pattern.compile("<span id=\"[^=]*\" class=\"text [^-]*-\\d*-(\\d*)\">" + verseOrChpNumRegex + "([^ ]*)</span>");
	private static final Pattern smallCapsPattern =
			Pattern.compile("<span style=\"font-variant: small-caps\" class=\"small-caps\">([^=<]*)</span>");
	
	/** {@inheritDoc} */
	@Override
	public Pattern getPattern(){
		return pattern;
	}
	
	/** {@inheritDoc} */
	@Override
	public String getURL(BibleReference ref){
		return "https://biblegateway.com/passage/?search=" + ref.getBook().getName() +
				"%20" + ref.getChapter() + "&version=" + ref.getTranslation().getAbbreviation();
	}
	
	/** {@inheritDoc} */
	@Override
	public String performExtraCleanup(String verse){
		Matcher smallCapsMatcher = smallCapsPattern.matcher(verse);
		while(smallCapsMatcher.find()){
			String smallCapsString = smallCapsMatcher.group(1).toUpperCase();
			verse = verse.replace(smallCapsMatcher.group(0), smallCapsString);
		}
		return verse;
	}
}
