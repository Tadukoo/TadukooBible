package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.SECOND_SAMUEL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondSamuelEnumBibleTest{
	
	@Test
	public void testSecondSamuelName(){
		assertEquals("2 Samuel", SECOND_SAMUEL.getName());
	}
	
	@Test
	public void testSecondSamuelAuthor(){
		assertEquals("Unknown", SECOND_SAMUEL.getAuthor());
	}
	
	@Test
	public void testSecondSamuelAliases(){
		assertEquals(ListUtil.createList("2Sam", "2Sa"), SECOND_SAMUEL.getAliases());
	}
	
	@Test
	public void testSecondSamuelChapters(){
		assertEquals(ListUtil.createList(27, 32, 39, 12, 25, 23, 29, 18, 13, 19, 27, 31, 39, 33, 37, 23, 29, 33, 43, 26, 22, 51, 39, 25), SECOND_SAMUEL.getChapters());
	}
	
	@Test
	public void testSecondSamuelNumChapters(){
		assertEquals(24, SECOND_SAMUEL.getNumChapters());
	}
	
	@Test
	public void testSecondSamuelChp1NumVerses(){
		assertEquals(27, SECOND_SAMUEL.getNumVersesInChp(1));
	}
	
	@Test
	public void testSecondSamuelChp2NumVerses(){
		assertEquals(32, SECOND_SAMUEL.getNumVersesInChp(2));
	}
	
	@Test
	public void testSecondSamuelChp3NumVerses(){
		assertEquals(39, SECOND_SAMUEL.getNumVersesInChp(3));
	}
	
	@Test
	public void testSecondSamuelChp4NumVerses(){
		assertEquals(12, SECOND_SAMUEL.getNumVersesInChp(4));
	}
	
	@Test
	public void testSecondSamuelChp5NumVerses(){
		assertEquals(25, SECOND_SAMUEL.getNumVersesInChp(5));
	}
	
	@Test
	public void testSecondSamuelChp6NumVerses(){
		assertEquals(23, SECOND_SAMUEL.getNumVersesInChp(6));
	}
	
	@Test
	public void testSecondSamuelChp7NumVerses(){
		assertEquals(29, SECOND_SAMUEL.getNumVersesInChp(7));
	}
	
	@Test
	public void testSecondSamuelChp8NumVerses(){
		assertEquals(18, SECOND_SAMUEL.getNumVersesInChp(8));
	}
	
	@Test
	public void testSecondSamuelChp9NumVerses(){
		assertEquals(13, SECOND_SAMUEL.getNumVersesInChp(9));
	}
	
	@Test
	public void testSecondSamuelChp10NumVerses(){
		assertEquals(19, SECOND_SAMUEL.getNumVersesInChp(10));
	}
	
	@Test
	public void testSecondSamuelChp11NumVerses(){
		assertEquals(27, SECOND_SAMUEL.getNumVersesInChp(11));
	}
	
	@Test
	public void testSecondSamuelChp12NumVerses(){
		assertEquals(31, SECOND_SAMUEL.getNumVersesInChp(12));
	}
	
	@Test
	public void testSecondSamuelChp13NumVerses(){
		assertEquals(39, SECOND_SAMUEL.getNumVersesInChp(13));
	}
	
	@Test
	public void testSecondSamuelChp14NumVerses(){
		assertEquals(33, SECOND_SAMUEL.getNumVersesInChp(14));
	}
	
	@Test
	public void testSecondSamuelChp15NumVerses(){
		assertEquals(37, SECOND_SAMUEL.getNumVersesInChp(15));
	}
	
	@Test
	public void testSecondSamuelChp16NumVerses(){
		assertEquals(23, SECOND_SAMUEL.getNumVersesInChp(16));
	}
	
	@Test
	public void testSecondSamuelChp17NumVerses(){
		assertEquals(29, SECOND_SAMUEL.getNumVersesInChp(17));
	}
	
	@Test
	public void testSecondSamuelChp18NumVerses(){
		assertEquals(33, SECOND_SAMUEL.getNumVersesInChp(18));
	}
	
	@Test
	public void testSecondSamuelChp19NumVerses(){
		assertEquals(43, SECOND_SAMUEL.getNumVersesInChp(19));
	}
	
	@Test
	public void testSecondSamuelChp20NumVerses(){
		assertEquals(26, SECOND_SAMUEL.getNumVersesInChp(20));
	}
	
	@Test
	public void testSecondSamuelChp21NumVerses(){
		assertEquals(22, SECOND_SAMUEL.getNumVersesInChp(21));
	}
	
	@Test
	public void testSecondSamuelChp22NumVerses(){
		assertEquals(51, SECOND_SAMUEL.getNumVersesInChp(22));
	}
	
	@Test
	public void testSecondSamuelChp23NumVerses(){
		assertEquals(39, SECOND_SAMUEL.getNumVersesInChp(23));
	}
	
	@Test
	public void testSecondSamuelChp24NumVerses(){
		assertEquals(25, SECOND_SAMUEL.getNumVersesInChp(24));
	}
	
	@Test
	public void testFromName(){
		assertEquals(SECOND_SAMUEL, EnumBible.fromName("2 Samuel"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(SECOND_SAMUEL, EnumBible.fromString("2 Samuel"));
	}
	
	@Test
	public void testFromAlias2Sam(){
		assertEquals(SECOND_SAMUEL, EnumBible.fromString("2Sam"));
	}
	
	@Test
	public void testFromAlias2Sa(){
		assertEquals(SECOND_SAMUEL, EnumBible.fromString("2Sa"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(SECOND_SAMUEL, EnumBible.fromInt(10));
	}
}
