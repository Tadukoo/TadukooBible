package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.FIRST_CORINTHIANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstCorinthiansEnumBibleTest{
	
	@Test
	public void testFirstCorinthiansName(){
		assertEquals("1 Corinthians", FIRST_CORINTHIANS.getName());
	}
	
	@Test
	public void testFirstCorinthiansAuthor(){
		assertEquals("Paul", FIRST_CORINTHIANS.getAuthor());
	}
	
	@Test
	public void testFirstCorinthiansAliases(){
		assertEquals(ListUtil.createList("1Cor", "1Co"), FIRST_CORINTHIANS.getAliases());
	}
	
	@Test
	public void testFirstCorinthiansChapters(){
		assertEquals(ListUtil.createList(31, 16, 23, 21, 13, 20, 40, 13, 27, 33, 34, 31, 13, 40, 58, 24), FIRST_CORINTHIANS.getChapters());
	}
	
	@Test
	public void testFirstCorinthiansNumChapters(){
		assertEquals(16, FIRST_CORINTHIANS.getNumChapters());
	}
	
	@Test
	public void testFirstCorinthiansChp1NumVerses(){
		assertEquals(31, FIRST_CORINTHIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testFirstCorinthiansChp2NumVerses(){
		assertEquals(16, FIRST_CORINTHIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testFirstCorinthiansChp3NumVerses(){
		assertEquals(23, FIRST_CORINTHIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testFirstCorinthiansChp4NumVerses(){
		assertEquals(21, FIRST_CORINTHIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void testFirstCorinthiansChp5NumVerses(){
		assertEquals(13, FIRST_CORINTHIANS.getNumVersesInChp(5));
	}
	
	@Test
	public void testFirstCorinthiansChp6NumVerses(){
		assertEquals(20, FIRST_CORINTHIANS.getNumVersesInChp(6));
	}
	
	@Test
	public void testFirstCorinthiansChp7NumVerses(){
		assertEquals(40, FIRST_CORINTHIANS.getNumVersesInChp(7));
	}
	
	@Test
	public void testFirstCorinthiansChp8NumVerses(){
		assertEquals(13, FIRST_CORINTHIANS.getNumVersesInChp(8));
	}
	
	@Test
	public void testFirstCorinthiansChp9NumVerses(){
		assertEquals(27, FIRST_CORINTHIANS.getNumVersesInChp(9));
	}
	
	@Test
	public void testFirstCorinthiansChp10NumVerses(){
		assertEquals(33, FIRST_CORINTHIANS.getNumVersesInChp(10));
	}
	
	@Test
	public void testFirstCorinthiansChp11NumVerses(){
		assertEquals(34, FIRST_CORINTHIANS.getNumVersesInChp(11));
	}
	
	@Test
	public void testFirstCorinthiansChp12NumVerses(){
		assertEquals(31, FIRST_CORINTHIANS.getNumVersesInChp(12));
	}
	
	@Test
	public void testFirstCorinthiansChp13NumVerses(){
		assertEquals(13, FIRST_CORINTHIANS.getNumVersesInChp(13));
	}
	
	@Test
	public void testFirstCorinthiansChp14NumVerses(){
		assertEquals(40, FIRST_CORINTHIANS.getNumVersesInChp(14));
	}
	
	@Test
	public void testFirstCorinthiansChp15NumVerses(){
		assertEquals(58, FIRST_CORINTHIANS.getNumVersesInChp(15));
	}
	
	@Test
	public void testFirstCorinthiansChp16NumVerses(){
		assertEquals(24, FIRST_CORINTHIANS.getNumVersesInChp(16));
	}
	
	@Test
	public void testFromName(){
		assertEquals(FIRST_CORINTHIANS, EnumBible.fromName("1 Corinthians"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(FIRST_CORINTHIANS, EnumBible.fromString("1 Corinthians"));
	}
	
	@Test
	public void testFromAlias1Cor(){
		assertEquals(FIRST_CORINTHIANS, EnumBible.fromString("1Cor"));
	}
	
	@Test
	public void testFromAlias1Co(){
		assertEquals(FIRST_CORINTHIANS, EnumBible.fromString("1Co"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(FIRST_CORINTHIANS, EnumBible.fromInt(46));
	}
}
