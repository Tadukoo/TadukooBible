package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.SECOND_JOHN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondJohnBibleTestBooks{
	
	@Test
	public void testSecondJohnName(){
		assertEquals("2 John", SECOND_JOHN.getName());
	}
	
	@Test
	public void testSecondJohnAuthor(){
		assertEquals("John", SECOND_JOHN.getAuthor());
	}
	
	@Test
	public void testSecondJohnAliases(){
		assertEquals(ListUtil.createList("2Jo"), SECOND_JOHN.getAliases());
	}
	
	@Test
	public void testSecondJohnChapters(){
		assertEquals(ListUtil.createList(13), SECOND_JOHN.getChapters());
	}
	
	@Test
	public void testSecondJohnNumChapters(){
		assertEquals(1, SECOND_JOHN.getNumChapters());
	}
	
	@Test
	public void testSecondJohnChp1NumVerses(){
		assertEquals(13, SECOND_JOHN.getNumVersesInChp(1));
	}
	
	@Test
	public void testFromName(){
		assertEquals(SECOND_JOHN, BibleBooks.fromName("2 John"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(SECOND_JOHN, BibleBooks.fromString("2 John"));
	}
	
	@Test
	public void testFromAlias2Jo(){
		assertEquals(SECOND_JOHN, BibleBooks.fromString("2Jo"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(SECOND_JOHN, BibleBooks.fromInt(63));
	}
}
