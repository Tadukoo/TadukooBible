package com.gmail.realtadukoo.TB.Command;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.gmail.realtadukoo.TB.Bible.BibleReference;
import com.gmail.realtadukoo.TB.Constants.EnumBible;
import com.gmail.realtadukoo.TB.Constants.EnumTranslation;

public class GetVerseTest{
	
	private String John316KJV = "For God so loved the world, that he gave his only begotten Son, that whosoever believeth in him "
			+ "should not perish, but have everlasting life.";
	private BibleReference John316KJVRef = BibleReference.builder()
															.book(EnumBible.JOHN)
															.chapter(3)
															.verse(16)
															.translation(EnumTranslation.KJV)
															.build();
	private String Genesis11NIV = "In the beginning God created the heavens and the earth.";
	private BibleReference Genesis11NIVRef = BibleReference.builder()
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
		ArrayList<String> args = new ArrayList<String>();
		args.add("John");
		args.add("3");
		args.add("16");
		args.add("KJV");
		
		String[] result = new GetVerse().runCommand(args);
		
		assertEquals(1, result.length);
		assertEquals(John316KJV, result[0]);
	}
	
	@Test
	public void testRunCommandGenesis11NIV(){
		ArrayList<String> args = new ArrayList<String>();
		args.add("Genesis");
		args.add("1");
		args.add("1");
		args.add("NIV");
		
		String[] result = new GetVerse().runCommand(args);
		
		assertEquals(1, result.length);
		assertEquals(Genesis11NIV, result[0]);
	}
}
