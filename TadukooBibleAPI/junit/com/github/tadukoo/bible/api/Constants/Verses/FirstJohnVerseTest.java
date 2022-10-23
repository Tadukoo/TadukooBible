package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.FIRST_JOHN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstJohnVerseTest{
	
	@Test
	public void testFirstJohnChp1NumVerses(){
		assertEquals(10, FIRST_JOHN.getNumVersesInChp(1));
	}
	
	@Test
	public void testFirstJohnChp2NumVerses(){
		assertEquals(29, FIRST_JOHN.getNumVersesInChp(2));
	}
	
	@Test
	public void testFirstJohnChp3NumVerses(){
		assertEquals(24, FIRST_JOHN.getNumVersesInChp(3));
	}
	
	@Test
	public void testFirstJohnChp4NumVerses(){
		assertEquals(21, FIRST_JOHN.getNumVersesInChp(4));
	}
	
	@Test
	public void testFirstJohnChp5NumVerses(){
		assertEquals(21, FIRST_JOHN.getNumVersesInChp(5));
	}
}
