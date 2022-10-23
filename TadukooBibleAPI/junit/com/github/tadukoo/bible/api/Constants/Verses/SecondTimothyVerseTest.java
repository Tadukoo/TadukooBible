package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.SECOND_TIMOTHY;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondTimothyVerseTest{
	
	@Test
	public void testSecondTimothyChp1NumVerses(){
		assertEquals(18, SECOND_TIMOTHY.getNumVersesInChp(1));
	}
	
	@Test
	public void testSecondTimothyChp2NumVerses(){
		assertEquals(26, SECOND_TIMOTHY.getNumVersesInChp(2));
	}
	
	@Test
	public void testSecondTimothyChp3NumVerses(){
		assertEquals(17, SECOND_TIMOTHY.getNumVersesInChp(3));
	}
	
	@Test
	public void testSecondTimothyChp4NumVerses(){
		assertEquals(22, SECOND_TIMOTHY.getNumVersesInChp(4));
	}
}
