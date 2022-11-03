package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.ECCLESIASTES;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EcclesiastesEnumBibleTest{
	
	@Test
	public void testEcclesiastesName(){
		assertEquals("Ecclesiastes", ECCLESIASTES.getName());
	}
	
	@Test
	public void testEcclesiastesAuthor(){
		assertEquals("Solomon", ECCLESIASTES.getAuthor());
	}
	
	@Test
	public void testEcclesiastesAliases(){
		assertEquals(ListUtil.createList("Ecc", "Ec"), ECCLESIASTES.getAliases());
	}
	
	@Test
	public void testEcclesiastesChapters(){
		assertEquals(ListUtil.createList(18, 26, 22, 16, 20, 12, 29, 17, 18, 20, 10, 14), ECCLESIASTES.getChapters());
	}
	
	@Test
	public void testEcclesiastesNumChapters(){
		assertEquals(12, ECCLESIASTES.getNumChapters());
	}
	
	@Test
	public void testEcclesiastesChp1NumVerses(){
		assertEquals(18, ECCLESIASTES.getNumVersesInChp(1));
	}
	
	@Test
	public void testEcclesiastesChp2NumVerses(){
		assertEquals(26, ECCLESIASTES.getNumVersesInChp(2));
	}
	
	@Test
	public void testEcclesiastesChp3NumVerses(){
		assertEquals(22, ECCLESIASTES.getNumVersesInChp(3));
	}
	
	@Test
	public void testEcclesiastesChp4NumVerses(){
		assertEquals(16, ECCLESIASTES.getNumVersesInChp(4));
	}
	
	@Test
	public void testEcclesiastesChp5NumVerses(){
		assertEquals(20, ECCLESIASTES.getNumVersesInChp(5));
	}
	
	@Test
	public void testEcclesiastesChp6NumVerses(){
		assertEquals(12, ECCLESIASTES.getNumVersesInChp(6));
	}
	
	@Test
	public void testEcclesiastesChp7NumVerses(){
		assertEquals(29, ECCLESIASTES.getNumVersesInChp(7));
	}
	
	@Test
	public void testEcclesiastesChp8NumVerses(){
		assertEquals(17, ECCLESIASTES.getNumVersesInChp(8));
	}
	
	@Test
	public void testEcclesiastesChp9NumVerses(){
		assertEquals(18, ECCLESIASTES.getNumVersesInChp(9));
	}
	
	@Test
	public void testEcclesiastesChp10NumVerses(){
		assertEquals(20, ECCLESIASTES.getNumVersesInChp(10));
	}
	
	@Test
	public void testEcclesiastesChp11NumVerses(){
		assertEquals(10, ECCLESIASTES.getNumVersesInChp(11));
	}
	
	@Test
	public void testEcclesiastesChp12NumVerses(){
		assertEquals(14, ECCLESIASTES.getNumVersesInChp(12));
	}
	
	@Test
	public void testFromName(){
		assertEquals(ECCLESIASTES, EnumBible.fromName("Ecclesiastes"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(ECCLESIASTES, EnumBible.fromString("Ecclesiastes"));
	}
	
	@Test
	public void testFromAliasEcc(){
		assertEquals(ECCLESIASTES, EnumBible.fromString("Ecc"));
	}
	
	@Test
	public void testFromAliasEc(){
		assertEquals(ECCLESIASTES, EnumBible.fromString("Ec"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(ECCLESIASTES, EnumBible.fromInt(21));
	}
}
