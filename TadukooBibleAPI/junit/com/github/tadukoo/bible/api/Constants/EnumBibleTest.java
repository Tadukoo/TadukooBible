package com.github.tadukoo.bible.api.Constants;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumBible.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnumBibleTest{
	
	/*
	 * ===========================
	 * Test that names are correct
	 * ===========================
	 */
	@Test
	public void testGenesisName(){
		assertEquals("Genesis", GENESIS.getBook());
	}
	
	@Test
	public void testExodusName(){
		assertEquals("Exodus", EXODUS.getBook());
	}
	
	@Test
	public void testLeviticusName(){
		assertEquals("Leviticus", LEVITICUS.getBook());
	}
	
	@Test
	public void testNumbersName(){
		assertEquals("Numbers", NUMBERS.getBook());
	}
	
	@Test
	public void testDeuteronomyName(){
		assertEquals("Deuteronomy", DEUTERONOMY.getBook());
	}
	
	@Test
	public void testJoshuaName(){
		assertEquals("Joshua", JOSHUA.getBook());
	}
	
	@Test
	public void testJudgesName(){
		assertEquals("Judges", JUDGES.getBook());
	}
	
	@Test
	public void testRuthName(){
		assertEquals("Ruth", RUTH.getBook());
	}
	
	@Test
	public void testFirstSamuelName(){
		assertEquals("1 Samuel", FIRST_SAMUEL.getBook());
	}
	
	@Test
	public void testSecondSamuelName(){
		assertEquals("2 Samuel", SECOND_SAMUEL.getBook());
	}
	
	@Test
	public void testFirstKingsName(){
		assertEquals("1 Kings", FIRST_KINGS.getBook());
	}
	
	@Test
	public void testSecondKingsName(){
		assertEquals("2 Kings", SECOND_KINGS.getBook());
	}
	
	@Test
	public void testFirstChroniclesName(){
		assertEquals("1 Chronicles", FIRST_CHRONICLES.getBook());
	}
	
	@Test
	public void testSecondChroniclesName(){
		assertEquals("2 Chronicles", SECOND_CHRONICLES.getBook());
	}
	
	@Test
	public void testEzraName(){
		assertEquals("Ezra", EZRA.getBook());
	}
	
	@Test
	public void testNehemiahName(){
		assertEquals("Nehemiah", NEHEMIAH.getBook());
	}
	
	@Test
	public void testEstherName(){
		assertEquals("Esther", ESTHER.getBook());
	}
	
	@Test
	public void testJobName(){
		assertEquals("Job", JOB.getBook());
	}
	
	@Test
	public void testPsalmsName(){
		assertEquals("Psalms", PSALMS.getBook());
	}
	
	@Test
	public void testProverbsName(){
		assertEquals("Proverbs", PROVERBS.getBook());
	}
	
	@Test
	public void testEcclesiastesName(){
		assertEquals("Ecclesiastes", ECCLESIASTES.getBook());
	}
	
	@Test
	public void testSongofSongsName(){
		assertEquals("Song of Songs", SONG_OF_SONGS.getBook());
	}
	
	@Test
	public void testIsaiahName(){
		assertEquals("Isaiah", ISAIAH.getBook());
	}
	
	@Test
	public void testJeremiahName(){
		assertEquals("Jeremiah", JEREMIAH.getBook());
	}
	
	@Test
	public void testLamentationsName(){
		assertEquals("Lamentations", LAMENTATIONS.getBook());
	}
	
	@Test
	public void testEzekielName(){
		assertEquals("Ezekiel", EZEKIEL.getBook());
	}
	
	@Test
	public void testDanielName(){
		assertEquals("Daniel", DANIEL.getBook());
	}
	
	@Test
	public void testHoseaName(){
		assertEquals("Hosea", HOSEA.getBook());
	}
	
	@Test
	public void testJoelName(){
		assertEquals("Joel", JOEL.getBook());
	}
	
	@Test
	public void testAmosName(){
		assertEquals("Amos", AMOS.getBook());
	}
	
	@Test
	public void testObadiahName(){
		assertEquals("Obadiah", OBADIAH.getBook());
	}
	
	@Test
	public void testJonahName(){
		assertEquals("Jonah", JONAH.getBook());
	}
	
	@Test
	public void testMicahName(){
		assertEquals("Micah", MICAH.getBook());
	}
	
	@Test
	public void testNahumName(){
		assertEquals("Nahum", NAHUM.getBook());
	}
	
	@Test
	public void testHabakkukName(){
		assertEquals("Habakkuk", HABAKKUK.getBook());
	}
	
	@Test
	public void testZephaniahName(){
		assertEquals("Zephaniah", ZEPHANIAH.getBook());
	}
	
	@Test
	public void testHaggaiName(){
		assertEquals("Haggai", HAGGAI.getBook());
	}
	
	@Test
	public void testZechariahName(){
		assertEquals("Zechariah", ZECHARIAH.getBook());
	}
	
	@Test
	public void testMalachiName(){
		assertEquals("Malachi", MALACHI.getBook());
	}
	
	@Test
	public void testMatthewName(){
		assertEquals("Matthew", MATTHEW.getBook());
	}
	
	@Test
	public void testMarkName(){
		assertEquals("Mark", MARK.getBook());
	}
	
	@Test
	public void testLukeName(){
		assertEquals("Luke", LUKE.getBook());
	}
	
	@Test
	public void testJohnName(){
		assertEquals("John", JOHN.getBook());
	}
	
	@Test
	public void testActsName(){
		assertEquals("Acts", ACTS.getBook());
	}
	
	@Test
	public void testRomansName(){
		assertEquals("Romans", ROMANS.getBook());
	}
	
	@Test
	public void testFirstCorinthiansName(){
		assertEquals("1 Corinthians", FIRST_CORINTHIANS.getBook());
	}
	
	@Test
	public void testSecondCorinthiansName(){
		assertEquals("2 Corinthians", SECOND_CORINTHIANS.getBook());
	}
	
	@Test
	public void testGalatiansName(){
		assertEquals("Galatians", GALATIANS.getBook());
	}
	
	@Test
	public void testEphesiansName(){
		assertEquals("Ephesians", EPHESIANS.getBook());
	}
	
	@Test
	public void testPhilippiansName(){
		assertEquals("Philippians", PHILIPPIANS.getBook());
	}
	
	@Test
	public void testColossiansName(){
		assertEquals("Colossians", COLOSSIANS.getBook());
	}
	
	@Test
	public void testFirstThessaloniansName(){
		assertEquals("1 Thessalonians", FIRST_THESSALONIANS.getBook());
	}
	
	@Test
	public void testSecondThessaloniansName(){
		assertEquals("2 Thessalonians", SECOND_THESSALONIANS.getBook());
	}
	
	@Test
	public void testFirstTimothyName(){
		assertEquals("1 Timothy", FIRST_TIMOTHY.getBook());
	}
	
	@Test
	public void testSecondTimothyName(){
		assertEquals("2 Timothy", SECOND_TIMOTHY.getBook());
	}
	
	@Test
	public void testTitusName(){
		assertEquals("Titus", TITUS.getBook());
	}
	
	@Test
	public void testPhilemonName(){
		assertEquals("Philemon", PHILEMON.getBook());
	}
	
	@Test
	public void testHebrewsName(){
		assertEquals("Hebrews", HEBREWS.getBook());
	}
	
	@Test
	public void testJamesName(){
		assertEquals("James", JAMES.getBook());
	}
	
	@Test
	public void testFirstPeterName(){
		assertEquals("1 Peter", FIRST_PETER.getBook());
	}
	
	@Test
	public void testSecondPeterName(){
		assertEquals("2 Peter", SECOND_PETER.getBook());
	}
	
	@Test
	public void testFirstJohnName(){
		assertEquals("1 John", FIRST_JOHN.getBook());
	}
	
	@Test
	public void testSecondJohnName(){
		assertEquals("2 John", SECOND_JOHN.getBook());
	}
	
	@Test
	public void testThirdJohnName(){
		assertEquals("3 John", THIRD_JOHN.getBook());
	}
	
	@Test
	public void testJudeName(){
		assertEquals("Jude", JUDE.getBook());
	}
	
	@Test
	public void testRevelationName(){
		assertEquals("Revelation", REVELATION.getBook());
	}
	
	/*
	 * ========================================
	 * Test that number of chapters are correct
	 * ========================================
	 */
	@Test
	public void testGenesisNumChapters(){
		assertEquals(50, GENESIS.getNumChapters());
	}
	
	@Test
	public void testExodusNumChapters(){
		assertEquals(40, EXODUS.getNumChapters());
	}
	
	@Test
	public void testLeviticusNumChapters(){
		assertEquals(27, LEVITICUS.getNumChapters());
	}
	
	@Test
	public void testNumbersNumChapters(){
		assertEquals(36, NUMBERS.getNumChapters());
	}
	
	@Test
	public void testDeuteronomyNumChapters(){
		assertEquals(34, DEUTERONOMY.getNumChapters());
	}
	
	@Test
	public void testJoshuaNumChapters(){
		assertEquals(24, JOSHUA.getNumChapters());
	}
	
	@Test
	public void testJudgesNumChapters(){
		assertEquals(21, JUDGES.getNumChapters());
	}
	
	@Test
	public void testRuthNumChapters(){
		assertEquals(4, RUTH.getNumChapters());
	}
	
	@Test
	public void testFirstSamuelNumChapters(){
		assertEquals(31, FIRST_SAMUEL.getNumChapters());
	}
	
	@Test
	public void testSecondSamuelNumChapters(){
		assertEquals(24, SECOND_SAMUEL.getNumChapters());
	}
	
	@Test
	public void testFirstKingsNumChapters(){
		assertEquals(22, FIRST_KINGS.getNumChapters());
	}
	
	@Test
	public void testSecondKingsNumChapters(){
		assertEquals(25, SECOND_KINGS.getNumChapters());
	}
	
	@Test
	public void testFirstChroniclesNumChapters(){
		assertEquals(29, FIRST_CHRONICLES.getNumChapters());
	}
	
	@Test
	public void testSecondChroniclesNumChapters(){
		assertEquals(36, SECOND_CHRONICLES.getNumChapters());
	}
	
	@Test
	public void testEzraNumChapters(){
		assertEquals(10, EZRA.getNumChapters());
	}
	
	@Test
	public void testNehemiahNumChapters(){
		assertEquals(13, NEHEMIAH.getNumChapters());
	}
	
	@Test
	public void testEstherNumChapters(){
		assertEquals(10, ESTHER.getNumChapters());
	}
	
	@Test
	public void testJobNumChapters(){
		assertEquals(42, JOB.getNumChapters());
	}
	
	@Test
	public void testPsalmsNumChapters(){
		assertEquals(150, PSALMS.getNumChapters());
	}
	
	@Test
	public void testProverbsNumChapters(){
		assertEquals(31, PROVERBS.getNumChapters());
	}
	
	@Test
	public void testEcclesiastesNumChapters(){
		assertEquals(12, ECCLESIASTES.getNumChapters());
	}
	
	@Test
	public void testSongofSongsNumChapters(){
		assertEquals(8, SONG_OF_SONGS.getNumChapters());
	}
	
	@Test
	public void testIsaiahNumChapters(){
		assertEquals(66, ISAIAH.getNumChapters());
	}
	
	@Test
	public void testJeremiahNumChapters(){
		assertEquals(52, JEREMIAH.getNumChapters());
	}
	
	@Test
	public void testLamentationsNumChapters(){
		assertEquals(5, LAMENTATIONS.getNumChapters());
	}
	
	@Test
	public void testEzekielNumChapters(){
		assertEquals(48, EZEKIEL.getNumChapters());
	}
	
	@Test
	public void testDanielNumChapters(){
		assertEquals(12, DANIEL.getNumChapters());
	}
	
	@Test
	public void testHoseaNumChapters(){
		assertEquals(14, HOSEA.getNumChapters());
	}
	
	@Test
	public void testJoelNumChapters(){
		assertEquals(3, JOEL.getNumChapters());
	}
	
	@Test
	public void testAmosNumChapters(){
		assertEquals(9, AMOS.getNumChapters());
	}
	
	@Test
	public void testObadiahNumChapters(){
		assertEquals(1, OBADIAH.getNumChapters());
	}
	
	@Test
	public void testJonahNumChapters(){
		assertEquals(4, JONAH.getNumChapters());
	}
	
	@Test
	public void testMicahNumChapters(){
		assertEquals(7, MICAH.getNumChapters());
	}
	
	@Test
	public void testNahumNumChapters(){
		assertEquals(3, NAHUM.getNumChapters());
	}
	
	@Test
	public void testHabakkukNumChapters(){
		assertEquals(3, HABAKKUK.getNumChapters());
	}
	
	@Test
	public void testZephaniahNumChapters(){
		assertEquals(3, ZEPHANIAH.getNumChapters());
	}
	
	@Test
	public void testHaggaiNumChapters(){
		assertEquals(2, HAGGAI.getNumChapters());
	}
	
	@Test
	public void testZechariahNumChapters(){
		assertEquals(14, ZECHARIAH.getNumChapters());
	}
	
	@Test
	public void testMalachiNumChapters(){
		assertEquals(4, MALACHI.getNumChapters());
	}
	
	@Test
	public void testMatthewNumChapters(){
		assertEquals(28, MATTHEW.getNumChapters());
	}
	
	@Test
	public void testMarkNumChapters(){
		assertEquals(16, MARK.getNumChapters());
	}
	
	@Test
	public void testLukeNumChapters(){
		assertEquals(24, LUKE.getNumChapters());
	}
	
	@Test
	public void testJohnNumChapters(){
		assertEquals(21, JOHN.getNumChapters());
	}
	
	@Test
	public void testActsNumChapters(){
		assertEquals(28, ACTS.getNumChapters());
	}
	
	@Test
	public void testRomansNumChapters(){
		assertEquals(16, ROMANS.getNumChapters());
	}
	
	@Test
	public void testFirstCorinthiansNumChapters(){
		assertEquals(16, FIRST_CORINTHIANS.getNumChapters());
	}
	
	@Test
	public void testSecondCorinthiansNumChapters(){
		assertEquals(13, SECOND_CORINTHIANS.getNumChapters());
	}
	
	@Test
	public void testGalatiansNumChapters(){
		assertEquals(6, GALATIANS.getNumChapters());
	}
	
	@Test
	public void testEphesiansNumChapters(){
		assertEquals(6, EPHESIANS.getNumChapters());
	}
	
	@Test
	public void testPhilippiansNumChapters(){
		assertEquals(4, PHILIPPIANS.getNumChapters());
	}
	
	@Test
	public void testColossiansNumChapters(){
		assertEquals(4, COLOSSIANS.getNumChapters());
	}
	
	@Test
	public void testFirstThessaloniansNumChapters(){
		assertEquals(5, FIRST_THESSALONIANS.getNumChapters());
	}
	
	@Test
	public void testSecondThessaloniansNumChapters(){
		assertEquals(3, SECOND_THESSALONIANS.getNumChapters());
	}
	
	@Test
	public void testFirstTimothyNumChapters(){
		assertEquals(6, FIRST_TIMOTHY.getNumChapters());
	}
	
	@Test
	public void testSecondTimothyNumChapters(){
		assertEquals(4, SECOND_TIMOTHY.getNumChapters());
	}
	
	@Test
	public void testTitusNumChapters(){
		assertEquals(3, TITUS.getNumChapters());
	}
	
	@Test
	public void testPhilemonNumChapters(){
		assertEquals(1, PHILEMON.getNumChapters());
	}
	
	@Test
	public void testHebrewsNumChapters(){
		assertEquals(13, HEBREWS.getNumChapters());
	}
	
	@Test
	public void testJamesNumChapters(){
		assertEquals(5, JAMES.getNumChapters());
	}
	
	@Test
	public void testFirstPeterNumChapters(){
		assertEquals(5, FIRST_PETER.getNumChapters());
	}
	
	@Test
	public void testSecondPeterNumChapters(){
		assertEquals(3, SECOND_PETER.getNumChapters());
	}
	
	@Test
	public void testFirstJohnNumChapters(){
		assertEquals(5, FIRST_JOHN.getNumChapters());
	}
	
	@Test
	public void testSecondJohnNumChapters(){
		assertEquals(1, SECOND_JOHN.getNumChapters());
	}
	
	@Test
	public void testThirdJohnNumChapters(){
		assertEquals(1, THIRD_JOHN.getNumChapters());
	}
	
	@Test
	public void testJudeNumChapters(){
		assertEquals(1, JUDE.getNumChapters());
	}
	
	@Test
	public void testRevelationNumChapters(){
		assertEquals(22, REVELATION.getNumChapters());
	}
}
