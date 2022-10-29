package com.github.tadukoo.bible.api.download.retrieval;

import com.github.tadukoo.bible.api.bible.BibleReference;
import com.github.tadukoo.util.StringUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface RetrieveChapterFromSite{
	
	/**
	 * Retrieves the {@link Pattern} used for matching against verses on the page. This should really be a
	 * static final variable defined in the implementing class so it isn't compiled every time.
	 *
	 * @return The {@link Pattern} used for matching against verses on the page
	 */
	Pattern getPattern();
	
	/**
	 * Build the URL for the page for the chapter of the Bible based on the given {@link BibleReference}
	 *
	 * @param ref The {@link BibleReference} to use to determine the chapter URL
	 * @return The chapter page URL based on the given {@link BibleReference}
	 */
	String getURL(BibleReference ref);
	
	default Map<Integer, String> getVerses(BibleReference ref){
		// Grab the pattern to match on and start the map
		Pattern pattern = getPattern();
		Map<Integer, String> verses = new HashMap<>();
		
		// Grab the URL for the chapter
		URL site = null;
		try{
			site = new URL(getURL(ref));
		}catch(MalformedURLException e){
			e.printStackTrace();
		}
		if(site == null){
			throw new IllegalStateException("URL was null for " + ref);
		}
		
		// Setup a reader for the page
		BufferedReader reader = null;
		try{
			reader = new BufferedReader(new InputStreamReader(site.openStream()));
		}catch(IOException e){
			e.printStackTrace();
		}
		if(reader == null){
			throw new IllegalStateException("Reader was null for " + ref);
		}
		
		while(true){
			// Grab the line and ensure we actually have something
			String line = null;
			try{
				line = reader.readLine();
			}catch(IOException e){
				e.printStackTrace();
			}
			if(line == null){
				break;
			}
			
			// Try to match on the
			Matcher matcher = pattern.matcher(line);
			while(matcher.find()){
				// Grab info from matcher
				String verseNumString = matcher.group(1);
				String verse = matcher.group(2).trim();
				
				// Cleanup the verse string
				if(verse.contains("</div>")){
					int divIndex = verse.indexOf("</div>");
					verse = verse.substring(0, divIndex);
				}
				verse = verse.replaceAll("<i>|</i>|</p>", "");
				verse = performExtraCleanup(verse);
				
				// Make sure we actually got something
				if(StringUtil.allBlank(verseNumString, verse)){
					continue;
				}
				
				// Parse the verse number and add the verse to the map
				int verseNum = Integer.parseInt(matcher.group(1));
				verses.put(verseNum, verse);
			}
		}
		
		return verses;
	}
	
	/**
	 * Performs extra cleanup of the verses beyond the cleanup that's already performed. This method exists
	 * for special logic on particular websites (*cough*Bible Gateway*cough*) that is not necessarily on others
	 *
	 * @param verse The verse that has already been cleaned up to some extent
	 * @return The verse after the extra cleanup has been performed on it
	 */
	String performExtraCleanup(String verse);
}
