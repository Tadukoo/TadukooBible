package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.SECOND_THESSALONIANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondThessaloniansEnumBibleTest{
	
	@Test
	public void testSecondThessaloniansName(){
		assertEquals("2 Thessalonians", SECOND_THESSALONIANS.getName());
	}
	
	@Test
	public void testSecondThessaloniansAuthor(){
		assertEquals("Paul", SECOND_THESSALONIANS.getAuthor());
	}
	
	@Test
	public void testSecondThessaloniansAliases(){
		assertEquals(ListUtil.createList("2Thes", "2Th"), SECOND_THESSALONIANS.getAliases());
	}
	
	@Test
	public void testSecondThessaloniansChapters(){
		assertEquals(ListUtil.createList(12, 17, 18), SECOND_THESSALONIANS.getChapters());
	}
	
	@Test
	public void testSecondThessaloniansNumChapters(){
		assertEquals(3, SECOND_THESSALONIANS.getNumChapters());
	}
	
	@Test
	public void testSecondThessaloniansChp1NumVerses(){
		assertEquals(12, SECOND_THESSALONIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testSecondThessaloniansChp2NumVerses(){
		assertEquals(17, SECOND_THESSALONIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testSecondThessaloniansChp3NumVerses(){
		assertEquals(18, SECOND_THESSALONIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testFromName(){
		assertEquals(SECOND_THESSALONIANS, EnumBible.fromName("2 Thessalonians"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(SECOND_THESSALONIANS, EnumBible.fromString("2 Thessalonians"));
	}
	
	@Test
	public void testFromAlias2Thes(){
		assertEquals(SECOND_THESSALONIANS, EnumBible.fromString("2Thes"));
	}
	
	@Test
	public void testFromAlias2Th(){
		assertEquals(SECOND_THESSALONIANS, EnumBible.fromString("2Th"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(SECOND_THESSALONIANS, EnumBible.fromInt(53));
	}
}
