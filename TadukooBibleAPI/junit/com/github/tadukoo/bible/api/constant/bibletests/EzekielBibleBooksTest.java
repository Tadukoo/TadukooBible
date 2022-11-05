package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.EZEKIEL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EzekielBibleBooksTest{
	
	@Test
	public void testEzekielName(){
		assertEquals("Ezekiel", EZEKIEL.getName());
	}
	
	@Test
	public void testEzekielAuthor(){
		assertEquals("Ezekiel", EZEKIEL.getAuthor());
	}
	
	@Test
	public void testEzekielAliases(){
		assertEquals(ListUtil.createList("Eze"), EZEKIEL.getAliases());
	}
	
	@Test
	public void testEzekielChapters(){
		assertEquals(ListUtil.createList(28, 10, 27, 17, 17, 14, 27, 18, 11, 22, 25, 28, 23, 23, 8, 63, 24, 32, 14, 49, 32, 31, 49, 27, 17, 21, 36, 26, 21, 26, 18, 32, 33, 31, 15, 38, 28, 23, 29, 49, 26, 20, 27, 31, 25, 24, 23, 35), EZEKIEL.getChapters());
	}
	
	@Test
	public void testEzekielNumChapters(){
		assertEquals(48, EZEKIEL.getNumChapters());
	}
	
	@Test
	public void testEzekielChp1NumVerses(){
		assertEquals(28, EZEKIEL.getNumVersesInChp(1));
	}
	
	@Test
	public void testEzekielChp2NumVerses(){
		assertEquals(10, EZEKIEL.getNumVersesInChp(2));
	}
	
	@Test
	public void testEzekielChp3NumVerses(){
		assertEquals(27, EZEKIEL.getNumVersesInChp(3));
	}
	
	@Test
	public void testEzekielChp4NumVerses(){
		assertEquals(17, EZEKIEL.getNumVersesInChp(4));
	}
	
	@Test
	public void testEzekielChp5NumVerses(){
		assertEquals(17, EZEKIEL.getNumVersesInChp(5));
	}
	
	@Test
	public void testEzekielChp6NumVerses(){
		assertEquals(14, EZEKIEL.getNumVersesInChp(6));
	}
	
	@Test
	public void testEzekielChp7NumVerses(){
		assertEquals(27, EZEKIEL.getNumVersesInChp(7));
	}
	
	@Test
	public void testEzekielChp8NumVerses(){
		assertEquals(18, EZEKIEL.getNumVersesInChp(8));
	}
	
	@Test
	public void testEzekielChp9NumVerses(){
		assertEquals(11, EZEKIEL.getNumVersesInChp(9));
	}
	
	@Test
	public void testEzekielChp10NumVerses(){
		assertEquals(22, EZEKIEL.getNumVersesInChp(10));
	}
	
	@Test
	public void testEzekielChp11NumVerses(){
		assertEquals(25, EZEKIEL.getNumVersesInChp(11));
	}
	
	@Test
	public void testEzekielChp12NumVerses(){
		assertEquals(28, EZEKIEL.getNumVersesInChp(12));
	}
	
	@Test
	public void testEzekielChp13NumVerses(){
		assertEquals(23, EZEKIEL.getNumVersesInChp(13));
	}
	
	@Test
	public void testEzekielChp14NumVerses(){
		assertEquals(23, EZEKIEL.getNumVersesInChp(14));
	}
	
	@Test
	public void testEzekielChp15NumVerses(){
		assertEquals(8, EZEKIEL.getNumVersesInChp(15));
	}
	
	@Test
	public void testEzekielChp16NumVerses(){
		assertEquals(63, EZEKIEL.getNumVersesInChp(16));
	}
	
	@Test
	public void testEzekielChp17NumVerses(){
		assertEquals(24, EZEKIEL.getNumVersesInChp(17));
	}
	
	@Test
	public void testEzekielChp18NumVerses(){
		assertEquals(32, EZEKIEL.getNumVersesInChp(18));
	}
	
	@Test
	public void testEzekielChp19NumVerses(){
		assertEquals(14, EZEKIEL.getNumVersesInChp(19));
	}
	
	@Test
	public void testEzekielChp20NumVerses(){
		assertEquals(49, EZEKIEL.getNumVersesInChp(20));
	}
	
	@Test
	public void testEzekielChp21NumVerses(){
		assertEquals(32, EZEKIEL.getNumVersesInChp(21));
	}
	
	@Test
	public void testEzekielChp22NumVerses(){
		assertEquals(31, EZEKIEL.getNumVersesInChp(22));
	}
	
	@Test
	public void testEzekielChp23NumVerses(){
		assertEquals(49, EZEKIEL.getNumVersesInChp(23));
	}
	
	@Test
	public void testEzekielChp24NumVerses(){
		assertEquals(27, EZEKIEL.getNumVersesInChp(24));
	}
	
	@Test
	public void testEzekielChp25NumVerses(){
		assertEquals(17, EZEKIEL.getNumVersesInChp(25));
	}
	
	@Test
	public void testEzekielChp26NumVerses(){
		assertEquals(21, EZEKIEL.getNumVersesInChp(26));
	}
	
	@Test
	public void testEzekielChp27NumVerses(){
		assertEquals(36, EZEKIEL.getNumVersesInChp(27));
	}
	
	@Test
	public void testEzekielChp28NumVerses(){
		assertEquals(26, EZEKIEL.getNumVersesInChp(28));
	}
	
	@Test
	public void testEzekielChp29NumVerses(){
		assertEquals(21, EZEKIEL.getNumVersesInChp(29));
	}
	
	@Test
	public void testEzekielChp30NumVerses(){
		assertEquals(26, EZEKIEL.getNumVersesInChp(30));
	}
	
	@Test
	public void testEzekielChp31NumVerses(){
		assertEquals(18, EZEKIEL.getNumVersesInChp(31));
	}
	
	@Test
	public void testEzekielChp32NumVerses(){
		assertEquals(32, EZEKIEL.getNumVersesInChp(32));
	}
	
	@Test
	public void testEzekielChp33NumVerses(){
		assertEquals(33, EZEKIEL.getNumVersesInChp(33));
	}
	
	@Test
	public void testEzekielChp34NumVerses(){
		assertEquals(31, EZEKIEL.getNumVersesInChp(34));
	}
	
	@Test
	public void testEzekielChp35NumVerses(){
		assertEquals(15, EZEKIEL.getNumVersesInChp(35));
	}
	
	@Test
	public void testEzekielChp36NumVerses(){
		assertEquals(38, EZEKIEL.getNumVersesInChp(36));
	}
	
	@Test
	public void testEzekielChp37NumVerses(){
		assertEquals(28, EZEKIEL.getNumVersesInChp(37));
	}
	
	@Test
	public void testEzekielChp38NumVerses(){
		assertEquals(23, EZEKIEL.getNumVersesInChp(38));
	}
	
	@Test
	public void testEzekielChp39NumVerses(){
		assertEquals(29, EZEKIEL.getNumVersesInChp(39));
	}
	
	@Test
	public void testEzekielChp40NumVerses(){
		assertEquals(49, EZEKIEL.getNumVersesInChp(40));
	}
	
	@Test
	public void testEzekielChp41NumVerses(){
		assertEquals(26, EZEKIEL.getNumVersesInChp(41));
	}
	
	@Test
	public void testEzekielChp42NumVerses(){
		assertEquals(20, EZEKIEL.getNumVersesInChp(42));
	}
	
	@Test
	public void testEzekielChp43NumVerses(){
		assertEquals(27, EZEKIEL.getNumVersesInChp(43));
	}
	
	@Test
	public void testEzekielChp44NumVerses(){
		assertEquals(31, EZEKIEL.getNumVersesInChp(44));
	}
	
	@Test
	public void testEzekielChp45NumVerses(){
		assertEquals(25, EZEKIEL.getNumVersesInChp(45));
	}
	
	@Test
	public void testEzekielChp46NumVerses(){
		assertEquals(24, EZEKIEL.getNumVersesInChp(46));
	}
	
	@Test
	public void testEzekielChp47NumVerses(){
		assertEquals(23, EZEKIEL.getNumVersesInChp(47));
	}
	
	@Test
	public void testEzekielChp48NumVerses(){
		assertEquals(35, EZEKIEL.getNumVersesInChp(48));
	}
	
	@Test
	public void testFromName(){
		assertEquals(EZEKIEL, BibleBooks.fromName("Ezekiel"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(EZEKIEL, BibleBooks.fromString("Ezekiel"));
	}
	
	@Test
	public void testFromAliasEze(){
		assertEquals(EZEKIEL, BibleBooks.fromString("Eze"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(EZEKIEL, BibleBooks.fromInt(26));
	}
}
