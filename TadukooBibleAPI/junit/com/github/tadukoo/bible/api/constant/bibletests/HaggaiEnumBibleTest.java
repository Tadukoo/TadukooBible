package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.HAGGAI;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HaggaiEnumBibleTest{
	
	@Test
	public void testHaggaiName(){
		assertEquals("Haggai", HAGGAI.getName());
	}
	
	@Test
	public void testHaggaiAuthor(){
		assertEquals("Haggai", HAGGAI.getAuthor());
	}
	
	@Test
	public void testHaggaiAliases(){
		assertEquals(ListUtil.createList("Hag"), HAGGAI.getAliases());
	}
	
	@Test
	public void testHaggaiChapters(){
		assertEquals(ListUtil.createList(15, 23), HAGGAI.getChapters());
	}
	
	@Test
	public void testHaggaiNumChapters(){
		assertEquals(2, HAGGAI.getNumChapters());
	}
	
	@Test
	public void testHaggaiChp1NumVerses(){
		assertEquals(15, HAGGAI.getNumVersesInChp(1));
	}
	
	@Test
	public void testHaggaiChp2NumVerses(){
		assertEquals(23, HAGGAI.getNumVersesInChp(2));
	}
	
	@Test
	public void testFromName(){
		assertEquals(HAGGAI, EnumBible.fromName("Haggai"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(HAGGAI, EnumBible.fromString("Haggai"));
	}
	
	@Test
	public void testFromAliasHag(){
		assertEquals(HAGGAI, EnumBible.fromString("Hag"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(HAGGAI, EnumBible.fromInt(37));
	}
}
