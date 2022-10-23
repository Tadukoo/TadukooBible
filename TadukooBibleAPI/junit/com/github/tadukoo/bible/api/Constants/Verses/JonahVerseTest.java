package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.JONAH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JonahVerseTest{
	
	@Test
	public void testJonahChp1NumVerses(){
		assertEquals(17, JONAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testJonahChp2NumVerses(){
		assertEquals(10, JONAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testJonahChp3NumVerses(){
		assertEquals(10, JONAH.getNumVersesInChp(3));
	}
	
	@Test
	public void testJonahChp4NumVerses(){
		assertEquals(11, JONAH.getNumVersesInChp(4));
	}
}
