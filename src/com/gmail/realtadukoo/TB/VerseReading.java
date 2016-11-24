package com.gmail.realtadukoo.TB;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.gmail.realtadukoo.TB.Enums.EnumBible;

public class VerseReading{
	
	public static Properties getBook(EnumBible book) throws IOException{
		Properties prop = new Properties();
		InputStream is = new FileInputStream("resource/Bible/KJV/" + 
				book.book().replaceAll(" ", "") + ".properties");
		prop.load(is);
		return prop;
	}
	
	public static String getVerse(EnumBible book, int chp, int verse) throws IOException{
		Properties prop = getBook(book);
		return prop.getProperty("ch" + chp + "v" + verse);
	}
}
