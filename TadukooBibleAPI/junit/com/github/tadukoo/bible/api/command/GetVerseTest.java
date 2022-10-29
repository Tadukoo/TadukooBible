package com.github.tadukoo.bible.api.command;


import com.github.tadukoo.bible.api.bible.BibleReference;
import com.github.tadukoo.bible.api.constant.EnumBible;
import com.github.tadukoo.bible.api.constant.EnumTranslation;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetVerseTest{
	
	private final String John316KJV = "For God so loved the world, that he gave his only begotten Son, " +
			"that whosoever believeth in him should not perish, but have everlasting life.";
	private final BibleReference John316KJVRef = BibleReference.builder()
															.book(EnumBible.JOHN)
															.chapter(3)
															.verse(16)
															.translation(EnumTranslation.KJV)
															.build();
	private final String Genesis11NIV = "In the beginning God created the heavens and the earth.";
	private final BibleReference Genesis11NIVRef = BibleReference.builder()
															.book(EnumBible.GENESIS)
															.chapter(1)
															.verse(1)
															.translation(EnumTranslation.NIV)
															.build();
	
	@Test
	public void testGetVerseJohn316KJV(){
		String verse = GetVerse.getVerse(John316KJVRef);
		
		assertEquals(John316KJV, verse);
	}
	
	@Test
	public void testGetVerseGenesis11NIV(){
		String verse = GetVerse.getVerse(Genesis11NIVRef);
		
		assertEquals(Genesis11NIV, verse);
	}
	
	@Test
	public void testRunCommandJohn316KJV(){
		List<String> args = ListUtil.createList("John", "3", "16", "KJV");
		
		List<String> result = new GetVerse().runCommand(args);
		
		assertEquals(1, result.size());
		assertEquals(John316KJV, result.get(0));
	}
	
	@Test
	public void testRunCommandGenesis11NIV(){
		List<String> args = ListUtil.createList("Genesis", "1", "1", "NIV");
		
		List<String> result = new GetVerse().runCommand(args);
		
		assertEquals(1, result.size());
		assertEquals(Genesis11NIV, result.get(0));
	}
}