package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.NEHEMIAH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NehemiahBibleBooksTest{
	
	@Test
	public void testNehemiahName(){
		assertEquals("Nehemiah", NEHEMIAH.getName());
	}
	
	@Test
	public void testNehemiahAuthor(){
		assertEquals("Ezra", NEHEMIAH.getAuthor());
	}
	
	@Test
	public void testNehemiahAliases(){
		assertEquals(ListUtil.createList("Neh", "Ne"), NEHEMIAH.getAliases());
	}
	
	@Test
	public void testNehemiahChapters(){
		assertEquals(ListUtil.createList(11, 20, 32, 23, 19, 19, 73, 18, 38, 39, 36, 47, 31), NEHEMIAH.getChapters());
	}
	
	@Test
	public void testNehemiahNumChapters(){
		assertEquals(13, NEHEMIAH.getNumChapters());
	}
	
	@Test
	public void testNehemiahChp1NumVerses(){
		assertEquals(11, NEHEMIAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testNehemiahChp2NumVerses(){
		assertEquals(20, NEHEMIAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testNehemiahChp3NumVerses(){
		assertEquals(32, NEHEMIAH.getNumVersesInChp(3));
	}
	
	@Test
	public void testNehemiahChp4NumVerses(){
		assertEquals(23, NEHEMIAH.getNumVersesInChp(4));
	}
	
	@Test
	public void testNehemiahChp5NumVerses(){
		assertEquals(19, NEHEMIAH.getNumVersesInChp(5));
	}
	
	@Test
	public void testNehemiahChp6NumVerses(){
		assertEquals(19, NEHEMIAH.getNumVersesInChp(6));
	}
	
	@Test
	public void testNehemiahChp7NumVerses(){
		assertEquals(73, NEHEMIAH.getNumVersesInChp(7));
	}
	
	@Test
	public void testNehemiahChp8NumVerses(){
		assertEquals(18, NEHEMIAH.getNumVersesInChp(8));
	}
	
	@Test
	public void testNehemiahChp9NumVerses(){
		assertEquals(38, NEHEMIAH.getNumVersesInChp(9));
	}
	
	@Test
	public void testNehemiahChp10NumVerses(){
		assertEquals(39, NEHEMIAH.getNumVersesInChp(10));
	}
	
	@Test
	public void testNehemiahChp11NumVerses(){
		assertEquals(36, NEHEMIAH.getNumVersesInChp(11));
	}
	
	@Test
	public void testNehemiahChp12NumVerses(){
		assertEquals(47, NEHEMIAH.getNumVersesInChp(12));
	}
	
	@Test
	public void testNehemiahChp13NumVerses(){
		assertEquals(31, NEHEMIAH.getNumVersesInChp(13));
	}
	
	@Test
	public void testFromName(){
		assertEquals(NEHEMIAH, BibleBooks.fromName("Nehemiah"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(NEHEMIAH, BibleBooks.fromString("Nehemiah"));
	}
	
	@Test
	public void testFromAliasNeh(){
		assertEquals(NEHEMIAH, BibleBooks.fromString("Neh"));
	}
	
	@Test
	public void testFromAliasNe(){
		assertEquals(NEHEMIAH, BibleBooks.fromString("Ne"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(NEHEMIAH, BibleBooks.fromInt(16));
	}
}
