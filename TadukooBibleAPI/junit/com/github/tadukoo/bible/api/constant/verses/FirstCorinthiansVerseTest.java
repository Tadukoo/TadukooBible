package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.FIRST_CORINTHIANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstCorinthiansVerseTest{
	
	@Test
	public void testFirstCorinthiansChp1NumVerses(){
		assertEquals(31, FIRST_CORINTHIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testFirstCorinthiansChp2NumVerses(){
		assertEquals(16, FIRST_CORINTHIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testFirstCorinthiansChp3NumVerses(){
		assertEquals(23, FIRST_CORINTHIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testFirstCorinthiansChp4NumVerses(){
		assertEquals(21, FIRST_CORINTHIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void testFirstCorinthiansChp5NumVerses(){
		assertEquals(13, FIRST_CORINTHIANS.getNumVersesInChp(5));
	}
	
	@Test
	public void testFirstCorinthiansChp6NumVerses(){
		assertEquals(20, FIRST_CORINTHIANS.getNumVersesInChp(6));
	}
	
	@Test
	public void testFirstCorinthiansChp7NumVerses(){
		assertEquals(40, FIRST_CORINTHIANS.getNumVersesInChp(7));
	}
	
	@Test
	public void testFirstCorinthiansChp8NumVerses(){
		assertEquals(13, FIRST_CORINTHIANS.getNumVersesInChp(8));
	}
	
	@Test
	public void testFirstCorinthiansChp9NumVerses(){
		assertEquals(27, FIRST_CORINTHIANS.getNumVersesInChp(9));
	}
	
	@Test
	public void testFirstCorinthiansChp10NumVerses(){
		assertEquals(33, FIRST_CORINTHIANS.getNumVersesInChp(10));
	}
	
	@Test
	public void testFirstCorinthiansChp11NumVerses(){
		assertEquals(34, FIRST_CORINTHIANS.getNumVersesInChp(11));
	}
	
	@Test
	public void testFirstCorinthiansChp12NumVerses(){
		assertEquals(31, FIRST_CORINTHIANS.getNumVersesInChp(12));
	}
	
	@Test
	public void testFirstCorinthiansChp13NumVerses(){
		assertEquals(13, FIRST_CORINTHIANS.getNumVersesInChp(13));
	}
	
	@Test
	public void testFirstCorinthiansChp14NumVerses(){
		assertEquals(40, FIRST_CORINTHIANS.getNumVersesInChp(14));
	}
	
	@Test
	public void testFirstCorinthiansChp15NumVerses(){
		assertEquals(58, FIRST_CORINTHIANS.getNumVersesInChp(15));
	}
	
	@Test
	public void testFirstCorinthiansChp16NumVerses(){
		assertEquals(24, FIRST_CORINTHIANS.getNumVersesInChp(16));
	}
}
