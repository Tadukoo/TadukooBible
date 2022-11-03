package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.COLOSSIANS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColossiansEnumBibleTest{
	
	@Test
	public void testColossiansName(){
		assertEquals("Colossians", COLOSSIANS.getName());
	}
	
	@Test
	public void testColossiansAuthor(){
		assertEquals("Paul", COLOSSIANS.getAuthor());
	}
	
	@Test
	public void testColossiansAliases(){
		assertEquals(ListUtil.createList("Col"), COLOSSIANS.getAliases());
	}
	
	@Test
	public void testColossiansChapters(){
		assertEquals(ListUtil.createList(29, 23, 25, 18), COLOSSIANS.getChapters());
	}
	
	@Test
	public void testColossiansNumChapters(){
		assertEquals(4, COLOSSIANS.getNumChapters());
	}
	
	@Test
	public void testColossiansChp1NumVerses(){
		assertEquals(29, COLOSSIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testColossiansChp2NumVerses(){
		assertEquals(23, COLOSSIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testColossiansChp3NumVerses(){
		assertEquals(25, COLOSSIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testColossiansChp4NumVerses(){
		assertEquals(18, COLOSSIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void testFromName(){
		assertEquals(COLOSSIANS, EnumBible.fromName("Colossians"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(COLOSSIANS, EnumBible.fromString("Colossians"));
	}
	
	@Test
	public void testFromAliasCol(){
		assertEquals(COLOSSIANS, EnumBible.fromString("Col"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(COLOSSIANS, EnumBible.fromInt(51));
	}
}
