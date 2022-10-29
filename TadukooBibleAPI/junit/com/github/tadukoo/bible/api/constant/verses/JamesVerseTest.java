package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.JAMES;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JamesVerseTest{
	
	@Test
	public void testJamesChp1NumVerses(){
		assertEquals(27, JAMES.getNumVersesInChp(1));
	}
	
	@Test
	public void testJamesChp2NumVerses(){
		assertEquals(26, JAMES.getNumVersesInChp(2));
	}
	
	@Test
	public void testJamesChp3NumVerses(){
		assertEquals(18, JAMES.getNumVersesInChp(3));
	}
	
	@Test
	public void testJamesChp4NumVerses(){
		assertEquals(17, JAMES.getNumVersesInChp(4));
	}
	
	@Test
	public void testJamesChp5NumVerses(){
		assertEquals(20, JAMES.getNumVersesInChp(5));
	}
}
