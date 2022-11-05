package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.JONAH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JonahBibleBooksTest{
	
	@Test
	public void testJonahName(){
		assertEquals("Jonah", JONAH.getName());
	}
	
	@Test
	public void testJonahAuthor(){
		assertEquals("Jonah", JONAH.getAuthor());
	}
	
	@Test
	public void testJonahAliases(){
		assertEquals(ListUtil.createList("Jon"), JONAH.getAliases());
	}
	
	@Test
	public void testJonahChapters(){
		assertEquals(ListUtil.createList(17, 10, 10, 11), JONAH.getChapters());
	}
	
	@Test
	public void testJonahNumChapters(){
		assertEquals(4, JONAH.getNumChapters());
	}
	
	@Test
	public void testJonahChp1NumVerses(){
		assertEquals(17, JONAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testJonahChp2NumVerses(){
		assertEquals(10, JONAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testJonahChp3NumVerses(){
		assertEquals(10, JONAH.getNumVersesInChp(3));
	}
	
	@Test
	public void testJonahChp4NumVerses(){
		assertEquals(11, JONAH.getNumVersesInChp(4));
	}
	
	@Test
	public void testFromName(){
		assertEquals(JONAH, BibleBooks.fromName("Jonah"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(JONAH, BibleBooks.fromString("Jonah"));
	}
	
	@Test
	public void testFromAliasJon(){
		assertEquals(JONAH, BibleBooks.fromString("Jon"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(JONAH, BibleBooks.fromInt(32));
	}
}
