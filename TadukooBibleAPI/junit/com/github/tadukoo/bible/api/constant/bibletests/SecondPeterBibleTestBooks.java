package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.SECOND_PETER;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondPeterBibleTestBooks{
	
	@Test
	public void testSecondPeterName(){
		assertEquals("2 Peter", SECOND_PETER.getName());
	}
	
	@Test
	public void testSecondPeterAuthor(){
		assertEquals("Peter", SECOND_PETER.getAuthor());
	}
	
	@Test
	public void testSecondPeterAliases(){
		assertEquals(ListUtil.createList("2Pe"), SECOND_PETER.getAliases());
	}
	
	@Test
	public void testSecondPeterChapters(){
		assertEquals(ListUtil.createList(21, 22, 18), SECOND_PETER.getChapters());
	}
	
	@Test
	public void testSecondPeterNumChapters(){
		assertEquals(3, SECOND_PETER.getNumChapters());
	}
	
	@Test
	public void testSecondPeterChp1NumVerses(){
		assertEquals(21, SECOND_PETER.getNumVersesInChp(1));
	}
	
	@Test
	public void testSecondPeterChp2NumVerses(){
		assertEquals(22, SECOND_PETER.getNumVersesInChp(2));
	}
	
	@Test
	public void testSecondPeterChp3NumVerses(){
		assertEquals(18, SECOND_PETER.getNumVersesInChp(3));
	}
	
	@Test
	public void testFromName(){
		assertEquals(SECOND_PETER, BibleBooks.fromName("2 Peter"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(SECOND_PETER, BibleBooks.fromString("2 Peter"));
	}
	
	@Test
	public void testFromAlias2Pe(){
		assertEquals(SECOND_PETER, BibleBooks.fromString("2Pe"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(SECOND_PETER, BibleBooks.fromInt(61));
	}
}
