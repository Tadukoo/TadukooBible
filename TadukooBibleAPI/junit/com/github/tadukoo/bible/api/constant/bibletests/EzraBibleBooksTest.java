package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.EZRA;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EzraBibleBooksTest{
	
	@Test
	public void testEzraName(){
		assertEquals("Ezra", EZRA.getName());
	}
	
	@Test
	public void testEzraAuthor(){
		assertEquals("Ezra", EZRA.getAuthor());
	}
	
	@Test
	public void testEzraAliases(){
		assertEquals(ListUtil.createList("Ezr"), EZRA.getAliases());
	}
	
	@Test
	public void testEzraChapters(){
		assertEquals(ListUtil.createList(11, 70, 13, 24, 17, 22, 28, 36, 15, 44), EZRA.getChapters());
	}
	
	@Test
	public void testEzraNumChapters(){
		assertEquals(10, EZRA.getNumChapters());
	}
	
	@Test
	public void testEzraChp1NumVerses(){
		assertEquals(11, EZRA.getNumVersesInChp(1));
	}
	
	@Test
	public void testEzraChp2NumVerses(){
		assertEquals(70, EZRA.getNumVersesInChp(2));
	}
	
	@Test
	public void testEzraChp3NumVerses(){
		assertEquals(13, EZRA.getNumVersesInChp(3));
	}
	
	@Test
	public void testEzraChp4NumVerses(){
		assertEquals(24, EZRA.getNumVersesInChp(4));
	}
	
	@Test
	public void testEzraChp5NumVerses(){
		assertEquals(17, EZRA.getNumVersesInChp(5));
	}
	
	@Test
	public void testEzraChp6NumVerses(){
		assertEquals(22, EZRA.getNumVersesInChp(6));
	}
	
	@Test
	public void testEzraChp7NumVerses(){
		assertEquals(28, EZRA.getNumVersesInChp(7));
	}
	
	@Test
	public void testEzraChp8NumVerses(){
		assertEquals(36, EZRA.getNumVersesInChp(8));
	}
	
	@Test
	public void testEzraChp9NumVerses(){
		assertEquals(15, EZRA.getNumVersesInChp(9));
	}
	
	@Test
	public void testEzraChp10NumVerses(){
		assertEquals(44, EZRA.getNumVersesInChp(10));
	}
	
	@Test
	public void testFromName(){
		assertEquals(EZRA, BibleBooks.fromName("Ezra"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(EZRA, BibleBooks.fromString("Ezra"));
	}
	
	@Test
	public void testFromAliasEzr(){
		assertEquals(EZRA, BibleBooks.fromString("Ezr"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(EZRA, BibleBooks.fromInt(15));
	}
}
