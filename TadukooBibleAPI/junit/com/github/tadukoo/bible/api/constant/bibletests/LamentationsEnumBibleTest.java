package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.LAMENTATIONS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LamentationsEnumBibleTest{
	
	@Test
	public void testLamentationsName(){
		assertEquals("Lamentations", LAMENTATIONS.getName());
	}
	
	@Test
	public void testLamentationsAuthor(){
		assertEquals("Jeremiah", LAMENTATIONS.getAuthor());
	}
	
	@Test
	public void testLamentationsAliases(){
		assertEquals(ListUtil.createList("Lam", "La"), LAMENTATIONS.getAliases());
	}
	
	@Test
	public void testLamentationsChapters(){
		assertEquals(ListUtil.createList(22, 22, 66, 22, 22), LAMENTATIONS.getChapters());
	}
	
	@Test
	public void testLamentationsNumChapters(){
		assertEquals(5, LAMENTATIONS.getNumChapters());
	}
	
	@Test
	public void testLamentationsChp1NumVerses(){
		assertEquals(22, LAMENTATIONS.getNumVersesInChp(1));
	}
	
	@Test
	public void testLamentationsChp2NumVerses(){
		assertEquals(22, LAMENTATIONS.getNumVersesInChp(2));
	}
	
	@Test
	public void testLamentationsChp3NumVerses(){
		assertEquals(66, LAMENTATIONS.getNumVersesInChp(3));
	}
	
	@Test
	public void testLamentationsChp4NumVerses(){
		assertEquals(22, LAMENTATIONS.getNumVersesInChp(4));
	}
	
	@Test
	public void testLamentationsChp5NumVerses(){
		assertEquals(22, LAMENTATIONS.getNumVersesInChp(5));
	}
	
	@Test
	public void testFromName(){
		assertEquals(LAMENTATIONS, EnumBible.fromName("Lamentations"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(LAMENTATIONS, EnumBible.fromString("Lamentations"));
	}
	
	@Test
	public void testFromAliasLam(){
		assertEquals(LAMENTATIONS, EnumBible.fromString("Lam"));
	}
	
	@Test
	public void testFromAliasLa(){
		assertEquals(LAMENTATIONS, EnumBible.fromString("La"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(LAMENTATIONS, EnumBible.fromInt(25));
	}
}
