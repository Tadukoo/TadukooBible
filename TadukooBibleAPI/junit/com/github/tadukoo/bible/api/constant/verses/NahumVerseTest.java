package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.NAHUM;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NahumVerseTest{
	
	@Test
	public void testNahumChp1NumVerses(){
		assertEquals(15, NAHUM.getNumVersesInChp(1));
	}
	
	@Test
	public void testNahumChp2NumVerses(){
		assertEquals(13, NAHUM.getNumVersesInChp(2));
	}
	
	@Test
	public void testNahumChp3NumVerses(){
		assertEquals(19, NAHUM.getNumVersesInChp(3));
	}
}
