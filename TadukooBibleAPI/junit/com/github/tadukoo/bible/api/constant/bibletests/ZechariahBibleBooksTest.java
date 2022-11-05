package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.ZECHARIAH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZechariahBibleBooksTest{
	
	@Test
	public void testZechariahName(){
		assertEquals("Zechariah", ZECHARIAH.getName());
	}
	
	@Test
	public void testZechariahAuthor(){
		assertEquals("Zechariah", ZECHARIAH.getAuthor());
	}
	
	@Test
	public void testZechariahAliases(){
		assertEquals(ListUtil.createList("Zec"), ZECHARIAH.getAliases());
	}
	
	@Test
	public void testZechariahChapters(){
		assertEquals(ListUtil.createList(21, 13, 10, 14, 11, 15, 14, 23, 17, 12, 17, 14, 9, 21), ZECHARIAH.getChapters());
	}
	
	@Test
	public void testZechariahNumChapters(){
		assertEquals(14, ZECHARIAH.getNumChapters());
	}
	
	@Test
	public void testZechariahChp1NumVerses(){
		assertEquals(21, ZECHARIAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testZechariahChp2NumVerses(){
		assertEquals(13, ZECHARIAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testZechariahChp3NumVerses(){
		assertEquals(10, ZECHARIAH.getNumVersesInChp(3));
	}
	
	@Test
	public void testZechariahChp4NumVerses(){
		assertEquals(14, ZECHARIAH.getNumVersesInChp(4));
	}
	
	@Test
	public void testZechariahChp5NumVerses(){
		assertEquals(11, ZECHARIAH.getNumVersesInChp(5));
	}
	
	@Test
	public void testZechariahChp6NumVerses(){
		assertEquals(15, ZECHARIAH.getNumVersesInChp(6));
	}
	
	@Test
	public void testZechariahChp7NumVerses(){
		assertEquals(14, ZECHARIAH.getNumVersesInChp(7));
	}
	
	@Test
	public void testZechariahChp8NumVerses(){
		assertEquals(23, ZECHARIAH.getNumVersesInChp(8));
	}
	
	@Test
	public void testZechariahChp9NumVerses(){
		assertEquals(17, ZECHARIAH.getNumVersesInChp(9));
	}
	
	@Test
	public void testZechariahChp10NumVerses(){
		assertEquals(12, ZECHARIAH.getNumVersesInChp(10));
	}
	
	@Test
	public void testZechariahChp11NumVerses(){
		assertEquals(17, ZECHARIAH.getNumVersesInChp(11));
	}
	
	@Test
	public void testZechariahChp12NumVerses(){
		assertEquals(14, ZECHARIAH.getNumVersesInChp(12));
	}
	
	@Test
	public void testZechariahChp13NumVerses(){
		assertEquals(9, ZECHARIAH.getNumVersesInChp(13));
	}
	
	@Test
	public void testZechariahChp14NumVerses(){
		assertEquals(21, ZECHARIAH.getNumVersesInChp(14));
	}
	
	@Test
	public void testFromName(){
		assertEquals(ZECHARIAH, BibleBooks.fromName("Zechariah"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(ZECHARIAH, BibleBooks.fromString("Zechariah"));
	}
	
	@Test
	public void testFromAliasZec(){
		assertEquals(ZECHARIAH, BibleBooks.fromString("Zec"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(ZECHARIAH, BibleBooks.fromInt(38));
	}
}
