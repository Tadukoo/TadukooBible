package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.JAMES;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JamesEnumBibleTest{
	
	@Test
	public void testJamesName(){
		assertEquals("James", JAMES.getName());
	}
	
	@Test
	public void testJamesAuthor(){
		assertEquals("James", JAMES.getAuthor());
	}
	
	@Test
	public void testJamesAliases(){
		assertEquals(ListUtil.createList("Jas"), JAMES.getAliases());
	}
	
	@Test
	public void testJamesChapters(){
		assertEquals(ListUtil.createList(27, 26, 18, 17, 20), JAMES.getChapters());
	}
	
	@Test
	public void testJamesNumChapters(){
		assertEquals(5, JAMES.getNumChapters());
	}
	
	@Test
	public void testJamesChp1NumVerses(){
		assertEquals(27, JAMES.getNumVersesInChp(1));
	}
	
	@Test
	public void testJamesChp2NumVerses(){
		assertEquals(26, JAMES.getNumVersesInChp(2));
	}
	
	@Test
	public void testJamesChp3NumVerses(){
		assertEquals(18, JAMES.getNumVersesInChp(3));
	}
	
	@Test
	public void testJamesChp4NumVerses(){
		assertEquals(17, JAMES.getNumVersesInChp(4));
	}
	
	@Test
	public void testJamesChp5NumVerses(){
		assertEquals(20, JAMES.getNumVersesInChp(5));
	}
	
	@Test
	public void testFromName(){
		assertEquals(JAMES, EnumBible.fromName("James"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(JAMES, EnumBible.fromString("James"));
	}
	
	@Test
	public void testFromAliasJas(){
		assertEquals(JAMES, EnumBible.fromString("Jas"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(JAMES, EnumBible.fromInt(59));
	}
}
