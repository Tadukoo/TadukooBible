package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.DANIEL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DanielVerseTest{
	
	@Test
	public void testDanielChp1NumVerses(){
		assertEquals(21, DANIEL.getNumVersesInChp(1));
	}
	
	@Test
	public void testDanielChp2NumVerses(){
		assertEquals(49, DANIEL.getNumVersesInChp(2));
	}
	
	@Test
	public void testDanielChp3NumVerses(){
		assertEquals(30, DANIEL.getNumVersesInChp(3));
	}
	
	@Test
	public void testDanielChp4NumVerses(){
		assertEquals(37, DANIEL.getNumVersesInChp(4));
	}
	
	@Test
	public void testDanielChp5NumVerses(){
		assertEquals(31, DANIEL.getNumVersesInChp(5));
	}
	
	@Test
	public void testDanielChp6NumVerses(){
		assertEquals(28, DANIEL.getNumVersesInChp(6));
	}
	
	@Test
	public void testDanielChp7NumVerses(){
		assertEquals(28, DANIEL.getNumVersesInChp(7));
	}
	
	@Test
	public void testDanielChp8NumVerses(){
		assertEquals(27, DANIEL.getNumVersesInChp(8));
	}
	
	@Test
	public void testDanielChp9NumVerses(){
		assertEquals(27, DANIEL.getNumVersesInChp(9));
	}
	
	@Test
	public void testDanielChp10NumVerses(){
		assertEquals(21, DANIEL.getNumVersesInChp(10));
	}
	
	@Test
	public void testDanielChp11NumVerses(){
		assertEquals(45, DANIEL.getNumVersesInChp(11));
	}
	
	@Test
	public void testDanielChp12NumVerses(){
		assertEquals(13, DANIEL.getNumVersesInChp(12));
	}
}
