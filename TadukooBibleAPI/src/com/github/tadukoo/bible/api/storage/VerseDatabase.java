package com.github.tadukoo.bible.api.storage;

import com.github.tadukoo.bible.api.bible.BibleReference;
import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.bible.api.constant.EnumTranslation;

import java.util.Map;
import java.util.Properties;

public class VerseDatabase implements VerseStorage{
	
	public VerseDatabase(){
		// TODO: Receive database / database info
	}
	
	/** {@inheritDoc} */
	@Override
	public String getVerse(BibleReference ref){
		return null;
	}
	
	/** {@inheritDoc} */
	@Override
	public void storeVerse(BibleReference ref, String verse){
	
	}
	
	/** {@inheritDoc} */
	@Override
	public void storeVerses(BibleReference ref, Map<Integer, String> verses){
	
	}
	
	/** {@inheritDoc} */
	@Override
	public void storeVerses(EnumBible book, EnumTranslation tran, Properties prop){
	
	}
}
