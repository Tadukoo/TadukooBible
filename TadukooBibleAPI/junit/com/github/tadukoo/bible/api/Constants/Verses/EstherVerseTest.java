package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.ESTHER;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstherVerseTest{
	
	@Test
	public void testEstherChp1NumVerses(){
		assertEquals(22, ESTHER.getNumVersesInChp(1));
	}
	
	@Test
	public void testEstherChp2NumVerses(){
		assertEquals(23, ESTHER.getNumVersesInChp(2));
	}
	
	@Test
	public void testEstherChp3NumVerses(){
		assertEquals(15, ESTHER.getNumVersesInChp(3));
	}
	
	@Test
	public void testEstherChp4NumVerses(){
		assertEquals(17, ESTHER.getNumVersesInChp(4));
	}
	
	@Test
	public void testEstherChp5NumVerses(){
		assertEquals(14, ESTHER.getNumVersesInChp(5));
	}
	
	@Test
	public void testEstherChp6NumVerses(){
		assertEquals(14, ESTHER.getNumVersesInChp(6));
	}
	
	@Test
	public void testEstherChp7NumVerses(){
		assertEquals(10, ESTHER.getNumVersesInChp(7));
	}
	
	@Test
	public void testEstherChp8NumVerses(){
		assertEquals(17, ESTHER.getNumVersesInChp(8));
	}
	
	@Test
	public void testEstherChp9NumVerses(){
		assertEquals(32, ESTHER.getNumVersesInChp(9));
	}
	
	@Test
	public void testEstherChp10NumVerses(){
		assertEquals(3, ESTHER.getNumVersesInChp(10));
	}
}
