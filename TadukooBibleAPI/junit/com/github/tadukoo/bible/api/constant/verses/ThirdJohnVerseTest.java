package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.THIRD_JOHN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdJohnVerseTest{
	
	@Test
	public void testThirdJohnChp1NumVerses(){
		assertEquals(14, THIRD_JOHN.getNumVersesInChp(1));
	}
}
