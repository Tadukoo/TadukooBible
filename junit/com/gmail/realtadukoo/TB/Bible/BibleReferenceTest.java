package com.gmail.realtadukoo.TB.Bible;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.gmail.realtadukoo.TB.Constants.EnumBible;

public class BibleReferenceTest{
	private BibleReference ref;
	
	@Before
	public void setup(){
		ref = new BibleReference(EnumBible.FIRST_JOHN, 3, 16, EnumTranslations.ESV);
	}
	
	@Test
	public void testEmptyConstructor(){
		BibleReference ref = new BibleReference();
		
		assertEquals(null, ref.getBook());
		assertEquals(-1, ref.getChapter());
		assertEquals(-1, ref.getVerse());
		assertEquals(null, ref.getTranslation());
	}
	
	@Test
	public void testConstructor(){
		assertEquals(EnumBible.FIRST_JOHN, ref.getBook());
		assertEquals(3, ref.getChapter());
		assertEquals(16, ref.getVerse());
		assertEquals(EnumTranslations.ESV, ref.getTranslation());
	}
	
	@Test
	public void testSetBook(){
		ref.setBook(EnumBible.ACTS);
		
		assertEquals(EnumBible.ACTS, ref.getBook());
	}
	
	@Test
	public void testSetChapter(){
		ref.setChapter(28);
		
		assertEquals(28, ref.getChapter());
	}
	
	@Test
	public void testSetVerse(){
		ref.setVerse(21);
		
		assertEquals(21, ref.getVerse());
	}
	
	@Test
	public void testSetTranslation(){
		ref.setTranslation(EnumTranslations.HCSB);
		
		assertEquals(EnumTranslations.HCSB, ref.getTranslation());
	}
}
