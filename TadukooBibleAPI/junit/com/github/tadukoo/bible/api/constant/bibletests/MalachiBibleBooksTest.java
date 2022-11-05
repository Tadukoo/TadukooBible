package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.MALACHI;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MalachiBibleBooksTest{
	
	@Test
	public void testMalachiName(){
		assertEquals("Malachi", MALACHI.getName());
	}
	
	@Test
	public void testMalachiAuthor(){
		assertEquals("Malachi", MALACHI.getAuthor());
	}
	
	@Test
	public void testMalachiAliases(){
		assertEquals(ListUtil.createList("Mal"), MALACHI.getAliases());
	}
	
	@Test
	public void testMalachiChapters(){
		assertEquals(ListUtil.createList(14, 17, 18, 6), MALACHI.getChapters());
	}
	
	@Test
	public void testMalachiNumChapters(){
		assertEquals(4, MALACHI.getNumChapters());
	}
	
	@Test
	public void testMalachiChp1NumVerses(){
		assertEquals(14, MALACHI.getNumVersesInChp(1));
	}
	
	@Test
	public void testMalachiChp2NumVerses(){
		assertEquals(17, MALACHI.getNumVersesInChp(2));
	}
	
	@Test
	public void testMalachiChp3NumVerses(){
		assertEquals(18, MALACHI.getNumVersesInChp(3));
	}
	
	@Test
	public void testMalachiChp4NumVerses(){
		assertEquals(6, MALACHI.getNumVersesInChp(4));
	}
	
	@Test
	public void testFromName(){
		assertEquals(MALACHI, BibleBooks.fromName("Malachi"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(MALACHI, BibleBooks.fromString("Malachi"));
	}
	
	@Test
	public void testFromAliasMal(){
		assertEquals(MALACHI, BibleBooks.fromString("Mal"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(MALACHI, BibleBooks.fromInt(39));
	}
}
