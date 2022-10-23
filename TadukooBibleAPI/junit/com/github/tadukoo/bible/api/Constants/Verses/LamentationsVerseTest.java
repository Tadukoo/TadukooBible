package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.LAMENTATIONS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LamentationsVerseTest{
	
	@Test
	public void testLamentationsChp1NumVerses(){
		assertEquals(22, LAMENTATIONS.getNumVersesInChp(1));
	}
	
	@Test
	public void testLamentationsChp2NumVerses(){
		assertEquals(22, LAMENTATIONS.getNumVersesInChp(2));
	}
	
	@Test
	public void testLamentationsChp3NumVerses(){
		assertEquals(66, LAMENTATIONS.getNumVersesInChp(3));
	}
	
	@Test
	public void testLamentationsChp4NumVerses(){
		assertEquals(22, LAMENTATIONS.getNumVersesInChp(4));
	}
	
	@Test
	public void testLamentationsChp5NumVerses(){
		assertEquals(22, LAMENTATIONS.getNumVersesInChp(5));
	}
}
