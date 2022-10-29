package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.OBADIAH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObadiahVerseTest{
	
	@Test
	public void testObadiahChp1NumVerses(){
		assertEquals(21, OBADIAH.getNumVersesInChp(1));
	}
}
