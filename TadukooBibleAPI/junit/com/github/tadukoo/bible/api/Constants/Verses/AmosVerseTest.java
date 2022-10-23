package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.AMOS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmosVerseTest{
	
	@Test
	public void testAmosChp1NumVerses(){
		assertEquals(15, AMOS.getNumVersesInChp(1));
	}
	
	@Test
	public void testAmosChp2NumVerses(){
		assertEquals(16, AMOS.getNumVersesInChp(2));
	}
	
	@Test
	public void testAmosChp3NumVerses(){
		assertEquals(15, AMOS.getNumVersesInChp(3));
	}
	
	@Test
	public void testAmosChp4NumVerses(){
		assertEquals(13, AMOS.getNumVersesInChp(4));
	}
	
	@Test
	public void testAmosChp5NumVerses(){
		assertEquals(27, AMOS.getNumVersesInChp(5));
	}
	
	@Test
	public void testAmosChp6NumVerses(){
		assertEquals(14, AMOS.getNumVersesInChp(6));
	}
	
	@Test
	public void testAmosChp7NumVerses(){
		assertEquals(17, AMOS.getNumVersesInChp(7));
	}
	
	@Test
	public void testAmosChp8NumVerses(){
		assertEquals(14, AMOS.getNumVersesInChp(8));
	}
	
	@Test
	public void testAmosChp9NumVerses(){
		assertEquals(15, AMOS.getNumVersesInChp(9));
	}
}
