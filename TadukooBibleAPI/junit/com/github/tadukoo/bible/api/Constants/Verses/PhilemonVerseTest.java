package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.PHILEMON;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhilemonVerseTest{
	
	@Test
	public void testPhilemonChp1NumVerses(){
		assertEquals(25, PHILEMON.getNumVersesInChp(1));
	}
}
