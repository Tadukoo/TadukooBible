package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.RUTH;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RuthEnumBibleTest{
	
	@Test
	public void testRuthName(){
		assertEquals("Ruth", RUTH.getName());
	}
	
	@Test
	public void testRuthAuthor(){
		assertEquals("Samuel", RUTH.getAuthor());
	}
	
	@Test
	public void testRuthAliases(){
		assertEquals(ListUtil.createList("Ru"), RUTH.getAliases());
	}
	
	@Test
	public void testRuthChapters(){
		assertEquals(ListUtil.createList(22, 23, 18, 22), RUTH.getChapters());
	}
	
	@Test
	public void testRuthNumChapters(){
		assertEquals(4, RUTH.getNumChapters());
	}
	
	@Test
	public void testRuthChp1NumVerses(){
		assertEquals(22, RUTH.getNumVersesInChp(1));
	}
	
	@Test
	public void testRuthChp2NumVerses(){
		assertEquals(23, RUTH.getNumVersesInChp(2));
	}
	
	@Test
	public void testRuthChp3NumVerses(){
		assertEquals(18, RUTH.getNumVersesInChp(3));
	}
	
	@Test
	public void testRuthChp4NumVerses(){
		assertEquals(22, RUTH.getNumVersesInChp(4));
	}
	
	@Test
	public void testFromName(){
		assertEquals(RUTH, EnumBible.fromName("Ruth"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(RUTH, EnumBible.fromString("Ruth"));
	}
	
	@Test
	public void testFromAliasRu(){
		assertEquals(RUTH, EnumBible.fromString("Ru"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(RUTH, EnumBible.fromInt(8));
	}
}
