package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.DANIEL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DanielBibleBooksTest{
	
	@Test
	public void testDanielName(){
		assertEquals("Daniel", DANIEL.getName());
	}
	
	@Test
	public void testDanielAuthor(){
		assertEquals("Daniel", DANIEL.getAuthor());
	}
	
	@Test
	public void testDanielAliases(){
		assertEquals(ListUtil.createList("Dan", "Da"), DANIEL.getAliases());
	}
	
	@Test
	public void testDanielChapters(){
		assertEquals(ListUtil.createList(21, 49, 30, 37, 31, 28, 28, 27, 27, 21, 45, 13), DANIEL.getChapters());
	}
	
	@Test
	public void testDanielNumChapters(){
		assertEquals(12, DANIEL.getNumChapters());
	}
	
	@Test
	public void testDanielChp1NumVerses(){
		assertEquals(21, DANIEL.getNumVersesInChp(1));
	}
	
	@Test
	public void testDanielChp2NumVerses(){
		assertEquals(49, DANIEL.getNumVersesInChp(2));
	}
	
	@Test
	public void testDanielChp3NumVerses(){
		assertEquals(30, DANIEL.getNumVersesInChp(3));
	}
	
	@Test
	public void testDanielChp4NumVerses(){
		assertEquals(37, DANIEL.getNumVersesInChp(4));
	}
	
	@Test
	public void testDanielChp5NumVerses(){
		assertEquals(31, DANIEL.getNumVersesInChp(5));
	}
	
	@Test
	public void testDanielChp6NumVerses(){
		assertEquals(28, DANIEL.getNumVersesInChp(6));
	}
	
	@Test
	public void testDanielChp7NumVerses(){
		assertEquals(28, DANIEL.getNumVersesInChp(7));
	}
	
	@Test
	public void testDanielChp8NumVerses(){
		assertEquals(27, DANIEL.getNumVersesInChp(8));
	}
	
	@Test
	public void testDanielChp9NumVerses(){
		assertEquals(27, DANIEL.getNumVersesInChp(9));
	}
	
	@Test
	public void testDanielChp10NumVerses(){
		assertEquals(21, DANIEL.getNumVersesInChp(10));
	}
	
	@Test
	public void testDanielChp11NumVerses(){
		assertEquals(45, DANIEL.getNumVersesInChp(11));
	}
	
	@Test
	public void testDanielChp12NumVerses(){
		assertEquals(13, DANIEL.getNumVersesInChp(12));
	}
	
	@Test
	public void testFromName(){
		assertEquals(DANIEL, BibleBooks.fromName("Daniel"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(DANIEL, BibleBooks.fromString("Daniel"));
	}
	
	@Test
	public void testFromAliasDan(){
		assertEquals(DANIEL, BibleBooks.fromString("Dan"));
	}
	
	@Test
	public void testFromAliasDa(){
		assertEquals(DANIEL, BibleBooks.fromString("Da"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(DANIEL, BibleBooks.fromInt(27));
	}
}
