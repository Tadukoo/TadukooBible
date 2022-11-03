package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.GALATIANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GalatiansEnumBibleTest{
	
	@Test
	public void testGalatiansName(){
		assertEquals("Galatians", GALATIANS.getName());
	}
	
	@Test
	public void testGalatiansAuthor(){
		assertEquals("Paul", GALATIANS.getAuthor());
	}
	
	@Test
	public void testGalatiansAliases(){
		assertEquals(ListUtil.createList("Gal", "Ga"), GALATIANS.getAliases());
	}
	
	@Test
	public void testGalatiansChapters(){
		assertEquals(ListUtil.createList(24, 21, 29, 31, 26, 18), GALATIANS.getChapters());
	}
	
	@Test
	public void testGalatiansNumChapters(){
		assertEquals(6, GALATIANS.getNumChapters());
	}
	
	@Test
	public void testGalatiansChp1NumVerses(){
		assertEquals(24, GALATIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testGalatiansChp2NumVerses(){
		assertEquals(21, GALATIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testGalatiansChp3NumVerses(){
		assertEquals(29, GALATIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testGalatiansChp4NumVerses(){
		assertEquals(31, GALATIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void testGalatiansChp5NumVerses(){
		assertEquals(26, GALATIANS.getNumVersesInChp(5));
	}
	
	@Test
	public void testGalatiansChp6NumVerses(){
		assertEquals(18, GALATIANS.getNumVersesInChp(6));
	}
	
	@Test
	public void testFromName(){
		assertEquals(GALATIANS, EnumBible.fromName("Galatians"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(GALATIANS, EnumBible.fromString("Galatians"));
	}
	
	@Test
	public void testFromAliasGal(){
		assertEquals(GALATIANS, EnumBible.fromString("Gal"));
	}
	
	@Test
	public void testFromAliasGa(){
		assertEquals(GALATIANS, EnumBible.fromString("Ga"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(GALATIANS, EnumBible.fromInt(48));
	}
}
