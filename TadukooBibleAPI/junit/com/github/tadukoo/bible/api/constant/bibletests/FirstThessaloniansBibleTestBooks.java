package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.FIRST_THESSALONIANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstThessaloniansBibleTestBooks{
	
	@Test
	public void testFirstThessaloniansName(){
		assertEquals("1 Thessalonians", FIRST_THESSALONIANS.getName());
	}
	
	@Test
	public void testFirstThessaloniansAuthor(){
		assertEquals("Paul", FIRST_THESSALONIANS.getAuthor());
	}
	
	@Test
	public void testFirstThessaloniansAliases(){
		assertEquals(ListUtil.createList("1Thes", "1Th"), FIRST_THESSALONIANS.getAliases());
	}
	
	@Test
	public void testFirstThessaloniansChapters(){
		assertEquals(ListUtil.createList(10, 20, 13, 18, 28), FIRST_THESSALONIANS.getChapters());
	}
	
	@Test
	public void testFirstThessaloniansNumChapters(){
		assertEquals(5, FIRST_THESSALONIANS.getNumChapters());
	}
	
	@Test
	public void testFirstThessaloniansChp1NumVerses(){
		assertEquals(10, FIRST_THESSALONIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testFirstThessaloniansChp2NumVerses(){
		assertEquals(20, FIRST_THESSALONIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testFirstThessaloniansChp3NumVerses(){
		assertEquals(13, FIRST_THESSALONIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testFirstThessaloniansChp4NumVerses(){
		assertEquals(18, FIRST_THESSALONIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void testFirstThessaloniansChp5NumVerses(){
		assertEquals(28, FIRST_THESSALONIANS.getNumVersesInChp(5));
	}
	
	@Test
	public void testFromName(){
		assertEquals(FIRST_THESSALONIANS, BibleBooks.fromName("1 Thessalonians"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(FIRST_THESSALONIANS, BibleBooks.fromString("1 Thessalonians"));
	}
	
	@Test
	public void testFromAlias1Thes(){
		assertEquals(FIRST_THESSALONIANS, BibleBooks.fromString("1Thes"));
	}
	
	@Test
	public void testFromAlias1Th(){
		assertEquals(FIRST_THESSALONIANS, BibleBooks.fromString("1Th"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(FIRST_THESSALONIANS, BibleBooks.fromInt(52));
	}
}
