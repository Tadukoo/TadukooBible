package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.PHILIPPIANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhilippiansVerseTest{
	
	@Test
	public void testPhilippiansChp1NumVerses(){
		assertEquals(30, PHILIPPIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testPhilippiansChp2NumVerses(){
		assertEquals(30, PHILIPPIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testPhilippiansChp3NumVerses(){
		assertEquals(21, PHILIPPIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testPhilippiansChp4NumVerses(){
		assertEquals(23, PHILIPPIANS.getNumVersesInChp(4));
	}
}
