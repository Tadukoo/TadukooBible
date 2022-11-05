package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.MICAH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MicahBibleBooksTest{
	
	@Test
	public void testMicahName(){
		assertEquals("Micah", MICAH.getName());
	}
	
	@Test
	public void testMicahAuthor(){
		assertEquals("Micah", MICAH.getAuthor());
	}
	
	@Test
	public void testMicahAliases(){
		assertEquals(ListUtil.createList("Mic"), MICAH.getAliases());
	}
	
	@Test
	public void testMicahChapters(){
		assertEquals(ListUtil.createList(16, 13, 12, 13, 15, 16, 20), MICAH.getChapters());
	}
	
	@Test
	public void testMicahNumChapters(){
		assertEquals(7, MICAH.getNumChapters());
	}
	
	@Test
	public void testMicahChp1NumVerses(){
		assertEquals(16, MICAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testMicahChp2NumVerses(){
		assertEquals(13, MICAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testMicahChp3NumVerses(){
		assertEquals(12, MICAH.getNumVersesInChp(3));
	}
	
	@Test
	public void testMicahChp4NumVerses(){
		assertEquals(13, MICAH.getNumVersesInChp(4));
	}
	
	@Test
	public void testMicahChp5NumVerses(){
		assertEquals(15, MICAH.getNumVersesInChp(5));
	}
	
	@Test
	public void testMicahChp6NumVerses(){
		assertEquals(16, MICAH.getNumVersesInChp(6));
	}
	
	@Test
	public void testMicahChp7NumVerses(){
		assertEquals(20, MICAH.getNumVersesInChp(7));
	}
	
	@Test
	public void testFromName(){
		assertEquals(MICAH, BibleBooks.fromName("Micah"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(MICAH, BibleBooks.fromString("Micah"));
	}
	
	@Test
	public void testFromAliasMic(){
		assertEquals(MICAH, BibleBooks.fromString("Mic"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(MICAH, BibleBooks.fromInt(33));
	}
}
