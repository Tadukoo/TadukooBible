package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.NEHEMIAH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NehemiahVerseTest{
	
	@Test
	public void testNehemiahChp1NumVerses(){
		assertEquals(11, NEHEMIAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testNehemiahChp2NumVerses(){
		assertEquals(20, NEHEMIAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testNehemiahChp3NumVerses(){
		assertEquals(32, NEHEMIAH.getNumVersesInChp(3));
	}
	
	@Test
	public void testNehemiahChp4NumVerses(){
		assertEquals(23, NEHEMIAH.getNumVersesInChp(4));
	}
	
	@Test
	public void testNehemiahChp5NumVerses(){
		assertEquals(19, NEHEMIAH.getNumVersesInChp(5));
	}
	
	@Test
	public void testNehemiahChp6NumVerses(){
		assertEquals(19, NEHEMIAH.getNumVersesInChp(6));
	}
	
	@Test
	public void testNehemiahChp7NumVerses(){
		assertEquals(73, NEHEMIAH.getNumVersesInChp(7));
	}
	
	@Test
	public void testNehemiahChp8NumVerses(){
		assertEquals(18, NEHEMIAH.getNumVersesInChp(8));
	}
	
	@Test
	public void testNehemiahChp9NumVerses(){
		assertEquals(38, NEHEMIAH.getNumVersesInChp(9));
	}
	
	@Test
	public void testNehemiahChp10NumVerses(){
		assertEquals(39, NEHEMIAH.getNumVersesInChp(10));
	}
	
	@Test
	public void testNehemiahChp11NumVerses(){
		assertEquals(36, NEHEMIAH.getNumVersesInChp(11));
	}
	
	@Test
	public void testNehemiahChp12NumVerses(){
		assertEquals(47, NEHEMIAH.getNumVersesInChp(12));
	}
	
	@Test
	public void testNehemiahChp13NumVerses(){
		assertEquals(31, NEHEMIAH.getNumVersesInChp(13));
	}
}
