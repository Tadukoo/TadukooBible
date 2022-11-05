package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.TITUS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TitusBibleBooksTest{
	
	@Test
	public void testTitusName(){
		assertEquals("Titus", TITUS.getName());
	}
	
	@Test
	public void testTitusAuthor(){
		assertEquals("Paul", TITUS.getAuthor());
	}
	
	@Test
	public void testTitusAliases(){
		assertEquals(ListUtil.createList("Tit"), TITUS.getAliases());
	}
	
	@Test
	public void testTitusChapters(){
		assertEquals(ListUtil.createList(16, 15, 15), TITUS.getChapters());
	}
	
	@Test
	public void testTitusNumChapters(){
		assertEquals(3, TITUS.getNumChapters());
	}
	
	@Test
	public void testTitusChp1NumVerses(){
		assertEquals(16, TITUS.getNumVersesInChp(1));
	}
	
	@Test
	public void testTitusChp2NumVerses(){
		assertEquals(15, TITUS.getNumVersesInChp(2));
	}
	
	@Test
	public void testTitusChp3NumVerses(){
		assertEquals(15, TITUS.getNumVersesInChp(3));
	}
	
	@Test
	public void testFromName(){
		assertEquals(TITUS, BibleBooks.fromName("Titus"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(TITUS, BibleBooks.fromString("Titus"));
	}
	
	@Test
	public void testFromAliasTit(){
		assertEquals(TITUS, BibleBooks.fromString("Tit"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(TITUS, BibleBooks.fromInt(56));
	}
}
