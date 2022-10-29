package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.FIRST_PETER;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstPeterVerseTest{
	
	@Test
	public void testFirstPeterChp1NumVerses(){
		assertEquals(25, FIRST_PETER.getNumVersesInChp(1));
	}
	
	@Test
	public void testFirstPeterChp2NumVerses(){
		assertEquals(25, FIRST_PETER.getNumVersesInChp(2));
	}
	
	@Test
	public void testFirstPeterChp3NumVerses(){
		assertEquals(22, FIRST_PETER.getNumVersesInChp(3));
	}
	
	@Test
	public void testFirstPeterChp4NumVerses(){
		assertEquals(19, FIRST_PETER.getNumVersesInChp(4));
	}
	
	@Test
	public void testFirstPeterChp5NumVerses(){
		assertEquals(14, FIRST_PETER.getNumVersesInChp(5));
	}
}
