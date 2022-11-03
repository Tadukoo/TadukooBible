package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.ESTHER;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstherEnumBibleTest{
	
	@Test
	public void testEstherName(){
		assertEquals("Esther", ESTHER.getName());
	}
	
	@Test
	public void testEstherAuthor(){
		assertEquals("Unknown", ESTHER.getAuthor());
	}
	
	@Test
	public void testEstherAliases(){
		assertEquals(ListUtil.createList("Est", "Es"), ESTHER.getAliases());
	}
	
	@Test
	public void testEstherChapters(){
		assertEquals(ListUtil.createList(22, 23, 15, 17, 14, 14, 10, 17, 32, 3), ESTHER.getChapters());
	}
	
	@Test
	public void testEstherNumChapters(){
		assertEquals(10, ESTHER.getNumChapters());
	}
	
	@Test
	public void testEstherChp1NumVerses(){
		assertEquals(22, ESTHER.getNumVersesInChp(1));
	}
	
	@Test
	public void testEstherChp2NumVerses(){
		assertEquals(23, ESTHER.getNumVersesInChp(2));
	}
	
	@Test
	public void testEstherChp3NumVerses(){
		assertEquals(15, ESTHER.getNumVersesInChp(3));
	}
	
	@Test
	public void testEstherChp4NumVerses(){
		assertEquals(17, ESTHER.getNumVersesInChp(4));
	}
	
	@Test
	public void testEstherChp5NumVerses(){
		assertEquals(14, ESTHER.getNumVersesInChp(5));
	}
	
	@Test
	public void testEstherChp6NumVerses(){
		assertEquals(14, ESTHER.getNumVersesInChp(6));
	}
	
	@Test
	public void testEstherChp7NumVerses(){
		assertEquals(10, ESTHER.getNumVersesInChp(7));
	}
	
	@Test
	public void testEstherChp8NumVerses(){
		assertEquals(17, ESTHER.getNumVersesInChp(8));
	}
	
	@Test
	public void testEstherChp9NumVerses(){
		assertEquals(32, ESTHER.getNumVersesInChp(9));
	}
	
	@Test
	public void testEstherChp10NumVerses(){
		assertEquals(3, ESTHER.getNumVersesInChp(10));
	}
	
	@Test
	public void testFromName(){
		assertEquals(ESTHER, EnumBible.fromName("Esther"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(ESTHER, EnumBible.fromString("Esther"));
	}
	
	@Test
	public void testFromAliasEst(){
		assertEquals(ESTHER, EnumBible.fromString("Est"));
	}
	
	@Test
	public void testFromAliasEs(){
		assertEquals(ESTHER, EnumBible.fromString("Es"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(ESTHER, EnumBible.fromInt(17));
	}
}
