package com.gmail.realtadukoo.TB;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class VerseReading{
	
	public static Properties getBook(EnumBooks book) throws IOException{
		Properties prop = new Properties();
		InputStream is = new FileInputStream("resource/Bible/KJV/" + 
				book.bookName().replaceAll(" ", "") + ".properties");
		prop.load(is);
		return prop;
	}
	
	public static String getVerse(EnumBooks book, int chp, int verse) throws IOException{
		Properties prop = getBook(book);
		return prop.getProperty("ch" + chp + "v" + verse);
	}
}
