package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.FIRST_JOHN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstJohnBibleTestBooks{
	
	@Test
	public void testFirstJohnName(){
		assertEquals("1 John", FIRST_JOHN.getName());
	}
	
	@Test
	public void testFirstJohnAuthor(){
		assertEquals("John", FIRST_JOHN.getAuthor());
	}
	
	@Test
	public void testFirstJohnAliases(){
		assertEquals(ListUtil.createList("1Jo"), FIRST_JOHN.getAliases());
	}
	
	@Test
	public void testFirstJohnChapters(){
		assertEquals(ListUtil.createList(10, 29, 24, 21, 21), FIRST_JOHN.getChapters());
	}
	
	@Test
	public void testFirstJohnNumChapters(){
		assertEquals(5, FIRST_JOHN.getNumChapters());
	}
	
	@Test
	public void testFirstJohnChp1NumVerses(){
		assertEquals(10, FIRST_JOHN.getNumVersesInChp(1));
	}
	
	@Test
	public void testFirstJohnChp2NumVerses(){
		assertEquals(29, FIRST_JOHN.getNumVersesInChp(2));
	}
	
	@Test
	public void testFirstJohnChp3NumVerses(){
		assertEquals(24, FIRST_JOHN.getNumVersesInChp(3));
	}
	
	@Test
	public void testFirstJohnChp4NumVerses(){
		assertEquals(21, FIRST_JOHN.getNumVersesInChp(4));
	}
	
	@Test
	public void testFirstJohnChp5NumVerses(){
		assertEquals(21, FIRST_JOHN.getNumVersesInChp(5));
	}
	
	@Test
	public void testFromName(){
		assertEquals(FIRST_JOHN, BibleBooks.fromName("1 John"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(FIRST_JOHN, BibleBooks.fromString("1 John"));
	}
	
	@Test
	public void testFromAlias1Jo(){
		assertEquals(FIRST_JOHN, BibleBooks.fromString("1Jo"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(FIRST_JOHN, BibleBooks.fromInt(62));
	}
}
