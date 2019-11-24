package com.gmail.realtadukoo.TB.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.gmail.realtadukoo.TB.Constants.EnumBible;
import com.gmail.realtadukoo.TB.Constants.EnumTranslation;

public class VerseFile{
	
	public static Properties getBook(EnumBible book, EnumTranslation tran) throws IOException{
		Properties prop = new Properties();
		InputStream is = new FileInputStream("resource/Bible/" + tran.getAbbreviation() + "/" + 
				book.getBook().replaceAll(" ", "") + ".properties");
		prop.load(is);
		return prop;
	}
	
	public static void saveBook(Properties verses, EnumBible book, EnumTranslation tran) 
			throws IOException{
		Properties prop = verses;
		try{
			Properties newProp = getBook(book, tran);
			newProp.putAll(verses);
			prop = newProp;
		}catch(IOException e){
			
		}
		
		try{
			FileOutputStream fos = new FileOutputStream("resource/Bible/" + tran.getAbbreviation() + "/" +
					book.getBook().replaceAll(" ", "") + ".properties");
			fos.close();
		}catch(FileNotFoundException e){
			File directory = new File("resource/Bible/" + tran.getAbbreviation());
			directory.mkdirs();
		}
		OutputStream os = new FileOutputStream("resource/Bible/" + tran.getAbbreviation() + "/" +
				book.getBook().replaceAll(" ", "") + ".properties");
		prop.store(os, "No Comment");
	}
}
