package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.SECOND_JOHN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondJohnVerseTest{
	
	@Test
	public void testSecondJohnChp1NumVerses(){
		assertEquals(13, SECOND_JOHN.getNumVersesInChp(1));
	}
}
