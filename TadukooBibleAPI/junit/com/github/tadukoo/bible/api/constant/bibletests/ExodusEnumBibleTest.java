package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.EXODUS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExodusEnumBibleTest{
	
	@Test
	public void testExodusName(){
		assertEquals("Exodus", EXODUS.getName());
	}
	
	@Test
	public void testExodusAuthor(){
		assertEquals("Moses", EXODUS.getAuthor());
	}
	
	@Test
	public void testExodusAliases(){
		assertEquals(ListUtil.createList("Exo", "Ex"), EXODUS.getAliases());
	}
	
	@Test
	public void testExodusChapters(){
		assertEquals(ListUtil.createList(22, 25, 22, 31, 23, 30, 25, 32, 35, 29, 10, 51, 22, 31, 27, 36, 16, 27, 25, 26, 36, 31, 33, 18, 40, 37, 21, 43, 46, 38, 18, 35, 23, 35, 35, 38, 29, 31, 43, 38), EXODUS.getChapters());
	}
	
	@Test
	public void testExodusNumChapters(){
		assertEquals(40, EXODUS.getNumChapters());
	}
	
	@Test
	public void testExodusChp1NumVerses(){
		assertEquals(22, EXODUS.getNumVersesInChp(1));
	}
	
	@Test
	public void testExodusChp2NumVerses(){
		assertEquals(25, EXODUS.getNumVersesInChp(2));
	}
	
	@Test
	public void testExodusChp3NumVerses(){
		assertEquals(22, EXODUS.getNumVersesInChp(3));
	}
	
	@Test
	public void testExodusChp4NumVerses(){
		assertEquals(31, EXODUS.getNumVersesInChp(4));
	}
	
	@Test
	public void testExodusChp5NumVerses(){
		assertEquals(23, EXODUS.getNumVersesInChp(5));
	}
	
	@Test
	public void testExodusChp6NumVerses(){
		assertEquals(30, EXODUS.getNumVersesInChp(6));
	}
	
	@Test
	public void testExodusChp7NumVerses(){
		assertEquals(25, EXODUS.getNumVersesInChp(7));
	}
	
	@Test
	public void testExodusChp8NumVerses(){
		assertEquals(32, EXODUS.getNumVersesInChp(8));
	}
	
	@Test
	public void testExodusChp9NumVerses(){
		assertEquals(35, EXODUS.getNumVersesInChp(9));
	}
	
	@Test
	public void testExodusChp10NumVerses(){
		assertEquals(29, EXODUS.getNumVersesInChp(10));
	}
	
	@Test
	public void testExodusChp11NumVerses(){
		assertEquals(10, EXODUS.getNumVersesInChp(11));
	}
	
	@Test
	public void testExodusChp12NumVerses(){
		assertEquals(51, EXODUS.getNumVersesInChp(12));
	}
	
	@Test
	public void testExodusChp13NumVerses(){
		assertEquals(22, EXODUS.getNumVersesInChp(13));
	}
	
	@Test
	public void testExodusChp14NumVerses(){
		assertEquals(31, EXODUS.getNumVersesInChp(14));
	}
	
	@Test
	public void testExodusChp15NumVerses(){
		assertEquals(27, EXODUS.getNumVersesInChp(15));
	}
	
	@Test
	public void testExodusChp16NumVerses(){
		assertEquals(36, EXODUS.getNumVersesInChp(16));
	}
	
	@Test
	public void testExodusChp17NumVerses(){
		assertEquals(16, EXODUS.getNumVersesInChp(17));
	}
	
	@Test
	public void testExodusChp18NumVerses(){
		assertEquals(27, EXODUS.getNumVersesInChp(18));
	}
	
	@Test
	public void testExodusChp19NumVerses(){
		assertEquals(25, EXODUS.getNumVersesInChp(19));
	}
	
	@Test
	public void testExodusChp20NumVerses(){
		assertEquals(26, EXODUS.getNumVersesInChp(20));
	}
	
	@Test
	public void testExodusChp21NumVerses(){
		assertEquals(36, EXODUS.getNumVersesInChp(21));
	}
	
	@Test
	public void testExodusChp22NumVerses(){
		assertEquals(31, EXODUS.getNumVersesInChp(22));
	}
	
	@Test
	public void testExodusChp23NumVerses(){
		assertEquals(33, EXODUS.getNumVersesInChp(23));
	}
	
	@Test
	public void testExodusChp24NumVerses(){
		assertEquals(18, EXODUS.getNumVersesInChp(24));
	}
	
	@Test
	public void testExodusChp25NumVerses(){
		assertEquals(40, EXODUS.getNumVersesInChp(25));
	}
	
	@Test
	public void testExodusChp26NumVerses(){
		assertEquals(37, EXODUS.getNumVersesInChp(26));
	}
	
	@Test
	public void testExodusChp27NumVerses(){
		assertEquals(21, EXODUS.getNumVersesInChp(27));
	}
	
	@Test
	public void testExodusChp28NumVerses(){
		assertEquals(43, EXODUS.getNumVersesInChp(28));
	}
	
	@Test
	public void testExodusChp29NumVerses(){
		assertEquals(46, EXODUS.getNumVersesInChp(29));
	}
	
	@Test
	public void testExodusChp30NumVerses(){
		assertEquals(38, EXODUS.getNumVersesInChp(30));
	}
	
	@Test
	public void testExodusChp31NumVerses(){
		assertEquals(18, EXODUS.getNumVersesInChp(31));
	}
	
	@Test
	public void testExodusChp32NumVerses(){
		assertEquals(35, EXODUS.getNumVersesInChp(32));
	}
	
	@Test
	public void testExodusChp33NumVerses(){
		assertEquals(23, EXODUS.getNumVersesInChp(33));
	}
	
	@Test
	public void testExodusChp34NumVerses(){
		assertEquals(35, EXODUS.getNumVersesInChp(34));
	}
	
	@Test
	public void testExodusChp35NumVerses(){
		assertEquals(35, EXODUS.getNumVersesInChp(35));
	}
	
	@Test
	public void testExodusChp36NumVerses(){
		assertEquals(38, EXODUS.getNumVersesInChp(36));
	}
	
	@Test
	public void testExodusChp37NumVerses(){
		assertEquals(29, EXODUS.getNumVersesInChp(37));
	}
	
	@Test
	public void testExodusChp38NumVerses(){
		assertEquals(31, EXODUS.getNumVersesInChp(38));
	}
	
	@Test
	public void testExodusChp39NumVerses(){
		assertEquals(43, EXODUS.getNumVersesInChp(39));
	}
	
	@Test
	public void testExodusChp40NumVerses(){
		assertEquals(38, EXODUS.getNumVersesInChp(40));
	}
	
	@Test
	public void testFromName(){
		assertEquals(EXODUS, EnumBible.fromName("Exodus"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(EXODUS, EnumBible.fromString("Exodus"));
	}
	
	@Test
	public void testFromAliasExo(){
		assertEquals(EXODUS, EnumBible.fromString("Exo"));
	}
	
	@Test
	public void testFromAliasEx(){
		assertEquals(EXODUS, EnumBible.fromString("Ex"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(EXODUS, EnumBible.fromInt(2));
	}
}
