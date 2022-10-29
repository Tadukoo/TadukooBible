package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.SECOND_JOHN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondJohnVerseTest{
	
	@Test
	public void testSecondJohnChp1NumVerses(){
		assertEquals(13, SECOND_JOHN.getNumVersesInChp(1));
	}
}
