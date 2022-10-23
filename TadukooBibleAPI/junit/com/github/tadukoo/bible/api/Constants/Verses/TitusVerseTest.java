package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.TITUS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TitusVerseTest{
	
	@Test
	public void testTitusChp1NumVerses(){
		assertEquals(16, TITUS.getNumVersesInChp(1));
	}
	
	@Test
	public void testTitusChp2NumVerses(){
		assertEquals(15, TITUS.getNumVersesInChp(2));
	}
	
	@Test
	public void testTitusChp3NumVerses(){
		assertEquals(15, TITUS.getNumVersesInChp(3));
	}
}
