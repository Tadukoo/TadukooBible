package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.SECOND_CHRONICLES;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondChroniclesBibleTestBooks{
	
	@Test
	public void testSecondChroniclesName(){
		assertEquals("2 Chronicles", SECOND_CHRONICLES.getName());
	}
	
	@Test
	public void testSecondChroniclesAuthor(){
		assertEquals("Ezra", SECOND_CHRONICLES.getAuthor());
	}
	
	@Test
	public void testSecondChroniclesAliases(){
		assertEquals(ListUtil.createList("2Chron", "2Ch"), SECOND_CHRONICLES.getAliases());
	}
	
	@Test
	public void testSecondChroniclesChapters(){
		assertEquals(ListUtil.createList(17, 18, 17, 22, 14, 42, 22, 18, 31, 19, 23, 16, 22, 15, 19, 14, 19, 34, 11, 37, 20, 12, 21, 27, 28, 23, 9, 27, 36, 27, 21, 33, 25, 33, 27, 23), SECOND_CHRONICLES.getChapters());
	}
	
	@Test
	public void testSecondChroniclesNumChapters(){
		assertEquals(36, SECOND_CHRONICLES.getNumChapters());
	}
	
	@Test
	public void testSecondChroniclesChp1NumVerses(){
		assertEquals(17, SECOND_CHRONICLES.getNumVersesInChp(1));
	}
	
	@Test
	public void testSecondChroniclesChp2NumVerses(){
		assertEquals(18, SECOND_CHRONICLES.getNumVersesInChp(2));
	}
	
	@Test
	public void testSecondChroniclesChp3NumVerses(){
		assertEquals(17, SECOND_CHRONICLES.getNumVersesInChp(3));
	}
	
	@Test
	public void testSecondChroniclesChp4NumVerses(){
		assertEquals(22, SECOND_CHRONICLES.getNumVersesInChp(4));
	}
	
	@Test
	public void testSecondChroniclesChp5NumVerses(){
		assertEquals(14, SECOND_CHRONICLES.getNumVersesInChp(5));
	}
	
	@Test
	public void testSecondChroniclesChp6NumVerses(){
		assertEquals(42, SECOND_CHRONICLES.getNumVersesInChp(6));
	}
	
	@Test
	public void testSecondChroniclesChp7NumVerses(){
		assertEquals(22, SECOND_CHRONICLES.getNumVersesInChp(7));
	}
	
	@Test
	public void testSecondChroniclesChp8NumVerses(){
		assertEquals(18, SECOND_CHRONICLES.getNumVersesInChp(8));
	}
	
	@Test
	public void testSecondChroniclesChp9NumVerses(){
		assertEquals(31, SECOND_CHRONICLES.getNumVersesInChp(9));
	}
	
	@Test
	public void testSecondChroniclesChp10NumVerses(){
		assertEquals(19, SECOND_CHRONICLES.getNumVersesInChp(10));
	}
	
	@Test
	public void testSecondChroniclesChp11NumVerses(){
		assertEquals(23, SECOND_CHRONICLES.getNumVersesInChp(11));
	}
	
	@Test
	public void testSecondChroniclesChp12NumVerses(){
		assertEquals(16, SECOND_CHRONICLES.getNumVersesInChp(12));
	}
	
	@Test
	public void testSecondChroniclesChp13NumVerses(){
		assertEquals(22, SECOND_CHRONICLES.getNumVersesInChp(13));
	}
	
	@Test
	public void testSecondChroniclesChp14NumVerses(){
		assertEquals(15, SECOND_CHRONICLES.getNumVersesInChp(14));
	}
	
	@Test
	public void testSecondChroniclesChp15NumVerses(){
		assertEquals(19, SECOND_CHRONICLES.getNumVersesInChp(15));
	}
	
	@Test
	public void testSecondChroniclesChp16NumVerses(){
		assertEquals(14, SECOND_CHRONICLES.getNumVersesInChp(16));
	}
	
	@Test
	public void testSecondChroniclesChp17NumVerses(){
		assertEquals(19, SECOND_CHRONICLES.getNumVersesInChp(17));
	}
	
	@Test
	public void testSecondChroniclesChp18NumVerses(){
		assertEquals(34, SECOND_CHRONICLES.getNumVersesInChp(18));
	}
	
	@Test
	public void testSecondChroniclesChp19NumVerses(){
		assertEquals(11, SECOND_CHRONICLES.getNumVersesInChp(19));
	}
	
	@Test
	public void testSecondChroniclesChp20NumVerses(){
		assertEquals(37, SECOND_CHRONICLES.getNumVersesInChp(20));
	}
	
	@Test
	public void testSecondChroniclesChp21NumVerses(){
		assertEquals(20, SECOND_CHRONICLES.getNumVersesInChp(21));
	}
	
	@Test
	public void testSecondChroniclesChp22NumVerses(){
		assertEquals(12, SECOND_CHRONICLES.getNumVersesInChp(22));
	}
	
	@Test
	public void testSecondChroniclesChp23NumVerses(){
		assertEquals(21, SECOND_CHRONICLES.getNumVersesInChp(23));
	}
	
	@Test
	public void testSecondChroniclesChp24NumVerses(){
		assertEquals(27, SECOND_CHRONICLES.getNumVersesInChp(24));
	}
	
	@Test
	public void testSecondChroniclesChp25NumVerses(){
		assertEquals(28, SECOND_CHRONICLES.getNumVersesInChp(25));
	}
	
	@Test
	public void testSecondChroniclesChp26NumVerses(){
		assertEquals(23, SECOND_CHRONICLES.getNumVersesInChp(26));
	}
	
	@Test
	public void testSecondChroniclesChp27NumVerses(){
		assertEquals(9, SECOND_CHRONICLES.getNumVersesInChp(27));
	}
	
	@Test
	public void testSecondChroniclesChp28NumVerses(){
		assertEquals(27, SECOND_CHRONICLES.getNumVersesInChp(28));
	}
	
	@Test
	public void testSecondChroniclesChp29NumVerses(){
		assertEquals(36, SECOND_CHRONICLES.getNumVersesInChp(29));
	}
	
	@Test
	public void testSecondChroniclesChp30NumVerses(){
		assertEquals(27, SECOND_CHRONICLES.getNumVersesInChp(30));
	}
	
	@Test
	public void testSecondChroniclesChp31NumVerses(){
		assertEquals(21, SECOND_CHRONICLES.getNumVersesInChp(31));
	}
	
	@Test
	public void testSecondChroniclesChp32NumVerses(){
		assertEquals(33, SECOND_CHRONICLES.getNumVersesInChp(32));
	}
	
	@Test
	public void testSecondChroniclesChp33NumVerses(){
		assertEquals(25, SECOND_CHRONICLES.getNumVersesInChp(33));
	}
	
	@Test
	public void testSecondChroniclesChp34NumVerses(){
		assertEquals(33, SECOND_CHRONICLES.getNumVersesInChp(34));
	}
	
	@Test
	public void testSecondChroniclesChp35NumVerses(){
		assertEquals(27, SECOND_CHRONICLES.getNumVersesInChp(35));
	}
	
	@Test
	public void testSecondChroniclesChp36NumVerses(){
		assertEquals(23, SECOND_CHRONICLES.getNumVersesInChp(36));
	}
	
	@Test
	public void testFromName(){
		assertEquals(SECOND_CHRONICLES, BibleBooks.fromName("2 Chronicles"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(SECOND_CHRONICLES, BibleBooks.fromString("2 Chronicles"));
	}
	
	@Test
	public void testFromAlias2Chron(){
		assertEquals(SECOND_CHRONICLES, BibleBooks.fromString("2Chron"));
	}
	
	@Test
	public void testFromAlias2Ch(){
		assertEquals(SECOND_CHRONICLES, BibleBooks.fromString("2Ch"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(SECOND_CHRONICLES, BibleBooks.fromInt(14));
	}
}
