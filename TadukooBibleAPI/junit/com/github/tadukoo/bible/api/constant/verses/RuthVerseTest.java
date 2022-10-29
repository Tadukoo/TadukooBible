package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.RUTH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RuthVerseTest{
	
	@Test
	public void testRuthChp1NumVerses(){
		assertEquals(22, RUTH.getNumVersesInChp(1));
	}
	
	@Test
	public void testRuthChp2NumVerses(){
		assertEquals(23, RUTH.getNumVersesInChp(2));
	}
	
	@Test
	public void testRuthChp3NumVerses(){
		assertEquals(18, RUTH.getNumVersesInChp(3));
	}
	
	@Test
	public void testRuthChp4NumVerses(){
		assertEquals(22, RUTH.getNumVersesInChp(4));
	}
}
