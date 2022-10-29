package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.MICAH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MicahVerseTest{
	
	@Test
	public void testMicahChp1NumVerses(){
		assertEquals(16, MICAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testMicahChp2NumVerses(){
		assertEquals(13, MICAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testMicahChp3NumVerses(){
		assertEquals(12, MICAH.getNumVersesInChp(3));
	}
	
	@Test
	public void testMicahChp4NumVerses(){
		assertEquals(13, MICAH.getNumVersesInChp(4));
	}
	
	@Test
	public void testMicahChp5NumVerses(){
		assertEquals(15, MICAH.getNumVersesInChp(5));
	}
	
	@Test
	public void testMicahChp6NumVerses(){
		assertEquals(16, MICAH.getNumVersesInChp(6));
	}
	
	@Test
	public void testMicahChp7NumVerses(){
		assertEquals(20, MICAH.getNumVersesInChp(7));
	}
}
