package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.THIRD_JOHN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdJohnEnumBibleTest{
	
	@Test
	public void testThirdJohnName(){
		assertEquals("3 John", THIRD_JOHN.getName());
	}
	
	@Test
	public void testThirdJohnAuthor(){
		assertEquals("John", THIRD_JOHN.getAuthor());
	}
	
	@Test
	public void testThirdJohnAliases(){
		assertEquals(ListUtil.createList("3Jo"), THIRD_JOHN.getAliases());
	}
	
	@Test
	public void testThirdJohnChapters(){
		assertEquals(ListUtil.createList(14), THIRD_JOHN.getChapters());
	}
	
	@Test
	public void testThirdJohnNumChapters(){
		assertEquals(1, THIRD_JOHN.getNumChapters());
	}
	
	@Test
	public void testThirdJohnChp1NumVerses(){
		assertEquals(14, THIRD_JOHN.getNumVersesInChp(1));
	}
	
	@Test
	public void testFromName(){
		assertEquals(THIRD_JOHN, EnumBible.fromName("3 John"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(THIRD_JOHN, EnumBible.fromString("3 John"));
	}
	
	@Test
	public void testFromAlias3Jo(){
		assertEquals(THIRD_JOHN, EnumBible.fromString("3Jo"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(THIRD_JOHN, EnumBible.fromInt(64));
	}
}
