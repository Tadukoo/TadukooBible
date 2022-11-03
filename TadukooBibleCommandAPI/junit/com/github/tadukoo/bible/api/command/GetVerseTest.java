package com.github.tadukoo.bible.api.command;

import com.github.tadukoo.bible.api.bible.Settings;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetVerseTest{
	
	private GetVerse getVerse;
	
	@BeforeEach
	public void setup(){
		getVerse = new GetVerse();
		getVerse.setSettings(new Settings());
	}
	
	@Test
	public void testRunCommandJohn316KJV() throws Throwable{
		List<String> args = ListUtil.createList("John", "3", "16", "KJV");
		
		List<String> result = getVerse.runCommand(args);
		
		assertEquals(1, result.size());
		String john316KJV = "For God so loved the world, that he gave his only begotten Son, " +
				"that whosoever believeth in him should not perish, but have everlasting life.";
		assertEquals(john316KJV, result.get(0));
	}
	
	@Test
	public void testRunCommandGenesis11NIV() throws Throwable{
		List<String> args = ListUtil.createList("Genesis", "1", "1", "NIV");
		
		List<String> result = getVerse.runCommand(args);
		
		assertEquals(1, result.size());
		String genesis11NIV = "In the beginning God created the heavens and the earth.";
		assertEquals(genesis11NIV, result.get(0));
	}
}
