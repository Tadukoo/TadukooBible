package com.github.tadukoo.bible.api.command;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.bible.api.constant.EnumTranslation;
import com.github.tadukoo.bible.api.storage.VerseFile;
import com.github.tadukoo.bible.api.bible.BibleReference;
import com.github.tadukoo.bible.api.download.retrieval.RetrieveChapterFromSite;
import com.github.tadukoo.bible.api.download.retrieval.RetrieveChapterFromSiteBH;
import com.github.tadukoo.util.ListUtil;

public class GetVerse extends Command{
	
	public GetVerse(){
		// Format only requires a Bible Reference object
		super("<Reference:bible reference>");
	}
	
	@Override
	public List<String> runCommand(List<String> args){
		// Get arguments
		Map<String, Object> objs = getArgsAsObjects(args);
		BibleReference ref = (BibleReference) objs.get("Reference");
		
		// Do work
		String verse = GetVerse.getVerse(ref);
		
		// Return verse
		return ListUtil.createList(verse);
	}
	
	public static String getVerse(BibleReference ref){
		EnumBible book = ref.getBook();
		int chp = ref.getChapter();
		int verse = ref.getVerse();
		EnumTranslation tran = ref.getTranslation();
		Properties prop;
		try{
			prop = VerseFile.getBook(book, tran);
			String v = prop.getProperty("ch" + chp + "v" + verse);
			if(v == null){
				v = retrieveFromSite(ref, prop);
			}
			return v;
		}catch(IOException e){
			String v = null;
			try{
				v = retrieveFromSite(ref, new Properties());
			}catch(IOException e2){
				e2.printStackTrace();
			}
			return v;
		}
	}
	
	private static String retrieveFromSite(BibleReference ref, Properties prop) throws IOException{
		RetrieveChapterFromSite retriever = new RetrieveChapterFromSiteBH();
		Map<Integer, String> verses = retriever.getVerses(ref);
		
		for(int verseNum: verses.keySet()){
			prop.setProperty("ch" + ref.getChapter() + "v" + verseNum, verses.get(verseNum));
		}
		VerseFile.saveBook(prop, ref.getBook(), ref.getTranslation());
		
		return verses.get(ref.getVerse());
	}
}
