package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.HOSEA;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HoseaBibleBooksTest{
	
	@Test
	public void testHoseaName(){
		assertEquals("Hosea", HOSEA.getName());
	}
	
	@Test
	public void testHoseaAuthor(){
		assertEquals("Hosea", HOSEA.getAuthor());
	}
	
	@Test
	public void testHoseaAliases(){
		assertEquals(ListUtil.createList("Hos", "Ho"), HOSEA.getAliases());
	}
	
	@Test
	public void testHoseaChapters(){
		assertEquals(ListUtil.createList(11, 23, 5, 19, 15, 11, 16, 14, 17, 15, 12, 14, 16, 9), HOSEA.getChapters());
	}
	
	@Test
	public void testHoseaNumChapters(){
		assertEquals(14, HOSEA.getNumChapters());
	}
	
	@Test
	public void testHoseaChp1NumVerses(){
		assertEquals(11, HOSEA.getNumVersesInChp(1));
	}
	
	@Test
	public void testHoseaChp2NumVerses(){
		assertEquals(23, HOSEA.getNumVersesInChp(2));
	}
	
	@Test
	public void testHoseaChp3NumVerses(){
		assertEquals(5, HOSEA.getNumVersesInChp(3));
	}
	
	@Test
	public void testHoseaChp4NumVerses(){
		assertEquals(19, HOSEA.getNumVersesInChp(4));
	}
	
	@Test
	public void testHoseaChp5NumVerses(){
		assertEquals(15, HOSEA.getNumVersesInChp(5));
	}
	
	@Test
	public void testHoseaChp6NumVerses(){
		assertEquals(11, HOSEA.getNumVersesInChp(6));
	}
	
	@Test
	public void testHoseaChp7NumVerses(){
		assertEquals(16, HOSEA.getNumVersesInChp(7));
	}
	
	@Test
	public void testHoseaChp8NumVerses(){
		assertEquals(14, HOSEA.getNumVersesInChp(8));
	}
	
	@Test
	public void testHoseaChp9NumVerses(){
		assertEquals(17, HOSEA.getNumVersesInChp(9));
	}
	
	@Test
	public void testHoseaChp10NumVerses(){
		assertEquals(15, HOSEA.getNumVersesInChp(10));
	}
	
	@Test
	public void testHoseaChp11NumVerses(){
		assertEquals(12, HOSEA.getNumVersesInChp(11));
	}
	
	@Test
	public void testHoseaChp12NumVerses(){
		assertEquals(14, HOSEA.getNumVersesInChp(12));
	}
	
	@Test
	public void testHoseaChp13NumVerses(){
		assertEquals(16, HOSEA.getNumVersesInChp(13));
	}
	
	@Test
	public void testHoseaChp14NumVerses(){
		assertEquals(9, HOSEA.getNumVersesInChp(14));
	}
	
	@Test
	public void testFromName(){
		assertEquals(HOSEA, BibleBooks.fromName("Hosea"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(HOSEA, BibleBooks.fromString("Hosea"));
	}
	
	@Test
	public void testFromAliasHos(){
		assertEquals(HOSEA, BibleBooks.fromString("Hos"));
	}
	
	@Test
	public void testFromAliasHo(){
		assertEquals(HOSEA, BibleBooks.fromString("Ho"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(HOSEA, BibleBooks.fromInt(28));
	}
}
