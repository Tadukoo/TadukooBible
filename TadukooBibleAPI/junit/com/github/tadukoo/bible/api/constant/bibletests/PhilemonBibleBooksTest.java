package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.PHILEMON;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhilemonBibleBooksTest{
	
	@Test
	public void testPhilemonName(){
		assertEquals("Philemon", PHILEMON.getName());
	}
	
	@Test
	public void testPhilemonAuthor(){
		assertEquals("Paul", PHILEMON.getAuthor());
	}
	
	@Test
	public void testPhilemonAliases(){
		assertEquals(ListUtil.createList("Phile", "Phm"), PHILEMON.getAliases());
	}
	
	@Test
	public void testPhilemonChapters(){
		assertEquals(ListUtil.createList(25), PHILEMON.getChapters());
	}
	
	@Test
	public void testPhilemonNumChapters(){
		assertEquals(1, PHILEMON.getNumChapters());
	}
	
	@Test
	public void testPhilemonChp1NumVerses(){
		assertEquals(25, PHILEMON.getNumVersesInChp(1));
	}
	
	@Test
	public void testFromName(){
		assertEquals(PHILEMON, BibleBooks.fromName("Philemon"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(PHILEMON, BibleBooks.fromString("Philemon"));
	}
	
	@Test
	public void testFromAliasPhile(){
		assertEquals(PHILEMON, BibleBooks.fromString("Phile"));
	}
	
	@Test
	public void testFromAliasPhm(){
		assertEquals(PHILEMON, BibleBooks.fromString("Phm"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(PHILEMON, BibleBooks.fromInt(57));
	}
}
