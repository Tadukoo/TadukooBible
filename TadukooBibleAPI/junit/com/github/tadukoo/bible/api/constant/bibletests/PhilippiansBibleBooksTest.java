package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.PHILIPPIANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhilippiansBibleBooksTest{
	
	@Test
	public void testPhilippiansName(){
		assertEquals("Philippians", PHILIPPIANS.getName());
	}
	
	@Test
	public void testPhilippiansAuthor(){
		assertEquals("Paul", PHILIPPIANS.getAuthor());
	}
	
	@Test
	public void testPhilippiansAliases(){
		assertEquals(ListUtil.createList("Phili", "Php"), PHILIPPIANS.getAliases());
	}
	
	@Test
	public void testPhilippiansChapters(){
		assertEquals(ListUtil.createList(30, 30, 21, 23), PHILIPPIANS.getChapters());
	}
	
	@Test
	public void testPhilippiansNumChapters(){
		assertEquals(4, PHILIPPIANS.getNumChapters());
	}
	
	@Test
	public void testPhilippiansChp1NumVerses(){
		assertEquals(30, PHILIPPIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testPhilippiansChp2NumVerses(){
		assertEquals(30, PHILIPPIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testPhilippiansChp3NumVerses(){
		assertEquals(21, PHILIPPIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testPhilippiansChp4NumVerses(){
		assertEquals(23, PHILIPPIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void testFromName(){
		assertEquals(PHILIPPIANS, BibleBooks.fromName("Philippians"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(PHILIPPIANS, BibleBooks.fromString("Philippians"));
	}
	
	@Test
	public void testFromAliasPhili(){
		assertEquals(PHILIPPIANS, BibleBooks.fromString("Phili"));
	}
	
	@Test
	public void testFromAliasPhp(){
		assertEquals(PHILIPPIANS, BibleBooks.fromString("Php"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(PHILIPPIANS, BibleBooks.fromInt(50));
	}
}
