package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.JEREMIAH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JeremiahEnumBibleTest{
	
	@Test
	public void testJeremiahName(){
		assertEquals("Jeremiah", JEREMIAH.getName());
	}
	
	@Test
	public void testJeremiahAuthor(){
		assertEquals("Jeremiah", JEREMIAH.getAuthor());
	}
	
	@Test
	public void testJeremiahAliases(){
		assertEquals(ListUtil.createList("Jer", "Je"), JEREMIAH.getAliases());
	}
	
	@Test
	public void testJeremiahChapters(){
		assertEquals(ListUtil.createList(19, 37, 25, 31, 31, 30, 34, 22, 26, 25, 23, 17, 27, 22, 21, 21, 27, 23, 15, 18, 14, 30, 40, 10, 38, 24, 22, 17, 32, 24, 40, 44, 26, 22, 19, 32, 21, 28, 18, 16, 18, 22, 13, 30, 5, 28, 7, 47, 39, 46, 64, 34), JEREMIAH.getChapters());
	}
	
	@Test
	public void testJeremiahNumChapters(){
		assertEquals(52, JEREMIAH.getNumChapters());
	}
	
	@Test
	public void testJeremiahChp1NumVerses(){
		assertEquals(19, JEREMIAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testJeremiahChp2NumVerses(){
		assertEquals(37, JEREMIAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testJeremiahChp3NumVerses(){
		assertEquals(25, JEREMIAH.getNumVersesInChp(3));
	}
	
	@Test
	public void testJeremiahChp4NumVerses(){
		assertEquals(31, JEREMIAH.getNumVersesInChp(4));
	}
	
	@Test
	public void testJeremiahChp5NumVerses(){
		assertEquals(31, JEREMIAH.getNumVersesInChp(5));
	}
	
	@Test
	public void testJeremiahChp6NumVerses(){
		assertEquals(30, JEREMIAH.getNumVersesInChp(6));
	}
	
	@Test
	public void testJeremiahChp7NumVerses(){
		assertEquals(34, JEREMIAH.getNumVersesInChp(7));
	}
	
	@Test
	public void testJeremiahChp8NumVerses(){
		assertEquals(22, JEREMIAH.getNumVersesInChp(8));
	}
	
	@Test
	public void testJeremiahChp9NumVerses(){
		assertEquals(26, JEREMIAH.getNumVersesInChp(9));
	}
	
	@Test
	public void testJeremiahChp10NumVerses(){
		assertEquals(25, JEREMIAH.getNumVersesInChp(10));
	}
	
	@Test
	public void testJeremiahChp11NumVerses(){
		assertEquals(23, JEREMIAH.getNumVersesInChp(11));
	}
	
	@Test
	public void testJeremiahChp12NumVerses(){
		assertEquals(17, JEREMIAH.getNumVersesInChp(12));
	}
	
	@Test
	public void testJeremiahChp13NumVerses(){
		assertEquals(27, JEREMIAH.getNumVersesInChp(13));
	}
	
	@Test
	public void testJeremiahChp14NumVerses(){
		assertEquals(22, JEREMIAH.getNumVersesInChp(14));
	}
	
	@Test
	public void testJeremiahChp15NumVerses(){
		assertEquals(21, JEREMIAH.getNumVersesInChp(15));
	}
	
	@Test
	public void testJeremiahChp16NumVerses(){
		assertEquals(21, JEREMIAH.getNumVersesInChp(16));
	}
	
	@Test
	public void testJeremiahChp17NumVerses(){
		assertEquals(27, JEREMIAH.getNumVersesInChp(17));
	}
	
	@Test
	public void testJeremiahChp18NumVerses(){
		assertEquals(23, JEREMIAH.getNumVersesInChp(18));
	}
	
	@Test
	public void testJeremiahChp19NumVerses(){
		assertEquals(15, JEREMIAH.getNumVersesInChp(19));
	}
	
	@Test
	public void testJeremiahChp20NumVerses(){
		assertEquals(18, JEREMIAH.getNumVersesInChp(20));
	}
	
	@Test
	public void testJeremiahChp21NumVerses(){
		assertEquals(14, JEREMIAH.getNumVersesInChp(21));
	}
	
	@Test
	public void testJeremiahChp22NumVerses(){
		assertEquals(30, JEREMIAH.getNumVersesInChp(22));
	}
	
	@Test
	public void testJeremiahChp23NumVerses(){
		assertEquals(40, JEREMIAH.getNumVersesInChp(23));
	}
	
	@Test
	public void testJeremiahChp24NumVerses(){
		assertEquals(10, JEREMIAH.getNumVersesInChp(24));
	}
	
	@Test
	public void testJeremiahChp25NumVerses(){
		assertEquals(38, JEREMIAH.getNumVersesInChp(25));
	}
	
	@Test
	public void testJeremiahChp26NumVerses(){
		assertEquals(24, JEREMIAH.getNumVersesInChp(26));
	}
	
	@Test
	public void testJeremiahChp27NumVerses(){
		assertEquals(22, JEREMIAH.getNumVersesInChp(27));
	}
	
	@Test
	public void testJeremiahChp28NumVerses(){
		assertEquals(17, JEREMIAH.getNumVersesInChp(28));
	}
	
	@Test
	public void testJeremiahChp29NumVerses(){
		assertEquals(32, JEREMIAH.getNumVersesInChp(29));
	}
	
	@Test
	public void testJeremiahChp30NumVerses(){
		assertEquals(24, JEREMIAH.getNumVersesInChp(30));
	}
	
	@Test
	public void testJeremiahChp31NumVerses(){
		assertEquals(40, JEREMIAH.getNumVersesInChp(31));
	}
	
	@Test
	public void testJeremiahChp32NumVerses(){
		assertEquals(44, JEREMIAH.getNumVersesInChp(32));
	}
	
	@Test
	public void testJeremiahChp33NumVerses(){
		assertEquals(26, JEREMIAH.getNumVersesInChp(33));
	}
	
	@Test
	public void testJeremiahChp34NumVerses(){
		assertEquals(22, JEREMIAH.getNumVersesInChp(34));
	}
	
	@Test
	public void testJeremiahChp35NumVerses(){
		assertEquals(19, JEREMIAH.getNumVersesInChp(35));
	}
	
	@Test
	public void testJeremiahChp36NumVerses(){
		assertEquals(32, JEREMIAH.getNumVersesInChp(36));
	}
	
	@Test
	public void testJeremiahChp37NumVerses(){
		assertEquals(21, JEREMIAH.getNumVersesInChp(37));
	}
	
	@Test
	public void testJeremiahChp38NumVerses(){
		assertEquals(28, JEREMIAH.getNumVersesInChp(38));
	}
	
	@Test
	public void testJeremiahChp39NumVerses(){
		assertEquals(18, JEREMIAH.getNumVersesInChp(39));
	}
	
	@Test
	public void testJeremiahChp40NumVerses(){
		assertEquals(16, JEREMIAH.getNumVersesInChp(40));
	}
	
	@Test
	public void testJeremiahChp41NumVerses(){
		assertEquals(18, JEREMIAH.getNumVersesInChp(41));
	}
	
	@Test
	public void testJeremiahChp42NumVerses(){
		assertEquals(22, JEREMIAH.getNumVersesInChp(42));
	}
	
	@Test
	public void testJeremiahChp43NumVerses(){
		assertEquals(13, JEREMIAH.getNumVersesInChp(43));
	}
	
	@Test
	public void testJeremiahChp44NumVerses(){
		assertEquals(30, JEREMIAH.getNumVersesInChp(44));
	}
	
	@Test
	public void testJeremiahChp45NumVerses(){
		assertEquals(5, JEREMIAH.getNumVersesInChp(45));
	}
	
	@Test
	public void testJeremiahChp46NumVerses(){
		assertEquals(28, JEREMIAH.getNumVersesInChp(46));
	}
	
	@Test
	public void testJeremiahChp47NumVerses(){
		assertEquals(7, JEREMIAH.getNumVersesInChp(47));
	}
	
	@Test
	public void testJeremiahChp48NumVerses(){
		assertEquals(47, JEREMIAH.getNumVersesInChp(48));
	}
	
	@Test
	public void testJeremiahChp49NumVerses(){
		assertEquals(39, JEREMIAH.getNumVersesInChp(49));
	}
	
	@Test
	public void testJeremiahChp50NumVerses(){
		assertEquals(46, JEREMIAH.getNumVersesInChp(50));
	}
	
	@Test
	public void testJeremiahChp51NumVerses(){
		assertEquals(64, JEREMIAH.getNumVersesInChp(51));
	}
	
	@Test
	public void testJeremiahChp52NumVerses(){
		assertEquals(34, JEREMIAH.getNumVersesInChp(52));
	}
	
	@Test
	public void testFromName(){
		assertEquals(JEREMIAH, EnumBible.fromName("Jeremiah"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(JEREMIAH, EnumBible.fromString("Jeremiah"));
	}
	
	@Test
	public void testFromAliasJer(){
		assertEquals(JEREMIAH, EnumBible.fromString("Jer"));
	}
	
	@Test
	public void testFromAliasJe(){
		assertEquals(JEREMIAH, EnumBible.fromString("Je"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(JEREMIAH, EnumBible.fromInt(24));
	}
}
