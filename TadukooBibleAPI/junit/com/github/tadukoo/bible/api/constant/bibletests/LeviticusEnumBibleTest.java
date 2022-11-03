package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.LEVITICUS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeviticusEnumBibleTest{
	
	@Test
	public void testLeviticusName(){
		assertEquals("Leviticus", LEVITICUS.getName());
	}
	
	@Test
	public void testLeviticusAuthor(){
		assertEquals("Moses", LEVITICUS.getAuthor());
	}
	
	@Test
	public void testLeviticusAliases(){
		assertEquals(ListUtil.createList("Lev", "Le"), LEVITICUS.getAliases());
	}
	
	@Test
	public void testLeviticusChapters(){
		assertEquals(ListUtil.createList(17, 16, 17, 35, 19, 30, 38, 36, 24, 20, 47, 8, 59, 57, 33, 34, 16, 30, 37, 27, 24, 33, 44, 23, 55, 46, 34), LEVITICUS.getChapters());
	}
	
	@Test
	public void testLeviticusNumChapters(){
		assertEquals(27, LEVITICUS.getNumChapters());
	}
	
	@Test
	public void testLeviticusChp1NumVerses(){
		assertEquals(17, LEVITICUS.getNumVersesInChp(1));
	}
	
	@Test
	public void testLeviticusChp2NumVerses(){
		assertEquals(16, LEVITICUS.getNumVersesInChp(2));
	}
	
	@Test
	public void testLeviticusChp3NumVerses(){
		assertEquals(17, LEVITICUS.getNumVersesInChp(3));
	}
	
	@Test
	public void testLeviticusChp4NumVerses(){
		assertEquals(35, LEVITICUS.getNumVersesInChp(4));
	}
	
	@Test
	public void testLeviticusChp5NumVerses(){
		assertEquals(19, LEVITICUS.getNumVersesInChp(5));
	}
	
	@Test
	public void testLeviticusChp6NumVerses(){
		assertEquals(30, LEVITICUS.getNumVersesInChp(6));
	}
	
	@Test
	public void testLeviticusChp7NumVerses(){
		assertEquals(38, LEVITICUS.getNumVersesInChp(7));
	}
	
	@Test
	public void testLeviticusChp8NumVerses(){
		assertEquals(36, LEVITICUS.getNumVersesInChp(8));
	}
	
	@Test
	public void testLeviticusChp9NumVerses(){
		assertEquals(24, LEVITICUS.getNumVersesInChp(9));
	}
	
	@Test
	public void testLeviticusChp10NumVerses(){
		assertEquals(20, LEVITICUS.getNumVersesInChp(10));
	}
	
	@Test
	public void testLeviticusChp11NumVerses(){
		assertEquals(47, LEVITICUS.getNumVersesInChp(11));
	}
	
	@Test
	public void testLeviticusChp12NumVerses(){
		assertEquals(8, LEVITICUS.getNumVersesInChp(12));
	}
	
	@Test
	public void testLeviticusChp13NumVerses(){
		assertEquals(59, LEVITICUS.getNumVersesInChp(13));
	}
	
	@Test
	public void testLeviticusChp14NumVerses(){
		assertEquals(57, LEVITICUS.getNumVersesInChp(14));
	}
	
	@Test
	public void testLeviticusChp15NumVerses(){
		assertEquals(33, LEVITICUS.getNumVersesInChp(15));
	}
	
	@Test
	public void testLeviticusChp16NumVerses(){
		assertEquals(34, LEVITICUS.getNumVersesInChp(16));
	}
	
	@Test
	public void testLeviticusChp17NumVerses(){
		assertEquals(16, LEVITICUS.getNumVersesInChp(17));
	}
	
	@Test
	public void testLeviticusChp18NumVerses(){
		assertEquals(30, LEVITICUS.getNumVersesInChp(18));
	}
	
	@Test
	public void testLeviticusChp19NumVerses(){
		assertEquals(37, LEVITICUS.getNumVersesInChp(19));
	}
	
	@Test
	public void testLeviticusChp20NumVerses(){
		assertEquals(27, LEVITICUS.getNumVersesInChp(20));
	}
	
	@Test
	public void testLeviticusChp21NumVerses(){
		assertEquals(24, LEVITICUS.getNumVersesInChp(21));
	}
	
	@Test
	public void testLeviticusChp22NumVerses(){
		assertEquals(33, LEVITICUS.getNumVersesInChp(22));
	}
	
	@Test
	public void testLeviticusChp23NumVerses(){
		assertEquals(44, LEVITICUS.getNumVersesInChp(23));
	}
	
	@Test
	public void testLeviticusChp24NumVerses(){
		assertEquals(23, LEVITICUS.getNumVersesInChp(24));
	}
	
	@Test
	public void testLeviticusChp25NumVerses(){
		assertEquals(55, LEVITICUS.getNumVersesInChp(25));
	}
	
	@Test
	public void testLeviticusChp26NumVerses(){
		assertEquals(46, LEVITICUS.getNumVersesInChp(26));
	}
	
	@Test
	public void testLeviticusChp27NumVerses(){
		assertEquals(34, LEVITICUS.getNumVersesInChp(27));
	}
	
	@Test
	public void testFromName(){
		assertEquals(LEVITICUS, EnumBible.fromName("Leviticus"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(LEVITICUS, EnumBible.fromString("Leviticus"));
	}
	
	@Test
	public void testFromAliasLev(){
		assertEquals(LEVITICUS, EnumBible.fromString("Lev"));
	}
	
	@Test
	public void testFromAliasLe(){
		assertEquals(LEVITICUS, EnumBible.fromString("Le"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(LEVITICUS, EnumBible.fromInt(3));
	}
}
