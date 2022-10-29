package com.github.tadukoo.bible.api.bible;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.bible.api.constant.EnumTranslation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BibleReferenceTest{
	private BibleReference reference;
	
	@BeforeEach
	public void setup(){
		reference = BibleReference.builder()
									.book(EnumBible.JOHN)
									.chapter(3)
									.verse(16)
									.translation(EnumTranslation.NIV)
									.build();
	}
	
	@Test
	public void testEmptyBuilder(){
		// Build reference with empty parameters
		BibleReference ref = BibleReference.builder()
											.build();
		
		// Check that it defaults to the correct things
		assertNull(ref.getBook());
		assertNull(ref.getChapter());
		assertNull(ref.getVerse());
		assertNull(ref.getTranslation());
	}
	
	@Test
	public void testFullBuilder(){
		// Build reference with full parameters
		BibleReference ref = BibleReference.builder()
											.book(EnumBible.FIRST_JOHN)
											.chapter(3)
											.verse(16)
											.translation(EnumTranslation.ESV)
											.build();
		
		// Check that it properly sets everything
		assertEquals(EnumBible.FIRST_JOHN, ref.getBook());
		assertEquals(3, ref.getChapter());
		assertEquals(16, ref.getVerse());
		assertEquals(EnumTranslation.ESV, ref.getTranslation());
	}
	
	@Test
	public void testBookFromNameBuilder(){
		// Build reference using bookFromName
		BibleReference ref = BibleReference.builder()
											.bookFromName("Amos")
											.build();
		
		// Check that book was properly set
		assertEquals(EnumBible.AMOS, ref.getBook());
	}
	
	@Test
	public void testBookFromStringBuilder(){
		// Build reference using bookFromString for an alias
		BibleReference ref = BibleReference.builder()
											.bookFromString("Ex")
											.build();
		
		// Check that book was properly set
		assertEquals(EnumBible.EXODUS, ref.getBook());
	}
	
	@Test
	public void testBookFromNumberBuilder(){
		// Build reference using bookFromNumber
		BibleReference ref = BibleReference.builder()
											.bookFromNumber(39)
											.build();
		
		// Check that book was properly set
		assertEquals(EnumBible.MALACHI, ref.getBook());
	}
	
	@Test
	public void testTranslationFromNameBuilder(){
		// Build reference using translationFromName
		BibleReference ref = BibleReference.builder()
											.translationFromName("English Standard Version")
											.build();
		
		// Check that translation was properly set
		assertEquals(EnumTranslation.ESV, ref.getTranslation());
	}
	
	@Test
	public void testTranslationFromAbbreviationBuilder(){
		// Build reference using translationFromAbbreviation
		BibleReference ref = BibleReference.builder()
											.translationFromAbbreviation("KJV")
											.build();
		
		// Check that translation was properly set
		assertEquals(EnumTranslation.KJV, ref.getTranslation());
	}
	
	@Test
	public void testSetBook(){
		// Change book to Acts and check that it changed
		reference.setBook(EnumBible.ACTS);
		assertEquals(EnumBible.ACTS, reference.getBook());
		
		// Change book to Ecclesiastes and check that it changed
		reference.setBook(EnumBible.ECCLESIASTES);
		assertEquals(EnumBible.ECCLESIASTES, reference.getBook());
	}
	
	@Test
	public void testSetChapter(){
		// Change chapter to 28 and check that it changed
		reference.setChapter(28);
		assertEquals(28, reference.getChapter());
		
		// Change chapter to 129 and check that it changed
		reference.setChapter(129);
		assertEquals(129, reference.getChapter());
	}
	
	@Test
	public void testSetVerse(){
		// Change verse to 21 and check that it changed
		reference.setVerse(21);
		assertEquals(21, reference.getVerse());
		
		// Change verse to 49 and check that it changed
		reference.setVerse(49);
		assertEquals(49, reference.getVerse());
	}
	
	@Test
	public void testSetTranslation(){
		// Change translation to HCSB and check that it changed
		reference.setTranslation(EnumTranslation.HCSB);
		assertEquals(EnumTranslation.HCSB, reference.getTranslation());
		
		// Change translation to DBT and check that it changed
		reference.setTranslation(EnumTranslation.DBT);
		assertEquals(EnumTranslation.DBT, reference.getTranslation());
	}
}
