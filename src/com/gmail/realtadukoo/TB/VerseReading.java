package com.gmail.realtadukoo.TB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.gmail.realtadukoo.TB.Download.RetrieveFromSite;
import com.gmail.realtadukoo.TB.Enums.EnumTranslations;
import com.gmail.realtadukoo.TB.Enums.Bible.EnumBible;

public class VerseReading{
	
	public static Properties getBook(EnumBible book, EnumTranslations tran) throws IOException{
		Properties prop = new Properties();
		InputStream is = new FileInputStream("resource/Bible/" + tran.abbreviation() + "/" + 
				book.book().replaceAll(" ", "") + ".properties");
		prop.load(is);
		return prop;
	}
	
	public static void saveBook(Properties verses, EnumBible book, EnumTranslations tran) 
			throws IOException{
		Properties prop = verses;
		try{
			Properties newProp = getBook(book, tran);
			newProp.putAll(verses);
			prop = newProp;
		}catch(IOException e){
			
		}
		
		try{
			FileOutputStream fos = new FileOutputStream("resource/Bible/" + tran.abbreviation() + "/" +
					book.book().replaceAll(" ", "") + ".properties");
			fos.close();
		}catch(FileNotFoundException e){
			File directory = new File("resource/Bible/" + tran.abbreviation());
			directory.mkdirs();
		}
		OutputStream os = new FileOutputStream("resource/Bible/" + tran.abbreviation() + "/" +
				book.book().replaceAll(" ", "") + ".properties");
		prop.store(os, "No Comment");
	}
	
	public static String getVerse(EnumBible book, int chp, int verse, EnumTranslations tran){
		Properties prop;
		try{
			prop = getBook(book, tran);
			String v = prop.getProperty("ch" + chp + "v" + verse);
			if(v == null){
				v = RetrieveFromSite.getVerse(book, chp, verse, tran);
				if(v != null){
					prop.setProperty("ch" + chp + "v" + verse, v);
					saveBook(prop, book, tran);
				}
			}
			return v;
		}catch(IOException e){
			String v = RetrieveFromSite.getVerse(book, chp, verse, tran);
			if(v != null){
				prop = new Properties();
				prop.setProperty("ch" + chp + "v" + verse, v);
				try{
					saveBook(prop, book, tran);
				}catch(IOException e2){
					e2.printStackTrace();
				}
			}
			return v;
		}
	}
}
