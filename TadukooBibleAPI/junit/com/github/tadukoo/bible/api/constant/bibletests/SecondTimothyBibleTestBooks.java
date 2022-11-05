package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.SECOND_TIMOTHY;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondTimothyBibleTestBooks{
	
	@Test
	public void testSecondTimothyName(){
		assertEquals("2 Timothy", SECOND_TIMOTHY.getName());
	}
	
	@Test
	public void testSecondTimothyAuthor(){
		assertEquals("Paul", SECOND_TIMOTHY.getAuthor());
	}
	
	@Test
	public void testSecondTimothyAliases(){
		assertEquals(ListUtil.createList("2Tim", "2Ti"), SECOND_TIMOTHY.getAliases());
	}
	
	@Test
	public void testSecondTimothyChapters(){
		assertEquals(ListUtil.createList(18, 26, 17, 22), SECOND_TIMOTHY.getChapters());
	}
	
	@Test
	public void testSecondTimothyNumChapters(){
		assertEquals(4, SECOND_TIMOTHY.getNumChapters());
	}
	
	@Test
	public void testSecondTimothyChp1NumVerses(){
		assertEquals(18, SECOND_TIMOTHY.getNumVersesInChp(1));
	}
	
	@Test
	public void testSecondTimothyChp2NumVerses(){
		assertEquals(26, SECOND_TIMOTHY.getNumVersesInChp(2));
	}
	
	@Test
	public void testSecondTimothyChp3NumVerses(){
		assertEquals(17, SECOND_TIMOTHY.getNumVersesInChp(3));
	}
	
	@Test
	public void testSecondTimothyChp4NumVerses(){
		assertEquals(22, SECOND_TIMOTHY.getNumVersesInChp(4));
	}
	
	@Test
	public void testFromName(){
		assertEquals(SECOND_TIMOTHY, BibleBooks.fromName("2 Timothy"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(SECOND_TIMOTHY, BibleBooks.fromString("2 Timothy"));
	}
	
	@Test
	public void testFromAlias2Tim(){
		assertEquals(SECOND_TIMOTHY, BibleBooks.fromString("2Tim"));
	}
	
	@Test
	public void testFromAlias2Ti(){
		assertEquals(SECOND_TIMOTHY, BibleBooks.fromString("2Ti"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(SECOND_TIMOTHY, BibleBooks.fromInt(55));
	}
}
