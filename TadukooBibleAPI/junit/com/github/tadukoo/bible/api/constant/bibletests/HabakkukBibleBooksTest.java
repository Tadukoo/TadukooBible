package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.HABAKKUK;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HabakkukBibleBooksTest{
	
	@Test
	public void testHabakkukName(){
		assertEquals("Habakkuk", HABAKKUK.getName());
	}
	
	@Test
	public void testHabakkukAuthor(){
		assertEquals("Habakkuk", HABAKKUK.getAuthor());
	}
	
	@Test
	public void testHabakkukAliases(){
		assertEquals(ListUtil.createList("Hab"), HABAKKUK.getAliases());
	}
	
	@Test
	public void testHabakkukChapters(){
		assertEquals(ListUtil.createList(17, 20, 19), HABAKKUK.getChapters());
	}
	
	@Test
	public void testHabakkukNumChapters(){
		assertEquals(3, HABAKKUK.getNumChapters());
	}
	
	@Test
	public void testHabakkukChp1NumVerses(){
		assertEquals(17, HABAKKUK.getNumVersesInChp(1));
	}
	
	@Test
	public void testHabakkukChp2NumVerses(){
		assertEquals(20, HABAKKUK.getNumVersesInChp(2));
	}
	
	@Test
	public void testHabakkukChp3NumVerses(){
		assertEquals(19, HABAKKUK.getNumVersesInChp(3));
	}
	
	@Test
	public void testFromName(){
		assertEquals(HABAKKUK, BibleBooks.fromName("Habakkuk"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(HABAKKUK, BibleBooks.fromString("Habakkuk"));
	}
	
	@Test
	public void testFromAliasHab(){
		assertEquals(HABAKKUK, BibleBooks.fromString("Hab"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(HABAKKUK, BibleBooks.fromInt(35));
	}
}
