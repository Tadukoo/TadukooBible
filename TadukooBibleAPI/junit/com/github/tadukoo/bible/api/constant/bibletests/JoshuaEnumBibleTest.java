package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.JOSHUA;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JoshuaEnumBibleTest{
	
	@Test
	public void testJoshuaName(){
		assertEquals("Joshua", JOSHUA.getName());
	}
	
	@Test
	public void testJoshuaAuthor(){
		assertEquals("Joshua", JOSHUA.getAuthor());
	}
	
	@Test
	public void testJoshuaAliases(){
		assertEquals(ListUtil.createList("Jos"), JOSHUA.getAliases());
	}
	
	@Test
	public void testJoshuaChapters(){
		assertEquals(ListUtil.createList(18, 24, 17, 24, 15, 27, 26, 35, 27, 43, 23, 24, 33, 15, 63, 10, 18, 28, 51, 9, 45, 34, 16, 33), JOSHUA.getChapters());
	}
	
	@Test
	public void testJoshuaNumChapters(){
		assertEquals(24, JOSHUA.getNumChapters());
	}
	
	@Test
	public void testJoshuaChp1NumVerses(){
		assertEquals(18, JOSHUA.getNumVersesInChp(1));
	}
	
	@Test
	public void testJoshuaChp2NumVerses(){
		assertEquals(24, JOSHUA.getNumVersesInChp(2));
	}
	
	@Test
	public void testJoshuaChp3NumVerses(){
		assertEquals(17, JOSHUA.getNumVersesInChp(3));
	}
	
	@Test
	public void testJoshuaChp4NumVerses(){
		assertEquals(24, JOSHUA.getNumVersesInChp(4));
	}
	
	@Test
	public void testJoshuaChp5NumVerses(){
		assertEquals(15, JOSHUA.getNumVersesInChp(5));
	}
	
	@Test
	public void testJoshuaChp6NumVerses(){
		assertEquals(27, JOSHUA.getNumVersesInChp(6));
	}
	
	@Test
	public void testJoshuaChp7NumVerses(){
		assertEquals(26, JOSHUA.getNumVersesInChp(7));
	}
	
	@Test
	public void testJoshuaChp8NumVerses(){
		assertEquals(35, JOSHUA.getNumVersesInChp(8));
	}
	
	@Test
	public void testJoshuaChp9NumVerses(){
		assertEquals(27, JOSHUA.getNumVersesInChp(9));
	}
	
	@Test
	public void testJoshuaChp10NumVerses(){
		assertEquals(43, JOSHUA.getNumVersesInChp(10));
	}
	
	@Test
	public void testJoshuaChp11NumVerses(){
		assertEquals(23, JOSHUA.getNumVersesInChp(11));
	}
	
	@Test
	public void testJoshuaChp12NumVerses(){
		assertEquals(24, JOSHUA.getNumVersesInChp(12));
	}
	
	@Test
	public void testJoshuaChp13NumVerses(){
		assertEquals(33, JOSHUA.getNumVersesInChp(13));
	}
	
	@Test
	public void testJoshuaChp14NumVerses(){
		assertEquals(15, JOSHUA.getNumVersesInChp(14));
	}
	
	@Test
	public void testJoshuaChp15NumVerses(){
		assertEquals(63, JOSHUA.getNumVersesInChp(15));
	}
	
	@Test
	public void testJoshuaChp16NumVerses(){
		assertEquals(10, JOSHUA.getNumVersesInChp(16));
	}
	
	@Test
	public void testJoshuaChp17NumVerses(){
		assertEquals(18, JOSHUA.getNumVersesInChp(17));
	}
	
	@Test
	public void testJoshuaChp18NumVerses(){
		assertEquals(28, JOSHUA.getNumVersesInChp(18));
	}
	
	@Test
	public void testJoshuaChp19NumVerses(){
		assertEquals(51, JOSHUA.getNumVersesInChp(19));
	}
	
	@Test
	public void testJoshuaChp20NumVerses(){
		assertEquals(9, JOSHUA.getNumVersesInChp(20));
	}
	
	@Test
	public void testJoshuaChp21NumVerses(){
		assertEquals(45, JOSHUA.getNumVersesInChp(21));
	}
	
	@Test
	public void testJoshuaChp22NumVerses(){
		assertEquals(34, JOSHUA.getNumVersesInChp(22));
	}
	
	@Test
	public void testJoshuaChp23NumVerses(){
		assertEquals(16, JOSHUA.getNumVersesInChp(23));
	}
	
	@Test
	public void testJoshuaChp24NumVerses(){
		assertEquals(33, JOSHUA.getNumVersesInChp(24));
	}
	
	@Test
	public void testFromName(){
		assertEquals(JOSHUA, EnumBible.fromName("Joshua"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(JOSHUA, EnumBible.fromString("Joshua"));
	}
	
	@Test
	public void testFromAliasJos(){
		assertEquals(JOSHUA, EnumBible.fromString("Jos"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(JOSHUA, EnumBible.fromInt(6));
	}
}
