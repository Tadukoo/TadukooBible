package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.LUKE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LukeEnumBibleTest{
	
	@Test
	public void testLukeName(){
		assertEquals("Luke", LUKE.getName());
	}
	
	@Test
	public void testLukeAuthor(){
		assertEquals("Luke", LUKE.getAuthor());
	}
	
	@Test
	public void testLukeAliases(){
		assertEquals(ListUtil.createList("Lu"), LUKE.getAliases());
	}
	
	@Test
	public void testLukeChapters(){
		assertEquals(ListUtil.createList(80, 52, 38, 44, 39, 49, 50, 56, 62, 42, 54, 59, 35, 35, 32, 31, 37, 43, 48, 47, 38, 71, 56, 53), LUKE.getChapters());
	}
	
	@Test
	public void testLukeNumChapters(){
		assertEquals(24, LUKE.getNumChapters());
	}
	
	@Test
	public void testLukeChp1NumVerses(){
		assertEquals(80, LUKE.getNumVersesInChp(1));
	}
	
	@Test
	public void testLukeChp2NumVerses(){
		assertEquals(52, LUKE.getNumVersesInChp(2));
	}
	
	@Test
	public void testLukeChp3NumVerses(){
		assertEquals(38, LUKE.getNumVersesInChp(3));
	}
	
	@Test
	public void testLukeChp4NumVerses(){
		assertEquals(44, LUKE.getNumVersesInChp(4));
	}
	
	@Test
	public void testLukeChp5NumVerses(){
		assertEquals(39, LUKE.getNumVersesInChp(5));
	}
	
	@Test
	public void testLukeChp6NumVerses(){
		assertEquals(49, LUKE.getNumVersesInChp(6));
	}
	
	@Test
	public void testLukeChp7NumVerses(){
		assertEquals(50, LUKE.getNumVersesInChp(7));
	}
	
	@Test
	public void testLukeChp8NumVerses(){
		assertEquals(56, LUKE.getNumVersesInChp(8));
	}
	
	@Test
	public void testLukeChp9NumVerses(){
		assertEquals(62, LUKE.getNumVersesInChp(9));
	}
	
	@Test
	public void testLukeChp10NumVerses(){
		assertEquals(42, LUKE.getNumVersesInChp(10));
	}
	
	@Test
	public void testLukeChp11NumVerses(){
		assertEquals(54, LUKE.getNumVersesInChp(11));
	}
	
	@Test
	public void testLukeChp12NumVerses(){
		assertEquals(59, LUKE.getNumVersesInChp(12));
	}
	
	@Test
	public void testLukeChp13NumVerses(){
		assertEquals(35, LUKE.getNumVersesInChp(13));
	}
	
	@Test
	public void testLukeChp14NumVerses(){
		assertEquals(35, LUKE.getNumVersesInChp(14));
	}
	
	@Test
	public void testLukeChp15NumVerses(){
		assertEquals(32, LUKE.getNumVersesInChp(15));
	}
	
	@Test
	public void testLukeChp16NumVerses(){
		assertEquals(31, LUKE.getNumVersesInChp(16));
	}
	
	@Test
	public void testLukeChp17NumVerses(){
		assertEquals(37, LUKE.getNumVersesInChp(17));
	}
	
	@Test
	public void testLukeChp18NumVerses(){
		assertEquals(43, LUKE.getNumVersesInChp(18));
	}
	
	@Test
	public void testLukeChp19NumVerses(){
		assertEquals(48, LUKE.getNumVersesInChp(19));
	}
	
	@Test
	public void testLukeChp20NumVerses(){
		assertEquals(47, LUKE.getNumVersesInChp(20));
	}
	
	@Test
	public void testLukeChp21NumVerses(){
		assertEquals(38, LUKE.getNumVersesInChp(21));
	}
	
	@Test
	public void testLukeChp22NumVerses(){
		assertEquals(71, LUKE.getNumVersesInChp(22));
	}
	
	@Test
	public void testLukeChp23NumVerses(){
		assertEquals(56, LUKE.getNumVersesInChp(23));
	}
	
	@Test
	public void testLukeChp24NumVerses(){
		assertEquals(53, LUKE.getNumVersesInChp(24));
	}
	
	@Test
	public void testFromName(){
		assertEquals(LUKE, EnumBible.fromName("Luke"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(LUKE, EnumBible.fromString("Luke"));
	}
	
	@Test
	public void testFromAliasLu(){
		assertEquals(LUKE, EnumBible.fromString("Lu"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(LUKE, EnumBible.fromInt(42));
	}
}
