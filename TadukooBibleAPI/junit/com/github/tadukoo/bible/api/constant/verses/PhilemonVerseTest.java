package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.PHILEMON;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhilemonVerseTest{
	
	@Test
	public void testPhilemonChp1NumVerses(){
		assertEquals(25, PHILEMON.getNumVersesInChp(1));
	}
}
