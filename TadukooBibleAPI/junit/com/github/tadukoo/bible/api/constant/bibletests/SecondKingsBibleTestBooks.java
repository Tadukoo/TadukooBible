package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.SECOND_KINGS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondKingsBibleTestBooks{
	
	@Test
	public void testSecondKingsName(){
		assertEquals("2 Kings", SECOND_KINGS.getName());
	}
	
	@Test
	public void testSecondKingsAuthor(){
		assertEquals("Unknown", SECOND_KINGS.getAuthor());
	}
	
	@Test
	public void testSecondKingsAliases(){
		assertEquals(ListUtil.createList("2Ki"), SECOND_KINGS.getAliases());
	}
	
	@Test
	public void testSecondKingsChapters(){
		assertEquals(ListUtil.createList(18, 25, 27, 44, 27, 33, 20, 29, 37, 36, 21, 21, 25, 29, 38, 20, 41, 37, 37, 21, 26, 20, 37, 20, 30), SECOND_KINGS.getChapters());
	}
	
	@Test
	public void testSecondKingsNumChapters(){
		assertEquals(25, SECOND_KINGS.getNumChapters());
	}
	
	@Test
	public void testSecondKingsChp1NumVerses(){
		assertEquals(18, SECOND_KINGS.getNumVersesInChp(1));
	}
	
	@Test
	public void testSecondKingsChp2NumVerses(){
		assertEquals(25, SECOND_KINGS.getNumVersesInChp(2));
	}
	
	@Test
	public void testSecondKingsChp3NumVerses(){
		assertEquals(27, SECOND_KINGS.getNumVersesInChp(3));
	}
	
	@Test
	public void testSecondKingsChp4NumVerses(){
		assertEquals(44, SECOND_KINGS.getNumVersesInChp(4));
	}
	
	@Test
	public void testSecondKingsChp5NumVerses(){
		assertEquals(27, SECOND_KINGS.getNumVersesInChp(5));
	}
	
	@Test
	public void testSecondKingsChp6NumVerses(){
		assertEquals(33, SECOND_KINGS.getNumVersesInChp(6));
	}
	
	@Test
	public void testSecondKingsChp7NumVerses(){
		assertEquals(20, SECOND_KINGS.getNumVersesInChp(7));
	}
	
	@Test
	public void testSecondKingsChp8NumVerses(){
		assertEquals(29, SECOND_KINGS.getNumVersesInChp(8));
	}
	
	@Test
	public void testSecondKingsChp9NumVerses(){
		assertEquals(37, SECOND_KINGS.getNumVersesInChp(9));
	}
	
	@Test
	public void testSecondKingsChp10NumVerses(){
		assertEquals(36, SECOND_KINGS.getNumVersesInChp(10));
	}
	
	@Test
	public void testSecondKingsChp11NumVerses(){
		assertEquals(21, SECOND_KINGS.getNumVersesInChp(11));
	}
	
	@Test
	public void testSecondKingsChp12NumVerses(){
		assertEquals(21, SECOND_KINGS.getNumVersesInChp(12));
	}
	
	@Test
	public void testSecondKingsChp13NumVerses(){
		assertEquals(25, SECOND_KINGS.getNumVersesInChp(13));
	}
	
	@Test
	public void testSecondKingsChp14NumVerses(){
		assertEquals(29, SECOND_KINGS.getNumVersesInChp(14));
	}
	
	@Test
	public void testSecondKingsChp15NumVerses(){
		assertEquals(38, SECOND_KINGS.getNumVersesInChp(15));
	}
	
	@Test
	public void testSecondKingsChp16NumVerses(){
		assertEquals(20, SECOND_KINGS.getNumVersesInChp(16));
	}
	
	@Test
	public void testSecondKingsChp17NumVerses(){
		assertEquals(41, SECOND_KINGS.getNumVersesInChp(17));
	}
	
	@Test
	public void testSecondKingsChp18NumVerses(){
		assertEquals(37, SECOND_KINGS.getNumVersesInChp(18));
	}
	
	@Test
	public void testSecondKingsChp19NumVerses(){
		assertEquals(37, SECOND_KINGS.getNumVersesInChp(19));
	}
	
	@Test
	public void testSecondKingsChp20NumVerses(){
		assertEquals(21, SECOND_KINGS.getNumVersesInChp(20));
	}
	
	@Test
	public void testSecondKingsChp21NumVerses(){
		assertEquals(26, SECOND_KINGS.getNumVersesInChp(21));
	}
	
	@Test
	public void testSecondKingsChp22NumVerses(){
		assertEquals(20, SECOND_KINGS.getNumVersesInChp(22));
	}
	
	@Test
	public void testSecondKingsChp23NumVerses(){
		assertEquals(37, SECOND_KINGS.getNumVersesInChp(23));
	}
	
	@Test
	public void testSecondKingsChp24NumVerses(){
		assertEquals(20, SECOND_KINGS.getNumVersesInChp(24));
	}
	
	@Test
	public void testSecondKingsChp25NumVerses(){
		assertEquals(30, SECOND_KINGS.getNumVersesInChp(25));
	}
	
	@Test
	public void testFromName(){
		assertEquals(SECOND_KINGS, BibleBooks.fromName("2 Kings"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(SECOND_KINGS, BibleBooks.fromString("2 Kings"));
	}
	
	@Test
	public void testFromAlias2Ki(){
		assertEquals(SECOND_KINGS, BibleBooks.fromString("2Ki"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(SECOND_KINGS, BibleBooks.fromInt(12));
	}
}
