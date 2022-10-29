package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.HABAKKUK;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HabakkukVerseTest{
	
	@Test
	public void testHabakkukChp1NumVerses(){
		assertEquals(17, HABAKKUK.getNumVersesInChp(1));
	}
	
	@Test
	public void testHabakkukChp2NumVerses(){
		assertEquals(20, HABAKKUK.getNumVersesInChp(2));
	}
	
	@Test
	public void testHabakkukChp3NumVerses(){
		assertEquals(19, HABAKKUK.getNumVersesInChp(3));
	}
}
