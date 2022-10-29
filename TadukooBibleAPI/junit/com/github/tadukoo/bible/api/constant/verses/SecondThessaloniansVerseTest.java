package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.SECOND_THESSALONIANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondThessaloniansVerseTest{
	
	@Test
	public void testSecondThessaloniansChp1NumVerses(){
		assertEquals(12, SECOND_THESSALONIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testSecondThessaloniansChp2NumVerses(){
		assertEquals(17, SECOND_THESSALONIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testSecondThessaloniansChp3NumVerses(){
		assertEquals(18, SECOND_THESSALONIANS.getNumVersesInChp(3));
	}
}
