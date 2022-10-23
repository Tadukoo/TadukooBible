package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.SECOND_PETER;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondPeterVerseTest{
	
	@Test
	public void testSecondPeterChp1NumVerses(){
		assertEquals(21, SECOND_PETER.getNumVersesInChp(1));
	}
	
	@Test
	public void testSecondPeterChp2NumVerses(){
		assertEquals(22, SECOND_PETER.getNumVersesInChp(2));
	}
	
	@Test
	public void testSecondPeterChp3NumVerses(){
		assertEquals(18, SECOND_PETER.getNumVersesInChp(3));
	}
}
