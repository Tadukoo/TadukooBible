package com.github.tadukoo.bible.api.Constants.Verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.ROMANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomansVerseTest{
	
	@Test
	public void testRomansChp1NumVerses(){
		assertEquals(32, ROMANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testRomansChp2NumVerses(){
		assertEquals(29, ROMANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testRomansChp3NumVerses(){
		assertEquals(31, ROMANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testRomansChp4NumVerses(){
		assertEquals(25, ROMANS.getNumVersesInChp(4));
	}
	
	@Test
	public void testRomansChp5NumVerses(){
		assertEquals(21, ROMANS.getNumVersesInChp(5));
	}
	
	@Test
	public void testRomansChp6NumVerses(){
		assertEquals(23, ROMANS.getNumVersesInChp(6));
	}
	
	@Test
	public void testRomansChp7NumVerses(){
		assertEquals(25, ROMANS.getNumVersesInChp(7));
	}
	
	@Test
	public void testRomansChp8NumVerses(){
		assertEquals(39, ROMANS.getNumVersesInChp(8));
	}
	
	@Test
	public void testRomansChp9NumVerses(){
		assertEquals(33, ROMANS.getNumVersesInChp(9));
	}
	
	@Test
	public void testRomansChp10NumVerses(){
		assertEquals(21, ROMANS.getNumVersesInChp(10));
	}
	
	@Test
	public void testRomansChp11NumVerses(){
		assertEquals(36, ROMANS.getNumVersesInChp(11));
	}
	
	@Test
	public void testRomansChp12NumVerses(){
		assertEquals(21, ROMANS.getNumVersesInChp(12));
	}
	
	@Test
	public void testRomansChp13NumVerses(){
		assertEquals(14, ROMANS.getNumVersesInChp(13));
	}
	
	@Test
	public void testRomansChp14NumVerses(){
		assertEquals(23, ROMANS.getNumVersesInChp(14));
	}
	
	@Test
	public void testRomansChp15NumVerses(){
		assertEquals(33, ROMANS.getNumVersesInChp(15));
	}
	
	@Test
	public void testRomansChp16NumVerses(){
		assertEquals(27, ROMANS.getNumVersesInChp(16));
	}
}
