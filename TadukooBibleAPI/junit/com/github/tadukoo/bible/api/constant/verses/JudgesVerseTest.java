package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.JUDGES;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JudgesVerseTest{
	
	@Test
	public void testJudgesChp1NumVerses(){
		assertEquals(36, JUDGES.getNumVersesInChp(1));
	}
	
	@Test
	public void testJudgesChp2NumVerses(){
		assertEquals(23, JUDGES.getNumVersesInChp(2));
	}
	
	@Test
	public void testJudgesChp3NumVerses(){
		assertEquals(31, JUDGES.getNumVersesInChp(3));
	}
	
	@Test
	public void testJudgesChp4NumVerses(){
		assertEquals(24, JUDGES.getNumVersesInChp(4));
	}
	
	@Test
	public void testJudgesChp5NumVerses(){
		assertEquals(31, JUDGES.getNumVersesInChp(5));
	}
	
	@Test
	public void testJudgesChp6NumVerses(){
		assertEquals(40, JUDGES.getNumVersesInChp(6));
	}
	
	@Test
	public void testJudgesChp7NumVerses(){
		assertEquals(25, JUDGES.getNumVersesInChp(7));
	}
	
	@Test
	public void testJudgesChp8NumVerses(){
		assertEquals(35, JUDGES.getNumVersesInChp(8));
	}
	
	@Test
	public void testJudgesChp9NumVerses(){
		assertEquals(57, JUDGES.getNumVersesInChp(9));
	}
	
	@Test
	public void testJudgesChp10NumVerses(){
		assertEquals(18, JUDGES.getNumVersesInChp(10));
	}
	
	@Test
	public void testJudgesChp11NumVerses(){
		assertEquals(40, JUDGES.getNumVersesInChp(11));
	}
	
	@Test
	public void testJudgesChp12NumVerses(){
		assertEquals(15, JUDGES.getNumVersesInChp(12));
	}
	
	@Test
	public void testJudgesChp13NumVerses(){
		assertEquals(25, JUDGES.getNumVersesInChp(13));
	}
	
	@Test
	public void testJudgesChp14NumVerses(){
		assertEquals(20, JUDGES.getNumVersesInChp(14));
	}
	
	@Test
	public void testJudgesChp15NumVerses(){
		assertEquals(20, JUDGES.getNumVersesInChp(15));
	}
	
	@Test
	public void testJudgesChp16NumVerses(){
		assertEquals(31, JUDGES.getNumVersesInChp(16));
	}
	
	@Test
	public void testJudgesChp17NumVerses(){
		assertEquals(13, JUDGES.getNumVersesInChp(17));
	}
	
	@Test
	public void testJudgesChp18NumVerses(){
		assertEquals(31, JUDGES.getNumVersesInChp(18));
	}
	
	@Test
	public void testJudgesChp19NumVerses(){
		assertEquals(30, JUDGES.getNumVersesInChp(19));
	}
	
	@Test
	public void testJudgesChp20NumVerses(){
		assertEquals(48, JUDGES.getNumVersesInChp(20));
	}
	
	@Test
	public void testJudgesChp21NumVerses(){
		assertEquals(25, JUDGES.getNumVersesInChp(21));
	}
}
