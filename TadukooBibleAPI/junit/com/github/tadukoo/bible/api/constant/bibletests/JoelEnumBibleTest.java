package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.JOEL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JoelEnumBibleTest{
	
	@Test
	public void testJoelName(){
		assertEquals("Joel", JOEL.getName());
	}
	
	@Test
	public void testJoelAuthor(){
		assertEquals("Joel", JOEL.getAuthor());
	}
	
	@Test
	public void testJoelAliases(){
		assertEquals(ListUtil.createList("Joe"), JOEL.getAliases());
	}
	
	@Test
	public void testJoelChapters(){
		assertEquals(ListUtil.createList(20, 32, 21), JOEL.getChapters());
	}
	
	@Test
	public void testJoelNumChapters(){
		assertEquals(3, JOEL.getNumChapters());
	}
	
	@Test
	public void testJoelChp1NumVerses(){
		assertEquals(20, JOEL.getNumVersesInChp(1));
	}
	
	@Test
	public void testJoelChp2NumVerses(){
		assertEquals(32, JOEL.getNumVersesInChp(2));
	}
	
	@Test
	public void testJoelChp3NumVerses(){
		assertEquals(21, JOEL.getNumVersesInChp(3));
	}
	
	@Test
	public void testFromName(){
		assertEquals(JOEL, EnumBible.fromName("Joel"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(JOEL, EnumBible.fromString("Joel"));
	}
	
	@Test
	public void testFromAliasJoe(){
		assertEquals(JOEL, EnumBible.fromString("Joe"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(JOEL, EnumBible.fromInt(29));
	}
}
