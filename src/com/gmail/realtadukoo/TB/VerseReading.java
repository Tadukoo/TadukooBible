package com.gmail.realtadukoo.TB;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.gmail.realtadukoo.TB.Enums.EnumBible;
import com.gmail.realtadukoo.TB.Enums.EnumTranslations;

public class VerseReading{
	
	public static Properties getBook(EnumBible book, String tran) throws IOException{
		Properties prop = new Properties();
		InputStream is = new FileInputStream("resource/Bible/" + tran + "/" + 
				book.book().replaceAll(" ", "") + ".properties");
		prop.load(is);
		return prop;
	}
	
	public static String getVerse(EnumBible book, int chp, int verse, EnumTranslations tran){
		
		Properties prop;
		try{
			prop = getBook(book, tran.abbreviation());
			return prop.getProperty("ch" + chp + "v" + verse);
		}catch(IOException e){
			return RetrieveFromSite.getVerse(book.book(), chp, verse, tran.getName());
		}
	}
}
