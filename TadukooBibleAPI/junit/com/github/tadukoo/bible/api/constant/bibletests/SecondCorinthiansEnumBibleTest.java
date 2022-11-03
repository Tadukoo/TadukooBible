package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.SECOND_CORINTHIANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondCorinthiansEnumBibleTest{
	
	@Test
	public void testSecondCorinthiansName(){
		assertEquals("2 Corinthians", SECOND_CORINTHIANS.getName());
	}
	
	@Test
	public void testSecondCorinthiansAuthor(){
		assertEquals("Paul", SECOND_CORINTHIANS.getAuthor());
	}
	
	@Test
	public void testSecondCorinthiansAliases(){
		assertEquals(ListUtil.createList("2Cor", "2Co"), SECOND_CORINTHIANS.getAliases());
	}
	
	@Test
	public void testSecondCorinthiansChapters(){
		assertEquals(ListUtil.createList(24, 17, 18, 18, 21, 18, 16, 24, 15, 18, 33, 21, 14), SECOND_CORINTHIANS.getChapters());
	}
	
	@Test
	public void testSecondCorinthiansNumChapters(){
		assertEquals(13, SECOND_CORINTHIANS.getNumChapters());
	}
	
	@Test
	public void testSecondCorinthiansChp1NumVerses(){
		assertEquals(24, SECOND_CORINTHIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testSecondCorinthiansChp2NumVerses(){
		assertEquals(17, SECOND_CORINTHIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testSecondCorinthiansChp3NumVerses(){
		assertEquals(18, SECOND_CORINTHIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testSecondCorinthiansChp4NumVerses(){
		assertEquals(18, SECOND_CORINTHIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void testSecondCorinthiansChp5NumVerses(){
		assertEquals(21, SECOND_CORINTHIANS.getNumVersesInChp(5));
	}
	
	@Test
	public void testSecondCorinthiansChp6NumVerses(){
		assertEquals(18, SECOND_CORINTHIANS.getNumVersesInChp(6));
	}
	
	@Test
	public void testSecondCorinthiansChp7NumVerses(){
		assertEquals(16, SECOND_CORINTHIANS.getNumVersesInChp(7));
	}
	
	@Test
	public void testSecondCorinthiansChp8NumVerses(){
		assertEquals(24, SECOND_CORINTHIANS.getNumVersesInChp(8));
	}
	
	@Test
	public void testSecondCorinthiansChp9NumVerses(){
		assertEquals(15, SECOND_CORINTHIANS.getNumVersesInChp(9));
	}
	
	@Test
	public void testSecondCorinthiansChp10NumVerses(){
		assertEquals(18, SECOND_CORINTHIANS.getNumVersesInChp(10));
	}
	
	@Test
	public void testSecondCorinthiansChp11NumVerses(){
		assertEquals(33, SECOND_CORINTHIANS.getNumVersesInChp(11));
	}
	
	@Test
	public void testSecondCorinthiansChp12NumVerses(){
		assertEquals(21, SECOND_CORINTHIANS.getNumVersesInChp(12));
	}
	
	@Test
	public void testSecondCorinthiansChp13NumVerses(){
		assertEquals(14, SECOND_CORINTHIANS.getNumVersesInChp(13));
	}
	
	@Test
	public void testFromName(){
		assertEquals(SECOND_CORINTHIANS, EnumBible.fromName("2 Corinthians"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(SECOND_CORINTHIANS, EnumBible.fromString("2 Corinthians"));
	}
	
	@Test
	public void testFromAlias2Cor(){
		assertEquals(SECOND_CORINTHIANS, EnumBible.fromString("2Cor"));
	}
	
	@Test
	public void testFromAlias2Co(){
		assertEquals(SECOND_CORINTHIANS, EnumBible.fromString("2Co"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(SECOND_CORINTHIANS, EnumBible.fromInt(47));
	}
}
