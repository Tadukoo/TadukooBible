package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.HEBREWS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HebrewsVerseTest{
	
	@Test
	public void testHebrewsChp1NumVerses(){
		assertEquals(14, HEBREWS.getNumVersesInChp(1));
	}
	
	@Test
	public void testHebrewsChp2NumVerses(){
		assertEquals(18, HEBREWS.getNumVersesInChp(2));
	}
	
	@Test
	public void testHebrewsChp3NumVerses(){
		assertEquals(19, HEBREWS.getNumVersesInChp(3));
	}
	
	@Test
	public void testHebrewsChp4NumVerses(){
		assertEquals(16, HEBREWS.getNumVersesInChp(4));
	}
	
	@Test
	public void testHebrewsChp5NumVerses(){
		assertEquals(14, HEBREWS.getNumVersesInChp(5));
	}
	
	@Test
	public void testHebrewsChp6NumVerses(){
		assertEquals(20, HEBREWS.getNumVersesInChp(6));
	}
	
	@Test
	public void testHebrewsChp7NumVerses(){
		assertEquals(28, HEBREWS.getNumVersesInChp(7));
	}
	
	@Test
	public void testHebrewsChp8NumVerses(){
		assertEquals(13, HEBREWS.getNumVersesInChp(8));
	}
	
	@Test
	public void testHebrewsChp9NumVerses(){
		assertEquals(28, HEBREWS.getNumVersesInChp(9));
	}
	
	@Test
	public void testHebrewsChp10NumVerses(){
		assertEquals(39, HEBREWS.getNumVersesInChp(10));
	}
	
	@Test
	public void testHebrewsChp11NumVerses(){
		assertEquals(40, HEBREWS.getNumVersesInChp(11));
	}
	
	@Test
	public void testHebrewsChp12NumVerses(){
		assertEquals(29, HEBREWS.getNumVersesInChp(12));
	}
	
	@Test
	public void testHebrewsChp13NumVerses(){
		assertEquals(25, HEBREWS.getNumVersesInChp(13));
	}
}
