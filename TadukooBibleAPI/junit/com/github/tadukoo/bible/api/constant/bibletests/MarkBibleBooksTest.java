package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.MARK;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarkBibleBooksTest{
	
	@Test
	public void testMarkName(){
		assertEquals("Mark", MARK.getName());
	}
	
	@Test
	public void testMarkAuthor(){
		assertEquals("John Mark", MARK.getAuthor());
	}
	
	@Test
	public void testMarkAliases(){
		assertEquals(ListUtil.createList("Mr"), MARK.getAliases());
	}
	
	@Test
	public void testMarkChapters(){
		assertEquals(ListUtil.createList(45, 28, 35, 41, 43, 56, 37, 38, 50, 52, 33, 44, 37, 72, 47, 20), MARK.getChapters());
	}
	
	@Test
	public void testMarkNumChapters(){
		assertEquals(16, MARK.getNumChapters());
	}
	
	@Test
	public void testMarkChp1NumVerses(){
		assertEquals(45, MARK.getNumVersesInChp(1));
	}
	
	@Test
	public void testMarkChp2NumVerses(){
		assertEquals(28, MARK.getNumVersesInChp(2));
	}
	
	@Test
	public void testMarkChp3NumVerses(){
		assertEquals(35, MARK.getNumVersesInChp(3));
	}
	
	@Test
	public void testMarkChp4NumVerses(){
		assertEquals(41, MARK.getNumVersesInChp(4));
	}
	
	@Test
	public void testMarkChp5NumVerses(){
		assertEquals(43, MARK.getNumVersesInChp(5));
	}
	
	@Test
	public void testMarkChp6NumVerses(){
		assertEquals(56, MARK.getNumVersesInChp(6));
	}
	
	@Test
	public void testMarkChp7NumVerses(){
		assertEquals(37, MARK.getNumVersesInChp(7));
	}
	
	@Test
	public void testMarkChp8NumVerses(){
		assertEquals(38, MARK.getNumVersesInChp(8));
	}
	
	@Test
	public void testMarkChp9NumVerses(){
		assertEquals(50, MARK.getNumVersesInChp(9));
	}
	
	@Test
	public void testMarkChp10NumVerses(){
		assertEquals(52, MARK.getNumVersesInChp(10));
	}
	
	@Test
	public void testMarkChp11NumVerses(){
		assertEquals(33, MARK.getNumVersesInChp(11));
	}
	
	@Test
	public void testMarkChp12NumVerses(){
		assertEquals(44, MARK.getNumVersesInChp(12));
	}
	
	@Test
	public void testMarkChp13NumVerses(){
		assertEquals(37, MARK.getNumVersesInChp(13));
	}
	
	@Test
	public void testMarkChp14NumVerses(){
		assertEquals(72, MARK.getNumVersesInChp(14));
	}
	
	@Test
	public void testMarkChp15NumVerses(){
		assertEquals(47, MARK.getNumVersesInChp(15));
	}
	
	@Test
	public void testMarkChp16NumVerses(){
		assertEquals(20, MARK.getNumVersesInChp(16));
	}
	
	@Test
	public void testFromName(){
		assertEquals(MARK, BibleBooks.fromName("Mark"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(MARK, BibleBooks.fromString("Mark"));
	}
	
	@Test
	public void testFromAliasMr(){
		assertEquals(MARK, BibleBooks.fromString("Mr"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(MARK, BibleBooks.fromInt(41));
	}
}
