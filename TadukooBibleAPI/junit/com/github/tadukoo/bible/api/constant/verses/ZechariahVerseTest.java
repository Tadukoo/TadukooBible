package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.ZECHARIAH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZechariahVerseTest{
	
	@Test
	public void testZechariahChp1NumVerses(){
		assertEquals(21, ZECHARIAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testZechariahChp2NumVerses(){
		assertEquals(13, ZECHARIAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testZechariahChp3NumVerses(){
		assertEquals(10, ZECHARIAH.getNumVersesInChp(3));
	}
	
	@Test
	public void testZechariahChp4NumVerses(){
		assertEquals(14, ZECHARIAH.getNumVersesInChp(4));
	}
	
	@Test
	public void testZechariahChp5NumVerses(){
		assertEquals(11, ZECHARIAH.getNumVersesInChp(5));
	}
	
	@Test
	public void testZechariahChp6NumVerses(){
		assertEquals(15, ZECHARIAH.getNumVersesInChp(6));
	}
	
	@Test
	public void testZechariahChp7NumVerses(){
		assertEquals(14, ZECHARIAH.getNumVersesInChp(7));
	}
	
	@Test
	public void testZechariahChp8NumVerses(){
		assertEquals(23, ZECHARIAH.getNumVersesInChp(8));
	}
	
	@Test
	public void testZechariahChp9NumVerses(){
		assertEquals(17, ZECHARIAH.getNumVersesInChp(9));
	}
	
	@Test
	public void testZechariahChp10NumVerses(){
		assertEquals(12, ZECHARIAH.getNumVersesInChp(10));
	}
	
	@Test
	public void testZechariahChp11NumVerses(){
		assertEquals(17, ZECHARIAH.getNumVersesInChp(11));
	}
	
	@Test
	public void testZechariahChp12NumVerses(){
		assertEquals(14, ZECHARIAH.getNumVersesInChp(12));
	}
	
	@Test
	public void testZechariahChp13NumVerses(){
		assertEquals(9, ZECHARIAH.getNumVersesInChp(13));
	}
	
	@Test
	public void testZechariahChp14NumVerses(){
		assertEquals(21, ZECHARIAH.getNumVersesInChp(14));
	}
}
