package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.NAHUM;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NahumBibleBooksTest{
	
	@Test
	public void testNahumName(){
		assertEquals("Nahum", NAHUM.getName());
	}
	
	@Test
	public void testNahumAuthor(){
		assertEquals("Nahum", NAHUM.getAuthor());
	}
	
	@Test
	public void testNahumAliases(){
		assertEquals(ListUtil.createList("Nah", "Na"), NAHUM.getAliases());
	}
	
	@Test
	public void testNahumChapters(){
		assertEquals(ListUtil.createList(15, 13, 19), NAHUM.getChapters());
	}
	
	@Test
	public void testNahumNumChapters(){
		assertEquals(3, NAHUM.getNumChapters());
	}
	
	@Test
	public void testNahumChp1NumVerses(){
		assertEquals(15, NAHUM.getNumVersesInChp(1));
	}
	
	@Test
	public void testNahumChp2NumVerses(){
		assertEquals(13, NAHUM.getNumVersesInChp(2));
	}
	
	@Test
	public void testNahumChp3NumVerses(){
		assertEquals(19, NAHUM.getNumVersesInChp(3));
	}
	
	@Test
	public void testFromName(){
		assertEquals(NAHUM, BibleBooks.fromName("Nahum"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(NAHUM, BibleBooks.fromString("Nahum"));
	}
	
	@Test
	public void testFromAliasNah(){
		assertEquals(NAHUM, BibleBooks.fromString("Nah"));
	}
	
	@Test
	public void testFromAliasNa(){
		assertEquals(NAHUM, BibleBooks.fromString("Na"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(NAHUM, BibleBooks.fromInt(34));
	}
}
