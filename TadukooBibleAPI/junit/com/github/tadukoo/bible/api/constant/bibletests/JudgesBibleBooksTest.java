package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.JUDGES;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JudgesBibleBooksTest{
	
	@Test
	public void testJudgesName(){
		assertEquals("Judges", JUDGES.getName());
	}
	
	@Test
	public void testJudgesAuthor(){
		assertEquals("Samuel", JUDGES.getAuthor());
	}
	
	@Test
	public void testJudgesAliases(){
		assertEquals(ListUtil.createList("Jud"), JUDGES.getAliases());
	}
	
	@Test
	public void testJudgesChapters(){
		assertEquals(ListUtil.createList(36, 23, 31, 24, 31, 40, 25, 35, 57, 18, 40, 15, 25, 20, 20, 31, 13, 31, 30, 48, 25), JUDGES.getChapters());
	}
	
	@Test
	public void testJudgesNumChapters(){
		assertEquals(21, JUDGES.getNumChapters());
	}
	
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
	
	@Test
	public void testFromName(){
		assertEquals(JUDGES, BibleBooks.fromName("Judges"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(JUDGES, BibleBooks.fromString("Judges"));
	}
	
	@Test
	public void testFromAliasJud(){
		assertEquals(JUDGES, BibleBooks.fromString("Jud"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(JUDGES, BibleBooks.fromInt(7));
	}
}
