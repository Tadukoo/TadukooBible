package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.AMOS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmosBibleBooksTest{
	
	@Test
	public void testAmosName(){
		assertEquals("Amos", AMOS.getName());
	}
	
	@Test
	public void testAmosAuthor(){
		assertEquals("Amos", AMOS.getAuthor());
	}
	
	@Test
	public void testAmosAliases(){
		assertEquals(ListUtil.createList("Am"), AMOS.getAliases());
	}
	
	@Test
	public void testAmosChapters(){
		assertEquals(ListUtil.createList(15, 16, 15, 13, 27, 14, 17, 14, 15), AMOS.getChapters());
	}
	
	@Test
	public void testAmosNumChapters(){
		assertEquals(9, AMOS.getNumChapters());
	}
	
	@Test
	public void testAmosChp1NumVerses(){
		assertEquals(15, AMOS.getNumVersesInChp(1));
	}
	
	@Test
	public void testAmosChp2NumVerses(){
		assertEquals(16, AMOS.getNumVersesInChp(2));
	}
	
	@Test
	public void testAmosChp3NumVerses(){
		assertEquals(15, AMOS.getNumVersesInChp(3));
	}
	
	@Test
	public void testAmosChp4NumVerses(){
		assertEquals(13, AMOS.getNumVersesInChp(4));
	}
	
	@Test
	public void testAmosChp5NumVerses(){
		assertEquals(27, AMOS.getNumVersesInChp(5));
	}
	
	@Test
	public void testAmosChp6NumVerses(){
		assertEquals(14, AMOS.getNumVersesInChp(6));
	}
	
	@Test
	public void testAmosChp7NumVerses(){
		assertEquals(17, AMOS.getNumVersesInChp(7));
	}
	
	@Test
	public void testAmosChp8NumVerses(){
		assertEquals(14, AMOS.getNumVersesInChp(8));
	}
	
	@Test
	public void testAmosChp9NumVerses(){
		assertEquals(15, AMOS.getNumVersesInChp(9));
	}
	
	@Test
	public void testFromName(){
		assertEquals(AMOS, BibleBooks.fromName("Amos"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(AMOS, BibleBooks.fromString("Amos"));
	}
	
	@Test
	public void testFromAliasAm(){
		assertEquals(AMOS, BibleBooks.fromString("Am"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(AMOS, BibleBooks.fromInt(30));
	}
}
