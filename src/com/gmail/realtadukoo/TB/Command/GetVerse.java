package com.gmail.realtadukoo.TB.Command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import com.gmail.realtadukoo.TB.Bible.BibleReference;
import com.gmail.realtadukoo.TB.Constants.EnumBible;
import com.gmail.realtadukoo.TB.Constants.EnumTranslation;
import com.gmail.realtadukoo.TB.Download.RetrieveFromSite;
import com.gmail.realtadukoo.TB.Files.VerseFile;

public class GetVerse extends Command{
	
	public GetVerse(){
		// Format only requires a Bible Reference object
		super("<Reference:bible reference>");
	}
	
	@Override
	public String[] runCommand(ArrayList<String> args){
		// Get arguments
		HashMap<String, Object> objs = getArgsAsObjects(args);
		BibleReference ref = (BibleReference) objs.get("Reference");
		
		// Do work
		String verse = GetVerse.getVerse(ref);
		
		// Return verse
		return new String[]{verse};
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
				v = RetrieveFromSite.getVerse(book, chp, verse, tran);
				if(v != null){
					prop.setProperty("ch" + chp + "v" + verse, v);
					VerseFile.saveBook(prop, book, tran);
				}
			}
			return v;
		}catch(IOException e){
			String v = RetrieveFromSite.getVerse(book, chp, verse, tran);
			if(v != null){
				prop = new Properties();
				prop.setProperty("ch" + chp + "v" + verse, v);
				try{
					VerseFile.saveBook(prop, book, tran);
				}catch(IOException e2){
					e2.printStackTrace();
				}
			}
			return v;
		}
	}
}
