package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.FIRST_CHRONICLES;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstChroniclesEnumBibleTest{
	
	@Test
	public void testFirstChroniclesName(){
		assertEquals("1 Chronicles", FIRST_CHRONICLES.getName());
	}
	
	@Test
	public void testFirstChroniclesAuthor(){
		assertEquals("Ezra", FIRST_CHRONICLES.getAuthor());
	}
	
	@Test
	public void testFirstChroniclesAliases(){
		assertEquals(ListUtil.createList("1Chron", "1Ch"), FIRST_CHRONICLES.getAliases());
	}
	
	@Test
	public void testFirstChroniclesChapters(){
		assertEquals(ListUtil.createList(54, 55, 24, 43, 26, 81, 40, 40, 44, 14, 47, 40, 14, 17, 29, 43, 27, 17, 19, 8, 30, 19, 32, 31, 31, 32, 34, 21, 30), FIRST_CHRONICLES.getChapters());
	}
	
	@Test
	public void testFirstChroniclesNumChapters(){
		assertEquals(29, FIRST_CHRONICLES.getNumChapters());
	}
	
	@Test
	public void testFirstChroniclesChp1NumVerses(){
		assertEquals(54, FIRST_CHRONICLES.getNumVersesInChp(1));
	}
	
	@Test
	public void testFirstChroniclesChp2NumVerses(){
		assertEquals(55, FIRST_CHRONICLES.getNumVersesInChp(2));
	}
	
	@Test
	public void testFirstChroniclesChp3NumVerses(){
		assertEquals(24, FIRST_CHRONICLES.getNumVersesInChp(3));
	}
	
	@Test
	public void testFirstChroniclesChp4NumVerses(){
		assertEquals(43, FIRST_CHRONICLES.getNumVersesInChp(4));
	}
	
	@Test
	public void testFirstChroniclesChp5NumVerses(){
		assertEquals(26, FIRST_CHRONICLES.getNumVersesInChp(5));
	}
	
	@Test
	public void testFirstChroniclesChp6NumVerses(){
		assertEquals(81, FIRST_CHRONICLES.getNumVersesInChp(6));
	}
	
	@Test
	public void testFirstChroniclesChp7NumVerses(){
		assertEquals(40, FIRST_CHRONICLES.getNumVersesInChp(7));
	}
	
	@Test
	public void testFirstChroniclesChp8NumVerses(){
		assertEquals(40, FIRST_CHRONICLES.getNumVersesInChp(8));
	}
	
	@Test
	public void testFirstChroniclesChp9NumVerses(){
		assertEquals(44, FIRST_CHRONICLES.getNumVersesInChp(9));
	}
	
	@Test
	public void testFirstChroniclesChp10NumVerses(){
		assertEquals(14, FIRST_CHRONICLES.getNumVersesInChp(10));
	}
	
	@Test
	public void testFirstChroniclesChp11NumVerses(){
		assertEquals(47, FIRST_CHRONICLES.getNumVersesInChp(11));
	}
	
	@Test
	public void testFirstChroniclesChp12NumVerses(){
		assertEquals(40, FIRST_CHRONICLES.getNumVersesInChp(12));
	}
	
	@Test
	public void testFirstChroniclesChp13NumVerses(){
		assertEquals(14, FIRST_CHRONICLES.getNumVersesInChp(13));
	}
	
	@Test
	public void testFirstChroniclesChp14NumVerses(){
		assertEquals(17, FIRST_CHRONICLES.getNumVersesInChp(14));
	}
	
	@Test
	public void testFirstChroniclesChp15NumVerses(){
		assertEquals(29, FIRST_CHRONICLES.getNumVersesInChp(15));
	}
	
	@Test
	public void testFirstChroniclesChp16NumVerses(){
		assertEquals(43, FIRST_CHRONICLES.getNumVersesInChp(16));
	}
	
	@Test
	public void testFirstChroniclesChp17NumVerses(){
		assertEquals(27, FIRST_CHRONICLES.getNumVersesInChp(17));
	}
	
	@Test
	public void testFirstChroniclesChp18NumVerses(){
		assertEquals(17, FIRST_CHRONICLES.getNumVersesInChp(18));
	}
	
	@Test
	public void testFirstChroniclesChp19NumVerses(){
		assertEquals(19, FIRST_CHRONICLES.getNumVersesInChp(19));
	}
	
	@Test
	public void testFirstChroniclesChp20NumVerses(){
		assertEquals(8, FIRST_CHRONICLES.getNumVersesInChp(20));
	}
	
	@Test
	public void testFirstChroniclesChp21NumVerses(){
		assertEquals(30, FIRST_CHRONICLES.getNumVersesInChp(21));
	}
	
	@Test
	public void testFirstChroniclesChp22NumVerses(){
		assertEquals(19, FIRST_CHRONICLES.getNumVersesInChp(22));
	}
	
	@Test
	public void testFirstChroniclesChp23NumVerses(){
		assertEquals(32, FIRST_CHRONICLES.getNumVersesInChp(23));
	}
	
	@Test
	public void testFirstChroniclesChp24NumVerses(){
		assertEquals(31, FIRST_CHRONICLES.getNumVersesInChp(24));
	}
	
	@Test
	public void testFirstChroniclesChp25NumVerses(){
		assertEquals(31, FIRST_CHRONICLES.getNumVersesInChp(25));
	}
	
	@Test
	public void testFirstChroniclesChp26NumVerses(){
		assertEquals(32, FIRST_CHRONICLES.getNumVersesInChp(26));
	}
	
	@Test
	public void testFirstChroniclesChp27NumVerses(){
		assertEquals(34, FIRST_CHRONICLES.getNumVersesInChp(27));
	}
	
	@Test
	public void testFirstChroniclesChp28NumVerses(){
		assertEquals(21, FIRST_CHRONICLES.getNumVersesInChp(28));
	}
	
	@Test
	public void testFirstChroniclesChp29NumVerses(){
		assertEquals(30, FIRST_CHRONICLES.getNumVersesInChp(29));
	}
	
	@Test
	public void testFromName(){
		assertEquals(FIRST_CHRONICLES, EnumBible.fromName("1 Chronicles"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(FIRST_CHRONICLES, EnumBible.fromString("1 Chronicles"));
	}
	
	@Test
	public void testFromAlias1Chron(){
		assertEquals(FIRST_CHRONICLES, EnumBible.fromString("1Chron"));
	}
	
	@Test
	public void testFromAlias1Ch(){
		assertEquals(FIRST_CHRONICLES, EnumBible.fromString("1Ch"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(FIRST_CHRONICLES, EnumBible.fromInt(13));
	}
}
