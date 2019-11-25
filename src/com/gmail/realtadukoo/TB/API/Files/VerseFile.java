package com.gmail.realtadukoo.TB.API.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.gmail.realtadukoo.TB.API.Constants.EnumBible;
import com.gmail.realtadukoo.TB.API.Constants.EnumTranslation;
import com.gmail.realtadukoo.TB.API.Constants.FilePaths;

/**
 * Provides functions for dealing with the files used to store Bible verses.
 * 
 * @author Logan Ferree (Tadukoo)
 * @version 2.0-Alpha1-SNAPSHOT (Definitely earlier)
 */
public class VerseFile{
	
	/**
	 * Retrieves the verse file for the given Bible book for the given translation.
	 * 
	 * @param book The EnumBible book to retrieve
	 * @param tran The EnumTranslation translation to retrieve
	 * @return A Properties object representing the information in the file
	 */
	public static Properties getBook(EnumBible book, EnumTranslation tran) throws IOException{
		// Load the file as Properties from Bible/<translationAbbreviation>/<bookName>.properties
		Properties prop = new Properties();
		InputStream is = new FileInputStream(FilePaths.BIBLE_BOOK_FOLDER + tran.getAbbreviation() + "/" + 
				book.getBook().replaceAll(" ", "") + ".properties");
		prop.load(is);
		return prop;
	}
	
	/**
	 * Saves the verse properties for the given Bible book and given translation. 
	 * Adds the given properties to those that already exist.
	 * 
	 * @param verses The properties to add to the file
	 * @param book The EnumBible book to save to
	 * @param tran The EnumTranslation translation to save to
	 */
	public static void saveBook(Properties verses, EnumBible book, EnumTranslation tran) 
			throws IOException{
		// Add the existing verses to the new ones (if there are any)
		Properties prop = verses;
		try{
			Properties newProp = getBook(book, tran);
			newProp.putAll(verses);
			prop = newProp;
		}catch(IOException e){
			// If no existing verses, that's okay
		}
		
		// Create the directory if it doesn't exist
		File directory = new File("Bible/" + tran.getAbbreviation());
		if(!directory.exists()){
			directory.mkdirs();
		}
		
		// Save the new properties to the file
		OutputStream os = new FileOutputStream(FilePaths.BIBLE_BOOK_FOLDER + tran.getAbbreviation() + "/" +
				book.getBook().replaceAll(" ", "") + ".properties");
		prop.store(os, "No Comment");
	}
}
