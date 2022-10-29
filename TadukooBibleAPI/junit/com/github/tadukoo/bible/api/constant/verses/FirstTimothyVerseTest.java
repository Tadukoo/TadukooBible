package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.FIRST_TIMOTHY;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTimothyVerseTest{
	
	@Test
	public void testFirstTimothyChp1NumVerses(){
		assertEquals(20, FIRST_TIMOTHY.getNumVersesInChp(1));
	}
	
	@Test
	public void testFirstTimothyChp2NumVerses(){
		assertEquals(15, FIRST_TIMOTHY.getNumVersesInChp(2));
	}
	
	@Test
	public void testFirstTimothyChp3NumVerses(){
		assertEquals(16, FIRST_TIMOTHY.getNumVersesInChp(3));
	}
	
	@Test
	public void testFirstTimothyChp4NumVerses(){
		assertEquals(16, FIRST_TIMOTHY.getNumVersesInChp(4));
	}
	
	@Test
	public void testFirstTimothyChp5NumVerses(){
		assertEquals(25, FIRST_TIMOTHY.getNumVersesInChp(5));
	}
	
	@Test
	public void testFirstTimothyChp6NumVerses(){
		assertEquals(21, FIRST_TIMOTHY.getNumVersesInChp(6));
	}
}
