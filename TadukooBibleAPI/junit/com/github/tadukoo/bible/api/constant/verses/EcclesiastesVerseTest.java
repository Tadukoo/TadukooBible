package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.ECCLESIASTES;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EcclesiastesVerseTest{
	
	@Test
	public void testEcclesiastesChp1NumVerses(){
		assertEquals(18, ECCLESIASTES.getNumVersesInChp(1));
	}
	
	@Test
	public void testEcclesiastesChp2NumVerses(){
		assertEquals(26, ECCLESIASTES.getNumVersesInChp(2));
	}
	
	@Test
	public void testEcclesiastesChp3NumVerses(){
		assertEquals(22, ECCLESIASTES.getNumVersesInChp(3));
	}
	
	@Test
	public void testEcclesiastesChp4NumVerses(){
		assertEquals(16, ECCLESIASTES.getNumVersesInChp(4));
	}
	
	@Test
	public void testEcclesiastesChp5NumVerses(){
		assertEquals(20, ECCLESIASTES.getNumVersesInChp(5));
	}
	
	@Test
	public void testEcclesiastesChp6NumVerses(){
		assertEquals(12, ECCLESIASTES.getNumVersesInChp(6));
	}
	
	@Test
	public void testEcclesiastesChp7NumVerses(){
		assertEquals(29, ECCLESIASTES.getNumVersesInChp(7));
	}
	
	@Test
	public void testEcclesiastesChp8NumVerses(){
		assertEquals(17, ECCLESIASTES.getNumVersesInChp(8));
	}
	
	@Test
	public void testEcclesiastesChp9NumVerses(){
		assertEquals(18, ECCLESIASTES.getNumVersesInChp(9));
	}
	
	@Test
	public void testEcclesiastesChp10NumVerses(){
		assertEquals(20, ECCLESIASTES.getNumVersesInChp(10));
	}
	
	@Test
	public void testEcclesiastesChp11NumVerses(){
		assertEquals(10, ECCLESIASTES.getNumVersesInChp(11));
	}
	
	@Test
	public void testEcclesiastesChp12NumVerses(){
		assertEquals(14, ECCLESIASTES.getNumVersesInChp(12));
	}
}
