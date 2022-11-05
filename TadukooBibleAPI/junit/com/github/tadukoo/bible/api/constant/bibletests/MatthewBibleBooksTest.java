package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.MATTHEW;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatthewBibleBooksTest{
	
	@Test
	public void testMatthewName(){
		assertEquals("Matthew", MATTHEW.getName());
	}
	
	@Test
	public void testMatthewAuthor(){
		assertEquals("Matthew", MATTHEW.getAuthor());
	}
	
	@Test
	public void testMatthewAliases(){
		assertEquals(ListUtil.createList("Mat", "Mt"), MATTHEW.getAliases());
	}
	
	@Test
	public void testMatthewChapters(){
		assertEquals(ListUtil.createList(25, 23, 17, 25, 48, 34, 29, 34, 38, 42, 30, 50, 58, 36, 39, 28, 27, 35, 30, 34, 46, 46, 39, 51, 46, 75, 66, 20), MATTHEW.getChapters());
	}
	
	@Test
	public void testMatthewNumChapters(){
		assertEquals(28, MATTHEW.getNumChapters());
	}
	
	@Test
	public void testMatthewChp1NumVerses(){
		assertEquals(25, MATTHEW.getNumVersesInChp(1));
	}
	
	@Test
	public void testMatthewChp2NumVerses(){
		assertEquals(23, MATTHEW.getNumVersesInChp(2));
	}
	
	@Test
	public void testMatthewChp3NumVerses(){
		assertEquals(17, MATTHEW.getNumVersesInChp(3));
	}
	
	@Test
	public void testMatthewChp4NumVerses(){
		assertEquals(25, MATTHEW.getNumVersesInChp(4));
	}
	
	@Test
	public void testMatthewChp5NumVerses(){
		assertEquals(48, MATTHEW.getNumVersesInChp(5));
	}
	
	@Test
	public void testMatthewChp6NumVerses(){
		assertEquals(34, MATTHEW.getNumVersesInChp(6));
	}
	
	@Test
	public void testMatthewChp7NumVerses(){
		assertEquals(29, MATTHEW.getNumVersesInChp(7));
	}
	
	@Test
	public void testMatthewChp8NumVerses(){
		assertEquals(34, MATTHEW.getNumVersesInChp(8));
	}
	
	@Test
	public void testMatthewChp9NumVerses(){
		assertEquals(38, MATTHEW.getNumVersesInChp(9));
	}
	
	@Test
	public void testMatthewChp10NumVerses(){
		assertEquals(42, MATTHEW.getNumVersesInChp(10));
	}
	
	@Test
	public void testMatthewChp11NumVerses(){
		assertEquals(30, MATTHEW.getNumVersesInChp(11));
	}
	
	@Test
	public void testMatthewChp12NumVerses(){
		assertEquals(50, MATTHEW.getNumVersesInChp(12));
	}
	
	@Test
	public void testMatthewChp13NumVerses(){
		assertEquals(58, MATTHEW.getNumVersesInChp(13));
	}
	
	@Test
	public void testMatthewChp14NumVerses(){
		assertEquals(36, MATTHEW.getNumVersesInChp(14));
	}
	
	@Test
	public void testMatthewChp15NumVerses(){
		assertEquals(39, MATTHEW.getNumVersesInChp(15));
	}
	
	@Test
	public void testMatthewChp16NumVerses(){
		assertEquals(28, MATTHEW.getNumVersesInChp(16));
	}
	
	@Test
	public void testMatthewChp17NumVerses(){
		assertEquals(27, MATTHEW.getNumVersesInChp(17));
	}
	
	@Test
	public void testMatthewChp18NumVerses(){
		assertEquals(35, MATTHEW.getNumVersesInChp(18));
	}
	
	@Test
	public void testMatthewChp19NumVerses(){
		assertEquals(30, MATTHEW.getNumVersesInChp(19));
	}
	
	@Test
	public void testMatthewChp20NumVerses(){
		assertEquals(34, MATTHEW.getNumVersesInChp(20));
	}
	
	@Test
	public void testMatthewChp21NumVerses(){
		assertEquals(46, MATTHEW.getNumVersesInChp(21));
	}
	
	@Test
	public void testMatthewChp22NumVerses(){
		assertEquals(46, MATTHEW.getNumVersesInChp(22));
	}
	
	@Test
	public void testMatthewChp23NumVerses(){
		assertEquals(39, MATTHEW.getNumVersesInChp(23));
	}
	
	@Test
	public void testMatthewChp24NumVerses(){
		assertEquals(51, MATTHEW.getNumVersesInChp(24));
	}
	
	@Test
	public void testMatthewChp25NumVerses(){
		assertEquals(46, MATTHEW.getNumVersesInChp(25));
	}
	
	@Test
	public void testMatthewChp26NumVerses(){
		assertEquals(75, MATTHEW.getNumVersesInChp(26));
	}
	
	@Test
	public void testMatthewChp27NumVerses(){
		assertEquals(66, MATTHEW.getNumVersesInChp(27));
	}
	
	@Test
	public void testMatthewChp28NumVerses(){
		assertEquals(20, MATTHEW.getNumVersesInChp(28));
	}
	
	@Test
	public void testFromName(){
		assertEquals(MATTHEW, BibleBooks.fromName("Matthew"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(MATTHEW, BibleBooks.fromString("Matthew"));
	}
	
	@Test
	public void testFromAliasMat(){
		assertEquals(MATTHEW, BibleBooks.fromString("Mat"));
	}
	
	@Test
	public void testFromAliasMt(){
		assertEquals(MATTHEW, BibleBooks.fromString("Mt"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(MATTHEW, BibleBooks.fromInt(40));
	}
}
