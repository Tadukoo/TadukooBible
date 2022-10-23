package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.MALACHI;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MalachiVerseTest{
	
	@Test
	public void testMalachiChp1NumVerses(){
		assertEquals(14, MALACHI.getNumVersesInChp(1));
	}
	
	@Test
	public void testMalachiChp2NumVerses(){
		assertEquals(17, MALACHI.getNumVersesInChp(2));
	}
	
	@Test
	public void testMalachiChp3NumVerses(){
		assertEquals(18, MALACHI.getNumVersesInChp(3));
	}
	
	@Test
	public void testMalachiChp4NumVerses(){
		assertEquals(6, MALACHI.getNumVersesInChp(4));
	}
}
