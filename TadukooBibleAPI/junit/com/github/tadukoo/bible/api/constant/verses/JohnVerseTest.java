package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.JOHN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JohnVerseTest{
	
	@Test
	public void testJohnChp1NumVerses(){
		assertEquals(51, JOHN.getNumVersesInChp(1));
	}
	
	@Test
	public void testJohnChp2NumVerses(){
		assertEquals(25, JOHN.getNumVersesInChp(2));
	}
	
	@Test
	public void testJohnChp3NumVerses(){
		assertEquals(36, JOHN.getNumVersesInChp(3));
	}
	
	@Test
	public void testJohnChp4NumVerses(){
		assertEquals(54, JOHN.getNumVersesInChp(4));
	}
	
	@Test
	public void testJohnChp5NumVerses(){
		assertEquals(47, JOHN.getNumVersesInChp(5));
	}
	
	@Test
	public void testJohnChp6NumVerses(){
		assertEquals(71, JOHN.getNumVersesInChp(6));
	}
	
	@Test
	public void testJohnChp7NumVerses(){
		assertEquals(53, JOHN.getNumVersesInChp(7));
	}
	
	@Test
	public void testJohnChp8NumVerses(){
		assertEquals(59, JOHN.getNumVersesInChp(8));
	}
	
	@Test
	public void testJohnChp9NumVerses(){
		assertEquals(41, JOHN.getNumVersesInChp(9));
	}
	
	@Test
	public void testJohnChp10NumVerses(){
		assertEquals(42, JOHN.getNumVersesInChp(10));
	}
	
	@Test
	public void testJohnChp11NumVerses(){
		assertEquals(57, JOHN.getNumVersesInChp(11));
	}
	
	@Test
	public void testJohnChp12NumVerses(){
		assertEquals(50, JOHN.getNumVersesInChp(12));
	}
	
	@Test
	public void testJohnChp13NumVerses(){
		assertEquals(38, JOHN.getNumVersesInChp(13));
	}
	
	@Test
	public void testJohnChp14NumVerses(){
		assertEquals(31, JOHN.getNumVersesInChp(14));
	}
	
	@Test
	public void testJohnChp15NumVerses(){
		assertEquals(27, JOHN.getNumVersesInChp(15));
	}
	
	@Test
	public void testJohnChp16NumVerses(){
		assertEquals(33, JOHN.getNumVersesInChp(16));
	}
	
	@Test
	public void testJohnChp17NumVerses(){
		assertEquals(26, JOHN.getNumVersesInChp(17));
	}
	
	@Test
	public void testJohnChp18NumVerses(){
		assertEquals(40, JOHN.getNumVersesInChp(18));
	}
	
	@Test
	public void testJohnChp19NumVerses(){
		assertEquals(42, JOHN.getNumVersesInChp(19));
	}
	
	@Test
	public void testJohnChp20NumVerses(){
		assertEquals(31, JOHN.getNumVersesInChp(20));
	}
	
	@Test
	public void testJohnChp21NumVerses(){
		assertEquals(25, JOHN.getNumVersesInChp(21));
	}
}
