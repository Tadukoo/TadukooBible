package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.GALATIANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GalatiansVerseTest{
	
	@Test
	public void testGalatiansChp1NumVerses(){
		assertEquals(24, GALATIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testGalatiansChp2NumVerses(){
		assertEquals(21, GALATIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testGalatiansChp3NumVerses(){
		assertEquals(29, GALATIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testGalatiansChp4NumVerses(){
		assertEquals(31, GALATIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void testGalatiansChp5NumVerses(){
		assertEquals(26, GALATIANS.getNumVersesInChp(5));
	}
	
	@Test
	public void testGalatiansChp6NumVerses(){
		assertEquals(18, GALATIANS.getNumVersesInChp(6));
	}
}
