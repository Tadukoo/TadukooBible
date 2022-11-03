package com.github.tadukoo.bible.api.constant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class EnumBibleTest{
	
	@Test
	public void testFromBookFail(){
		assertNull(EnumBible.fromName("garbage_string"));
	}
	
	@Test
	public void testFromStringFail(){
		assertNull(EnumBible.fromString("garbage_string"));
	}
	
	@Test
	public void testFromIntFail0(){
		assertNull(EnumBible.fromInt(0));
	}
	
	@Test
	public void testFromIntFail67(){
		assertNull(EnumBible.fromInt(67));
	}
}
