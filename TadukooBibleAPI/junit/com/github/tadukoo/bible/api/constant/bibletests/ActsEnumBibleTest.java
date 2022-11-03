package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.ACTS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActsEnumBibleTest{
	
	@Test
	public void testActsName(){
		assertEquals("Acts", ACTS.getName());
	}
	
	@Test
	public void testActsAuthor(){
		assertEquals("Luke", ACTS.getAuthor());
	}
	
	@Test
	public void testActsAliases(){
		assertEquals(ListUtil.createList("Ac"), ACTS.getAliases());
	}
	
	@Test
	public void testActsChapters(){
		assertEquals(ListUtil.createList(26, 47, 26, 37, 42, 15, 60, 40, 43, 48, 30, 25, 52, 28, 41, 40, 34, 28, 41, 38, 40, 30, 35, 27, 27, 32, 44, 31), ACTS.getChapters());
	}
	
	@Test
	public void testActsNumChapters(){
		assertEquals(28, ACTS.getNumChapters());
	}
	
	@Test
	public void testActsChp1NumVerses(){
		assertEquals(26, ACTS.getNumVersesInChp(1));
	}
	
	@Test
	public void testActsChp2NumVerses(){
		assertEquals(47, ACTS.getNumVersesInChp(2));
	}
	
	@Test
	public void testActsChp3NumVerses(){
		assertEquals(26, ACTS.getNumVersesInChp(3));
	}
	
	@Test
	public void testActsChp4NumVerses(){
		assertEquals(37, ACTS.getNumVersesInChp(4));
	}
	
	@Test
	public void testActsChp5NumVerses(){
		assertEquals(42, ACTS.getNumVersesInChp(5));
	}
	
	@Test
	public void testActsChp6NumVerses(){
		assertEquals(15, ACTS.getNumVersesInChp(6));
	}
	
	@Test
	public void testActsChp7NumVerses(){
		assertEquals(60, ACTS.getNumVersesInChp(7));
	}
	
	@Test
	public void testActsChp8NumVerses(){
		assertEquals(40, ACTS.getNumVersesInChp(8));
	}
	
	@Test
	public void testActsChp9NumVerses(){
		assertEquals(43, ACTS.getNumVersesInChp(9));
	}
	
	@Test
	public void testActsChp10NumVerses(){
		assertEquals(48, ACTS.getNumVersesInChp(10));
	}
	
	@Test
	public void testActsChp11NumVerses(){
		assertEquals(30, ACTS.getNumVersesInChp(11));
	}
	
	@Test
	public void testActsChp12NumVerses(){
		assertEquals(25, ACTS.getNumVersesInChp(12));
	}
	
	@Test
	public void testActsChp13NumVerses(){
		assertEquals(52, ACTS.getNumVersesInChp(13));
	}
	
	@Test
	public void testActsChp14NumVerses(){
		assertEquals(28, ACTS.getNumVersesInChp(14));
	}
	
	@Test
	public void testActsChp15NumVerses(){
		assertEquals(41, ACTS.getNumVersesInChp(15));
	}
	
	@Test
	public void testActsChp16NumVerses(){
		assertEquals(40, ACTS.getNumVersesInChp(16));
	}
	
	@Test
	public void testActsChp17NumVerses(){
		assertEquals(34, ACTS.getNumVersesInChp(17));
	}
	
	@Test
	public void testActsChp18NumVerses(){
		assertEquals(28, ACTS.getNumVersesInChp(18));
	}
	
	@Test
	public void testActsChp19NumVerses(){
		assertEquals(41, ACTS.getNumVersesInChp(19));
	}
	
	@Test
	public void testActsChp20NumVerses(){
		assertEquals(38, ACTS.getNumVersesInChp(20));
	}
	
	@Test
	public void testActsChp21NumVerses(){
		assertEquals(40, ACTS.getNumVersesInChp(21));
	}
	
	@Test
	public void testActsChp22NumVerses(){
		assertEquals(30, ACTS.getNumVersesInChp(22));
	}
	
	@Test
	public void testActsChp23NumVerses(){
		assertEquals(35, ACTS.getNumVersesInChp(23));
	}
	
	@Test
	public void testActsChp24NumVerses(){
		assertEquals(27, ACTS.getNumVersesInChp(24));
	}
	
	@Test
	public void testActsChp25NumVerses(){
		assertEquals(27, ACTS.getNumVersesInChp(25));
	}
	
	@Test
	public void testActsChp26NumVerses(){
		assertEquals(32, ACTS.getNumVersesInChp(26));
	}
	
	@Test
	public void testActsChp27NumVerses(){
		assertEquals(44, ACTS.getNumVersesInChp(27));
	}
	
	@Test
	public void testActsChp28NumVerses(){
		assertEquals(31, ACTS.getNumVersesInChp(28));
	}
	
	@Test
	public void testFromName(){
		assertEquals(ACTS, EnumBible.fromName("Acts"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(ACTS, EnumBible.fromString("Acts"));
	}
	
	@Test
	public void testFromAliasAc(){
		assertEquals(ACTS, EnumBible.fromString("Ac"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(ACTS, EnumBible.fromInt(44));
	}
}
