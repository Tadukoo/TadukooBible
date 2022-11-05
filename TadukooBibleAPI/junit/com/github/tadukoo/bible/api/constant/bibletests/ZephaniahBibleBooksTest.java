package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.ZEPHANIAH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZephaniahBibleBooksTest{
	
	@Test
	public void testZephaniahName(){
		assertEquals("Zephaniah", ZEPHANIAH.getName());
	}
	
	@Test
	public void testZephaniahAuthor(){
		assertEquals("Zephaniah", ZEPHANIAH.getAuthor());
	}
	
	@Test
	public void testZephaniahAliases(){
		assertEquals(ListUtil.createList("Zep"), ZEPHANIAH.getAliases());
	}
	
	@Test
	public void testZephaniahChapters(){
		assertEquals(ListUtil.createList(18, 15, 20), ZEPHANIAH.getChapters());
	}
	
	@Test
	public void testZephaniahNumChapters(){
		assertEquals(3, ZEPHANIAH.getNumChapters());
	}
	
	@Test
	public void testZephaniahChp1NumVerses(){
		assertEquals(18, ZEPHANIAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testZephaniahChp2NumVerses(){
		assertEquals(15, ZEPHANIAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testZephaniahChp3NumVerses(){
		assertEquals(20, ZEPHANIAH.getNumVersesInChp(3));
	}
	
	@Test
	public void testFromName(){
		assertEquals(ZEPHANIAH, BibleBooks.fromName("Zephaniah"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(ZEPHANIAH, BibleBooks.fromString("Zephaniah"));
	}
	
	@Test
	public void testFromAliasZep(){
		assertEquals(ZEPHANIAH, BibleBooks.fromString("Zep"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(ZEPHANIAH, BibleBooks.fromInt(36));
	}
}
