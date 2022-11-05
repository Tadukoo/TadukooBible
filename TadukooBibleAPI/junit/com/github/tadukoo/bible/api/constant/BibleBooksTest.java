package com.github.tadukoo.bible.api.constant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class BibleBooksTest{
	
	@Test
	public void testFromBookFail(){
		assertNull(BibleBooks.fromName("garbage_string"));
	}
	
	@Test
	public void testFromStringFail(){
		assertNull(BibleBooks.fromString("garbage_string"));
	}
	
	@Test
	public void testFromIntFail0(){
		assertNull(BibleBooks.fromInt(0));
	}
	
	@Test
	public void testFromIntFail67(){
		assertNull(BibleBooks.fromInt(67));
	}
}
