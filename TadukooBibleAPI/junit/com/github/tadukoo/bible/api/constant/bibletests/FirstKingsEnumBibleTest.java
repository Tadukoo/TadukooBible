package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.FIRST_KINGS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstKingsEnumBibleTest{
	
	@Test
	public void testFirstKingsName(){
		assertEquals("1 Kings", FIRST_KINGS.getName());
	}
	
	@Test
	public void testFirstKingsAuthor(){
		assertEquals("Unknown", FIRST_KINGS.getAuthor());
	}
	
	@Test
	public void testFirstKingsAliases(){
		assertEquals(ListUtil.createList("1Ki"), FIRST_KINGS.getAliases());
	}
	
	@Test
	public void testFirstKingsChapters(){
		assertEquals(ListUtil.createList(53, 46, 28, 34, 18, 38, 51, 66, 28, 29, 43, 33, 34, 31, 34, 34, 24, 46, 21, 43, 29, 53), FIRST_KINGS.getChapters());
	}
	
	@Test
	public void testFirstKingsNumChapters(){
		assertEquals(22, FIRST_KINGS.getNumChapters());
	}
	
	@Test
	public void testFirstKingsChp1NumVerses(){
		assertEquals(53, FIRST_KINGS.getNumVersesInChp(1));
	}
	
	@Test
	public void testFirstKingsChp2NumVerses(){
		assertEquals(46, FIRST_KINGS.getNumVersesInChp(2));
	}
	
	@Test
	public void testFirstKingsChp3NumVerses(){
		assertEquals(28, FIRST_KINGS.getNumVersesInChp(3));
	}
	
	@Test
	public void testFirstKingsChp4NumVerses(){
		assertEquals(34, FIRST_KINGS.getNumVersesInChp(4));
	}
	
	@Test
	public void testFirstKingsChp5NumVerses(){
		assertEquals(18, FIRST_KINGS.getNumVersesInChp(5));
	}
	
	@Test
	public void testFirstKingsChp6NumVerses(){
		assertEquals(38, FIRST_KINGS.getNumVersesInChp(6));
	}
	
	@Test
	public void testFirstKingsChp7NumVerses(){
		assertEquals(51, FIRST_KINGS.getNumVersesInChp(7));
	}
	
	@Test
	public void testFirstKingsChp8NumVerses(){
		assertEquals(66, FIRST_KINGS.getNumVersesInChp(8));
	}
	
	@Test
	public void testFirstKingsChp9NumVerses(){
		assertEquals(28, FIRST_KINGS.getNumVersesInChp(9));
	}
	
	@Test
	public void testFirstKingsChp10NumVerses(){
		assertEquals(29, FIRST_KINGS.getNumVersesInChp(10));
	}
	
	@Test
	public void testFirstKingsChp11NumVerses(){
		assertEquals(43, FIRST_KINGS.getNumVersesInChp(11));
	}
	
	@Test
	public void testFirstKingsChp12NumVerses(){
		assertEquals(33, FIRST_KINGS.getNumVersesInChp(12));
	}
	
	@Test
	public void testFirstKingsChp13NumVerses(){
		assertEquals(34, FIRST_KINGS.getNumVersesInChp(13));
	}
	
	@Test
	public void testFirstKingsChp14NumVerses(){
		assertEquals(31, FIRST_KINGS.getNumVersesInChp(14));
	}
	
	@Test
	public void testFirstKingsChp15NumVerses(){
		assertEquals(34, FIRST_KINGS.getNumVersesInChp(15));
	}
	
	@Test
	public void testFirstKingsChp16NumVerses(){
		assertEquals(34, FIRST_KINGS.getNumVersesInChp(16));
	}
	
	@Test
	public void testFirstKingsChp17NumVerses(){
		assertEquals(24, FIRST_KINGS.getNumVersesInChp(17));
	}
	
	@Test
	public void testFirstKingsChp18NumVerses(){
		assertEquals(46, FIRST_KINGS.getNumVersesInChp(18));
	}
	
	@Test
	public void testFirstKingsChp19NumVerses(){
		assertEquals(21, FIRST_KINGS.getNumVersesInChp(19));
	}
	
	@Test
	public void testFirstKingsChp20NumVerses(){
		assertEquals(43, FIRST_KINGS.getNumVersesInChp(20));
	}
	
	@Test
	public void testFirstKingsChp21NumVerses(){
		assertEquals(29, FIRST_KINGS.getNumVersesInChp(21));
	}
	
	@Test
	public void testFirstKingsChp22NumVerses(){
		assertEquals(53, FIRST_KINGS.getNumVersesInChp(22));
	}
	
	@Test
	public void testFromName(){
		assertEquals(FIRST_KINGS, EnumBible.fromName("1 Kings"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(FIRST_KINGS, EnumBible.fromString("1 Kings"));
	}
	
	@Test
	public void testFromAlias1Ki(){
		assertEquals(FIRST_KINGS, EnumBible.fromString("1Ki"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(FIRST_KINGS, EnumBible.fromInt(11));
	}
}
