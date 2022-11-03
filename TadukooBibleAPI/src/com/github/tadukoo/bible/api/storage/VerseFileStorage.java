package com.github.tadukoo.bible.api.storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Properties;

import com.github.tadukoo.bible.api.bible.BibleReference;
import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.bible.api.constant.EnumTranslation;

/**
 * Provides functions for dealing with the files used to store Bible verses.
 * 
 * @author Logan Ferree (Tadukoo)
 * @version 2.0-Alpha1-SNAPSHOT (Definitely earlier)
 */
public class VerseFileStorage implements VerseStorage{
	/** The folder that the verses should be stored in */
	private final String folder;
	
	/**
	 * Constructs a new {@link VerseFileStorage} using the given parameters
	 *
	 * @param folder The folder that the verses should be stored in
	 */
	public VerseFileStorage(String folder){
		this.folder = folder;
	}
	
	/**
	 * Gets the file name for the given book and translation
	 *
	 * @param book The {@link EnumBible book} to use for the file name
	 * @param tran The {@link EnumTranslation translation} to use for the file name
	 * @return The file name for the given book and translation
	 */
	private String getFileName(EnumBible book, EnumTranslation tran){
		return folder + tran.getAbbreviation() + "/" +
				book.getName().replaceAll(" ", "") + ".properties";
	}
	
	/**
	 * Gets the property string for the given reference
	 *
	 * @param ref The {@link BibleReference reference} for the property
	 * @return The property string for the given reference
	 */
	private String getPropertyString(BibleReference ref){
		return getPropertyString(ref.getChapter(), ref.getVerse());
	}
	
	/**
	 * Gets the property string for the given chapter and verse
	 *
	 * @param chapter The chapter to use for the property string
	 * @param verse The verse to use for the property string
	 * @return The property string for the given chapter and verse
	 */
	private String getPropertyString(int chapter, int verse){
		return "ch" + chapter + "v" + verse;
	}
	
	/**
	 * Retrieves the verse file for the given Bible book for the given translation.
	 * 
	 * @param book The EnumBible book to retrieve
	 * @param tran The EnumTranslation translation to retrieve
	 * @return A Properties object representing the information in the file
	 * @throws IOException If something goes wrong in grabbing the file
	 */
	private Properties getBook(EnumBible book, EnumTranslation tran) throws IOException{
		// Load the file as Properties from Bible/<translationAbbreviation>/<bookName>.properties
		Properties prop = new Properties();
		InputStream is = new FileInputStream(getFileName(book, tran));
		prop.load(is);
		return prop;
	}
	
	/**
	 * Saves the verse properties for the given Bible book and given translation. 
	 * Adds the given properties to those that already exist.
	 * 
	 * @param book The EnumBible book to save to
	 * @param tran The EnumTranslation translation to save to
	 * @param verses The properties to add to the file
	 * @throws IOException If something goes wrong in saving the file
	 */
	private void saveBook(EnumBible book, EnumTranslation tran, Properties verses)
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
		File directory = new File(folder + tran.getAbbreviation());
		if(!directory.exists()){
			directory.mkdirs();
		}
		
		// Save the new properties to the file
		OutputStream os = new FileOutputStream(getFileName(book, tran));
		prop.store(os, "No Comment");
	}
	
	/** {@inheritDoc} */
	@Override
	public String getVerse(BibleReference ref) throws Throwable{
		return getBook(ref.getBook(), ref.getTranslation()).getProperty(getPropertyString(ref));
	}
	
	/** {@inheritDoc} */
	@Override
	public void storeVerse(BibleReference ref, String verse) throws Throwable{
		Properties prop = new Properties();
		prop.setProperty(getPropertyString(ref), verse);
		saveBook(ref.getBook(), ref.getTranslation(), prop);
	}
	
	/** {@inheritDoc} */
	@Override
	public void storeVerses(BibleReference ref, Map<Integer, String> verses) throws Throwable{
		Properties prop = new Properties();
		verses.forEach((verseNum, verse) -> prop.getProperty(getPropertyString(ref.getChapter(), verseNum), verse));
		saveBook(ref.getBook(), ref.getTranslation(), prop);
	}
	
	/** {@inheritDoc} */
	@Override
	public void storeVerses(EnumBible book, EnumTranslation tran, Properties prop) throws Throwable{
		saveBook(book, tran, prop);
	}
}
