package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.REVELATION;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RevelationVerseTest{
	
	@Test
	public void testRevelationChp1NumVerses(){
		assertEquals(20, REVELATION.getNumVersesInChp(1));
	}
	
	@Test
	public void testRevelationChp2NumVerses(){
		assertEquals(29, REVELATION.getNumVersesInChp(2));
	}
	
	@Test
	public void testRevelationChp3NumVerses(){
		assertEquals(22, REVELATION.getNumVersesInChp(3));
	}
	
	@Test
	public void testRevelationChp4NumVerses(){
		assertEquals(11, REVELATION.getNumVersesInChp(4));
	}
	
	@Test
	public void testRevelationChp5NumVerses(){
		assertEquals(14, REVELATION.getNumVersesInChp(5));
	}
	
	@Test
	public void testRevelationChp6NumVerses(){
		assertEquals(17, REVELATION.getNumVersesInChp(6));
	}
	
	@Test
	public void testRevelationChp7NumVerses(){
		assertEquals(17, REVELATION.getNumVersesInChp(7));
	}
	
	@Test
	public void testRevelationChp8NumVerses(){
		assertEquals(13, REVELATION.getNumVersesInChp(8));
	}
	
	@Test
	public void testRevelationChp9NumVerses(){
		assertEquals(21, REVELATION.getNumVersesInChp(9));
	}
	
	@Test
	public void testRevelationChp10NumVerses(){
		assertEquals(11, REVELATION.getNumVersesInChp(10));
	}
	
	@Test
	public void testRevelationChp11NumVerses(){
		assertEquals(19, REVELATION.getNumVersesInChp(11));
	}
	
	@Test
	public void testRevelationChp12NumVerses(){
		assertEquals(17, REVELATION.getNumVersesInChp(12));
	}
	
	@Test
	public void testRevelationChp13NumVerses(){
		assertEquals(18, REVELATION.getNumVersesInChp(13));
	}
	
	@Test
	public void testRevelationChp14NumVerses(){
		assertEquals(20, REVELATION.getNumVersesInChp(14));
	}
	
	@Test
	public void testRevelationChp15NumVerses(){
		assertEquals(8, REVELATION.getNumVersesInChp(15));
	}
	
	@Test
	public void testRevelationChp16NumVerses(){
		assertEquals(21, REVELATION.getNumVersesInChp(16));
	}
	
	@Test
	public void testRevelationChp17NumVerses(){
		assertEquals(18, REVELATION.getNumVersesInChp(17));
	}
	
	@Test
	public void testRevelationChp18NumVerses(){
		assertEquals(24, REVELATION.getNumVersesInChp(18));
	}
	
	@Test
	public void testRevelationChp19NumVerses(){
		assertEquals(21, REVELATION.getNumVersesInChp(19));
	}
	
	@Test
	public void testRevelationChp20NumVerses(){
		assertEquals(15, REVELATION.getNumVersesInChp(20));
	}
	
	@Test
	public void testRevelationChp21NumVerses(){
		assertEquals(27, REVELATION.getNumVersesInChp(21));
	}
	
	@Test
	public void testRevelationChp22NumVerses(){
		assertEquals(21, REVELATION.getNumVersesInChp(22));
	}
}
