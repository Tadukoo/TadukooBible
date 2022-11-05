package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.OBADIAH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObadiahBibleBooksTest{
	
	@Test
	public void testObadiahName(){
		assertEquals("Obadiah", OBADIAH.getName());
	}
	
	@Test
	public void testObadiahAuthor(){
		assertEquals("Obadiah", OBADIAH.getAuthor());
	}
	
	@Test
	public void testObadiahAliases(){
		assertEquals(ListUtil.createList("Oba", "Ob"), OBADIAH.getAliases());
	}
	
	@Test
	public void testObadiahChapters(){
		assertEquals(ListUtil.createList(21), OBADIAH.getChapters());
	}
	
	@Test
	public void testObadiahNumChapters(){
		assertEquals(1, OBADIAH.getNumChapters());
	}
	
	@Test
	public void testObadiahChp1NumVerses(){
		assertEquals(21, OBADIAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testFromName(){
		assertEquals(OBADIAH, BibleBooks.fromName("Obadiah"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(OBADIAH, BibleBooks.fromString("Obadiah"));
	}
	
	@Test
	public void testFromAliasOba(){
		assertEquals(OBADIAH, BibleBooks.fromString("Oba"));
	}
	
	@Test
	public void testFromAliasOb(){
		assertEquals(OBADIAH, BibleBooks.fromString("Ob"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(OBADIAH, BibleBooks.fromInt(31));
	}
}
