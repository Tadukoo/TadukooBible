package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.PROVERBS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProverbsEnumBibleTest{
	
	@Test
	public void testProverbsName(){
		assertEquals("Proverbs", PROVERBS.getName());
	}
	
	@Test
	public void testProverbsAuthor(){
		assertEquals("Solomon", PROVERBS.getAuthor());
	}
	
	@Test
	public void testProverbsAliases(){
		assertEquals(ListUtil.createList("Pro", "Pr"), PROVERBS.getAliases());
	}
	
	@Test
	public void testProverbsChapters(){
		assertEquals(ListUtil.createList(33, 22, 35, 27, 23, 35, 27, 36, 18, 32, 31, 28, 25, 35, 33, 33, 28, 24, 29, 30, 31, 29, 35, 34, 28, 28, 27, 28, 27, 33, 31), PROVERBS.getChapters());
	}
	
	@Test
	public void testProverbsNumChapters(){
		assertEquals(31, PROVERBS.getNumChapters());
	}
	
	@Test
	public void testProverbsChp1NumVerses(){
		assertEquals(33, PROVERBS.getNumVersesInChp(1));
	}
	
	@Test
	public void testProverbsChp2NumVerses(){
		assertEquals(22, PROVERBS.getNumVersesInChp(2));
	}
	
	@Test
	public void testProverbsChp3NumVerses(){
		assertEquals(35, PROVERBS.getNumVersesInChp(3));
	}
	
	@Test
	public void testProverbsChp4NumVerses(){
		assertEquals(27, PROVERBS.getNumVersesInChp(4));
	}
	
	@Test
	public void testProverbsChp5NumVerses(){
		assertEquals(23, PROVERBS.getNumVersesInChp(5));
	}
	
	@Test
	public void testProverbsChp6NumVerses(){
		assertEquals(35, PROVERBS.getNumVersesInChp(6));
	}
	
	@Test
	public void testProverbsChp7NumVerses(){
		assertEquals(27, PROVERBS.getNumVersesInChp(7));
	}
	
	@Test
	public void testProverbsChp8NumVerses(){
		assertEquals(36, PROVERBS.getNumVersesInChp(8));
	}
	
	@Test
	public void testProverbsChp9NumVerses(){
		assertEquals(18, PROVERBS.getNumVersesInChp(9));
	}
	
	@Test
	public void testProverbsChp10NumVerses(){
		assertEquals(32, PROVERBS.getNumVersesInChp(10));
	}
	
	@Test
	public void testProverbsChp11NumVerses(){
		assertEquals(31, PROVERBS.getNumVersesInChp(11));
	}
	
	@Test
	public void testProverbsChp12NumVerses(){
		assertEquals(28, PROVERBS.getNumVersesInChp(12));
	}
	
	@Test
	public void testProverbsChp13NumVerses(){
		assertEquals(25, PROVERBS.getNumVersesInChp(13));
	}
	
	@Test
	public void testProverbsChp14NumVerses(){
		assertEquals(35, PROVERBS.getNumVersesInChp(14));
	}
	
	@Test
	public void testProverbsChp15NumVerses(){
		assertEquals(33, PROVERBS.getNumVersesInChp(15));
	}
	
	@Test
	public void testProverbsChp16NumVerses(){
		assertEquals(33, PROVERBS.getNumVersesInChp(16));
	}
	
	@Test
	public void testProverbsChp17NumVerses(){
		assertEquals(28, PROVERBS.getNumVersesInChp(17));
	}
	
	@Test
	public void testProverbsChp18NumVerses(){
		assertEquals(24, PROVERBS.getNumVersesInChp(18));
	}
	
	@Test
	public void testProverbsChp19NumVerses(){
		assertEquals(29, PROVERBS.getNumVersesInChp(19));
	}
	
	@Test
	public void testProverbsChp20NumVerses(){
		assertEquals(30, PROVERBS.getNumVersesInChp(20));
	}
	
	@Test
	public void testProverbsChp21NumVerses(){
		assertEquals(31, PROVERBS.getNumVersesInChp(21));
	}
	
	@Test
	public void testProverbsChp22NumVerses(){
		assertEquals(29, PROVERBS.getNumVersesInChp(22));
	}
	
	@Test
	public void testProverbsChp23NumVerses(){
		assertEquals(35, PROVERBS.getNumVersesInChp(23));
	}
	
	@Test
	public void testProverbsChp24NumVerses(){
		assertEquals(34, PROVERBS.getNumVersesInChp(24));
	}
	
	@Test
	public void testProverbsChp25NumVerses(){
		assertEquals(28, PROVERBS.getNumVersesInChp(25));
	}
	
	@Test
	public void testProverbsChp26NumVerses(){
		assertEquals(28, PROVERBS.getNumVersesInChp(26));
	}
	
	@Test
	public void testProverbsChp27NumVerses(){
		assertEquals(27, PROVERBS.getNumVersesInChp(27));
	}
	
	@Test
	public void testProverbsChp28NumVerses(){
		assertEquals(28, PROVERBS.getNumVersesInChp(28));
	}
	
	@Test
	public void testProverbsChp29NumVerses(){
		assertEquals(27, PROVERBS.getNumVersesInChp(29));
	}
	
	@Test
	public void testProverbsChp30NumVerses(){
		assertEquals(33, PROVERBS.getNumVersesInChp(30));
	}
	
	@Test
	public void testProverbsChp31NumVerses(){
		assertEquals(31, PROVERBS.getNumVersesInChp(31));
	}
	
	@Test
	public void testFromName(){
		assertEquals(PROVERBS, EnumBible.fromName("Proverbs"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(PROVERBS, EnumBible.fromString("Proverbs"));
	}
	
	@Test
	public void testFromAliasPro(){
		assertEquals(PROVERBS, EnumBible.fromString("Pro"));
	}
	
	@Test
	public void testFromAliasPr(){
		assertEquals(PROVERBS, EnumBible.fromString("Pr"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(PROVERBS, EnumBible.fromInt(20));
	}
}
