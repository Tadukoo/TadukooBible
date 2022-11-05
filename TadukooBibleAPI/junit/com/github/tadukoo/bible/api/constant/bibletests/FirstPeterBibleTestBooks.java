package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.FIRST_PETER;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstPeterBibleTestBooks{
	
	@Test
	public void testFirstPeterName(){
		assertEquals("1 Peter", FIRST_PETER.getName());
	}
	
	@Test
	public void testFirstPeterAuthor(){
		assertEquals("Peter", FIRST_PETER.getAuthor());
	}
	
	@Test
	public void testFirstPeterAliases(){
		assertEquals(ListUtil.createList("1Pe"), FIRST_PETER.getAliases());
	}
	
	@Test
	public void testFirstPeterChapters(){
		assertEquals(ListUtil.createList(25, 25, 22, 19, 14), FIRST_PETER.getChapters());
	}
	
	@Test
	public void testFirstPeterNumChapters(){
		assertEquals(5, FIRST_PETER.getNumChapters());
	}
	
	@Test
	public void testFirstPeterChp1NumVerses(){
		assertEquals(25, FIRST_PETER.getNumVersesInChp(1));
	}
	
	@Test
	public void testFirstPeterChp2NumVerses(){
		assertEquals(25, FIRST_PETER.getNumVersesInChp(2));
	}
	
	@Test
	public void testFirstPeterChp3NumVerses(){
		assertEquals(22, FIRST_PETER.getNumVersesInChp(3));
	}
	
	@Test
	public void testFirstPeterChp4NumVerses(){
		assertEquals(19, FIRST_PETER.getNumVersesInChp(4));
	}
	
	@Test
	public void testFirstPeterChp5NumVerses(){
		assertEquals(14, FIRST_PETER.getNumVersesInChp(5));
	}
	
	@Test
	public void testFromName(){
		assertEquals(FIRST_PETER, BibleBooks.fromName("1 Peter"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(FIRST_PETER, BibleBooks.fromString("1 Peter"));
	}
	
	@Test
	public void testFromAlias1Pe(){
		assertEquals(FIRST_PETER, BibleBooks.fromString("1Pe"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(FIRST_PETER, BibleBooks.fromInt(60));
	}
}
