package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.REVELATION;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RevelationBibleBooksTest{
	
	@Test
	public void testRevelationName(){
		assertEquals("Revelation", REVELATION.getName());
	}
	
	@Test
	public void testRevelationAuthor(){
		assertEquals("John", REVELATION.getAuthor());
	}
	
	@Test
	public void testRevelationAliases(){
		assertEquals(ListUtil.createList("Rev", "Re"), REVELATION.getAliases());
	}
	
	@Test
	public void testRevelationChapters(){
		assertEquals(ListUtil.createList(20, 29, 22, 11, 14, 17, 17, 13, 21, 11, 19, 17, 18, 20, 8, 21, 18, 24, 21, 15, 27, 21), REVELATION.getChapters());
	}
	
	@Test
	public void testRevelationNumChapters(){
		assertEquals(22, REVELATION.getNumChapters());
	}
	
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
	
	@Test
	public void testFromName(){
		assertEquals(REVELATION, BibleBooks.fromName("Revelation"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(REVELATION, BibleBooks.fromString("Revelation"));
	}
	
	@Test
	public void testFromAliasRev(){
		assertEquals(REVELATION, BibleBooks.fromString("Rev"));
	}
	
	@Test
	public void testFromAliasRe(){
		assertEquals(REVELATION, BibleBooks.fromString("Re"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(REVELATION, BibleBooks.fromInt(66));
	}
}
