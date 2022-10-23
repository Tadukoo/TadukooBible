package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.JOEL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JoelVerseTest{
	
	@Test
	public void testJoelChp1NumVerses(){
		assertEquals(20, JOEL.getNumVersesInChp(1));
	}
	
	@Test
	public void testJoelChp2NumVerses(){
		assertEquals(32, JOEL.getNumVersesInChp(2));
	}
	
	@Test
	public void testJoelChp3NumVerses(){
		assertEquals(21, JOEL.getNumVersesInChp(3));
	}
}
