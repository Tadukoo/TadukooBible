package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.EZRA;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EzraVerseTest{
	
	@Test
	public void testEzraChp1NumVerses(){
		assertEquals(11, EZRA.getNumVersesInChp(1));
	}
	
	@Test
	public void testEzraChp2NumVerses(){
		assertEquals(70, EZRA.getNumVersesInChp(2));
	}
	
	@Test
	public void testEzraChp3NumVerses(){
		assertEquals(13, EZRA.getNumVersesInChp(3));
	}
	
	@Test
	public void testEzraChp4NumVerses(){
		assertEquals(24, EZRA.getNumVersesInChp(4));
	}
	
	@Test
	public void testEzraChp5NumVerses(){
		assertEquals(17, EZRA.getNumVersesInChp(5));
	}
	
	@Test
	public void testEzraChp6NumVerses(){
		assertEquals(22, EZRA.getNumVersesInChp(6));
	}
	
	@Test
	public void testEzraChp7NumVerses(){
		assertEquals(28, EZRA.getNumVersesInChp(7));
	}
	
	@Test
	public void testEzraChp8NumVerses(){
		assertEquals(36, EZRA.getNumVersesInChp(8));
	}
	
	@Test
	public void testEzraChp9NumVerses(){
		assertEquals(15, EZRA.getNumVersesInChp(9));
	}
	
	@Test
	public void testEzraChp10NumVerses(){
		assertEquals(44, EZRA.getNumVersesInChp(10));
	}
}
