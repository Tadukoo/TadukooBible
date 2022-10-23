package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.FIRST_THESSALONIANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstThessaloniansVerseTest{
	
	@Test
	public void testFirstThessaloniansChp1NumVerses(){
		assertEquals(10, FIRST_THESSALONIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testFirstThessaloniansChp2NumVerses(){
		assertEquals(20, FIRST_THESSALONIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testFirstThessaloniansChp3NumVerses(){
		assertEquals(13, FIRST_THESSALONIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testFirstThessaloniansChp4NumVerses(){
		assertEquals(18, FIRST_THESSALONIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void testFirstThessaloniansChp5NumVerses(){
		assertEquals(28, FIRST_THESSALONIANS.getNumVersesInChp(5));
	}
}
