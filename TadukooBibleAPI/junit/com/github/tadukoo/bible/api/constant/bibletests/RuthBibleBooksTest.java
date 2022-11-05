package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.RUTH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RuthBibleBooksTest{
	
	@Test
	public void testRuthName(){
		assertEquals("Ruth", RUTH.getName());
	}
	
	@Test
	public void testRuthAuthor(){
		assertEquals("Samuel", RUTH.getAuthor());
	}
	
	@Test
	public void testRuthAliases(){
		assertEquals(ListUtil.createList("Ru"), RUTH.getAliases());
	}
	
	@Test
	public void testRuthChapters(){
		assertEquals(ListUtil.createList(22, 23, 18, 22), RUTH.getChapters());
	}
	
	@Test
	public void testRuthNumChapters(){
		assertEquals(4, RUTH.getNumChapters());
	}
	
	@Test
	public void testRuthChp1NumVerses(){
		assertEquals(22, RUTH.getNumVersesInChp(1));
	}
	
	@Test
	public void testRuthChp2NumVerses(){
		assertEquals(23, RUTH.getNumVersesInChp(2));
	}
	
	@Test
	public void testRuthChp3NumVerses(){
		assertEquals(18, RUTH.getNumVersesInChp(3));
	}
	
	@Test
	public void testRuthChp4NumVerses(){
		assertEquals(22, RUTH.getNumVersesInChp(4));
	}
	
	@Test
	public void testFromName(){
		assertEquals(RUTH, BibleBooks.fromName("Ruth"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(RUTH, BibleBooks.fromString("Ruth"));
	}
	
	@Test
	public void testFromAliasRu(){
		assertEquals(RUTH, BibleBooks.fromString("Ru"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(RUTH, BibleBooks.fromInt(8));
	}
}
