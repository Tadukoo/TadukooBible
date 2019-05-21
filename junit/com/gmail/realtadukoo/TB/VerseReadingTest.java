package com.gmail.realtadukoo.TB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gmail.realtadukoo.TB.Bible.BibleReference;
import com.gmail.realtadukoo.TB.Bible.EnumBible;
import com.gmail.realtadukoo.TB.Bible.EnumTranslations;

public class VerseReadingTest{
	
	private String John316KJV = "For God so loved the world, that he gave his only begotten Son, that whosoever believeth in him "
			+ "should not perish, but have everlasting life.";
	private String Genesis11NIV = "In the beginning God created the heavens and the earth.";
	
	@Test
	public void testGetVerseJohn316KJV(){
		BibleReference ref = new BibleReference(EnumBible.JOHN, 3, 16, EnumTranslations.KJV);
		
		String verse = VerseReading.getVerse(ref);
		
		assertEquals(John316KJV, verse);
	}
	
	@Test
	public void testGetVerseGenesis11NIV(){
		BibleReference ref = new BibleReference(EnumBible.GENESIS, 1, 1, EnumTranslations.NIV);
		
		String verse = VerseReading.getVerse(ref);
		
		assertEquals(Genesis11NIV, verse);
	}
}
