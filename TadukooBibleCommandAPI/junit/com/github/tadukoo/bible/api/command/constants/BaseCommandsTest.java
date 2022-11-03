package com.github.tadukoo.bible.api.command.constants;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BaseCommandsTest{
	
	@Test
	public void testGetBaseCommandFail(){
		assertNull(BaseCommands.getBaseCommand("garbage_string"));
	}
	
	@Test
	public void testBIBLEFromCommandString(){
		assertEquals(BaseCommands.BIBLE, BaseCommands.getBaseCommand("bible"));
	}
	
	@Test
	public void testBIBLEFromBAlias(){
		assertEquals(BaseCommands.BIBLE, BaseCommands.getBaseCommand("b"));
	}
	
	@Test
	public void testAPOCRYPHAFromCommandString(){
		assertEquals(BaseCommands.APOCRYPHA, BaseCommands.getBaseCommand("apocrypha"));
	}
	
	@Test
	public void testAPOCRYPHAFromAAlias(){
		assertEquals(BaseCommands.APOCRYPHA, BaseCommands.getBaseCommand("a"));
	}
}
