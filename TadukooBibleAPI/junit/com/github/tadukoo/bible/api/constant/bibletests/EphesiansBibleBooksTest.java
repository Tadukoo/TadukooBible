package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.EPHESIANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EphesiansBibleBooksTest{
	
	@Test
	public void testEphesiansName(){
		assertEquals("Ephesians", EPHESIANS.getName());
	}
	
	@Test
	public void testEphesiansAuthor(){
		assertEquals("Paul", EPHESIANS.getAuthor());
	}
	
	@Test
	public void testEphesiansAliases(){
		assertEquals(ListUtil.createList("Eph"), EPHESIANS.getAliases());
	}
	
	@Test
	public void testEphesiansChapters(){
		assertEquals(ListUtil.createList(23, 22, 21, 32, 33, 24), EPHESIANS.getChapters());
	}
	
	@Test
	public void testEphesiansNumChapters(){
		assertEquals(6, EPHESIANS.getNumChapters());
	}
	
	@Test
	public void testEphesiansChp1NumVerses(){
		assertEquals(23, EPHESIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testEphesiansChp2NumVerses(){
		assertEquals(22, EPHESIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testEphesiansChp3NumVerses(){
		assertEquals(21, EPHESIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testEphesiansChp4NumVerses(){
		assertEquals(32, EPHESIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void testEphesiansChp5NumVerses(){
		assertEquals(33, EPHESIANS.getNumVersesInChp(5));
	}
	
	@Test
	public void testEphesiansChp6NumVerses(){
		assertEquals(24, EPHESIANS.getNumVersesInChp(6));
	}
	
	@Test
	public void testFromName(){
		assertEquals(EPHESIANS, BibleBooks.fromName("Ephesians"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(EPHESIANS, BibleBooks.fromString("Ephesians"));
	}
	
	@Test
	public void testFromAliasEph(){
		assertEquals(EPHESIANS, BibleBooks.fromString("Eph"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(EPHESIANS, BibleBooks.fromInt(49));
	}
}
