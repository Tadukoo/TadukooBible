package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.FIRST_TIMOTHY;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTimothyEnumBibleTest{
	
	@Test
	public void testFirstTimothyName(){
		assertEquals("1 Timothy", FIRST_TIMOTHY.getName());
	}
	
	@Test
	public void testFirstTimothyAuthor(){
		assertEquals("Paul", FIRST_TIMOTHY.getAuthor());
	}
	
	@Test
	public void testFirstTimothyAliases(){
		assertEquals(ListUtil.createList("1Tim", "1Ti"), FIRST_TIMOTHY.getAliases());
	}
	
	@Test
	public void testFirstTimothyChapters(){
		assertEquals(ListUtil.createList(20, 15, 16, 16, 25, 21), FIRST_TIMOTHY.getChapters());
	}
	
	@Test
	public void testFirstTimothyNumChapters(){
		assertEquals(6, FIRST_TIMOTHY.getNumChapters());
	}
	
	@Test
	public void testFirstTimothyChp1NumVerses(){
		assertEquals(20, FIRST_TIMOTHY.getNumVersesInChp(1));
	}
	
	@Test
	public void testFirstTimothyChp2NumVerses(){
		assertEquals(15, FIRST_TIMOTHY.getNumVersesInChp(2));
	}
	
	@Test
	public void testFirstTimothyChp3NumVerses(){
		assertEquals(16, FIRST_TIMOTHY.getNumVersesInChp(3));
	}
	
	@Test
	public void testFirstTimothyChp4NumVerses(){
		assertEquals(16, FIRST_TIMOTHY.getNumVersesInChp(4));
	}
	
	@Test
	public void testFirstTimothyChp5NumVerses(){
		assertEquals(25, FIRST_TIMOTHY.getNumVersesInChp(5));
	}
	
	@Test
	public void testFirstTimothyChp6NumVerses(){
		assertEquals(21, FIRST_TIMOTHY.getNumVersesInChp(6));
	}
	
	@Test
	public void testFromName(){
		assertEquals(FIRST_TIMOTHY, EnumBible.fromName("1 Timothy"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(FIRST_TIMOTHY, EnumBible.fromString("1 Timothy"));
	}
	
	@Test
	public void testFromAlias1Tim(){
		assertEquals(FIRST_TIMOTHY, EnumBible.fromString("1Tim"));
	}
	
	@Test
	public void testFromAlias1Ti(){
		assertEquals(FIRST_TIMOTHY, EnumBible.fromString("1Ti"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(FIRST_TIMOTHY, EnumBible.fromInt(54));
	}
}
