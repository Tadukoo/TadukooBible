package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.DEUTERONOMY;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeuteronomyEnumBibleTest{
	
	@Test
	public void testDeuteronomyName(){
		assertEquals("Deuteronomy", DEUTERONOMY.getName());
	}
	
	@Test
	public void testDeuteronomyAuthor(){
		assertEquals("Moses", DEUTERONOMY.getAuthor());
	}
	
	@Test
	public void testDeuteronomyAliases(){
		assertEquals(ListUtil.createList("Deu", "De"), DEUTERONOMY.getAliases());
	}
	
	@Test
	public void testDeuteronomyChapters(){
		assertEquals(ListUtil.createList(46, 37, 29, 49, 33, 25, 26, 20, 29, 22, 32, 32, 18, 29, 23, 22, 20, 22, 21, 20, 23, 30, 25, 22, 19, 19, 26, 68, 29, 20, 30, 52, 29, 12), DEUTERONOMY.getChapters());
	}
	
	@Test
	public void testDeuteronomyNumChapters(){
		assertEquals(34, DEUTERONOMY.getNumChapters());
	}
	
	@Test
	public void testDeuteronomyChp1NumVerses(){
		assertEquals(46, DEUTERONOMY.getNumVersesInChp(1));
	}
	
	@Test
	public void testDeuteronomyChp2NumVerses(){
		assertEquals(37, DEUTERONOMY.getNumVersesInChp(2));
	}
	
	@Test
	public void testDeuteronomyChp3NumVerses(){
		assertEquals(29, DEUTERONOMY.getNumVersesInChp(3));
	}
	
	@Test
	public void testDeuteronomyChp4NumVerses(){
		assertEquals(49, DEUTERONOMY.getNumVersesInChp(4));
	}
	
	@Test
	public void testDeuteronomyChp5NumVerses(){
		assertEquals(33, DEUTERONOMY.getNumVersesInChp(5));
	}
	
	@Test
	public void testDeuteronomyChp6NumVerses(){
		assertEquals(25, DEUTERONOMY.getNumVersesInChp(6));
	}
	
	@Test
	public void testDeuteronomyChp7NumVerses(){
		assertEquals(26, DEUTERONOMY.getNumVersesInChp(7));
	}
	
	@Test
	public void testDeuteronomyChp8NumVerses(){
		assertEquals(20, DEUTERONOMY.getNumVersesInChp(8));
	}
	
	@Test
	public void testDeuteronomyChp9NumVerses(){
		assertEquals(29, DEUTERONOMY.getNumVersesInChp(9));
	}
	
	@Test
	public void testDeuteronomyChp10NumVerses(){
		assertEquals(22, DEUTERONOMY.getNumVersesInChp(10));
	}
	
	@Test
	public void testDeuteronomyChp11NumVerses(){
		assertEquals(32, DEUTERONOMY.getNumVersesInChp(11));
	}
	
	@Test
	public void testDeuteronomyChp12NumVerses(){
		assertEquals(32, DEUTERONOMY.getNumVersesInChp(12));
	}
	
	@Test
	public void testDeuteronomyChp13NumVerses(){
		assertEquals(18, DEUTERONOMY.getNumVersesInChp(13));
	}
	
	@Test
	public void testDeuteronomyChp14NumVerses(){
		assertEquals(29, DEUTERONOMY.getNumVersesInChp(14));
	}
	
	@Test
	public void testDeuteronomyChp15NumVerses(){
		assertEquals(23, DEUTERONOMY.getNumVersesInChp(15));
	}
	
	@Test
	public void testDeuteronomyChp16NumVerses(){
		assertEquals(22, DEUTERONOMY.getNumVersesInChp(16));
	}
	
	@Test
	public void testDeuteronomyChp17NumVerses(){
		assertEquals(20, DEUTERONOMY.getNumVersesInChp(17));
	}
	
	@Test
	public void testDeuteronomyChp18NumVerses(){
		assertEquals(22, DEUTERONOMY.getNumVersesInChp(18));
	}
	
	@Test
	public void testDeuteronomyChp19NumVerses(){
		assertEquals(21, DEUTERONOMY.getNumVersesInChp(19));
	}
	
	@Test
	public void testDeuteronomyChp20NumVerses(){
		assertEquals(20, DEUTERONOMY.getNumVersesInChp(20));
	}
	
	@Test
	public void testDeuteronomyChp21NumVerses(){
		assertEquals(23, DEUTERONOMY.getNumVersesInChp(21));
	}
	
	@Test
	public void testDeuteronomyChp22NumVerses(){
		assertEquals(30, DEUTERONOMY.getNumVersesInChp(22));
	}
	
	@Test
	public void testDeuteronomyChp23NumVerses(){
		assertEquals(25, DEUTERONOMY.getNumVersesInChp(23));
	}
	
	@Test
	public void testDeuteronomyChp24NumVerses(){
		assertEquals(22, DEUTERONOMY.getNumVersesInChp(24));
	}
	
	@Test
	public void testDeuteronomyChp25NumVerses(){
		assertEquals(19, DEUTERONOMY.getNumVersesInChp(25));
	}
	
	@Test
	public void testDeuteronomyChp26NumVerses(){
		assertEquals(19, DEUTERONOMY.getNumVersesInChp(26));
	}
	
	@Test
	public void testDeuteronomyChp27NumVerses(){
		assertEquals(26, DEUTERONOMY.getNumVersesInChp(27));
	}
	
	@Test
	public void testDeuteronomyChp28NumVerses(){
		assertEquals(68, DEUTERONOMY.getNumVersesInChp(28));
	}
	
	@Test
	public void testDeuteronomyChp29NumVerses(){
		assertEquals(29, DEUTERONOMY.getNumVersesInChp(29));
	}
	
	@Test
	public void testDeuteronomyChp30NumVerses(){
		assertEquals(20, DEUTERONOMY.getNumVersesInChp(30));
	}
	
	@Test
	public void testDeuteronomyChp31NumVerses(){
		assertEquals(30, DEUTERONOMY.getNumVersesInChp(31));
	}
	
	@Test
	public void testDeuteronomyChp32NumVerses(){
		assertEquals(52, DEUTERONOMY.getNumVersesInChp(32));
	}
	
	@Test
	public void testDeuteronomyChp33NumVerses(){
		assertEquals(29, DEUTERONOMY.getNumVersesInChp(33));
	}
	
	@Test
	public void testDeuteronomyChp34NumVerses(){
		assertEquals(12, DEUTERONOMY.getNumVersesInChp(34));
	}
	
	@Test
	public void testFromName(){
		assertEquals(DEUTERONOMY, EnumBible.fromName("Deuteronomy"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(DEUTERONOMY, EnumBible.fromString("Deuteronomy"));
	}
	
	@Test
	public void testFromAliasDeu(){
		assertEquals(DEUTERONOMY, EnumBible.fromString("Deu"));
	}
	
	@Test
	public void testFromAliasDe(){
		assertEquals(DEUTERONOMY, EnumBible.fromString("De"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(DEUTERONOMY, EnumBible.fromInt(5));
	}
}
