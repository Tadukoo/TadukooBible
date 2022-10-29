package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.SECOND_CORINTHIANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondCorinthiansVerseTest{
	
	@Test
	public void testSecondCorinthiansChp1NumVerses(){
		assertEquals(24, SECOND_CORINTHIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testSecondCorinthiansChp2NumVerses(){
		assertEquals(17, SECOND_CORINTHIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testSecondCorinthiansChp3NumVerses(){
		assertEquals(18, SECOND_CORINTHIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testSecondCorinthiansChp4NumVerses(){
		assertEquals(18, SECOND_CORINTHIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void testSecondCorinthiansChp5NumVerses(){
		assertEquals(21, SECOND_CORINTHIANS.getNumVersesInChp(5));
	}
	
	@Test
	public void testSecondCorinthiansChp6NumVerses(){
		assertEquals(18, SECOND_CORINTHIANS.getNumVersesInChp(6));
	}
	
	@Test
	public void testSecondCorinthiansChp7NumVerses(){
		assertEquals(16, SECOND_CORINTHIANS.getNumVersesInChp(7));
	}
	
	@Test
	public void testSecondCorinthiansChp8NumVerses(){
		assertEquals(24, SECOND_CORINTHIANS.getNumVersesInChp(8));
	}
	
	@Test
	public void testSecondCorinthiansChp9NumVerses(){
		assertEquals(15, SECOND_CORINTHIANS.getNumVersesInChp(9));
	}
	
	@Test
	public void testSecondCorinthiansChp10NumVerses(){
		assertEquals(18, SECOND_CORINTHIANS.getNumVersesInChp(10));
	}
	
	@Test
	public void testSecondCorinthiansChp11NumVerses(){
		assertEquals(33, SECOND_CORINTHIANS.getNumVersesInChp(11));
	}
	
	@Test
	public void testSecondCorinthiansChp12NumVerses(){
		assertEquals(21, SECOND_CORINTHIANS.getNumVersesInChp(12));
	}
	
	@Test
	public void testSecondCorinthiansChp13NumVerses(){
		assertEquals(14, SECOND_CORINTHIANS.getNumVersesInChp(13));
	}
}
