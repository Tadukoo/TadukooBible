package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.HEBREWS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HebrewsEnumBibleTest{
	
	@Test
	public void testHebrewsName(){
		assertEquals("Hebrews", HEBREWS.getName());
	}
	
	@Test
	public void testHebrewsAuthor(){
		assertEquals("Unknown", HEBREWS.getAuthor());
	}
	
	@Test
	public void testHebrewsAliases(){
		assertEquals(ListUtil.createList("Heb"), HEBREWS.getAliases());
	}
	
	@Test
	public void testHebrewsChapters(){
		assertEquals(ListUtil.createList(14, 18, 19, 16, 14, 20, 28, 13, 28, 39, 40, 29, 25), HEBREWS.getChapters());
	}
	
	@Test
	public void testHebrewsNumChapters(){
		assertEquals(13, HEBREWS.getNumChapters());
	}
	
	@Test
	public void testHebrewsChp1NumVerses(){
		assertEquals(14, HEBREWS.getNumVersesInChp(1));
	}
	
	@Test
	public void testHebrewsChp2NumVerses(){
		assertEquals(18, HEBREWS.getNumVersesInChp(2));
	}
	
	@Test
	public void testHebrewsChp3NumVerses(){
		assertEquals(19, HEBREWS.getNumVersesInChp(3));
	}
	
	@Test
	public void testHebrewsChp4NumVerses(){
		assertEquals(16, HEBREWS.getNumVersesInChp(4));
	}
	
	@Test
	public void testHebrewsChp5NumVerses(){
		assertEquals(14, HEBREWS.getNumVersesInChp(5));
	}
	
	@Test
	public void testHebrewsChp6NumVerses(){
		assertEquals(20, HEBREWS.getNumVersesInChp(6));
	}
	
	@Test
	public void testHebrewsChp7NumVerses(){
		assertEquals(28, HEBREWS.getNumVersesInChp(7));
	}
	
	@Test
	public void testHebrewsChp8NumVerses(){
		assertEquals(13, HEBREWS.getNumVersesInChp(8));
	}
	
	@Test
	public void testHebrewsChp9NumVerses(){
		assertEquals(28, HEBREWS.getNumVersesInChp(9));
	}
	
	@Test
	public void testHebrewsChp10NumVerses(){
		assertEquals(39, HEBREWS.getNumVersesInChp(10));
	}
	
	@Test
	public void testHebrewsChp11NumVerses(){
		assertEquals(40, HEBREWS.getNumVersesInChp(11));
	}
	
	@Test
	public void testHebrewsChp12NumVerses(){
		assertEquals(29, HEBREWS.getNumVersesInChp(12));
	}
	
	@Test
	public void testHebrewsChp13NumVerses(){
		assertEquals(25, HEBREWS.getNumVersesInChp(13));
	}
	
	@Test
	public void testFromName(){
		assertEquals(HEBREWS, EnumBible.fromName("Hebrews"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(HEBREWS, EnumBible.fromString("Hebrews"));
	}
	
	@Test
	public void testFromAliasHeb(){
		assertEquals(HEBREWS, EnumBible.fromString("Heb"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(HEBREWS, EnumBible.fromInt(58));
	}
}
