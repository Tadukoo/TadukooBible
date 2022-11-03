package com.github.tadukoo.bible.api.command.constants;

import com.github.tadukoo.bible.api.command.DownloadCommand;
import com.github.tadukoo.bible.api.command.DownloadTranCommand;
import com.github.tadukoo.bible.api.command.FindMissing;
import com.github.tadukoo.bible.api.command.GetVerse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandsTest{
	
	@Test
	public void testGetCommandFail(){
		assertNull(Commands.getCommand("garbage_string"));
	}
	
	@Test
	public void testGET_VERSEFromCommandString(){
		assertTrue(Commands.getCommand("get") instanceof GetVerse);
	}
	
	@Test
	public void testGET_VERSEFromGetVerseAlias(){
		assertTrue(Commands.getCommand("getVerse") instanceof GetVerse);
	}
	
	@Test
	public void testGET_VERSEFromVerseGetAlias(){
		assertTrue(Commands.getCommand("verseGet") instanceof GetVerse);
	}
	
	@Test
	public void testGET_VERSEFromReadVerseAlias(){
		assertTrue(Commands.getCommand("readVerse") instanceof GetVerse);
	}
	
	@Test
	public void testGET_VERSEFromVerseReadAlias(){
		assertTrue(Commands.getCommand("verseRead") instanceof GetVerse);
	}
	
	@Test
	public void testGET_VERSEFromReadVAlias(){
		assertTrue(Commands.getCommand("readV") instanceof GetVerse);
	}
	
	@Test
	public void testGET_VERSEFromVReadAlias(){
		assertTrue(Commands.getCommand("vRead") instanceof GetVerse);
	}
	
	@Test
	public void testDOWNLOADFromCommandString(){
		assertTrue(Commands.getCommand("download") instanceof DownloadCommand);
	}
	
	@Test
	public void testDOWNLOAD_TRANFromCommandString(){
		assertTrue(Commands.getCommand("downloadTran") instanceof DownloadTranCommand);
	}
	
	@Test
	public void testMISSINGFromCommandString(){
		assertTrue(Commands.getCommand("missing") instanceof FindMissing);
	}
}
