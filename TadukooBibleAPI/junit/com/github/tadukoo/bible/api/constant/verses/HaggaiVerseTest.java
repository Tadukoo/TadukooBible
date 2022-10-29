package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.HAGGAI;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HaggaiVerseTest{
	
	@Test
	public void testHaggaiChp1NumVerses(){
		assertEquals(15, HAGGAI.getNumVersesInChp(1));
	}
	
	@Test
	public void testHaggaiChp2NumVerses(){
		assertEquals(23, HAGGAI.getNumVersesInChp(2));
	}
}
