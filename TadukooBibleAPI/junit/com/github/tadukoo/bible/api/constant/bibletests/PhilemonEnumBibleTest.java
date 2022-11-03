package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.PHILEMON;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhilemonEnumBibleTest{
	
	@Test
	public void testPhilemonName(){
		assertEquals("Philemon", PHILEMON.getName());
	}
	
	@Test
	public void testPhilemonAuthor(){
		assertEquals("Paul", PHILEMON.getAuthor());
	}
	
	@Test
	public void testPhilemonAliases(){
		assertEquals(ListUtil.createList("Phile", "Phm"), PHILEMON.getAliases());
	}
	
	@Test
	public void testPhilemonChapters(){
		assertEquals(ListUtil.createList(25), PHILEMON.getChapters());
	}
	
	@Test
	public void testPhilemonNumChapters(){
		assertEquals(1, PHILEMON.getNumChapters());
	}
	
	@Test
	public void testPhilemonChp1NumVerses(){
		assertEquals(25, PHILEMON.getNumVersesInChp(1));
	}
	
	@Test
	public void testFromName(){
		assertEquals(PHILEMON, EnumBible.fromName("Philemon"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(PHILEMON, EnumBible.fromString("Philemon"));
	}
	
	@Test
	public void testFromAliasPhile(){
		assertEquals(PHILEMON, EnumBible.fromString("Phile"));
	}
	
	@Test
	public void testFromAliasPhm(){
		assertEquals(PHILEMON, EnumBible.fromString("Phm"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(PHILEMON, EnumBible.fromInt(57));
	}
}
