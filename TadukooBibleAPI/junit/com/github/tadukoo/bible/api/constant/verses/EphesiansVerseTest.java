package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.EPHESIANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EphesiansVerseTest{
	
	@Test
	public void testEphesiansChp1NumVerses(){
		assertEquals(23, EPHESIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testEphesiansChp2NumVerses(){
		assertEquals(22, EPHESIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testEphesiansChp3NumVerses(){
		assertEquals(21, EPHESIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testEphesiansChp4NumVerses(){
		assertEquals(32, EPHESIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void testEphesiansChp5NumVerses(){
		assertEquals(33, EPHESIANS.getNumVersesInChp(5));
	}
	
	@Test
	public void testEphesiansChp6NumVerses(){
		assertEquals(24, EPHESIANS.getNumVersesInChp(6));
	}
}
