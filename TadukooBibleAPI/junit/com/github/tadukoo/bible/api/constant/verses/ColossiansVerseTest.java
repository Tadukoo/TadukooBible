package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.COLOSSIANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColossiansVerseTest{
	
	@Test
	public void testColossiansChp1NumVerses(){
		assertEquals(29, COLOSSIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testColossiansChp2NumVerses(){
		assertEquals(23, COLOSSIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testColossiansChp3NumVerses(){
		assertEquals(25, COLOSSIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testColossiansChp4NumVerses(){
		assertEquals(18, COLOSSIANS.getNumVersesInChp(4));
	}
}
