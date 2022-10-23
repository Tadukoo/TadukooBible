package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.ZEPHANIAH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZephaniahVerseTest{
	
	@Test
	public void testZephaniahChp1NumVerses(){
		assertEquals(18, ZEPHANIAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testZephaniahChp2NumVerses(){
		assertEquals(15, ZEPHANIAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testZephaniahChp3NumVerses(){
		assertEquals(20, ZEPHANIAH.getNumVersesInChp(3));
	}
}
