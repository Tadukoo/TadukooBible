package com.github.tadukoo.bible.api.storage;

import com.github.tadukoo.bible.api.bible.BibleReference;
import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.bible.api.constant.EnumTranslation;

import java.util.Map;
import java.util.Properties;

/**
 * Verse Storage handles storing and retrieving verses
 *
 * @author Logan Ferree (Tadukoo)
 * @version 2.0-Alpha1
 */
public interface VerseStorage{
	
	/**
	 * Retrieves the verse of the given {@link BibleReference reference}
	 *
	 * @param ref The {@link BibleReference reference} of the verse to retrieve
	 * @return The actual verse for the given reference
	 * @throws Throwable If anything goes wrong in retrieving the verse
	 */
	String getVerse(BibleReference ref) throws Throwable;
	
	/**
	 * Stores the given verse
	 *
	 * @param ref The {@link BibleReference reference} of the given verse
	 * @param verse The actual verse to be stored
	 * @throws Throwable If anything goes wrong in storing the verse
	 */
	void storeVerse(BibleReference ref, String verse) throws Throwable;
	
	/**
	 * Stores the given verses
	 *
	 * @param ref The {@link BibleReference reference} to be used for book, chapter, and translation of the verses
	 * @param verses A Map of the verse numbers to verses to be stored
	 * @throws Throwable If anything goes wrong in storing the verses
	 */
	void storeVerses(BibleReference ref, Map<Integer, String> verses) throws Throwable;
	
	/**
	 * Stores the given verses
	 *
	 * @param book The {@link BibleBooks book} of the verses to be stored
	 * @param tran The {@link EnumTranslation translation} of the verses to be stored
	 * @param prop A {@link Properties} object containing the verses to be stored, mapped as ch#v#
	 * @throws Throwable If anything goes wrong in storing the verses
	 */
	void storeVerses(BibleBooks book, EnumTranslation tran, Properties prop) throws Throwable;
}
