package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.JUDE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JudeBibleBooksTest{
	
	@Test
	public void testJudeName(){
		assertEquals("Jude", JUDE.getName());
	}
	
	@Test
	public void testJudeAuthor(){
		assertEquals("Jude", JUDE.getAuthor());
	}
	
	@Test
	public void testJudeAliases(){
		assertEquals(ListUtil.createList(), JUDE.getAliases());
	}
	
	@Test
	public void testJudeChapters(){
		assertEquals(ListUtil.createList(25), JUDE.getChapters());
	}
	
	@Test
	public void testJudeNumChapters(){
		assertEquals(1, JUDE.getNumChapters());
	}
	
	@Test
	public void testJudeChp1NumVerses(){
		assertEquals(25, JUDE.getNumVersesInChp(1));
	}
	
	@Test
	public void testFromName(){
		assertEquals(JUDE, BibleBooks.fromName("Jude"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(JUDE, BibleBooks.fromString("Jude"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(JUDE, BibleBooks.fromInt(65));
	}
}
