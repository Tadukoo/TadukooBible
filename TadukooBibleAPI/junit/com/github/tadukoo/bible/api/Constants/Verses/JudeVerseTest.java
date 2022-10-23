package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.JUDE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JudeVerseTest{
	
	@Test
	public void testJudeChp1NumVerses(){
		assertEquals(25, JUDE.getNumVersesInChp(1));
	}
}
