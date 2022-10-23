package com.github.tadukoo.bible.api.Constants;

import com.github.tadukoo.bible.api.Constants.Verses.*;
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
		assertEquals(BibleBooks.GENESIS, GENESIS.getBook());
	}
	
	@Test
	public void testExodusName(){
		assertEquals(BibleBooks.EXODUS, EXODUS.getBook());
	}
	
	@Test
	public void testLeviticusName(){
		assertEquals(BibleBooks.LEVITICUS, LEVITICUS.getBook());
	}
	
	@Test
	public void testNumbersName(){
		assertEquals(BibleBooks.NUMBERS, NUMBERS.getBook());
	}
	
	@Test
	public void testDeuteronomyName(){
		assertEquals(BibleBooks.DEUTERONOMY, DEUTERONOMY.getBook());
	}
	
	@Test
	public void testJoshuaName(){
		assertEquals(BibleBooks.JOSHUA, JOSHUA.getBook());
	}
	
	@Test
	public void testJudgesName(){
		assertEquals(BibleBooks.JUDGES, JUDGES.getBook());
	}
	
	@Test
	public void testRuthName(){
		assertEquals(BibleBooks.RUTH, RUTH.getBook());
	}
	
	@Test
	public void test1SamuelName(){
		assertEquals(BibleBooks.FIRST_SAMUEL, FIRST_SAMUEL.getBook());
	}
	
	@Test
	public void test2SamuelName(){
		assertEquals(BibleBooks.SECOND_SAMUEL, SECOND_SAMUEL.getBook());
	}
	
	@Test
	public void test1KingsName(){
		assertEquals(BibleBooks.FIRST_KINGS, FIRST_KINGS.getBook());
	}
	
	@Test
	public void test2KingsName(){
		assertEquals(BibleBooks.SECOND_KINGS, SECOND_KINGS.getBook());
	}
	
	@Test
	public void test1ChroniclesName(){
		assertEquals(BibleBooks.FIRST_CHRONICLES, FIRST_CHRONICLES.getBook());
	}
	
	@Test
	public void test2ChroniclesName(){
		assertEquals(BibleBooks.SECOND_CHRONICLES, SECOND_CHRONICLES.getBook());
	}
	
	@Test
	public void testEzraName(){
		assertEquals(BibleBooks.EZRA, EZRA.getBook());
	}
	
	@Test
	public void testNehemiahName(){
		assertEquals(BibleBooks.NEHEMIAH, NEHEMIAH.getBook());
	}
	
	@Test
	public void testEstherName(){
		assertEquals(BibleBooks.ESTHER, ESTHER.getBook());
	}
	
	@Test
	public void testJobName(){
		assertEquals(BibleBooks.JOB, JOB.getBook());
	}
	
	@Test
	public void testPsalmsName(){
		assertEquals(BibleBooks.PSALMS, PSALMS.getBook());
	}
	
	@Test
	public void testProverbsName(){
		assertEquals(BibleBooks.PROVERBS, PROVERBS.getBook());
	}
	
	@Test
	public void testEcclesiastesName(){
		assertEquals(BibleBooks.ECCLESIASTES, ECCLESIASTES.getBook());
	}
	
	@Test
	public void testSongofSongsName(){
		assertEquals(BibleBooks.SONG_OF_SONGS, SONG_OF_SONGS.getBook());
	}
	
	@Test
	public void testIsaiahName(){
		assertEquals(BibleBooks.ISAIAH, ISAIAH.getBook());
	}
	
	@Test
	public void testJeremiahName(){
		assertEquals(BibleBooks.JEREMIAH, JEREMIAH.getBook());
	}
	
	@Test
	public void testLamentationsName(){
		assertEquals(BibleBooks.LAMENTATIONS, LAMENTATIONS.getBook());
	}
	
	@Test
	public void testEzekielName(){
		assertEquals(BibleBooks.EZEKIEL, EZEKIEL.getBook());
	}
	
	@Test
	public void testDanielName(){
		assertEquals(BibleBooks.DANIEL, DANIEL.getBook());
	}
	
	@Test
	public void testHoseaName(){
		assertEquals(BibleBooks.HOSEA, HOSEA.getBook());
	}
	
	@Test
	public void testJoelName(){
		assertEquals(BibleBooks.JOEL, JOEL.getBook());
	}
	
	@Test
	public void testAmosName(){
		assertEquals(BibleBooks.AMOS, AMOS.getBook());
	}
	
	@Test
	public void testObadiahName(){
		assertEquals(BibleBooks.OBADIAH, OBADIAH.getBook());
	}
	
	@Test
	public void testJonahName(){
		assertEquals(BibleBooks.JONAH, JONAH.getBook());
	}
	
	@Test
	public void testMicahName(){
		assertEquals(BibleBooks.MICAH, MICAH.getBook());
	}
	
	@Test
	public void testNahumName(){
		assertEquals(BibleBooks.NAHUM, NAHUM.getBook());
	}
	
	@Test
	public void testHabakkukName(){
		assertEquals(BibleBooks.HABAKKUK, HABAKKUK.getBook());
	}
	
	@Test
	public void testZephaniahName(){
		assertEquals(BibleBooks.ZEPHANIAH, ZEPHANIAH.getBook());
	}
	
	@Test
	public void testHaggaiName(){
		assertEquals(BibleBooks.HAGGAI, HAGGAI.getBook());
	}
	
	@Test
	public void testZechariahName(){
		assertEquals(BibleBooks.ZECHARIAH, ZECHARIAH.getBook());
	}
	
	@Test
	public void testMalachiName(){
		assertEquals(BibleBooks.MALACHI, MALACHI.getBook());
	}
	
	@Test
	public void testMatthewName(){
		assertEquals(BibleBooks.MATTHEW, MATTHEW.getBook());
	}
	
	@Test
	public void testMarkName(){
		assertEquals(BibleBooks.MARK, MARK.getBook());
	}
	
	@Test
	public void testLukeName(){
		assertEquals(BibleBooks.LUKE, LUKE.getBook());
	}
	
	@Test
	public void testJohnName(){
		assertEquals(BibleBooks.JOHN, JOHN.getBook());
	}
	
	@Test
	public void testActsName(){
		assertEquals(BibleBooks.ACTS, ACTS.getBook());
	}
	
	@Test
	public void testRomansName(){
		assertEquals(BibleBooks.ROMANS, ROMANS.getBook());
	}
	
	@Test
	public void test1CorinthiansName(){
		assertEquals(BibleBooks.FIRST_CORINTHIANS, FIRST_CORINTHIANS.getBook());
	}
	
	@Test
	public void test2CorinthiansName(){
		assertEquals(BibleBooks.SECOND_CORINTHIANS, SECOND_CORINTHIANS.getBook());
	}
	
	@Test
	public void testGalatiansName(){
		assertEquals(BibleBooks.GALATIANS, GALATIANS.getBook());
	}
	
	@Test
	public void testEphesiansName(){
		assertEquals(BibleBooks.EPHESIANS, EPHESIANS.getBook());
	}
	
	@Test
	public void testPhilippiansName(){
		assertEquals(BibleBooks.PHILIPPIANS, PHILIPPIANS.getBook());
	}
	
	@Test
	public void testColossiansName(){
		assertEquals(BibleBooks.COLOSSIANS, COLOSSIANS.getBook());
	}
	
	@Test
	public void test1ThessaloniansName(){
		assertEquals(BibleBooks.FIRST_THESSALONIANS, FIRST_THESSALONIANS.getBook());
	}
	
	@Test
	public void test2ThessaloniansName(){
		assertEquals(BibleBooks.SECOND_THESSALONIANS, SECOND_THESSALONIANS.getBook());
	}
	
	@Test
	public void test1TimothyName(){
		assertEquals(BibleBooks.FIRST_TIMOTHY, FIRST_TIMOTHY.getBook());
	}
	
	@Test
	public void test2TimothyName(){
		assertEquals(BibleBooks.SECOND_TIMOTHY, SECOND_TIMOTHY.getBook());
	}
	
	@Test
	public void testTitusName(){
		assertEquals(BibleBooks.TITUS, TITUS.getBook());
	}
	
	@Test
	public void testPhilemonName(){
		assertEquals(BibleBooks.PHILEMON, PHILEMON.getBook());
	}
	
	@Test
	public void testHebrewsName(){
		assertEquals(BibleBooks.HEBREWS, HEBREWS.getBook());
	}
	
	@Test
	public void testJamesName(){
		assertEquals(BibleBooks.JAMES, JAMES.getBook());
	}
	
	@Test
	public void test1PeterName(){
		assertEquals(BibleBooks.FIRST_PETER, FIRST_PETER.getBook());
	}
	
	@Test
	public void test2PeterName(){
		assertEquals(BibleBooks.SECOND_PETER, SECOND_PETER.getBook());
	}
	
	@Test
	public void test1JohnName(){
		assertEquals(BibleBooks.FIRST_JOHN, FIRST_JOHN.getBook());
	}
	
	@Test
	public void test2JohnName(){
		assertEquals(BibleBooks.SECOND_JOHN, SECOND_JOHN.getBook());
	}
	
	@Test
	public void test3JohnName(){
		assertEquals(BibleBooks.THIRD_JOHN, THIRD_JOHN.getBook());
	}
	
	@Test
	public void testJudeName(){
		assertEquals(BibleBooks.JUDE, JUDE.getBook());
	}
	
	@Test
	public void testRevelationName(){
		assertEquals(BibleBooks.REVELATION, REVELATION.getBook());
	}
	
	/*
	 * ========================================
	 * Test that number of chapters are correct
	 * ========================================
	 */
	@Test
	public void testGenesisNumChapters(){
		assertEquals(BibleChapters.GENESIS, GENESIS.getNumChapters());
	}
	
	@Test
	public void testExodusNumChapters(){
		assertEquals(BibleChapters.EXODUS, EXODUS.getNumChapters());
	}
	
	@Test
	public void testLeviticusNumChapters(){
		assertEquals(BibleChapters.LEVITICUS, LEVITICUS.getNumChapters());
	}
	
	@Test
	public void testNumbersNumChapters(){
		assertEquals(BibleChapters.NUMBERS, NUMBERS.getNumChapters());
	}
	
	@Test
	public void testDeuteronomyNumChapters(){
		assertEquals(BibleChapters.DEUTERONOMY, DEUTERONOMY.getNumChapters());
	}
	
	@Test
	public void testJoshuaNumChapters(){
		assertEquals(BibleChapters.JOSHUA, JOSHUA.getNumChapters());
	}
	
	@Test
	public void testJudgesNumChapters(){
		assertEquals(BibleChapters.JUDGES, JUDGES.getNumChapters());
	}
	
	@Test
	public void testRuthNumChapters(){
		assertEquals(BibleChapters.RUTH, RUTH.getNumChapters());
	}
	
	@Test
	public void test1SamuelNumChapters(){
		assertEquals(BibleChapters.FIRST_SAMUEL, FIRST_SAMUEL.getNumChapters());
	}
	
	@Test
	public void test2SamuelNumChapters(){
		assertEquals(BibleChapters.SECOND_SAMUEL, SECOND_SAMUEL.getNumChapters());
	}
	
	@Test
	public void test1KingsNumChapters(){
		assertEquals(BibleChapters.FIRST_KINGS, FIRST_KINGS.getNumChapters());
	}
	
	@Test
	public void test2KingsNumChapters(){
		assertEquals(BibleChapters.SECOND_KINGS, SECOND_KINGS.getNumChapters());
	}
	
	@Test
	public void test1ChroniclesNumChapters(){
		assertEquals(BibleChapters.FIRST_CHRONICLES, FIRST_CHRONICLES.getNumChapters());
	}
	
	@Test
	public void test2ChroniclesNumChapters(){
		assertEquals(BibleChapters.SECOND_CHRONICLES, SECOND_CHRONICLES.getNumChapters());
	}
	
	@Test
	public void testEzraNumChapters(){
		assertEquals(BibleChapters.EZRA, EZRA.getNumChapters());
	}
	
	@Test
	public void testNehemiahNumChapters(){
		assertEquals(BibleChapters.NEHEMIAH, NEHEMIAH.getNumChapters());
	}
	
	@Test
	public void testEstherNumChapters(){
		assertEquals(BibleChapters.ESTHER, ESTHER.getNumChapters());
	}
	
	@Test
	public void testJobNumChapters(){
		assertEquals(BibleChapters.JOB, JOB.getNumChapters());
	}
	
	@Test
	public void testPsalmsNumChapters(){
		assertEquals(BibleChapters.PSALMS, PSALMS.getNumChapters());
	}
	
	@Test
	public void testProverbsNumChapters(){
		assertEquals(BibleChapters.PROVERBS, PROVERBS.getNumChapters());
	}
	
	@Test
	public void testEcclesiastesNumChapters(){
		assertEquals(BibleChapters.ECCLESIASTES, ECCLESIASTES.getNumChapters());
	}
	
	@Test
	public void testSongofSongsNumChapters(){
		assertEquals(BibleChapters.SONG_OF_SONGS, SONG_OF_SONGS.getNumChapters());
	}
	
	@Test
	public void testIsaiahNumChapters(){
		assertEquals(BibleChapters.ISAIAH, ISAIAH.getNumChapters());
	}
	
	@Test
	public void testJeremiahNumChapters(){
		assertEquals(BibleChapters.JEREMIAH, JEREMIAH.getNumChapters());
	}
	
	@Test
	public void testLamentationsNumChapters(){
		assertEquals(BibleChapters.LAMENTATIONS, LAMENTATIONS.getNumChapters());
	}
	
	@Test
	public void testEzekielNumChapters(){
		assertEquals(BibleChapters.EZEKIEL, EZEKIEL.getNumChapters());
	}
	
	@Test
	public void testDanielNumChapters(){
		assertEquals(BibleChapters.DANIEL, DANIEL.getNumChapters());
	}
	
	@Test
	public void testHoseaNumChapters(){
		assertEquals(BibleChapters.HOSEA, HOSEA.getNumChapters());
	}
	
	@Test
	public void testJoelNumChapters(){
		assertEquals(BibleChapters.JOEL, JOEL.getNumChapters());
	}
	
	@Test
	public void testAmosNumChapters(){
		assertEquals(BibleChapters.AMOS, AMOS.getNumChapters());
	}
	
	@Test
	public void testObadiahNumChapters(){
		assertEquals(BibleChapters.OBADIAH, OBADIAH.getNumChapters());
	}
	
	@Test
	public void testJonahNumChapters(){
		assertEquals(BibleChapters.JONAH, JONAH.getNumChapters());
	}
	
	@Test
	public void testMicahNumChapters(){
		assertEquals(BibleChapters.MICAH, MICAH.getNumChapters());
	}
	
	@Test
	public void testNahumNumChapters(){
		assertEquals(BibleChapters.NAHUM, NAHUM.getNumChapters());
	}
	
	@Test
	public void testHabakkukNumChapters(){
		assertEquals(BibleChapters.HABAKKUK, HABAKKUK.getNumChapters());
	}
	
	@Test
	public void testZephaniahNumChapters(){
		assertEquals(BibleChapters.ZEPHANIAH, ZEPHANIAH.getNumChapters());
	}
	
	@Test
	public void testHaggaiNumChapters(){
		assertEquals(BibleChapters.HAGGAI, HAGGAI.getNumChapters());
	}
	
	@Test
	public void testZechariahNumChapters(){
		assertEquals(BibleChapters.ZECHARIAH, ZECHARIAH.getNumChapters());
	}
	
	@Test
	public void testMalachiNumChapters(){
		assertEquals(BibleChapters.MALACHI, MALACHI.getNumChapters());
	}
	
	@Test
	public void testMatthewNumChapters(){
		assertEquals(BibleChapters.MATTHEW, MATTHEW.getNumChapters());
	}
	
	@Test
	public void testMarkNumChapters(){
		assertEquals(BibleChapters.MARK, MARK.getNumChapters());
	}
	
	@Test
	public void testLukeNumChapters(){
		assertEquals(BibleChapters.LUKE, LUKE.getNumChapters());
	}
	
	@Test
	public void testJohnNumChapters(){
		assertEquals(BibleChapters.JOHN, JOHN.getNumChapters());
	}
	
	@Test
	public void testActsNumChapters(){
		assertEquals(BibleChapters.ACTS, ACTS.getNumChapters());
	}
	
	@Test
	public void testRomansNumChapters(){
		assertEquals(BibleChapters.ROMANS, ROMANS.getNumChapters());
	}
	
	@Test
	public void test1CorinthiansNumChapters(){
		assertEquals(BibleChapters.FIRST_CORINTHIANS, FIRST_CORINTHIANS.getNumChapters());
	}
	
	@Test
	public void test2CorinthiansNumChapters(){
		assertEquals(BibleChapters.SECOND_CORINTHIANS, SECOND_CORINTHIANS.getNumChapters());
	}
	
	@Test
	public void testGalatiansNumChapters(){
		assertEquals(BibleChapters.GALATIANS, GALATIANS.getNumChapters());
	}
	
	@Test
	public void testEphesiansNumChapters(){
		assertEquals(BibleChapters.EPHESIANS, EPHESIANS.getNumChapters());
	}
	
	@Test
	public void testPhilippiansNumChapters(){
		assertEquals(BibleChapters.PHILIPPIANS, PHILIPPIANS.getNumChapters());
	}
	
	@Test
	public void testColossiansNumChapters(){
		assertEquals(BibleChapters.COLOSSIANS, COLOSSIANS.getNumChapters());
	}
	
	@Test
	public void test1ThessaloniansNumChapters(){
		assertEquals(BibleChapters.FIRST_THESSALONIANS, FIRST_THESSALONIANS.getNumChapters());
	}
	
	@Test
	public void test2ThessaloniansNumChapters(){
		assertEquals(BibleChapters.SECOND_THESSALONIANS, SECOND_THESSALONIANS.getNumChapters());
	}
	
	@Test
	public void test1TimothyNumChapters(){
		assertEquals(BibleChapters.FIRST_TIMOTHY, FIRST_TIMOTHY.getNumChapters());
	}
	
	@Test
	public void test2TimothyNumChapters(){
		assertEquals(BibleChapters.SECOND_TIMOTHY, SECOND_TIMOTHY.getNumChapters());
	}
	
	@Test
	public void testTitusNumChapters(){
		assertEquals(BibleChapters.TITUS, TITUS.getNumChapters());
	}
	
	@Test
	public void testPhilemonNumChapters(){
		assertEquals(BibleChapters.PHILEMON, PHILEMON.getNumChapters());
	}
	
	@Test
	public void testHebrewsNumChapters(){
		assertEquals(BibleChapters.HEBREWS, HEBREWS.getNumChapters());
	}
	
	@Test
	public void testJamesNumChapters(){
		assertEquals(BibleChapters.JAMES, JAMES.getNumChapters());
	}
	
	@Test
	public void test1PeterNumChapters(){
		assertEquals(BibleChapters.FIRST_PETER, FIRST_PETER.getNumChapters());
	}
	
	@Test
	public void test2PeterNumChapters(){
		assertEquals(BibleChapters.SECOND_PETER, SECOND_PETER.getNumChapters());
	}
	
	@Test
	public void test1JohnNumChapters(){
		assertEquals(BibleChapters.FIRST_JOHN, FIRST_JOHN.getNumChapters());
	}
	
	@Test
	public void test2JohnNumChapters(){
		assertEquals(BibleChapters.SECOND_JOHN, SECOND_JOHN.getNumChapters());
	}
	
	@Test
	public void test3JohnNumChapters(){
		assertEquals(BibleChapters.THIRD_JOHN, THIRD_JOHN.getNumChapters());
	}
	
	@Test
	public void testJudeNumChapters(){
		assertEquals(BibleChapters.JUDE, JUDE.getNumChapters());
	}
	
	@Test
	public void testRevelationNumChapters(){
		assertEquals(BibleChapters.REVELATION, REVELATION.getNumChapters());
	}
	
	/*
	 * ======================================
	 * Test that number of verses are correct
	 * ======================================
	 */
	
	/*
	 * Genesis number of verses checks
	 */
	@Test
	public void testGenesisChp1NumVerses(){
		assertEquals(Genesis.CHP1, GENESIS.getNumVersesInChp(1));
	}
	
	@Test
	public void testGenesisChp2NumVerses(){
		assertEquals(Genesis.CHP2, GENESIS.getNumVersesInChp(2));
	}
	
	@Test
	public void testGenesisChp3NumVerses(){
		assertEquals(Genesis.CHP3, GENESIS.getNumVersesInChp(3));
	}
	
	@Test
	public void testGenesisChp4NumVerses(){
		assertEquals(Genesis.CHP4, GENESIS.getNumVersesInChp(4));
	}
	
	@Test
	public void testGenesisChp5NumVerses(){
		assertEquals(Genesis.CHP5, GENESIS.getNumVersesInChp(5));
	}
	
	@Test
	public void testGenesisChp6NumVerses(){
		assertEquals(Genesis.CHP6, GENESIS.getNumVersesInChp(6));
	}
	
	@Test
	public void testGenesisChp7NumVerses(){
		assertEquals(Genesis.CHP7, GENESIS.getNumVersesInChp(7));
	}
	
	@Test
	public void testGenesisChp8NumVerses(){
		assertEquals(Genesis.CHP8, GENESIS.getNumVersesInChp(8));
	}
	
	@Test
	public void testGenesisChp9NumVerses(){
		assertEquals(Genesis.CHP9, GENESIS.getNumVersesInChp(9));
	}
	
	@Test
	public void testGenesisChp10NumVerses(){
		assertEquals(Genesis.CHP10, GENESIS.getNumVersesInChp(10));
	}
	
	@Test
	public void testGenesisChp11NumVerses(){
		assertEquals(Genesis.CHP11, GENESIS.getNumVersesInChp(11));
	}
	
	@Test
	public void testGenesisChp12NumVerses(){
		assertEquals(Genesis.CHP12, GENESIS.getNumVersesInChp(12));
	}
	
	@Test
	public void testGenesisChp13NumVerses(){
		assertEquals(Genesis.CHP13, GENESIS.getNumVersesInChp(13));
	}
	
	@Test
	public void testGenesisChp14NumVerses(){
		assertEquals(Genesis.CHP14, GENESIS.getNumVersesInChp(14));
	}
	
	@Test
	public void testGenesisChp15NumVerses(){
		assertEquals(Genesis.CHP15, GENESIS.getNumVersesInChp(15));
	}
	
	@Test
	public void testGenesisChp16NumVerses(){
		assertEquals(Genesis.CHP16, GENESIS.getNumVersesInChp(16));
	}
	
	@Test
	public void testGenesisChp17NumVerses(){
		assertEquals(Genesis.CHP17, GENESIS.getNumVersesInChp(17));
	}
	
	@Test
	public void testGenesisChp18NumVerses(){
		assertEquals(Genesis.CHP18, GENESIS.getNumVersesInChp(18));
	}
	
	@Test
	public void testGenesisChp19NumVerses(){
		assertEquals(Genesis.CHP19, GENESIS.getNumVersesInChp(19));
	}
	
	@Test
	public void testGenesisChp20NumVerses(){
		assertEquals(Genesis.CHP20, GENESIS.getNumVersesInChp(20));
	}
	
	@Test
	public void testGenesisChp21NumVerses(){
		assertEquals(Genesis.CHP21, GENESIS.getNumVersesInChp(21));
	}
	
	@Test
	public void testGenesisChp22NumVerses(){
		assertEquals(Genesis.CHP22, GENESIS.getNumVersesInChp(22));
	}
	
	@Test
	public void testGenesisChp23NumVerses(){
		assertEquals(Genesis.CHP23, GENESIS.getNumVersesInChp(23));
	}
	
	@Test
	public void testGenesisChp24NumVerses(){
		assertEquals(Genesis.CHP24, GENESIS.getNumVersesInChp(24));
	}
	
	@Test
	public void testGenesisChp25NumVerses(){
		assertEquals(Genesis.CHP25, GENESIS.getNumVersesInChp(25));
	}
	
	@Test
	public void testGenesisChp26NumVerses(){
		assertEquals(Genesis.CHP26, GENESIS.getNumVersesInChp(26));
	}
	
	@Test
	public void testGenesisChp27NumVerses(){
		assertEquals(Genesis.CHP27, GENESIS.getNumVersesInChp(27));
	}
	
	@Test
	public void testGenesisChp28NumVerses(){
		assertEquals(Genesis.CHP28, GENESIS.getNumVersesInChp(28));
	}
	
	@Test
	public void testGenesisChp29NumVerses(){
		assertEquals(Genesis.CHP29, GENESIS.getNumVersesInChp(29));
	}
	
	@Test
	public void testGenesisChp30NumVerses(){
		assertEquals(Genesis.CHP30, GENESIS.getNumVersesInChp(30));
	}
	
	@Test
	public void testGenesisChp31NumVerses(){
		assertEquals(Genesis.CHP31, GENESIS.getNumVersesInChp(31));
	}
	
	@Test
	public void testGenesisChp32NumVerses(){
		assertEquals(Genesis.CHP32, GENESIS.getNumVersesInChp(32));
	}
	
	@Test
	public void testGenesisChp33NumVerses(){
		assertEquals(Genesis.CHP33, GENESIS.getNumVersesInChp(33));
	}
	
	@Test
	public void testGenesisChp34NumVerses(){
		assertEquals(Genesis.CHP34, GENESIS.getNumVersesInChp(34));
	}
	
	@Test
	public void testGenesisChp35NumVerses(){
		assertEquals(Genesis.CHP35, GENESIS.getNumVersesInChp(35));
	}
	
	@Test
	public void testGenesisChp36NumVerses(){
		assertEquals(Genesis.CHP36, GENESIS.getNumVersesInChp(36));
	}
	
	@Test
	public void testGenesisChp37NumVerses(){
		assertEquals(Genesis.CHP37, GENESIS.getNumVersesInChp(37));
	}
	
	@Test
	public void testGenesisChp38NumVerses(){
		assertEquals(Genesis.CHP38, GENESIS.getNumVersesInChp(38));
	}
	
	@Test
	public void testGenesisChp39NumVerses(){
		assertEquals(Genesis.CHP39, GENESIS.getNumVersesInChp(39));
	}
	
	@Test
	public void testGenesisChp40NumVerses(){
		assertEquals(Genesis.CHP40, GENESIS.getNumVersesInChp(40));
	}
	
	@Test
	public void testGenesisChp41NumVerses(){
		assertEquals(Genesis.CHP41, GENESIS.getNumVersesInChp(41));
	}
	
	@Test
	public void testGenesisChp42NumVerses(){
		assertEquals(Genesis.CHP42, GENESIS.getNumVersesInChp(42));
	}
	
	@Test
	public void testGenesisChp43NumVerses(){
		assertEquals(Genesis.CHP43, GENESIS.getNumVersesInChp(43));
	}
	
	@Test
	public void testGenesisChp44NumVerses(){
		assertEquals(Genesis.CHP44, GENESIS.getNumVersesInChp(44));
	}
	
	@Test
	public void testGenesisChp45NumVerses(){
		assertEquals(Genesis.CHP45, GENESIS.getNumVersesInChp(45));
	}
	
	@Test
	public void testGenesisChp46NumVerses(){
		assertEquals(Genesis.CHP46, GENESIS.getNumVersesInChp(46));
	}
	
	@Test
	public void testGenesisChp47NumVerses(){
		assertEquals(Genesis.CHP47, GENESIS.getNumVersesInChp(47));
	}
	
	@Test
	public void testGenesisChp48NumVerses(){
		assertEquals(Genesis.CHP48, GENESIS.getNumVersesInChp(48));
	}
	
	@Test
	public void testGenesisChp49NumVerses(){
		assertEquals(Genesis.CHP49, GENESIS.getNumVersesInChp(49));
	}
	
	@Test
	public void testGenesisChp50NumVerses(){
		assertEquals(Genesis.CHP50, GENESIS.getNumVersesInChp(50));
	}
	
	/*
	 * Exodus number of verses checks
	 */
	@Test
	public void testExodusChp1NumVerses(){
		assertEquals(Exodus.CHP1, EXODUS.getNumVersesInChp(1));
	}
	
	@Test
	public void testExodusChp2NumVerses(){
		assertEquals(Exodus.CHP2, EXODUS.getNumVersesInChp(2));
	}
	
	@Test
	public void testExodusChp3NumVerses(){
		assertEquals(Exodus.CHP3, EXODUS.getNumVersesInChp(3));
	}
	
	@Test
	public void testExodusChp4NumVerses(){
		assertEquals(Exodus.CHP4, EXODUS.getNumVersesInChp(4));
	}
	
	@Test
	public void testExodusChp5NumVerses(){
		assertEquals(Exodus.CHP5, EXODUS.getNumVersesInChp(5));
	}
	
	@Test
	public void testExodusChp6NumVerses(){
		assertEquals(Exodus.CHP6, EXODUS.getNumVersesInChp(6));
	}
	
	@Test
	public void testExodusChp7NumVerses(){
		assertEquals(Exodus.CHP7, EXODUS.getNumVersesInChp(7));
	}
	
	@Test
	public void testExodusChp8NumVerses(){
		assertEquals(Exodus.CHP8, EXODUS.getNumVersesInChp(8));
	}
	
	@Test
	public void testExodusChp9NumVerses(){
		assertEquals(Exodus.CHP9, EXODUS.getNumVersesInChp(9));
	}
	
	@Test
	public void testExodusChp10NumVerses(){
		assertEquals(Exodus.CHP10, EXODUS.getNumVersesInChp(10));
	}
	
	@Test
	public void testExodusChp11NumVerses(){
		assertEquals(Exodus.CHP11, EXODUS.getNumVersesInChp(11));
	}
	
	@Test
	public void testExodusChp12NumVerses(){
		assertEquals(Exodus.CHP12, EXODUS.getNumVersesInChp(12));
	}
	
	@Test
	public void testExodusChp13NumVerses(){
		assertEquals(Exodus.CHP13, EXODUS.getNumVersesInChp(13));
	}
	
	@Test
	public void testExodusChp14NumVerses(){
		assertEquals(Exodus.CHP14, EXODUS.getNumVersesInChp(14));
	}
	
	@Test
	public void testExodusChp15NumVerses(){
		assertEquals(Exodus.CHP15, EXODUS.getNumVersesInChp(15));
	}
	
	@Test
	public void testExodusChp16NumVerses(){
		assertEquals(Exodus.CHP16, EXODUS.getNumVersesInChp(16));
	}
	
	@Test
	public void testExodusChp17NumVerses(){
		assertEquals(Exodus.CHP17, EXODUS.getNumVersesInChp(17));
	}
	
	@Test
	public void testExodusChp18NumVerses(){
		assertEquals(Exodus.CHP18, EXODUS.getNumVersesInChp(18));
	}
	
	@Test
	public void testExodusChp19NumVerses(){
		assertEquals(Exodus.CHP19, EXODUS.getNumVersesInChp(19));
	}
	
	@Test
	public void testExodusChp20NumVerses(){
		assertEquals(Exodus.CHP20, EXODUS.getNumVersesInChp(20));
	}
	
	@Test
	public void testExodusChp21NumVerses(){
		assertEquals(Exodus.CHP21, EXODUS.getNumVersesInChp(21));
	}
	
	@Test
	public void testExodusChp22NumVerses(){
		assertEquals(Exodus.CHP22, EXODUS.getNumVersesInChp(22));
	}
	
	@Test
	public void testExodusChp23NumVerses(){
		assertEquals(Exodus.CHP23, EXODUS.getNumVersesInChp(23));
	}
	
	@Test
	public void testExodusChp24NumVerses(){
		assertEquals(Exodus.CHP24, EXODUS.getNumVersesInChp(24));
	}
	
	@Test
	public void testExodusChp25NumVerses(){
		assertEquals(Exodus.CHP25, EXODUS.getNumVersesInChp(25));
	}
	
	@Test
	public void testExodusChp26NumVerses(){
		assertEquals(Exodus.CHP26, EXODUS.getNumVersesInChp(26));
	}
	
	@Test
	public void testExodusChp27NumVerses(){
		assertEquals(Exodus.CHP27, EXODUS.getNumVersesInChp(27));
	}
	
	@Test
	public void testExodusChp28NumVerses(){
		assertEquals(Exodus.CHP28, EXODUS.getNumVersesInChp(28));
	}
	
	@Test
	public void testExodusChp29NumVerses(){
		assertEquals(Exodus.CHP29, EXODUS.getNumVersesInChp(29));
	}
	
	@Test
	public void testExodusChp30NumVerses(){
		assertEquals(Exodus.CHP30, EXODUS.getNumVersesInChp(30));
	}
	
	@Test
	public void testExodusChp31NumVerses(){
		assertEquals(Exodus.CHP31, EXODUS.getNumVersesInChp(31));
	}
	
	@Test
	public void testExodusChp32NumVerses(){
		assertEquals(Exodus.CHP32, EXODUS.getNumVersesInChp(32));
	}
	
	@Test
	public void testExodusChp33NumVerses(){
		assertEquals(Exodus.CHP33, EXODUS.getNumVersesInChp(33));
	}
	
	@Test
	public void testExodusChp34NumVerses(){
		assertEquals(Exodus.CHP34, EXODUS.getNumVersesInChp(34));
	}
	
	@Test
	public void testExodusChp35NumVerses(){
		assertEquals(Exodus.CHP35, EXODUS.getNumVersesInChp(35));
	}
	
	@Test
	public void testExodusChp36NumVerses(){
		assertEquals(Exodus.CHP36, EXODUS.getNumVersesInChp(36));
	}
	
	@Test
	public void testExodusChp37NumVerses(){
		assertEquals(Exodus.CHP37, EXODUS.getNumVersesInChp(37));
	}
	
	@Test
	public void testExodusChp38NumVerses(){
		assertEquals(Exodus.CHP38, EXODUS.getNumVersesInChp(38));
	}
	
	@Test
	public void testExodusChp39NumVerses(){
		assertEquals(Exodus.CHP39, EXODUS.getNumVersesInChp(39));
	}
	
	@Test
	public void testExodusChp40NumVerses(){
		assertEquals(Exodus.CHP40, EXODUS.getNumVersesInChp(40));
	}
	
	/*
	 * Leviticus number of verses checks
	 */
	@Test
	public void testLeviticusChp1NumVerses(){
		assertEquals(Leviticus.CHP1, LEVITICUS.getNumVersesInChp(1));
	}
	
	@Test
	public void testLeviticusChp2NumVerses(){
		assertEquals(Leviticus.CHP2, LEVITICUS.getNumVersesInChp(2));
	}
	
	@Test
	public void testLeviticusChp3NumVerses(){
		assertEquals(Leviticus.CHP3, LEVITICUS.getNumVersesInChp(3));
	}
	
	@Test
	public void testLeviticusChp4NumVerses(){
		assertEquals(Leviticus.CHP4, LEVITICUS.getNumVersesInChp(4));
	}
	
	@Test
	public void testLeviticusChp5NumVerses(){
		assertEquals(Leviticus.CHP5, LEVITICUS.getNumVersesInChp(5));
	}
	
	@Test
	public void testLeviticusChp6NumVerses(){
		assertEquals(Leviticus.CHP6, LEVITICUS.getNumVersesInChp(6));
	}
	
	@Test
	public void testLeviticusChp7NumVerses(){
		assertEquals(Leviticus.CHP7, LEVITICUS.getNumVersesInChp(7));
	}
	
	@Test
	public void testLeviticusChp8NumVerses(){
		assertEquals(Leviticus.CHP8, LEVITICUS.getNumVersesInChp(8));
	}
	
	@Test
	public void testLeviticusChp9NumVerses(){
		assertEquals(Leviticus.CHP9, LEVITICUS.getNumVersesInChp(9));
	}
	
	@Test
	public void testLeviticusChp10NumVerses(){
		assertEquals(Leviticus.CHP10, LEVITICUS.getNumVersesInChp(10));
	}
	
	@Test
	public void testLeviticusChp11NumVerses(){
		assertEquals(Leviticus.CHP11, LEVITICUS.getNumVersesInChp(11));
	}
	
	@Test
	public void testLeviticusChp12NumVerses(){
		assertEquals(Leviticus.CHP12, LEVITICUS.getNumVersesInChp(12));
	}
	
	@Test
	public void testLeviticusChp13NumVerses(){
		assertEquals(Leviticus.CHP13, LEVITICUS.getNumVersesInChp(13));
	}
	
	@Test
	public void testLeviticusChp14NumVerses(){
		assertEquals(Leviticus.CHP14, LEVITICUS.getNumVersesInChp(14));
	}
	
	@Test
	public void testLeviticusChp15NumVerses(){
		assertEquals(Leviticus.CHP15, LEVITICUS.getNumVersesInChp(15));
	}
	
	@Test
	public void testLeviticusChp16NumVerses(){
		assertEquals(Leviticus.CHP16, LEVITICUS.getNumVersesInChp(16));
	}
	
	@Test
	public void testLeviticusChp17NumVerses(){
		assertEquals(Leviticus.CHP17, LEVITICUS.getNumVersesInChp(17));
	}
	
	@Test
	public void testLeviticusChp18NumVerses(){
		assertEquals(Leviticus.CHP18, LEVITICUS.getNumVersesInChp(18));
	}
	
	@Test
	public void testLeviticusChp19NumVerses(){
		assertEquals(Leviticus.CHP19, LEVITICUS.getNumVersesInChp(19));
	}
	
	@Test
	public void testLeviticusChp20NumVerses(){
		assertEquals(Leviticus.CHP20, LEVITICUS.getNumVersesInChp(20));
	}
	
	@Test
	public void testLeviticusChp21NumVerses(){
		assertEquals(Leviticus.CHP21, LEVITICUS.getNumVersesInChp(21));
	}
	
	@Test
	public void testLeviticusChp22NumVerses(){
		assertEquals(Leviticus.CHP22, LEVITICUS.getNumVersesInChp(22));
	}
	
	@Test
	public void testLeviticusChp23NumVerses(){
		assertEquals(Leviticus.CHP23, LEVITICUS.getNumVersesInChp(23));
	}
	
	@Test
	public void testLeviticusChp24NumVerses(){
		assertEquals(Leviticus.CHP24, LEVITICUS.getNumVersesInChp(24));
	}
	
	@Test
	public void testLeviticusChp25NumVerses(){
		assertEquals(Leviticus.CHP25, LEVITICUS.getNumVersesInChp(25));
	}
	
	@Test
	public void testLeviticusChp26NumVerses(){
		assertEquals(Leviticus.CHP26, LEVITICUS.getNumVersesInChp(26));
	}
	
	@Test
	public void testLeviticusChp27NumVerses(){
		assertEquals(Leviticus.CHP27, LEVITICUS.getNumVersesInChp(27));
	}
	
	/*
	 * Numbers number of verses checks
	 */
	@Test
	public void testNumbersChp1NumVerses(){
		assertEquals(Numbers.CHP1, NUMBERS.getNumVersesInChp(1));
	}
	
	@Test
	public void testNumbersChp2NumVerses(){
		assertEquals(Numbers.CHP2, NUMBERS.getNumVersesInChp(2));
	}
	
	@Test
	public void testNumbersChp3NumVerses(){
		assertEquals(Numbers.CHP3, NUMBERS.getNumVersesInChp(3));
	}
	
	@Test
	public void testNumbersChp4NumVerses(){
		assertEquals(Numbers.CHP4, NUMBERS.getNumVersesInChp(4));
	}
	
	@Test
	public void testNumbersChp5NumVerses(){
		assertEquals(Numbers.CHP5, NUMBERS.getNumVersesInChp(5));
	}
	
	@Test
	public void testNumbersChp6NumVerses(){
		assertEquals(Numbers.CHP6, NUMBERS.getNumVersesInChp(6));
	}
	
	@Test
	public void testNumbersChp7NumVerses(){
		assertEquals(Numbers.CHP7, NUMBERS.getNumVersesInChp(7));
	}
	
	@Test
	public void testNumbersChp8NumVerses(){
		assertEquals(Numbers.CHP8, NUMBERS.getNumVersesInChp(8));
	}
	
	@Test
	public void testNumbersChp9NumVerses(){
		assertEquals(Numbers.CHP9, NUMBERS.getNumVersesInChp(9));
	}
	
	@Test
	public void testNumbersChp10NumVerses(){
		assertEquals(Numbers.CHP10, NUMBERS.getNumVersesInChp(10));
	}
	
	@Test
	public void testNumbersChp11NumVerses(){
		assertEquals(Numbers.CHP11, NUMBERS.getNumVersesInChp(11));
	}
	
	@Test
	public void testNumbersChp12NumVerses(){
		assertEquals(Numbers.CHP12, NUMBERS.getNumVersesInChp(12));
	}
	
	@Test
	public void testNumbersChp13NumVerses(){
		assertEquals(Numbers.CHP13, NUMBERS.getNumVersesInChp(13));
	}
	
	@Test
	public void testNumbersChp14NumVerses(){
		assertEquals(Numbers.CHP14, NUMBERS.getNumVersesInChp(14));
	}
	
	@Test
	public void testNumbersChp15NumVerses(){
		assertEquals(Numbers.CHP15, NUMBERS.getNumVersesInChp(15));
	}
	
	@Test
	public void testNumbersChp16NumVerses(){
		assertEquals(Numbers.CHP16, NUMBERS.getNumVersesInChp(16));
	}
	
	@Test
	public void testNumbersChp17NumVerses(){
		assertEquals(Numbers.CHP17, NUMBERS.getNumVersesInChp(17));
	}
	
	@Test
	public void testNumbersChp18NumVerses(){
		assertEquals(Numbers.CHP18, NUMBERS.getNumVersesInChp(18));
	}
	
	@Test
	public void testNumbersChp19NumVerses(){
		assertEquals(Numbers.CHP19, NUMBERS.getNumVersesInChp(19));
	}
	
	@Test
	public void testNumbersChp20NumVerses(){
		assertEquals(Numbers.CHP20, NUMBERS.getNumVersesInChp(20));
	}
	
	@Test
	public void testNumbersChp21NumVerses(){
		assertEquals(Numbers.CHP21, NUMBERS.getNumVersesInChp(21));
	}
	
	@Test
	public void testNumbersChp22NumVerses(){
		assertEquals(Numbers.CHP22, NUMBERS.getNumVersesInChp(22));
	}
	
	@Test
	public void testNumbersChp23NumVerses(){
		assertEquals(Numbers.CHP23, NUMBERS.getNumVersesInChp(23));
	}
	
	@Test
	public void testNumbersChp24NumVerses(){
		assertEquals(Numbers.CHP24, NUMBERS.getNumVersesInChp(24));
	}
	
	@Test
	public void testNumbersChp25NumVerses(){
		assertEquals(Numbers.CHP25, NUMBERS.getNumVersesInChp(25));
	}
	
	@Test
	public void testNumbersChp26NumVerses(){
		assertEquals(Numbers.CHP26, NUMBERS.getNumVersesInChp(26));
	}
	
	@Test
	public void testNumbersChp27NumVerses(){
		assertEquals(Numbers.CHP27, NUMBERS.getNumVersesInChp(27));
	}
	
	@Test
	public void testNumbersChp28NumVerses(){
		assertEquals(Numbers.CHP28, NUMBERS.getNumVersesInChp(28));
	}
	
	@Test
	public void testNumbersChp29NumVerses(){
		assertEquals(Numbers.CHP29, NUMBERS.getNumVersesInChp(29));
	}
	
	@Test
	public void testNumbersChp30NumVerses(){
		assertEquals(Numbers.CHP30, NUMBERS.getNumVersesInChp(30));
	}
	
	@Test
	public void testNumbersChp31NumVerses(){
		assertEquals(Numbers.CHP31, NUMBERS.getNumVersesInChp(31));
	}
	
	@Test
	public void testNumbersChp32NumVerses(){
		assertEquals(Numbers.CHP32, NUMBERS.getNumVersesInChp(32));
	}
	
	@Test
	public void testNumbersChp33NumVerses(){
		assertEquals(Numbers.CHP33, NUMBERS.getNumVersesInChp(33));
	}
	
	@Test
	public void testNumbersChp34NumVerses(){
		assertEquals(Numbers.CHP34, NUMBERS.getNumVersesInChp(34));
	}
	
	@Test
	public void testNumbersChp35NumVerses(){
		assertEquals(Numbers.CHP35, NUMBERS.getNumVersesInChp(35));
	}
	
	@Test
	public void testNumbersChp36NumVerses(){
		assertEquals(Numbers.CHP36, NUMBERS.getNumVersesInChp(36));
	}
	
	/*
	 * Deuteronomy number of verses checks
	 */
	@Test
	public void testDeuteronomyChp1NumVerses(){
		assertEquals(Deuteronomy.CHP1, DEUTERONOMY.getNumVersesInChp(1));
	}
	
	@Test
	public void testDeuteronomyChp2NumVerses(){
		assertEquals(Deuteronomy.CHP2, DEUTERONOMY.getNumVersesInChp(2));
	}
	
	@Test
	public void testDeuteronomyChp3NumVerses(){
		assertEquals(Deuteronomy.CHP3, DEUTERONOMY.getNumVersesInChp(3));
	}
	
	@Test
	public void testDeuteronomyChp4NumVerses(){
		assertEquals(Deuteronomy.CHP4, DEUTERONOMY.getNumVersesInChp(4));
	}
	
	@Test
	public void testDeuteronomyChp5NumVerses(){
		assertEquals(Deuteronomy.CHP5, DEUTERONOMY.getNumVersesInChp(5));
	}
	
	@Test
	public void testDeuteronomyChp6NumVerses(){
		assertEquals(Deuteronomy.CHP6, DEUTERONOMY.getNumVersesInChp(6));
	}
	
	@Test
	public void testDeuteronomyChp7NumVerses(){
		assertEquals(Deuteronomy.CHP7, DEUTERONOMY.getNumVersesInChp(7));
	}
	
	@Test
	public void testDeuteronomyChp8NumVerses(){
		assertEquals(Deuteronomy.CHP8, DEUTERONOMY.getNumVersesInChp(8));
	}
	
	@Test
	public void testDeuteronomyChp9NumVerses(){
		assertEquals(Deuteronomy.CHP9, DEUTERONOMY.getNumVersesInChp(9));
	}
	
	@Test
	public void testDeuteronomyChp10NumVerses(){
		assertEquals(Deuteronomy.CHP10, DEUTERONOMY.getNumVersesInChp(10));
	}
	
	@Test
	public void testDeuteronomyChp11NumVerses(){
		assertEquals(Deuteronomy.CHP11, DEUTERONOMY.getNumVersesInChp(11));
	}
	
	@Test
	public void testDeuteronomyChp12NumVerses(){
		assertEquals(Deuteronomy.CHP12, DEUTERONOMY.getNumVersesInChp(12));
	}
	
	@Test
	public void testDeuteronomyChp13NumVerses(){
		assertEquals(Deuteronomy.CHP13, DEUTERONOMY.getNumVersesInChp(13));
	}
	
	@Test
	public void testDeuteronomyChp14NumVerses(){
		assertEquals(Deuteronomy.CHP14, DEUTERONOMY.getNumVersesInChp(14));
	}
	
	@Test
	public void testDeuteronomyChp15NumVerses(){
		assertEquals(Deuteronomy.CHP15, DEUTERONOMY.getNumVersesInChp(15));
	}
	
	@Test
	public void testDeuteronomyChp16NumVerses(){
		assertEquals(Deuteronomy.CHP16, DEUTERONOMY.getNumVersesInChp(16));
	}
	
	@Test
	public void testDeuteronomyChp17NumVerses(){
		assertEquals(Deuteronomy.CHP17, DEUTERONOMY.getNumVersesInChp(17));
	}
	
	@Test
	public void testDeuteronomyChp18NumVerses(){
		assertEquals(Deuteronomy.CHP18, DEUTERONOMY.getNumVersesInChp(18));
	}
	
	@Test
	public void testDeuteronomyChp19NumVerses(){
		assertEquals(Deuteronomy.CHP19, DEUTERONOMY.getNumVersesInChp(19));
	}
	
	@Test
	public void testDeuteronomyChp20NumVerses(){
		assertEquals(Deuteronomy.CHP20, DEUTERONOMY.getNumVersesInChp(20));
	}
	
	@Test
	public void testDeuteronomyChp21NumVerses(){
		assertEquals(Deuteronomy.CHP21, DEUTERONOMY.getNumVersesInChp(21));
	}
	
	@Test
	public void testDeuteronomyChp22NumVerses(){
		assertEquals(Deuteronomy.CHP22, DEUTERONOMY.getNumVersesInChp(22));
	}
	
	@Test
	public void testDeuteronomyChp23NumVerses(){
		assertEquals(Deuteronomy.CHP23, DEUTERONOMY.getNumVersesInChp(23));
	}
	
	@Test
	public void testDeuteronomyChp24NumVerses(){
		assertEquals(Deuteronomy.CHP24, DEUTERONOMY.getNumVersesInChp(24));
	}
	
	@Test
	public void testDeuteronomyChp25NumVerses(){
		assertEquals(Deuteronomy.CHP25, DEUTERONOMY.getNumVersesInChp(25));
	}
	
	@Test
	public void testDeuteronomyChp26NumVerses(){
		assertEquals(Deuteronomy.CHP26, DEUTERONOMY.getNumVersesInChp(26));
	}
	
	@Test
	public void testDeuteronomyChp27NumVerses(){
		assertEquals(Deuteronomy.CHP27, DEUTERONOMY.getNumVersesInChp(27));
	}
	
	@Test
	public void testDeuteronomyChp28NumVerses(){
		assertEquals(Deuteronomy.CHP28, DEUTERONOMY.getNumVersesInChp(28));
	}
	
	@Test
	public void testDeuteronomyChp29NumVerses(){
		assertEquals(Deuteronomy.CHP29, DEUTERONOMY.getNumVersesInChp(29));
	}
	
	@Test
	public void testDeuteronomyChp30NumVerses(){
		assertEquals(Deuteronomy.CHP30, DEUTERONOMY.getNumVersesInChp(30));
	}
	
	@Test
	public void testDeuteronomyChp31NumVerses(){
		assertEquals(Deuteronomy.CHP31, DEUTERONOMY.getNumVersesInChp(31));
	}
	
	@Test
	public void testDeuteronomyChp32NumVerses(){
		assertEquals(Deuteronomy.CHP32, DEUTERONOMY.getNumVersesInChp(32));
	}
	
	@Test
	public void testDeuteronomyChp33NumVerses(){
		assertEquals(Deuteronomy.CHP33, DEUTERONOMY.getNumVersesInChp(33));
	}
	
	@Test
	public void testDeuteronomyChp34NumVerses(){
		assertEquals(Deuteronomy.CHP34, DEUTERONOMY.getNumVersesInChp(34));
	}
	
	/*
	 * Joshua number of verses checks
	 */
	@Test
	public void testJoshuaChp1NumVerses(){
		assertEquals(Joshua.CHP1, JOSHUA.getNumVersesInChp(1));
	}
	
	@Test
	public void testJoshuaChp2NumVerses(){
		assertEquals(Joshua.CHP2, JOSHUA.getNumVersesInChp(2));
	}
	
	@Test
	public void testJoshuaChp3NumVerses(){
		assertEquals(Joshua.CHP3, JOSHUA.getNumVersesInChp(3));
	}
	
	@Test
	public void testJoshuaChp4NumVerses(){
		assertEquals(Joshua.CHP4, JOSHUA.getNumVersesInChp(4));
	}
	
	@Test
	public void testJoshuaChp5NumVerses(){
		assertEquals(Joshua.CHP5, JOSHUA.getNumVersesInChp(5));
	}
	
	@Test
	public void testJoshuaChp6NumVerses(){
		assertEquals(Joshua.CHP6, JOSHUA.getNumVersesInChp(6));
	}
	
	@Test
	public void testJoshuaChp7NumVerses(){
		assertEquals(Joshua.CHP7, JOSHUA.getNumVersesInChp(7));
	}
	
	@Test
	public void testJoshuaChp8NumVerses(){
		assertEquals(Joshua.CHP8, JOSHUA.getNumVersesInChp(8));
	}
	
	@Test
	public void testJoshuaChp9NumVerses(){
		assertEquals(Joshua.CHP9, JOSHUA.getNumVersesInChp(9));
	}
	
	@Test
	public void testJoshuaChp10NumVerses(){
		assertEquals(Joshua.CHP10, JOSHUA.getNumVersesInChp(10));
	}
	
	@Test
	public void testJoshuaChp11NumVerses(){
		assertEquals(Joshua.CHP11, JOSHUA.getNumVersesInChp(11));
	}
	
	@Test
	public void testJoshuaChp12NumVerses(){
		assertEquals(Joshua.CHP12, JOSHUA.getNumVersesInChp(12));
	}
	
	@Test
	public void testJoshuaChp13NumVerses(){
		assertEquals(Joshua.CHP13, JOSHUA.getNumVersesInChp(13));
	}
	
	@Test
	public void testJoshuaChp14NumVerses(){
		assertEquals(Joshua.CHP14, JOSHUA.getNumVersesInChp(14));
	}
	
	@Test
	public void testJoshuaChp15NumVerses(){
		assertEquals(Joshua.CHP15, JOSHUA.getNumVersesInChp(15));
	}
	
	@Test
	public void testJoshuaChp16NumVerses(){
		assertEquals(Joshua.CHP16, JOSHUA.getNumVersesInChp(16));
	}
	
	@Test
	public void testJoshuaChp17NumVerses(){
		assertEquals(Joshua.CHP17, JOSHUA.getNumVersesInChp(17));
	}
	
	@Test
	public void testJoshuaChp18NumVerses(){
		assertEquals(Joshua.CHP18, JOSHUA.getNumVersesInChp(18));
	}
	
	@Test
	public void testJoshuaChp19NumVerses(){
		assertEquals(Joshua.CHP19, JOSHUA.getNumVersesInChp(19));
	}
	
	@Test
	public void testJoshuaChp20NumVerses(){
		assertEquals(Joshua.CHP20, JOSHUA.getNumVersesInChp(20));
	}
	
	@Test
	public void testJoshuaChp21NumVerses(){
		assertEquals(Joshua.CHP21, JOSHUA.getNumVersesInChp(21));
	}
	
	@Test
	public void testJoshuaChp22NumVerses(){
		assertEquals(Joshua.CHP22, JOSHUA.getNumVersesInChp(22));
	}
	
	@Test
	public void testJoshuaChp23NumVerses(){
		assertEquals(Joshua.CHP23, JOSHUA.getNumVersesInChp(23));
	}
	
	@Test
	public void testJoshuaChp24NumVerses(){
		assertEquals(Joshua.CHP24, JOSHUA.getNumVersesInChp(24));
	}
	
	/*
	 * Judges number of verses checks
	 */
	@Test
	public void testJudgesChp1NumVerses(){
		assertEquals(Judges.CHP1, JUDGES.getNumVersesInChp(1));
	}
	
	@Test
	public void testJudgesChp2NumVerses(){
		assertEquals(Judges.CHP2, JUDGES.getNumVersesInChp(2));
	}
	
	@Test
	public void testJudgesChp3NumVerses(){
		assertEquals(Judges.CHP3, JUDGES.getNumVersesInChp(3));
	}
	
	@Test
	public void testJudgesChp4NumVerses(){
		assertEquals(Judges.CHP4, JUDGES.getNumVersesInChp(4));
	}
	
	@Test
	public void testJudgesChp5NumVerses(){
		assertEquals(Judges.CHP5, JUDGES.getNumVersesInChp(5));
	}
	
	@Test
	public void testJudgesChp6NumVerses(){
		assertEquals(Judges.CHP6, JUDGES.getNumVersesInChp(6));
	}
	
	@Test
	public void testJudgesChp7NumVerses(){
		assertEquals(Judges.CHP7, JUDGES.getNumVersesInChp(7));
	}
	
	@Test
	public void testJudgesChp8NumVerses(){
		assertEquals(Judges.CHP8, JUDGES.getNumVersesInChp(8));
	}
	
	@Test
	public void testJudgesChp9NumVerses(){
		assertEquals(Judges.CHP9, JUDGES.getNumVersesInChp(9));
	}
	
	@Test
	public void testJudgesChp10NumVerses(){
		assertEquals(Judges.CHP10, JUDGES.getNumVersesInChp(10));
	}
	
	@Test
	public void testJudgesChp11NumVerses(){
		assertEquals(Judges.CHP11, JUDGES.getNumVersesInChp(11));
	}
	
	@Test
	public void testJudgesChp12NumVerses(){
		assertEquals(Judges.CHP12, JUDGES.getNumVersesInChp(12));
	}
	
	@Test
	public void testJudgesChp13NumVerses(){
		assertEquals(Judges.CHP13, JUDGES.getNumVersesInChp(13));
	}
	
	@Test
	public void testJudgesChp14NumVerses(){
		assertEquals(Judges.CHP14, JUDGES.getNumVersesInChp(14));
	}
	
	@Test
	public void testJudgesChp15NumVerses(){
		assertEquals(Judges.CHP15, JUDGES.getNumVersesInChp(15));
	}
	
	@Test
	public void testJudgesChp16NumVerses(){
		assertEquals(Judges.CHP16, JUDGES.getNumVersesInChp(16));
	}
	
	@Test
	public void testJudgesChp17NumVerses(){
		assertEquals(Judges.CHP17, JUDGES.getNumVersesInChp(17));
	}
	
	@Test
	public void testJudgesChp18NumVerses(){
		assertEquals(Judges.CHP18, JUDGES.getNumVersesInChp(18));
	}
	
	@Test
	public void testJudgesChp19NumVerses(){
		assertEquals(Judges.CHP19, JUDGES.getNumVersesInChp(19));
	}
	
	@Test
	public void testJudgesChp20NumVerses(){
		assertEquals(Judges.CHP20, JUDGES.getNumVersesInChp(20));
	}
	
	@Test
	public void testJudgesChp21NumVerses(){
		assertEquals(Judges.CHP21, JUDGES.getNumVersesInChp(21));
	}
	
	/*
	 * Ruth number of verses checks
	 */
	@Test
	public void testRuthChp1NumVerses(){
		assertEquals(Ruth.CHP1, RUTH.getNumVersesInChp(1));
	}
	
	@Test
	public void testRuthChp2NumVerses(){
		assertEquals(Ruth.CHP2, RUTH.getNumVersesInChp(2));
	}
	
	@Test
	public void testRuthChp3NumVerses(){
		assertEquals(Ruth.CHP3, RUTH.getNumVersesInChp(3));
	}
	
	@Test
	public void testRuthChp4NumVerses(){
		assertEquals(Ruth.CHP4, RUTH.getNumVersesInChp(4));
	}
	
	/*
	 * 1 Samuel number of verses checks
	 */
	@Test
	public void test1SamuelChp1NumVerses(){
		assertEquals(FirstSamuel.CHP1, FIRST_SAMUEL.getNumVersesInChp(1));
	}
	
	@Test
	public void test1SamuelChp2NumVerses(){
		assertEquals(FirstSamuel.CHP2, FIRST_SAMUEL.getNumVersesInChp(2));
	}
	
	@Test
	public void test1SamuelChp3NumVerses(){
		assertEquals(FirstSamuel.CHP3, FIRST_SAMUEL.getNumVersesInChp(3));
	}
	
	@Test
	public void test1SamuelChp4NumVerses(){
		assertEquals(FirstSamuel.CHP4, FIRST_SAMUEL.getNumVersesInChp(4));
	}
	
	@Test
	public void test1SamuelChp5NumVerses(){
		assertEquals(FirstSamuel.CHP5, FIRST_SAMUEL.getNumVersesInChp(5));
	}
	
	@Test
	public void test1SamuelChp6NumVerses(){
		assertEquals(FirstSamuel.CHP6, FIRST_SAMUEL.getNumVersesInChp(6));
	}
	
	@Test
	public void test1SamuelChp7NumVerses(){
		assertEquals(FirstSamuel.CHP7, FIRST_SAMUEL.getNumVersesInChp(7));
	}
	
	@Test
	public void test1SamuelChp8NumVerses(){
		assertEquals(FirstSamuel.CHP8, FIRST_SAMUEL.getNumVersesInChp(8));
	}
	
	@Test
	public void test1SamuelChp9NumVerses(){
		assertEquals(FirstSamuel.CHP9, FIRST_SAMUEL.getNumVersesInChp(9));
	}
	
	@Test
	public void test1SamuelChp10NumVerses(){
		assertEquals(FirstSamuel.CHP10, FIRST_SAMUEL.getNumVersesInChp(10));
	}
	
	@Test
	public void test1SamuelChp11NumVerses(){
		assertEquals(FirstSamuel.CHP11, FIRST_SAMUEL.getNumVersesInChp(11));
	}
	
	@Test
	public void test1SamuelChp12NumVerses(){
		assertEquals(FirstSamuel.CHP12, FIRST_SAMUEL.getNumVersesInChp(12));
	}
	
	@Test
	public void test1SamuelChp13NumVerses(){
		assertEquals(FirstSamuel.CHP13, FIRST_SAMUEL.getNumVersesInChp(13));
	}
	
	@Test
	public void test1SamuelChp14NumVerses(){
		assertEquals(FirstSamuel.CHP14, FIRST_SAMUEL.getNumVersesInChp(14));
	}
	
	@Test
	public void test1SamuelChp15NumVerses(){
		assertEquals(FirstSamuel.CHP15, FIRST_SAMUEL.getNumVersesInChp(15));
	}
	
	@Test
	public void test1SamuelChp16NumVerses(){
		assertEquals(FirstSamuel.CHP16, FIRST_SAMUEL.getNumVersesInChp(16));
	}
	
	@Test
	public void test1SamuelChp17NumVerses(){
		assertEquals(FirstSamuel.CHP17, FIRST_SAMUEL.getNumVersesInChp(17));
	}
	
	@Test
	public void test1SamuelChp18NumVerses(){
		assertEquals(FirstSamuel.CHP18, FIRST_SAMUEL.getNumVersesInChp(18));
	}
	
	@Test
	public void test1SamuelChp19NumVerses(){
		assertEquals(FirstSamuel.CHP19, FIRST_SAMUEL.getNumVersesInChp(19));
	}
	
	@Test
	public void test1SamuelChp20NumVerses(){
		assertEquals(FirstSamuel.CHP20, FIRST_SAMUEL.getNumVersesInChp(20));
	}
	
	@Test
	public void test1SamuelChp21NumVerses(){
		assertEquals(FirstSamuel.CHP21, FIRST_SAMUEL.getNumVersesInChp(21));
	}
	
	@Test
	public void test1SamuelChp22NumVerses(){
		assertEquals(FirstSamuel.CHP22, FIRST_SAMUEL.getNumVersesInChp(22));
	}
	
	@Test
	public void test1SamuelChp23NumVerses(){
		assertEquals(FirstSamuel.CHP23, FIRST_SAMUEL.getNumVersesInChp(23));
	}
	
	@Test
	public void test1SamuelChp24NumVerses(){
		assertEquals(FirstSamuel.CHP24, FIRST_SAMUEL.getNumVersesInChp(24));
	}
	
	@Test
	public void test1SamuelChp25NumVerses(){
		assertEquals(FirstSamuel.CHP25, FIRST_SAMUEL.getNumVersesInChp(25));
	}
	
	@Test
	public void test1SamuelChp26NumVerses(){
		assertEquals(FirstSamuel.CHP26, FIRST_SAMUEL.getNumVersesInChp(26));
	}
	
	@Test
	public void test1SamuelChp27NumVerses(){
		assertEquals(FirstSamuel.CHP27, FIRST_SAMUEL.getNumVersesInChp(27));
	}
	
	@Test
	public void test1SamuelChp28NumVerses(){
		assertEquals(FirstSamuel.CHP28, FIRST_SAMUEL.getNumVersesInChp(28));
	}
	
	@Test
	public void test1SamuelChp29NumVerses(){
		assertEquals(FirstSamuel.CHP29, FIRST_SAMUEL.getNumVersesInChp(29));
	}
	
	@Test
	public void test1SamuelChp30NumVerses(){
		assertEquals(FirstSamuel.CHP30, FIRST_SAMUEL.getNumVersesInChp(30));
	}
	
	@Test
	public void test1SamuelChp31NumVerses(){
		assertEquals(FirstSamuel.CHP31, FIRST_SAMUEL.getNumVersesInChp(31));
	}
	
	/*
	 * 2 Samuel number of verses checks
	 */
	@Test
	public void test2SamuelChp1NumVerses(){
		assertEquals(SecondSamuel.CHP1, SECOND_SAMUEL.getNumVersesInChp(1));
	}
	
	@Test
	public void test2SamuelChp2NumVerses(){
		assertEquals(SecondSamuel.CHP2, SECOND_SAMUEL.getNumVersesInChp(2));
	}
	
	@Test
	public void test2SamuelChp3NumVerses(){
		assertEquals(SecondSamuel.CHP3, SECOND_SAMUEL.getNumVersesInChp(3));
	}
	
	@Test
	public void test2SamuelChp4NumVerses(){
		assertEquals(SecondSamuel.CHP4, SECOND_SAMUEL.getNumVersesInChp(4));
	}
	
	@Test
	public void test2SamuelChp5NumVerses(){
		assertEquals(SecondSamuel.CHP5, SECOND_SAMUEL.getNumVersesInChp(5));
	}
	
	@Test
	public void test2SamuelChp6NumVerses(){
		assertEquals(SecondSamuel.CHP6, SECOND_SAMUEL.getNumVersesInChp(6));
	}
	
	@Test
	public void test2SamuelChp7NumVerses(){
		assertEquals(SecondSamuel.CHP7, SECOND_SAMUEL.getNumVersesInChp(7));
	}
	
	@Test
	public void test2SamuelChp8NumVerses(){
		assertEquals(SecondSamuel.CHP8, SECOND_SAMUEL.getNumVersesInChp(8));
	}
	
	@Test
	public void test2SamuelChp9NumVerses(){
		assertEquals(SecondSamuel.CHP9, SECOND_SAMUEL.getNumVersesInChp(9));
	}
	
	@Test
	public void test2SamuelChp10NumVerses(){
		assertEquals(SecondSamuel.CHP10, SECOND_SAMUEL.getNumVersesInChp(10));
	}
	
	@Test
	public void test2SamuelChp11NumVerses(){
		assertEquals(SecondSamuel.CHP11, SECOND_SAMUEL.getNumVersesInChp(11));
	}
	
	@Test
	public void test2SamuelChp12NumVerses(){
		assertEquals(SecondSamuel.CHP12, SECOND_SAMUEL.getNumVersesInChp(12));
	}
	
	@Test
	public void test2SamuelChp13NumVerses(){
		assertEquals(SecondSamuel.CHP13, SECOND_SAMUEL.getNumVersesInChp(13));
	}
	
	@Test
	public void test2SamuelChp14NumVerses(){
		assertEquals(SecondSamuel.CHP14, SECOND_SAMUEL.getNumVersesInChp(14));
	}
	
	@Test
	public void test2SamuelChp15NumVerses(){
		assertEquals(SecondSamuel.CHP15, SECOND_SAMUEL.getNumVersesInChp(15));
	}
	
	@Test
	public void test2SamuelChp16NumVerses(){
		assertEquals(SecondSamuel.CHP16, SECOND_SAMUEL.getNumVersesInChp(16));
	}
	
	@Test
	public void test2SamuelChp17NumVerses(){
		assertEquals(SecondSamuel.CHP17, SECOND_SAMUEL.getNumVersesInChp(17));
	}
	
	@Test
	public void test2SamuelChp18NumVerses(){
		assertEquals(SecondSamuel.CHP18, SECOND_SAMUEL.getNumVersesInChp(18));
	}
	
	@Test
	public void test2SamuelChp19NumVerses(){
		assertEquals(SecondSamuel.CHP19, SECOND_SAMUEL.getNumVersesInChp(19));
	}
	
	@Test
	public void test2SamuelChp20NumVerses(){
		assertEquals(SecondSamuel.CHP20, SECOND_SAMUEL.getNumVersesInChp(20));
	}
	
	@Test
	public void test2SamuelChp21NumVerses(){
		assertEquals(SecondSamuel.CHP21, SECOND_SAMUEL.getNumVersesInChp(21));
	}
	
	@Test
	public void test2SamuelChp22NumVerses(){
		assertEquals(SecondSamuel.CHP22, SECOND_SAMUEL.getNumVersesInChp(22));
	}
	
	@Test
	public void test2SamuelChp23NumVerses(){
		assertEquals(SecondSamuel.CHP23, SECOND_SAMUEL.getNumVersesInChp(23));
	}
	
	@Test
	public void test2SamuelChp24NumVerses(){
		assertEquals(SecondSamuel.CHP24, SECOND_SAMUEL.getNumVersesInChp(24));
	}
	
	/*
	 * 1 Kings number of verses checks
	 */
	@Test
	public void test1KingsChp1NumVerses(){
		assertEquals(FirstKings.CHP1, FIRST_KINGS.getNumVersesInChp(1));
	}
	
	@Test
	public void test1KingsChp2NumVerses(){
		assertEquals(FirstKings.CHP2, FIRST_KINGS.getNumVersesInChp(2));
	}
	
	@Test
	public void test1KingsChp3NumVerses(){
		assertEquals(FirstKings.CHP3, FIRST_KINGS.getNumVersesInChp(3));
	}
	
	@Test
	public void test1KingsChp4NumVerses(){
		assertEquals(FirstKings.CHP4, FIRST_KINGS.getNumVersesInChp(4));
	}
	
	@Test
	public void test1KingsChp5NumVerses(){
		assertEquals(FirstKings.CHP5, FIRST_KINGS.getNumVersesInChp(5));
	}
	
	@Test
	public void test1KingsChp6NumVerses(){
		assertEquals(FirstKings.CHP6, FIRST_KINGS.getNumVersesInChp(6));
	}
	
	@Test
	public void test1KingsChp7NumVerses(){
		assertEquals(FirstKings.CHP7, FIRST_KINGS.getNumVersesInChp(7));
	}
	
	@Test
	public void test1KingsChp8NumVerses(){
		assertEquals(FirstKings.CHP8, FIRST_KINGS.getNumVersesInChp(8));
	}
	
	@Test
	public void test1KingsChp9NumVerses(){
		assertEquals(FirstKings.CHP9, FIRST_KINGS.getNumVersesInChp(9));
	}
	
	@Test
	public void test1KingsChp10NumVerses(){
		assertEquals(FirstKings.CHP10, FIRST_KINGS.getNumVersesInChp(10));
	}
	
	@Test
	public void test1KingsChp11NumVerses(){
		assertEquals(FirstKings.CHP11, FIRST_KINGS.getNumVersesInChp(11));
	}
	
	@Test
	public void test1KingsChp12NumVerses(){
		assertEquals(FirstKings.CHP12, FIRST_KINGS.getNumVersesInChp(12));
	}
	
	@Test
	public void test1KingsChp13NumVerses(){
		assertEquals(FirstKings.CHP13, FIRST_KINGS.getNumVersesInChp(13));
	}
	
	@Test
	public void test1KingsChp14NumVerses(){
		assertEquals(FirstKings.CHP14, FIRST_KINGS.getNumVersesInChp(14));
	}
	
	@Test
	public void test1KingsChp15NumVerses(){
		assertEquals(FirstKings.CHP15, FIRST_KINGS.getNumVersesInChp(15));
	}
	
	@Test
	public void test1KingsChp16NumVerses(){
		assertEquals(FirstKings.CHP16, FIRST_KINGS.getNumVersesInChp(16));
	}
	
	@Test
	public void test1KingsChp17NumVerses(){
		assertEquals(FirstKings.CHP17, FIRST_KINGS.getNumVersesInChp(17));
	}
	
	@Test
	public void test1KingsChp18NumVerses(){
		assertEquals(FirstKings.CHP18, FIRST_KINGS.getNumVersesInChp(18));
	}
	
	@Test
	public void test1KingsChp19NumVerses(){
		assertEquals(FirstKings.CHP19, FIRST_KINGS.getNumVersesInChp(19));
	}
	
	@Test
	public void test1KingsChp20NumVerses(){
		assertEquals(FirstKings.CHP20, FIRST_KINGS.getNumVersesInChp(20));
	}
	
	@Test
	public void test1KingsChp21NumVerses(){
		assertEquals(FirstKings.CHP21, FIRST_KINGS.getNumVersesInChp(21));
	}
	
	@Test
	public void test1KingsChp22NumVerses(){
		assertEquals(FirstKings.CHP22, FIRST_KINGS.getNumVersesInChp(22));
	}
	
	/*
	 * 2 Kings number of verses checks
	 */
	@Test
	public void test2KingsChp1NumVerses(){
		assertEquals(SecondKings.CHP1, SECOND_KINGS.getNumVersesInChp(1));
	}
	
	@Test
	public void test2KingsChp2NumVerses(){
		assertEquals(SecondKings.CHP2, SECOND_KINGS.getNumVersesInChp(2));
	}
	
	@Test
	public void test2KingsChp3NumVerses(){
		assertEquals(SecondKings.CHP3, SECOND_KINGS.getNumVersesInChp(3));
	}
	
	@Test
	public void test2KingsChp4NumVerses(){
		assertEquals(SecondKings.CHP4, SECOND_KINGS.getNumVersesInChp(4));
	}
	
	@Test
	public void test2KingsChp5NumVerses(){
		assertEquals(SecondKings.CHP5, SECOND_KINGS.getNumVersesInChp(5));
	}
	
	@Test
	public void test2KingsChp6NumVerses(){
		assertEquals(SecondKings.CHP6, SECOND_KINGS.getNumVersesInChp(6));
	}
	
	@Test
	public void test2KingsChp7NumVerses(){
		assertEquals(SecondKings.CHP7, SECOND_KINGS.getNumVersesInChp(7));
	}
	
	@Test
	public void test2KingsChp8NumVerses(){
		assertEquals(SecondKings.CHP8, SECOND_KINGS.getNumVersesInChp(8));
	}
	
	@Test
	public void test2KingsChp9NumVerses(){
		assertEquals(SecondKings.CHP9, SECOND_KINGS.getNumVersesInChp(9));
	}
	
	@Test
	public void test2KingsChp10NumVerses(){
		assertEquals(SecondKings.CHP10, SECOND_KINGS.getNumVersesInChp(10));
	}
	
	@Test
	public void test2KingsChp11NumVerses(){
		assertEquals(SecondKings.CHP11, SECOND_KINGS.getNumVersesInChp(11));
	}
	
	@Test
	public void test2KingsChp12NumVerses(){
		assertEquals(SecondKings.CHP12, SECOND_KINGS.getNumVersesInChp(12));
	}
	
	@Test
	public void test2KingsChp13NumVerses(){
		assertEquals(SecondKings.CHP13, SECOND_KINGS.getNumVersesInChp(13));
	}
	
	@Test
	public void test2KingsChp14NumVerses(){
		assertEquals(SecondKings.CHP14, SECOND_KINGS.getNumVersesInChp(14));
	}
	
	@Test
	public void test2KingsChp15NumVerses(){
		assertEquals(SecondKings.CHP15, SECOND_KINGS.getNumVersesInChp(15));
	}
	
	@Test
	public void test2KingsChp16NumVerses(){
		assertEquals(SecondKings.CHP16, SECOND_KINGS.getNumVersesInChp(16));
	}
	
	@Test
	public void test2KingsChp17NumVerses(){
		assertEquals(SecondKings.CHP17, SECOND_KINGS.getNumVersesInChp(17));
	}
	
	@Test
	public void test2KingsChp18NumVerses(){
		assertEquals(SecondKings.CHP18, SECOND_KINGS.getNumVersesInChp(18));
	}
	
	@Test
	public void test2KingsChp19NumVerses(){
		assertEquals(SecondKings.CHP19, SECOND_KINGS.getNumVersesInChp(19));
	}
	
	@Test
	public void test2KingsChp20NumVerses(){
		assertEquals(SecondKings.CHP20, SECOND_KINGS.getNumVersesInChp(20));
	}
	
	@Test
	public void test2KingsChp21NumVerses(){
		assertEquals(SecondKings.CHP21, SECOND_KINGS.getNumVersesInChp(21));
	}
	
	@Test
	public void test2KingsChp22NumVerses(){
		assertEquals(SecondKings.CHP22, SECOND_KINGS.getNumVersesInChp(22));
	}
	
	@Test
	public void test2KingsChp23NumVerses(){
		assertEquals(SecondKings.CHP23, SECOND_KINGS.getNumVersesInChp(23));
	}
	
	@Test
	public void test2KingsChp24NumVerses(){
		assertEquals(SecondKings.CHP24, SECOND_KINGS.getNumVersesInChp(24));
	}
	
	@Test
	public void test2KingsChp25NumVerses(){
		assertEquals(SecondKings.CHP25, SECOND_KINGS.getNumVersesInChp(25));
	}
	
	/*
	 * 1 Chronicles number of verses checks
	 */
	@Test
	public void test1ChroniclesChp1NumVerses(){
		assertEquals(FirstChronicles.CHP1, FIRST_CHRONICLES.getNumVersesInChp(1));
	}
	
	@Test
	public void test1ChroniclesChp2NumVerses(){
		assertEquals(FirstChronicles.CHP2, FIRST_CHRONICLES.getNumVersesInChp(2));
	}
	
	@Test
	public void test1ChroniclesChp3NumVerses(){
		assertEquals(FirstChronicles.CHP3, FIRST_CHRONICLES.getNumVersesInChp(3));
	}
	
	@Test
	public void test1ChroniclesChp4NumVerses(){
		assertEquals(FirstChronicles.CHP4, FIRST_CHRONICLES.getNumVersesInChp(4));
	}
	
	@Test
	public void test1ChroniclesChp5NumVerses(){
		assertEquals(FirstChronicles.CHP5, FIRST_CHRONICLES.getNumVersesInChp(5));
	}
	
	@Test
	public void test1ChroniclesChp6NumVerses(){
		assertEquals(FirstChronicles.CHP6, FIRST_CHRONICLES.getNumVersesInChp(6));
	}
	
	@Test
	public void test1ChroniclesChp7NumVerses(){
		assertEquals(FirstChronicles.CHP7, FIRST_CHRONICLES.getNumVersesInChp(7));
	}
	
	@Test
	public void test1ChroniclesChp8NumVerses(){
		assertEquals(FirstChronicles.CHP8, FIRST_CHRONICLES.getNumVersesInChp(8));
	}
	
	@Test
	public void test1ChroniclesChp9NumVerses(){
		assertEquals(FirstChronicles.CHP9, FIRST_CHRONICLES.getNumVersesInChp(9));
	}
	
	@Test
	public void test1ChroniclesChp10NumVerses(){
		assertEquals(FirstChronicles.CHP10, FIRST_CHRONICLES.getNumVersesInChp(10));
	}
	
	@Test
	public void test1ChroniclesChp11NumVerses(){
		assertEquals(FirstChronicles.CHP11, FIRST_CHRONICLES.getNumVersesInChp(11));
	}
	
	@Test
	public void test1ChroniclesChp12NumVerses(){
		assertEquals(FirstChronicles.CHP12, FIRST_CHRONICLES.getNumVersesInChp(12));
	}
	
	@Test
	public void test1ChroniclesChp13NumVerses(){
		assertEquals(FirstChronicles.CHP13, FIRST_CHRONICLES.getNumVersesInChp(13));
	}
	
	@Test
	public void test1ChroniclesChp14NumVerses(){
		assertEquals(FirstChronicles.CHP14, FIRST_CHRONICLES.getNumVersesInChp(14));
	}
	
	@Test
	public void test1ChroniclesChp15NumVerses(){
		assertEquals(FirstChronicles.CHP15, FIRST_CHRONICLES.getNumVersesInChp(15));
	}
	
	@Test
	public void test1ChroniclesChp16NumVerses(){
		assertEquals(FirstChronicles.CHP16, FIRST_CHRONICLES.getNumVersesInChp(16));
	}
	
	@Test
	public void test1ChroniclesChp17NumVerses(){
		assertEquals(FirstChronicles.CHP17, FIRST_CHRONICLES.getNumVersesInChp(17));
	}
	
	@Test
	public void test1ChroniclesChp18NumVerses(){
		assertEquals(FirstChronicles.CHP18, FIRST_CHRONICLES.getNumVersesInChp(18));
	}
	
	@Test
	public void test1ChroniclesChp19NumVerses(){
		assertEquals(FirstChronicles.CHP19, FIRST_CHRONICLES.getNumVersesInChp(19));
	}
	
	@Test
	public void test1ChroniclesChp20NumVerses(){
		assertEquals(FirstChronicles.CHP20, FIRST_CHRONICLES.getNumVersesInChp(20));
	}
	
	@Test
	public void test1ChroniclesChp21NumVerses(){
		assertEquals(FirstChronicles.CHP21, FIRST_CHRONICLES.getNumVersesInChp(21));
	}
	
	@Test
	public void test1ChroniclesChp22NumVerses(){
		assertEquals(FirstChronicles.CHP22, FIRST_CHRONICLES.getNumVersesInChp(22));
	}
	
	@Test
	public void test1ChroniclesChp23NumVerses(){
		assertEquals(FirstChronicles.CHP23, FIRST_CHRONICLES.getNumVersesInChp(23));
	}
	
	@Test
	public void test1ChroniclesChp24NumVerses(){
		assertEquals(FirstChronicles.CHP24, FIRST_CHRONICLES.getNumVersesInChp(24));
	}
	
	@Test
	public void test1ChroniclesChp25NumVerses(){
		assertEquals(FirstChronicles.CHP25, FIRST_CHRONICLES.getNumVersesInChp(25));
	}
	
	@Test
	public void test1ChroniclesChp26NumVerses(){
		assertEquals(FirstChronicles.CHP26, FIRST_CHRONICLES.getNumVersesInChp(26));
	}
	
	@Test
	public void test1ChroniclesChp27NumVerses(){
		assertEquals(FirstChronicles.CHP27, FIRST_CHRONICLES.getNumVersesInChp(27));
	}
	
	@Test
	public void test1ChroniclesChp28NumVerses(){
		assertEquals(FirstChronicles.CHP28, FIRST_CHRONICLES.getNumVersesInChp(28));
	}
	
	@Test
	public void test1ChroniclesChp29NumVerses(){
		assertEquals(FirstChronicles.CHP29, FIRST_CHRONICLES.getNumVersesInChp(29));
	}
	
	/*
	 * 2 Chronicles number of verses checks
	 */
	@Test
	public void test2ChroniclesChp1NumVerses(){
		assertEquals(SecondChronicles.CHP1, SECOND_CHRONICLES.getNumVersesInChp(1));
	}
	
	@Test
	public void test2ChroniclesChp2NumVerses(){
		assertEquals(SecondChronicles.CHP2, SECOND_CHRONICLES.getNumVersesInChp(2));
	}
	
	@Test
	public void test2ChroniclesChp3NumVerses(){
		assertEquals(SecondChronicles.CHP3, SECOND_CHRONICLES.getNumVersesInChp(3));
	}
	
	@Test
	public void test2ChroniclesChp4NumVerses(){
		assertEquals(SecondChronicles.CHP4, SECOND_CHRONICLES.getNumVersesInChp(4));
	}
	
	@Test
	public void test2ChroniclesChp5NumVerses(){
		assertEquals(SecondChronicles.CHP5, SECOND_CHRONICLES.getNumVersesInChp(5));
	}
	
	@Test
	public void test2ChroniclesChp6NumVerses(){
		assertEquals(SecondChronicles.CHP6, SECOND_CHRONICLES.getNumVersesInChp(6));
	}
	
	@Test
	public void test2ChroniclesChp7NumVerses(){
		assertEquals(SecondChronicles.CHP7, SECOND_CHRONICLES.getNumVersesInChp(7));
	}
	
	@Test
	public void test2ChroniclesChp8NumVerses(){
		assertEquals(SecondChronicles.CHP8, SECOND_CHRONICLES.getNumVersesInChp(8));
	}
	
	@Test
	public void test2ChroniclesChp9NumVerses(){
		assertEquals(SecondChronicles.CHP9, SECOND_CHRONICLES.getNumVersesInChp(9));
	}
	
	@Test
	public void test2ChroniclesChp10NumVerses(){
		assertEquals(SecondChronicles.CHP10, SECOND_CHRONICLES.getNumVersesInChp(10));
	}
	
	@Test
	public void test2ChroniclesChp11NumVerses(){
		assertEquals(SecondChronicles.CHP11, SECOND_CHRONICLES.getNumVersesInChp(11));
	}
	
	@Test
	public void test2ChroniclesChp12NumVerses(){
		assertEquals(SecondChronicles.CHP12, SECOND_CHRONICLES.getNumVersesInChp(12));
	}
	
	@Test
	public void test2ChroniclesChp13NumVerses(){
		assertEquals(SecondChronicles.CHP13, SECOND_CHRONICLES.getNumVersesInChp(13));
	}
	
	@Test
	public void test2ChroniclesChp14NumVerses(){
		assertEquals(SecondChronicles.CHP14, SECOND_CHRONICLES.getNumVersesInChp(14));
	}
	
	@Test
	public void test2ChroniclesChp15NumVerses(){
		assertEquals(SecondChronicles.CHP15, SECOND_CHRONICLES.getNumVersesInChp(15));
	}
	
	@Test
	public void test2ChroniclesChp16NumVerses(){
		assertEquals(SecondChronicles.CHP16, SECOND_CHRONICLES.getNumVersesInChp(16));
	}
	
	@Test
	public void test2ChroniclesChp17NumVerses(){
		assertEquals(SecondChronicles.CHP17, SECOND_CHRONICLES.getNumVersesInChp(17));
	}
	
	@Test
	public void test2ChroniclesChp18NumVerses(){
		assertEquals(SecondChronicles.CHP18, SECOND_CHRONICLES.getNumVersesInChp(18));
	}
	
	@Test
	public void test2ChroniclesChp19NumVerses(){
		assertEquals(SecondChronicles.CHP19, SECOND_CHRONICLES.getNumVersesInChp(19));
	}
	
	@Test
	public void test2ChroniclesChp20NumVerses(){
		assertEquals(SecondChronicles.CHP20, SECOND_CHRONICLES.getNumVersesInChp(20));
	}
	
	@Test
	public void test2ChroniclesChp21NumVerses(){
		assertEquals(SecondChronicles.CHP21, SECOND_CHRONICLES.getNumVersesInChp(21));
	}
	
	@Test
	public void test2ChroniclesChp22NumVerses(){
		assertEquals(SecondChronicles.CHP22, SECOND_CHRONICLES.getNumVersesInChp(22));
	}
	
	@Test
	public void test2ChroniclesChp23NumVerses(){
		assertEquals(SecondChronicles.CHP23, SECOND_CHRONICLES.getNumVersesInChp(23));
	}
	
	@Test
	public void test2ChroniclesChp24NumVerses(){
		assertEquals(SecondChronicles.CHP24, SECOND_CHRONICLES.getNumVersesInChp(24));
	}
	
	@Test
	public void test2ChroniclesChp25NumVerses(){
		assertEquals(SecondChronicles.CHP25, SECOND_CHRONICLES.getNumVersesInChp(25));
	}
	
	@Test
	public void test2ChroniclesChp26NumVerses(){
		assertEquals(SecondChronicles.CHP26, SECOND_CHRONICLES.getNumVersesInChp(26));
	}
	
	@Test
	public void test2ChroniclesChp27NumVerses(){
		assertEquals(SecondChronicles.CHP27, SECOND_CHRONICLES.getNumVersesInChp(27));
	}
	
	@Test
	public void test2ChroniclesChp28NumVerses(){
		assertEquals(SecondChronicles.CHP28, SECOND_CHRONICLES.getNumVersesInChp(28));
	}
	
	@Test
	public void test2ChroniclesChp29NumVerses(){
		assertEquals(SecondChronicles.CHP29, SECOND_CHRONICLES.getNumVersesInChp(29));
	}
	
	@Test
	public void test2ChroniclesChp30NumVerses(){
		assertEquals(SecondChronicles.CHP30, SECOND_CHRONICLES.getNumVersesInChp(30));
	}
	
	@Test
	public void test2ChroniclesChp31NumVerses(){
		assertEquals(SecondChronicles.CHP31, SECOND_CHRONICLES.getNumVersesInChp(31));
	}
	
	@Test
	public void test2ChroniclesChp32NumVerses(){
		assertEquals(SecondChronicles.CHP32, SECOND_CHRONICLES.getNumVersesInChp(32));
	}
	
	@Test
	public void test2ChroniclesChp33NumVerses(){
		assertEquals(SecondChronicles.CHP33, SECOND_CHRONICLES.getNumVersesInChp(33));
	}
	
	@Test
	public void test2ChroniclesChp34NumVerses(){
		assertEquals(SecondChronicles.CHP34, SECOND_CHRONICLES.getNumVersesInChp(34));
	}
	
	@Test
	public void test2ChroniclesChp35NumVerses(){
		assertEquals(SecondChronicles.CHP35, SECOND_CHRONICLES.getNumVersesInChp(35));
	}
	
	@Test
	public void test2ChroniclesChp36NumVerses(){
		assertEquals(SecondChronicles.CHP36, SECOND_CHRONICLES.getNumVersesInChp(36));
	}
	
	/*
	 * Ezra number of verses checks
	 */
	@Test
	public void testEzraChp1NumVerses(){
		assertEquals(Ezra.CHP1, EZRA.getNumVersesInChp(1));
	}
	
	@Test
	public void testEzraChp2NumVerses(){
		assertEquals(Ezra.CHP2, EZRA.getNumVersesInChp(2));
	}
	
	@Test
	public void testEzraChp3NumVerses(){
		assertEquals(Ezra.CHP3, EZRA.getNumVersesInChp(3));
	}
	
	@Test
	public void testEzraChp4NumVerses(){
		assertEquals(Ezra.CHP4, EZRA.getNumVersesInChp(4));
	}
	
	@Test
	public void testEzraChp5NumVerses(){
		assertEquals(Ezra.CHP5, EZRA.getNumVersesInChp(5));
	}
	
	@Test
	public void testEzraChp6NumVerses(){
		assertEquals(Ezra.CHP6, EZRA.getNumVersesInChp(6));
	}
	
	@Test
	public void testEzraChp7NumVerses(){
		assertEquals(Ezra.CHP7, EZRA.getNumVersesInChp(7));
	}
	
	@Test
	public void testEzraChp8NumVerses(){
		assertEquals(Ezra.CHP8, EZRA.getNumVersesInChp(8));
	}
	
	@Test
	public void testEzraChp9NumVerses(){
		assertEquals(Ezra.CHP9, EZRA.getNumVersesInChp(9));
	}
	
	@Test
	public void testEzraChp10NumVerses(){
		assertEquals(Ezra.CHP10, EZRA.getNumVersesInChp(10));
	}
	
	/*
	 * Nehemiah number of verses checks
	 */
	@Test
	public void testNehemiahChp1NumVerses(){
		assertEquals(Nehemiah.CHP1, NEHEMIAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testNehemiahChp2NumVerses(){
		assertEquals(Nehemiah.CHP2, NEHEMIAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testNehemiahChp3NumVerses(){
		assertEquals(Nehemiah.CHP3, NEHEMIAH.getNumVersesInChp(3));
	}
	
	@Test
	public void testNehemiahChp4NumVerses(){
		assertEquals(Nehemiah.CHP4, NEHEMIAH.getNumVersesInChp(4));
	}
	
	@Test
	public void testNehemiahChp5NumVerses(){
		assertEquals(Nehemiah.CHP5, NEHEMIAH.getNumVersesInChp(5));
	}
	
	@Test
	public void testNehemiahChp6NumVerses(){
		assertEquals(Nehemiah.CHP6, NEHEMIAH.getNumVersesInChp(6));
	}
	
	@Test
	public void testNehemiahChp7NumVerses(){
		assertEquals(Nehemiah.CHP7, NEHEMIAH.getNumVersesInChp(7));
	}
	
	@Test
	public void testNehemiahChp8NumVerses(){
		assertEquals(Nehemiah.CHP8, NEHEMIAH.getNumVersesInChp(8));
	}
	
	@Test
	public void testNehemiahChp9NumVerses(){
		assertEquals(Nehemiah.CHP9, NEHEMIAH.getNumVersesInChp(9));
	}
	
	@Test
	public void testNehemiahChp10NumVerses(){
		assertEquals(Nehemiah.CHP10, NEHEMIAH.getNumVersesInChp(10));
	}
	
	@Test
	public void testNehemiahChp11NumVerses(){
		assertEquals(Nehemiah.CHP11, NEHEMIAH.getNumVersesInChp(11));
	}
	
	@Test
	public void testNehemiahChp12NumVerses(){
		assertEquals(Nehemiah.CHP12, NEHEMIAH.getNumVersesInChp(12));
	}
	
	@Test
	public void testNehemiahChp13NumVerses(){
		assertEquals(Nehemiah.CHP13, NEHEMIAH.getNumVersesInChp(13));
	}
	
	/*
	 * Esther number of verses checks
	 */
	@Test
	public void testEstherChp1NumVerses(){
		assertEquals(Esther.CHP1, ESTHER.getNumVersesInChp(1));
	}
	
	@Test
	public void testEstherChp2NumVerses(){
		assertEquals(Esther.CHP2, ESTHER.getNumVersesInChp(2));
	}
	
	@Test
	public void testEstherChp3NumVerses(){
		assertEquals(Esther.CHP3, ESTHER.getNumVersesInChp(3));
	}
	
	@Test
	public void testEstherChp4NumVerses(){
		assertEquals(Esther.CHP4, ESTHER.getNumVersesInChp(4));
	}
	
	@Test
	public void testEstherChp5NumVerses(){
		assertEquals(Esther.CHP5, ESTHER.getNumVersesInChp(5));
	}
	
	@Test
	public void testEstherChp6NumVerses(){
		assertEquals(Esther.CHP6, ESTHER.getNumVersesInChp(6));
	}
	
	@Test
	public void testEstherChp7NumVerses(){
		assertEquals(Esther.CHP7, ESTHER.getNumVersesInChp(7));
	}
	
	@Test
	public void testEstherChp8NumVerses(){
		assertEquals(Esther.CHP8, ESTHER.getNumVersesInChp(8));
	}
	
	@Test
	public void testEstherChp9NumVerses(){
		assertEquals(Esther.CHP9, ESTHER.getNumVersesInChp(9));
	}
	
	@Test
	public void testEstherChp10NumVerses(){
		assertEquals(Esther.CHP10, ESTHER.getNumVersesInChp(10));
	}
	
	/*
	 * Job number of verses checks
	 */
	@Test
	public void testJobChp1NumVerses(){
		assertEquals(Job.CHP1, JOB.getNumVersesInChp(1));
	}
	
	@Test
	public void testJobChp2NumVerses(){
		assertEquals(Job.CHP2, JOB.getNumVersesInChp(2));
	}
	
	@Test
	public void testJobChp3NumVerses(){
		assertEquals(Job.CHP3, JOB.getNumVersesInChp(3));
	}
	
	@Test
	public void testJobChp4NumVerses(){
		assertEquals(Job.CHP4, JOB.getNumVersesInChp(4));
	}
	
	@Test
	public void testJobChp5NumVerses(){
		assertEquals(Job.CHP5, JOB.getNumVersesInChp(5));
	}
	
	@Test
	public void testJobChp6NumVerses(){
		assertEquals(Job.CHP6, JOB.getNumVersesInChp(6));
	}
	
	@Test
	public void testJobChp7NumVerses(){
		assertEquals(Job.CHP7, JOB.getNumVersesInChp(7));
	}
	
	@Test
	public void testJobChp8NumVerses(){
		assertEquals(Job.CHP8, JOB.getNumVersesInChp(8));
	}
	
	@Test
	public void testJobChp9NumVerses(){
		assertEquals(Job.CHP9, JOB.getNumVersesInChp(9));
	}
	
	@Test
	public void testJobChp10NumVerses(){
		assertEquals(Job.CHP10, JOB.getNumVersesInChp(10));
	}
	
	@Test
	public void testJobChp11NumVerses(){
		assertEquals(Job.CHP11, JOB.getNumVersesInChp(11));
	}
	
	@Test
	public void testJobChp12NumVerses(){
		assertEquals(Job.CHP12, JOB.getNumVersesInChp(12));
	}
	
	@Test
	public void testJobChp13NumVerses(){
		assertEquals(Job.CHP13, JOB.getNumVersesInChp(13));
	}
	
	@Test
	public void testJobChp14NumVerses(){
		assertEquals(Job.CHP14, JOB.getNumVersesInChp(14));
	}
	
	@Test
	public void testJobChp15NumVerses(){
		assertEquals(Job.CHP15, JOB.getNumVersesInChp(15));
	}
	
	@Test
	public void testJobChp16NumVerses(){
		assertEquals(Job.CHP16, JOB.getNumVersesInChp(16));
	}
	
	@Test
	public void testJobChp17NumVerses(){
		assertEquals(Job.CHP17, JOB.getNumVersesInChp(17));
	}
	
	@Test
	public void testJobChp18NumVerses(){
		assertEquals(Job.CHP18, JOB.getNumVersesInChp(18));
	}
	
	@Test
	public void testJobChp19NumVerses(){
		assertEquals(Job.CHP19, JOB.getNumVersesInChp(19));
	}
	
	@Test
	public void testJobChp20NumVerses(){
		assertEquals(Job.CHP20, JOB.getNumVersesInChp(20));
	}
	
	@Test
	public void testJobChp21NumVerses(){
		assertEquals(Job.CHP21, JOB.getNumVersesInChp(21));
	}
	
	@Test
	public void testJobChp22NumVerses(){
		assertEquals(Job.CHP22, JOB.getNumVersesInChp(22));
	}
	
	@Test
	public void testJobChp23NumVerses(){
		assertEquals(Job.CHP23, JOB.getNumVersesInChp(23));
	}
	
	@Test
	public void testJobChp24NumVerses(){
		assertEquals(Job.CHP24, JOB.getNumVersesInChp(24));
	}
	
	@Test
	public void testJobChp25NumVerses(){
		assertEquals(Job.CHP25, JOB.getNumVersesInChp(25));
	}
	
	@Test
	public void testJobChp26NumVerses(){
		assertEquals(Job.CHP26, JOB.getNumVersesInChp(26));
	}
	
	@Test
	public void testJobChp27NumVerses(){
		assertEquals(Job.CHP27, JOB.getNumVersesInChp(27));
	}
	
	@Test
	public void testJobChp28NumVerses(){
		assertEquals(Job.CHP28, JOB.getNumVersesInChp(28));
	}
	
	@Test
	public void testJobChp29NumVerses(){
		assertEquals(Job.CHP29, JOB.getNumVersesInChp(29));
	}
	
	@Test
	public void testJobChp30NumVerses(){
		assertEquals(Job.CHP30, JOB.getNumVersesInChp(30));
	}
	
	@Test
	public void testJobChp31NumVerses(){
		assertEquals(Job.CHP31, JOB.getNumVersesInChp(31));
	}
	
	@Test
	public void testJobChp32NumVerses(){
		assertEquals(Job.CHP32, JOB.getNumVersesInChp(32));
	}
	
	@Test
	public void testJobChp33NumVerses(){
		assertEquals(Job.CHP33, JOB.getNumVersesInChp(33));
	}
	
	@Test
	public void testJobChp34NumVerses(){
		assertEquals(Job.CHP34, JOB.getNumVersesInChp(34));
	}
	
	@Test
	public void testJobChp35NumVerses(){
		assertEquals(Job.CHP35, JOB.getNumVersesInChp(35));
	}
	
	@Test
	public void testJobChp36NumVerses(){
		assertEquals(Job.CHP36, JOB.getNumVersesInChp(36));
	}
	
	@Test
	public void testJobChp37NumVerses(){
		assertEquals(Job.CHP37, JOB.getNumVersesInChp(37));
	}
	
	@Test
	public void testJobChp38NumVerses(){
		assertEquals(Job.CHP38, JOB.getNumVersesInChp(38));
	}
	
	@Test
	public void testJobChp39NumVerses(){
		assertEquals(Job.CHP39, JOB.getNumVersesInChp(39));
	}
	
	@Test
	public void testJobChp40NumVerses(){
		assertEquals(Job.CHP40, JOB.getNumVersesInChp(40));
	}
	
	@Test
	public void testJobChp41NumVerses(){
		assertEquals(Job.CHP41, JOB.getNumVersesInChp(41));
	}
	
	@Test
	public void testJobChp42NumVerses(){
		assertEquals(Job.CHP42, JOB.getNumVersesInChp(42));
	}
	
	/*
	 * Psalms number of verses checks
	 */
	@Test
	public void testPsalmsChp1NumVerses(){
		assertEquals(Psalms.CHP1, PSALMS.getNumVersesInChp(1));
	}
	
	@Test
	public void testPsalmsChp2NumVerses(){
		assertEquals(Psalms.CHP2, PSALMS.getNumVersesInChp(2));
	}
	
	@Test
	public void testPsalmsChp3NumVerses(){
		assertEquals(Psalms.CHP3, PSALMS.getNumVersesInChp(3));
	}
	
	@Test
	public void testPsalmsChp4NumVerses(){
		assertEquals(Psalms.CHP4, PSALMS.getNumVersesInChp(4));
	}
	
	@Test
	public void testPsalmsChp5NumVerses(){
		assertEquals(Psalms.CHP5, PSALMS.getNumVersesInChp(5));
	}
	
	@Test
	public void testPsalmsChp6NumVerses(){
		assertEquals(Psalms.CHP6, PSALMS.getNumVersesInChp(6));
	}
	
	@Test
	public void testPsalmsChp7NumVerses(){
		assertEquals(Psalms.CHP7, PSALMS.getNumVersesInChp(7));
	}
	
	@Test
	public void testPsalmsChp8NumVerses(){
		assertEquals(Psalms.CHP8, PSALMS.getNumVersesInChp(8));
	}
	
	@Test
	public void testPsalmsChp9NumVerses(){
		assertEquals(Psalms.CHP9, PSALMS.getNumVersesInChp(9));
	}
	
	@Test
	public void testPsalmsChp10NumVerses(){
		assertEquals(Psalms.CHP10, PSALMS.getNumVersesInChp(10));
	}
	
	@Test
	public void testPsalmsChp11NumVerses(){
		assertEquals(Psalms.CHP11, PSALMS.getNumVersesInChp(11));
	}
	
	@Test
	public void testPsalmsChp12NumVerses(){
		assertEquals(Psalms.CHP12, PSALMS.getNumVersesInChp(12));
	}
	
	@Test
	public void testPsalmsChp13NumVerses(){
		assertEquals(Psalms.CHP13, PSALMS.getNumVersesInChp(13));
	}
	
	@Test
	public void testPsalmsChp14NumVerses(){
		assertEquals(Psalms.CHP14, PSALMS.getNumVersesInChp(14));
	}
	
	@Test
	public void testPsalmsChp15NumVerses(){
		assertEquals(Psalms.CHP15, PSALMS.getNumVersesInChp(15));
	}
	
	@Test
	public void testPsalmsChp16NumVerses(){
		assertEquals(Psalms.CHP16, PSALMS.getNumVersesInChp(16));
	}
	
	@Test
	public void testPsalmsChp17NumVerses(){
		assertEquals(Psalms.CHP17, PSALMS.getNumVersesInChp(17));
	}
	
	@Test
	public void testPsalmsChp18NumVerses(){
		assertEquals(Psalms.CHP18, PSALMS.getNumVersesInChp(18));
	}
	
	@Test
	public void testPsalmsChp19NumVerses(){
		assertEquals(Psalms.CHP19, PSALMS.getNumVersesInChp(19));
	}
	
	@Test
	public void testPsalmsChp20NumVerses(){
		assertEquals(Psalms.CHP20, PSALMS.getNumVersesInChp(20));
	}
	
	@Test
	public void testPsalmsChp21NumVerses(){
		assertEquals(Psalms.CHP21, PSALMS.getNumVersesInChp(21));
	}
	
	@Test
	public void testPsalmsChp22NumVerses(){
		assertEquals(Psalms.CHP22, PSALMS.getNumVersesInChp(22));
	}
	
	@Test
	public void testPsalmsChp23NumVerses(){
		assertEquals(Psalms.CHP23, PSALMS.getNumVersesInChp(23));
	}
	
	@Test
	public void testPsalmsChp24NumVerses(){
		assertEquals(Psalms.CHP24, PSALMS.getNumVersesInChp(24));
	}
	
	@Test
	public void testPsalmsChp25NumVerses(){
		assertEquals(Psalms.CHP25, PSALMS.getNumVersesInChp(25));
	}
	
	@Test
	public void testPsalmsChp26NumVerses(){
		assertEquals(Psalms.CHP26, PSALMS.getNumVersesInChp(26));
	}
	
	@Test
	public void testPsalmsChp27NumVerses(){
		assertEquals(Psalms.CHP27, PSALMS.getNumVersesInChp(27));
	}
	
	@Test
	public void testPsalmsChp28NumVerses(){
		assertEquals(Psalms.CHP28, PSALMS.getNumVersesInChp(28));
	}
	
	@Test
	public void testPsalmsChp29NumVerses(){
		assertEquals(Psalms.CHP29, PSALMS.getNumVersesInChp(29));
	}
	
	@Test
	public void testPsalmsChp30NumVerses(){
		assertEquals(Psalms.CHP30, PSALMS.getNumVersesInChp(30));
	}
	
	@Test
	public void testPsalmsChp31NumVerses(){
		assertEquals(Psalms.CHP31, PSALMS.getNumVersesInChp(31));
	}
	
	@Test
	public void testPsalmsChp32NumVerses(){
		assertEquals(Psalms.CHP32, PSALMS.getNumVersesInChp(32));
	}
	
	@Test
	public void testPsalmsChp33NumVerses(){
		assertEquals(Psalms.CHP33, PSALMS.getNumVersesInChp(33));
	}
	
	@Test
	public void testPsalmsChp34NumVerses(){
		assertEquals(Psalms.CHP34, PSALMS.getNumVersesInChp(34));
	}
	
	@Test
	public void testPsalmsChp35NumVerses(){
		assertEquals(Psalms.CHP35, PSALMS.getNumVersesInChp(35));
	}
	
	@Test
	public void testPsalmsChp36NumVerses(){
		assertEquals(Psalms.CHP36, PSALMS.getNumVersesInChp(36));
	}
	
	@Test
	public void testPsalmsChp37NumVerses(){
		assertEquals(Psalms.CHP37, PSALMS.getNumVersesInChp(37));
	}
	
	@Test
	public void testPsalmsChp38NumVerses(){
		assertEquals(Psalms.CHP38, PSALMS.getNumVersesInChp(38));
	}
	
	@Test
	public void testPsalmsChp39NumVerses(){
		assertEquals(Psalms.CHP39, PSALMS.getNumVersesInChp(39));
	}
	
	@Test
	public void testPsalmsChp40NumVerses(){
		assertEquals(Psalms.CHP40, PSALMS.getNumVersesInChp(40));
	}
	
	@Test
	public void testPsalmsChp41NumVerses(){
		assertEquals(Psalms.CHP41, PSALMS.getNumVersesInChp(41));
	}
	
	@Test
	public void testPsalmsChp42NumVerses(){
		assertEquals(Psalms.CHP42, PSALMS.getNumVersesInChp(42));
	}
	
	@Test
	public void testPsalmsChp43NumVerses(){
		assertEquals(Psalms.CHP43, PSALMS.getNumVersesInChp(43));
	}
	
	@Test
	public void testPsalmsChp44NumVerses(){
		assertEquals(Psalms.CHP44, PSALMS.getNumVersesInChp(44));
	}
	
	@Test
	public void testPsalmsChp45NumVerses(){
		assertEquals(Psalms.CHP45, PSALMS.getNumVersesInChp(45));
	}
	
	@Test
	public void testPsalmsChp46NumVerses(){
		assertEquals(Psalms.CHP46, PSALMS.getNumVersesInChp(46));
	}
	
	@Test
	public void testPsalmsChp47NumVerses(){
		assertEquals(Psalms.CHP47, PSALMS.getNumVersesInChp(47));
	}
	
	@Test
	public void testPsalmsChp48NumVerses(){
		assertEquals(Psalms.CHP48, PSALMS.getNumVersesInChp(48));
	}
	
	@Test
	public void testPsalmsChp49NumVerses(){
		assertEquals(Psalms.CHP49, PSALMS.getNumVersesInChp(49));
	}
	
	@Test
	public void testPsalmsChp50NumVerses(){
		assertEquals(Psalms.CHP50, PSALMS.getNumVersesInChp(50));
	}
	
	@Test
	public void testPsalmsChp51NumVerses(){
		assertEquals(Psalms.CHP51, PSALMS.getNumVersesInChp(51));
	}
	
	@Test
	public void testPsalmsChp52NumVerses(){
		assertEquals(Psalms.CHP52, PSALMS.getNumVersesInChp(52));
	}
	
	@Test
	public void testPsalmsChp53NumVerses(){
		assertEquals(Psalms.CHP53, PSALMS.getNumVersesInChp(53));
	}
	
	@Test
	public void testPsalmsChp54NumVerses(){
		assertEquals(Psalms.CHP54, PSALMS.getNumVersesInChp(54));
	}
	
	@Test
	public void testPsalmsChp55NumVerses(){
		assertEquals(Psalms.CHP55, PSALMS.getNumVersesInChp(55));
	}
	
	@Test
	public void testPsalmsChp56NumVerses(){
		assertEquals(Psalms.CHP56, PSALMS.getNumVersesInChp(56));
	}
	
	@Test
	public void testPsalmsChp57NumVerses(){
		assertEquals(Psalms.CHP57, PSALMS.getNumVersesInChp(57));
	}
	
	@Test
	public void testPsalmsChp58NumVerses(){
		assertEquals(Psalms.CHP58, PSALMS.getNumVersesInChp(58));
	}
	
	@Test
	public void testPsalmsChp59NumVerses(){
		assertEquals(Psalms.CHP59, PSALMS.getNumVersesInChp(59));
	}
	
	@Test
	public void testPsalmsChp60NumVerses(){
		assertEquals(Psalms.CHP60, PSALMS.getNumVersesInChp(60));
	}
	
	@Test
	public void testPsalmsChp61NumVerses(){
		assertEquals(Psalms.CHP61, PSALMS.getNumVersesInChp(61));
	}
	
	@Test
	public void testPsalmsChp62NumVerses(){
		assertEquals(Psalms.CHP62, PSALMS.getNumVersesInChp(62));
	}
	
	@Test
	public void testPsalmsChp63NumVerses(){
		assertEquals(Psalms.CHP63, PSALMS.getNumVersesInChp(63));
	}
	
	@Test
	public void testPsalmsChp64NumVerses(){
		assertEquals(Psalms.CHP64, PSALMS.getNumVersesInChp(64));
	}
	
	@Test
	public void testPsalmsChp65NumVerses(){
		assertEquals(Psalms.CHP65, PSALMS.getNumVersesInChp(65));
	}
	
	@Test
	public void testPsalmsChp66NumVerses(){
		assertEquals(Psalms.CHP66, PSALMS.getNumVersesInChp(66));
	}
	
	@Test
	public void testPsalmsChp67NumVerses(){
		assertEquals(Psalms.CHP67, PSALMS.getNumVersesInChp(67));
	}
	
	@Test
	public void testPsalmsChp68NumVerses(){
		assertEquals(Psalms.CHP68, PSALMS.getNumVersesInChp(68));
	}
	
	@Test
	public void testPsalmsChp69NumVerses(){
		assertEquals(Psalms.CHP69, PSALMS.getNumVersesInChp(69));
	}
	
	@Test
	public void testPsalmsChp70NumVerses(){
		assertEquals(Psalms.CHP70, PSALMS.getNumVersesInChp(70));
	}
	
	@Test
	public void testPsalmsChp71NumVerses(){
		assertEquals(Psalms.CHP71, PSALMS.getNumVersesInChp(71));
	}
	
	@Test
	public void testPsalmsChp72NumVerses(){
		assertEquals(Psalms.CHP72, PSALMS.getNumVersesInChp(72));
	}
	
	@Test
	public void testPsalmsChp73NumVerses(){
		assertEquals(Psalms.CHP73, PSALMS.getNumVersesInChp(73));
	}
	
	@Test
	public void testPsalmsChp74NumVerses(){
		assertEquals(Psalms.CHP74, PSALMS.getNumVersesInChp(74));
	}
	
	@Test
	public void testPsalmsChp75NumVerses(){
		assertEquals(Psalms.CHP75, PSALMS.getNumVersesInChp(75));
	}
	
	@Test
	public void testPsalmsChp76NumVerses(){
		assertEquals(Psalms.CHP76, PSALMS.getNumVersesInChp(76));
	}
	
	@Test
	public void testPsalmsChp77NumVerses(){
		assertEquals(Psalms.CHP77, PSALMS.getNumVersesInChp(77));
	}
	
	@Test
	public void testPsalmsChp78NumVerses(){
		assertEquals(Psalms.CHP78, PSALMS.getNumVersesInChp(78));
	}
	
	@Test
	public void testPsalmsChp79NumVerses(){
		assertEquals(Psalms.CHP79, PSALMS.getNumVersesInChp(79));
	}
	
	@Test
	public void testPsalmsChp80NumVerses(){
		assertEquals(Psalms.CHP80, PSALMS.getNumVersesInChp(80));
	}
	
	@Test
	public void testPsalmsChp81NumVerses(){
		assertEquals(Psalms.CHP81, PSALMS.getNumVersesInChp(81));
	}
	
	@Test
	public void testPsalmsChp82NumVerses(){
		assertEquals(Psalms.CHP82, PSALMS.getNumVersesInChp(82));
	}
	
	@Test
	public void testPsalmsChp83NumVerses(){
		assertEquals(Psalms.CHP83, PSALMS.getNumVersesInChp(83));
	}
	
	@Test
	public void testPsalmsChp84NumVerses(){
		assertEquals(Psalms.CHP84, PSALMS.getNumVersesInChp(84));
	}
	
	@Test
	public void testPsalmsChp85NumVerses(){
		assertEquals(Psalms.CHP85, PSALMS.getNumVersesInChp(85));
	}
	
	@Test
	public void testPsalmsChp86NumVerses(){
		assertEquals(Psalms.CHP86, PSALMS.getNumVersesInChp(86));
	}
	
	@Test
	public void testPsalmsChp87NumVerses(){
		assertEquals(Psalms.CHP87, PSALMS.getNumVersesInChp(87));
	}
	
	@Test
	public void testPsalmsChp88NumVerses(){
		assertEquals(Psalms.CHP88, PSALMS.getNumVersesInChp(88));
	}
	
	@Test
	public void testPsalmsChp89NumVerses(){
		assertEquals(Psalms.CHP89, PSALMS.getNumVersesInChp(89));
	}
	
	@Test
	public void testPsalmsChp90NumVerses(){
		assertEquals(Psalms.CHP90, PSALMS.getNumVersesInChp(90));
	}
	
	@Test
	public void testPsalmsChp91NumVerses(){
		assertEquals(Psalms.CHP91, PSALMS.getNumVersesInChp(91));
	}
	
	@Test
	public void testPsalmsChp92NumVerses(){
		assertEquals(Psalms.CHP92, PSALMS.getNumVersesInChp(92));
	}
	
	@Test
	public void testPsalmsChp93NumVerses(){
		assertEquals(Psalms.CHP93, PSALMS.getNumVersesInChp(93));
	}
	
	@Test
	public void testPsalmsChp94NumVerses(){
		assertEquals(Psalms.CHP94, PSALMS.getNumVersesInChp(94));
	}
	
	@Test
	public void testPsalmsChp95NumVerses(){
		assertEquals(Psalms.CHP95, PSALMS.getNumVersesInChp(95));
	}
	
	@Test
	public void testPsalmsChp96NumVerses(){
		assertEquals(Psalms.CHP96, PSALMS.getNumVersesInChp(96));
	}
	
	@Test
	public void testPsalmsChp97NumVerses(){
		assertEquals(Psalms.CHP97, PSALMS.getNumVersesInChp(97));
	}
	
	@Test
	public void testPsalmsChp98NumVerses(){
		assertEquals(Psalms.CHP98, PSALMS.getNumVersesInChp(98));
	}
	
	@Test
	public void testPsalmsChp99NumVerses(){
		assertEquals(Psalms.CHP99, PSALMS.getNumVersesInChp(99));
	}
	
	@Test
	public void testPsalmsChp100NumVerses(){
		assertEquals(Psalms.CHP100, PSALMS.getNumVersesInChp(100));
	}
	
	@Test
	public void testPsalmsChp101NumVerses(){
		assertEquals(Psalms.CHP101, PSALMS.getNumVersesInChp(101));
	}
	
	@Test
	public void testPsalmsChp102NumVerses(){
		assertEquals(Psalms.CHP102, PSALMS.getNumVersesInChp(102));
	}
	
	@Test
	public void testPsalmsChp103NumVerses(){
		assertEquals(Psalms.CHP103, PSALMS.getNumVersesInChp(103));
	}
	
	@Test
	public void testPsalmsChp104NumVerses(){
		assertEquals(Psalms.CHP104, PSALMS.getNumVersesInChp(104));
	}
	
	@Test
	public void testPsalmsChp105NumVerses(){
		assertEquals(Psalms.CHP105, PSALMS.getNumVersesInChp(105));
	}
	
	@Test
	public void testPsalmsChp106NumVerses(){
		assertEquals(Psalms.CHP106, PSALMS.getNumVersesInChp(106));
	}
	
	@Test
	public void testPsalmsChp107NumVerses(){
		assertEquals(Psalms.CHP107, PSALMS.getNumVersesInChp(107));
	}
	
	@Test
	public void testPsalmsChp108NumVerses(){
		assertEquals(Psalms.CHP108, PSALMS.getNumVersesInChp(108));
	}
	
	@Test
	public void testPsalmsChp109NumVerses(){
		assertEquals(Psalms.CHP109, PSALMS.getNumVersesInChp(109));
	}
	
	@Test
	public void testPsalmsChp110NumVerses(){
		assertEquals(Psalms.CHP110, PSALMS.getNumVersesInChp(110));
	}
	
	@Test
	public void testPsalmsChp111NumVerses(){
		assertEquals(Psalms.CHP111, PSALMS.getNumVersesInChp(111));
	}
	
	@Test
	public void testPsalmsChp112NumVerses(){
		assertEquals(Psalms.CHP112, PSALMS.getNumVersesInChp(112));
	}
	
	@Test
	public void testPsalmsChp113NumVerses(){
		assertEquals(Psalms.CHP113, PSALMS.getNumVersesInChp(113));
	}
	
	@Test
	public void testPsalmsChp114NumVerses(){
		assertEquals(Psalms.CHP114, PSALMS.getNumVersesInChp(114));
	}
	
	@Test
	public void testPsalmsChp115NumVerses(){
		assertEquals(Psalms.CHP115, PSALMS.getNumVersesInChp(115));
	}
	
	@Test
	public void testPsalmsChp116NumVerses(){
		assertEquals(Psalms.CHP116, PSALMS.getNumVersesInChp(116));
	}
	
	@Test
	public void testPsalmsChp117NumVerses(){
		assertEquals(Psalms.CHP117, PSALMS.getNumVersesInChp(117));
	}
	
	@Test
	public void testPsalmsChp118NumVerses(){
		assertEquals(Psalms.CHP118, PSALMS.getNumVersesInChp(118));
	}
	
	@Test
	public void testPsalmsChp119NumVerses(){
		assertEquals(Psalms.CHP119, PSALMS.getNumVersesInChp(119));
	}
	
	@Test
	public void testPsalmsChp120NumVerses(){
		assertEquals(Psalms.CHP120, PSALMS.getNumVersesInChp(120));
	}
	
	@Test
	public void testPsalmsChp121NumVerses(){
		assertEquals(Psalms.CHP121, PSALMS.getNumVersesInChp(121));
	}
	
	@Test
	public void testPsalmsChp122NumVerses(){
		assertEquals(Psalms.CHP122, PSALMS.getNumVersesInChp(122));
	}
	
	@Test
	public void testPsalmsChp123NumVerses(){
		assertEquals(Psalms.CHP123, PSALMS.getNumVersesInChp(123));
	}
	
	@Test
	public void testPsalmsChp124NumVerses(){
		assertEquals(Psalms.CHP124, PSALMS.getNumVersesInChp(124));
	}
	
	@Test
	public void testPsalmsChp125NumVerses(){
		assertEquals(Psalms.CHP125, PSALMS.getNumVersesInChp(125));
	}
	
	@Test
	public void testPsalmsChp126NumVerses(){
		assertEquals(Psalms.CHP126, PSALMS.getNumVersesInChp(126));
	}
	
	@Test
	public void testPsalmsChp127NumVerses(){
		assertEquals(Psalms.CHP127, PSALMS.getNumVersesInChp(127));
	}
	
	@Test
	public void testPsalmsChp128NumVerses(){
		assertEquals(Psalms.CHP128, PSALMS.getNumVersesInChp(128));
	}
	
	@Test
	public void testPsalmsChp129NumVerses(){
		assertEquals(Psalms.CHP129, PSALMS.getNumVersesInChp(129));
	}
	
	@Test
	public void testPsalmsChp130NumVerses(){
		assertEquals(Psalms.CHP130, PSALMS.getNumVersesInChp(130));
	}
	
	@Test
	public void testPsalmsChp131NumVerses(){
		assertEquals(Psalms.CHP131, PSALMS.getNumVersesInChp(131));
	}
	
	@Test
	public void testPsalmsChp132NumVerses(){
		assertEquals(Psalms.CHP132, PSALMS.getNumVersesInChp(132));
	}
	
	@Test
	public void testPsalmsChp133NumVerses(){
		assertEquals(Psalms.CHP133, PSALMS.getNumVersesInChp(133));
	}
	
	@Test
	public void testPsalmsChp134NumVerses(){
		assertEquals(Psalms.CHP134, PSALMS.getNumVersesInChp(134));
	}
	
	@Test
	public void testPsalmsChp135NumVerses(){
		assertEquals(Psalms.CHP135, PSALMS.getNumVersesInChp(135));
	}
	
	@Test
	public void testPsalmsChp136NumVerses(){
		assertEquals(Psalms.CHP136, PSALMS.getNumVersesInChp(136));
	}
	
	@Test
	public void testPsalmsChp137NumVerses(){
		assertEquals(Psalms.CHP137, PSALMS.getNumVersesInChp(137));
	}
	
	@Test
	public void testPsalmsChp138NumVerses(){
		assertEquals(Psalms.CHP138, PSALMS.getNumVersesInChp(138));
	}
	
	@Test
	public void testPsalmsChp139NumVerses(){
		assertEquals(Psalms.CHP139, PSALMS.getNumVersesInChp(139));
	}
	
	@Test
	public void testPsalmsChp140NumVerses(){
		assertEquals(Psalms.CHP140, PSALMS.getNumVersesInChp(140));
	}
	
	@Test
	public void testPsalmsChp141NumVerses(){
		assertEquals(Psalms.CHP141, PSALMS.getNumVersesInChp(141));
	}
	
	@Test
	public void testPsalmsChp142NumVerses(){
		assertEquals(Psalms.CHP142, PSALMS.getNumVersesInChp(142));
	}
	
	@Test
	public void testPsalmsChp143NumVerses(){
		assertEquals(Psalms.CHP143, PSALMS.getNumVersesInChp(143));
	}
	
	@Test
	public void testPsalmsChp144NumVerses(){
		assertEquals(Psalms.CHP144, PSALMS.getNumVersesInChp(144));
	}
	
	@Test
	public void testPsalmsChp145NumVerses(){
		assertEquals(Psalms.CHP145, PSALMS.getNumVersesInChp(145));
	}
	
	@Test
	public void testPsalmsChp146NumVerses(){
		assertEquals(Psalms.CHP146, PSALMS.getNumVersesInChp(146));
	}
	
	@Test
	public void testPsalmsChp147NumVerses(){
		assertEquals(Psalms.CHP147, PSALMS.getNumVersesInChp(147));
	}
	
	@Test
	public void testPsalmsChp148NumVerses(){
		assertEquals(Psalms.CHP148, PSALMS.getNumVersesInChp(148));
	}
	
	@Test
	public void testPsalmsChp149NumVerses(){
		assertEquals(Psalms.CHP149, PSALMS.getNumVersesInChp(149));
	}
	
	@Test
	public void testPsalmsChp150NumVerses(){
		assertEquals(Psalms.CHP150, PSALMS.getNumVersesInChp(150));
	}
	
	/*
	 * Proverbs number of verses checks
	 */
	@Test
	public void testProverbsChp1NumVerses(){
		assertEquals(Proverbs.CHP1, PROVERBS.getNumVersesInChp(1));
	}
	
	@Test
	public void testProverbsChp2NumVerses(){
		assertEquals(Proverbs.CHP2, PROVERBS.getNumVersesInChp(2));
	}
	
	@Test
	public void testProverbsChp3NumVerses(){
		assertEquals(Proverbs.CHP3, PROVERBS.getNumVersesInChp(3));
	}
	
	@Test
	public void testProverbsChp4NumVerses(){
		assertEquals(Proverbs.CHP4, PROVERBS.getNumVersesInChp(4));
	}
	
	@Test
	public void testProverbsChp5NumVerses(){
		assertEquals(Proverbs.CHP5, PROVERBS.getNumVersesInChp(5));
	}
	
	@Test
	public void testProverbsChp6NumVerses(){
		assertEquals(Proverbs.CHP6, PROVERBS.getNumVersesInChp(6));
	}
	
	@Test
	public void testProverbsChp7NumVerses(){
		assertEquals(Proverbs.CHP7, PROVERBS.getNumVersesInChp(7));
	}
	
	@Test
	public void testProverbsChp8NumVerses(){
		assertEquals(Proverbs.CHP8, PROVERBS.getNumVersesInChp(8));
	}
	
	@Test
	public void testProverbsChp9NumVerses(){
		assertEquals(Proverbs.CHP9, PROVERBS.getNumVersesInChp(9));
	}
	
	@Test
	public void testProverbsChp10NumVerses(){
		assertEquals(Proverbs.CHP10, PROVERBS.getNumVersesInChp(10));
	}
	
	@Test
	public void testProverbsChp11NumVerses(){
		assertEquals(Proverbs.CHP11, PROVERBS.getNumVersesInChp(11));
	}
	
	@Test
	public void testProverbsChp12NumVerses(){
		assertEquals(Proverbs.CHP12, PROVERBS.getNumVersesInChp(12));
	}
	
	@Test
	public void testProverbsChp13NumVerses(){
		assertEquals(Proverbs.CHP13, PROVERBS.getNumVersesInChp(13));
	}
	
	@Test
	public void testProverbsChp14NumVerses(){
		assertEquals(Proverbs.CHP14, PROVERBS.getNumVersesInChp(14));
	}
	
	@Test
	public void testProverbsChp15NumVerses(){
		assertEquals(Proverbs.CHP15, PROVERBS.getNumVersesInChp(15));
	}
	
	@Test
	public void testProverbsChp16NumVerses(){
		assertEquals(Proverbs.CHP16, PROVERBS.getNumVersesInChp(16));
	}
	
	@Test
	public void testProverbsChp17NumVerses(){
		assertEquals(Proverbs.CHP17, PROVERBS.getNumVersesInChp(17));
	}
	
	@Test
	public void testProverbsChp18NumVerses(){
		assertEquals(Proverbs.CHP18, PROVERBS.getNumVersesInChp(18));
	}
	
	@Test
	public void testProverbsChp19NumVerses(){
		assertEquals(Proverbs.CHP19, PROVERBS.getNumVersesInChp(19));
	}
	
	@Test
	public void testProverbsChp20NumVerses(){
		assertEquals(Proverbs.CHP20, PROVERBS.getNumVersesInChp(20));
	}
	
	@Test
	public void testProverbsChp21NumVerses(){
		assertEquals(Proverbs.CHP21, PROVERBS.getNumVersesInChp(21));
	}
	
	@Test
	public void testProverbsChp22NumVerses(){
		assertEquals(Proverbs.CHP22, PROVERBS.getNumVersesInChp(22));
	}
	
	@Test
	public void testProverbsChp23NumVerses(){
		assertEquals(Proverbs.CHP23, PROVERBS.getNumVersesInChp(23));
	}
	
	@Test
	public void testProverbsChp24NumVerses(){
		assertEquals(Proverbs.CHP24, PROVERBS.getNumVersesInChp(24));
	}
	
	@Test
	public void testProverbsChp25NumVerses(){
		assertEquals(Proverbs.CHP25, PROVERBS.getNumVersesInChp(25));
	}
	
	@Test
	public void testProverbsChp26NumVerses(){
		assertEquals(Proverbs.CHP26, PROVERBS.getNumVersesInChp(26));
	}
	
	@Test
	public void testProverbsChp27NumVerses(){
		assertEquals(Proverbs.CHP27, PROVERBS.getNumVersesInChp(27));
	}
	
	@Test
	public void testProverbsChp28NumVerses(){
		assertEquals(Proverbs.CHP28, PROVERBS.getNumVersesInChp(28));
	}
	
	@Test
	public void testProverbsChp29NumVerses(){
		assertEquals(Proverbs.CHP29, PROVERBS.getNumVersesInChp(29));
	}
	
	@Test
	public void testProverbsChp30NumVerses(){
		assertEquals(Proverbs.CHP30, PROVERBS.getNumVersesInChp(30));
	}
	
	@Test
	public void testProverbsChp31NumVerses(){
		assertEquals(Proverbs.CHP31, PROVERBS.getNumVersesInChp(31));
	}
	
	/*
	 * Ecclesiastes number of verses checks
	 */
	@Test
	public void testEcclesiastesChp1NumVerses(){
		assertEquals(Ecclesiastes.CHP1, ECCLESIASTES.getNumVersesInChp(1));
	}
	
	@Test
	public void testEcclesiastesChp2NumVerses(){
		assertEquals(Ecclesiastes.CHP2, ECCLESIASTES.getNumVersesInChp(2));
	}
	
	@Test
	public void testEcclesiastesChp3NumVerses(){
		assertEquals(Ecclesiastes.CHP3, ECCLESIASTES.getNumVersesInChp(3));
	}
	
	@Test
	public void testEcclesiastesChp4NumVerses(){
		assertEquals(Ecclesiastes.CHP4, ECCLESIASTES.getNumVersesInChp(4));
	}
	
	@Test
	public void testEcclesiastesChp5NumVerses(){
		assertEquals(Ecclesiastes.CHP5, ECCLESIASTES.getNumVersesInChp(5));
	}
	
	@Test
	public void testEcclesiastesChp6NumVerses(){
		assertEquals(Ecclesiastes.CHP6, ECCLESIASTES.getNumVersesInChp(6));
	}
	
	@Test
	public void testEcclesiastesChp7NumVerses(){
		assertEquals(Ecclesiastes.CHP7, ECCLESIASTES.getNumVersesInChp(7));
	}
	
	@Test
	public void testEcclesiastesChp8NumVerses(){
		assertEquals(Ecclesiastes.CHP8, ECCLESIASTES.getNumVersesInChp(8));
	}
	
	@Test
	public void testEcclesiastesChp9NumVerses(){
		assertEquals(Ecclesiastes.CHP9, ECCLESIASTES.getNumVersesInChp(9));
	}
	
	@Test
	public void testEcclesiastesChp10NumVerses(){
		assertEquals(Ecclesiastes.CHP10, ECCLESIASTES.getNumVersesInChp(10));
	}
	
	@Test
	public void testEcclesiastesChp11NumVerses(){
		assertEquals(Ecclesiastes.CHP11, ECCLESIASTES.getNumVersesInChp(11));
	}
	
	@Test
	public void testEcclesiastesChp12NumVerses(){
		assertEquals(Ecclesiastes.CHP12, ECCLESIASTES.getNumVersesInChp(12));
	}
	
	/*
	 * Song of Songs number of verses checks
	 */
	@Test
	public void testSongofSongsChp1NumVerses(){
		assertEquals(SongofSongs.CHP1, SONG_OF_SONGS.getNumVersesInChp(1));
	}
	
	@Test
	public void testSongofSongsChp2NumVerses(){
		assertEquals(SongofSongs.CHP2, SONG_OF_SONGS.getNumVersesInChp(2));
	}
	
	@Test
	public void testSongofSongsChp3NumVerses(){
		assertEquals(SongofSongs.CHP3, SONG_OF_SONGS.getNumVersesInChp(3));
	}
	
	@Test
	public void testSongofSongsChp4NumVerses(){
		assertEquals(SongofSongs.CHP4, SONG_OF_SONGS.getNumVersesInChp(4));
	}
	
	@Test
	public void testSongofSongsChp5NumVerses(){
		assertEquals(SongofSongs.CHP5, SONG_OF_SONGS.getNumVersesInChp(5));
	}
	
	@Test
	public void testSongofSongsChp6NumVerses(){
		assertEquals(SongofSongs.CHP6, SONG_OF_SONGS.getNumVersesInChp(6));
	}
	
	@Test
	public void testSongofSongsChp7NumVerses(){
		assertEquals(SongofSongs.CHP7, SONG_OF_SONGS.getNumVersesInChp(7));
	}
	
	@Test
	public void testSongofSongsChp8NumVerses(){
		assertEquals(SongofSongs.CHP8, SONG_OF_SONGS.getNumVersesInChp(8));
	}
	
	/*
	 * Isaiah number of verses checks
	 */
	@Test
	public void testIsaiahChp1NumVerses(){
		assertEquals(Isaiah.CHP1, ISAIAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testIsaiahChp2NumVerses(){
		assertEquals(Isaiah.CHP2, ISAIAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testIsaiahChp3NumVerses(){
		assertEquals(Isaiah.CHP3, ISAIAH.getNumVersesInChp(3));
	}
	
	@Test
	public void testIsaiahChp4NumVerses(){
		assertEquals(Isaiah.CHP4, ISAIAH.getNumVersesInChp(4));
	}
	
	@Test
	public void testIsaiahChp5NumVerses(){
		assertEquals(Isaiah.CHP5, ISAIAH.getNumVersesInChp(5));
	}
	
	@Test
	public void testIsaiahChp6NumVerses(){
		assertEquals(Isaiah.CHP6, ISAIAH.getNumVersesInChp(6));
	}
	
	@Test
	public void testIsaiahChp7NumVerses(){
		assertEquals(Isaiah.CHP7, ISAIAH.getNumVersesInChp(7));
	}
	
	@Test
	public void testIsaiahChp8NumVerses(){
		assertEquals(Isaiah.CHP8, ISAIAH.getNumVersesInChp(8));
	}
	
	@Test
	public void testIsaiahChp9NumVerses(){
		assertEquals(Isaiah.CHP9, ISAIAH.getNumVersesInChp(9));
	}
	
	@Test
	public void testIsaiahChp10NumVerses(){
		assertEquals(Isaiah.CHP10, ISAIAH.getNumVersesInChp(10));
	}
	
	@Test
	public void testIsaiahChp11NumVerses(){
		assertEquals(Isaiah.CHP11, ISAIAH.getNumVersesInChp(11));
	}
	
	@Test
	public void testIsaiahChp12NumVerses(){
		assertEquals(Isaiah.CHP12, ISAIAH.getNumVersesInChp(12));
	}
	
	@Test
	public void testIsaiahChp13NumVerses(){
		assertEquals(Isaiah.CHP13, ISAIAH.getNumVersesInChp(13));
	}
	
	@Test
	public void testIsaiahChp14NumVerses(){
		assertEquals(Isaiah.CHP14, ISAIAH.getNumVersesInChp(14));
	}
	
	@Test
	public void testIsaiahChp15NumVerses(){
		assertEquals(Isaiah.CHP15, ISAIAH.getNumVersesInChp(15));
	}
	
	@Test
	public void testIsaiahChp16NumVerses(){
		assertEquals(Isaiah.CHP16, ISAIAH.getNumVersesInChp(16));
	}
	
	@Test
	public void testIsaiahChp17NumVerses(){
		assertEquals(Isaiah.CHP17, ISAIAH.getNumVersesInChp(17));
	}
	
	@Test
	public void testIsaiahChp18NumVerses(){
		assertEquals(Isaiah.CHP18, ISAIAH.getNumVersesInChp(18));
	}
	
	@Test
	public void testIsaiahChp19NumVerses(){
		assertEquals(Isaiah.CHP19, ISAIAH.getNumVersesInChp(19));
	}
	
	@Test
	public void testIsaiahChp20NumVerses(){
		assertEquals(Isaiah.CHP20, ISAIAH.getNumVersesInChp(20));
	}
	
	@Test
	public void testIsaiahChp21NumVerses(){
		assertEquals(Isaiah.CHP21, ISAIAH.getNumVersesInChp(21));
	}
	
	@Test
	public void testIsaiahChp22NumVerses(){
		assertEquals(Isaiah.CHP22, ISAIAH.getNumVersesInChp(22));
	}
	
	@Test
	public void testIsaiahChp23NumVerses(){
		assertEquals(Isaiah.CHP23, ISAIAH.getNumVersesInChp(23));
	}
	
	@Test
	public void testIsaiahChp24NumVerses(){
		assertEquals(Isaiah.CHP24, ISAIAH.getNumVersesInChp(24));
	}
	
	@Test
	public void testIsaiahChp25NumVerses(){
		assertEquals(Isaiah.CHP25, ISAIAH.getNumVersesInChp(25));
	}
	
	@Test
	public void testIsaiahChp26NumVerses(){
		assertEquals(Isaiah.CHP26, ISAIAH.getNumVersesInChp(26));
	}
	
	@Test
	public void testIsaiahChp27NumVerses(){
		assertEquals(Isaiah.CHP27, ISAIAH.getNumVersesInChp(27));
	}
	
	@Test
	public void testIsaiahChp28NumVerses(){
		assertEquals(Isaiah.CHP28, ISAIAH.getNumVersesInChp(28));
	}
	
	@Test
	public void testIsaiahChp29NumVerses(){
		assertEquals(Isaiah.CHP29, ISAIAH.getNumVersesInChp(29));
	}
	
	@Test
	public void testIsaiahChp30NumVerses(){
		assertEquals(Isaiah.CHP30, ISAIAH.getNumVersesInChp(30));
	}
	
	@Test
	public void testIsaiahChp31NumVerses(){
		assertEquals(Isaiah.CHP31, ISAIAH.getNumVersesInChp(31));
	}
	
	@Test
	public void testIsaiahChp32NumVerses(){
		assertEquals(Isaiah.CHP32, ISAIAH.getNumVersesInChp(32));
	}
	
	@Test
	public void testIsaiahChp33NumVerses(){
		assertEquals(Isaiah.CHP33, ISAIAH.getNumVersesInChp(33));
	}
	
	@Test
	public void testIsaiahChp34NumVerses(){
		assertEquals(Isaiah.CHP34, ISAIAH.getNumVersesInChp(34));
	}
	
	@Test
	public void testIsaiahChp35NumVerses(){
		assertEquals(Isaiah.CHP35, ISAIAH.getNumVersesInChp(35));
	}
	
	@Test
	public void testIsaiahChp36NumVerses(){
		assertEquals(Isaiah.CHP36, ISAIAH.getNumVersesInChp(36));
	}
	
	@Test
	public void testIsaiahChp37NumVerses(){
		assertEquals(Isaiah.CHP37, ISAIAH.getNumVersesInChp(37));
	}
	
	@Test
	public void testIsaiahChp38NumVerses(){
		assertEquals(Isaiah.CHP38, ISAIAH.getNumVersesInChp(38));
	}
	
	@Test
	public void testIsaiahChp39NumVerses(){
		assertEquals(Isaiah.CHP39, ISAIAH.getNumVersesInChp(39));
	}
	
	@Test
	public void testIsaiahChp40NumVerses(){
		assertEquals(Isaiah.CHP40, ISAIAH.getNumVersesInChp(40));
	}
	
	@Test
	public void testIsaiahChp41NumVerses(){
		assertEquals(Isaiah.CHP41, ISAIAH.getNumVersesInChp(41));
	}
	
	@Test
	public void testIsaiahChp42NumVerses(){
		assertEquals(Isaiah.CHP42, ISAIAH.getNumVersesInChp(42));
	}
	
	@Test
	public void testIsaiahChp43NumVerses(){
		assertEquals(Isaiah.CHP43, ISAIAH.getNumVersesInChp(43));
	}
	
	@Test
	public void testIsaiahChp44NumVerses(){
		assertEquals(Isaiah.CHP44, ISAIAH.getNumVersesInChp(44));
	}
	
	@Test
	public void testIsaiahChp45NumVerses(){
		assertEquals(Isaiah.CHP45, ISAIAH.getNumVersesInChp(45));
	}
	
	@Test
	public void testIsaiahChp46NumVerses(){
		assertEquals(Isaiah.CHP46, ISAIAH.getNumVersesInChp(46));
	}
	
	@Test
	public void testIsaiahChp47NumVerses(){
		assertEquals(Isaiah.CHP47, ISAIAH.getNumVersesInChp(47));
	}
	
	@Test
	public void testIsaiahChp48NumVerses(){
		assertEquals(Isaiah.CHP48, ISAIAH.getNumVersesInChp(48));
	}
	
	@Test
	public void testIsaiahChp49NumVerses(){
		assertEquals(Isaiah.CHP49, ISAIAH.getNumVersesInChp(49));
	}
	
	@Test
	public void testIsaiahChp50NumVerses(){
		assertEquals(Isaiah.CHP50, ISAIAH.getNumVersesInChp(50));
	}
	
	@Test
	public void testIsaiahChp51NumVerses(){
		assertEquals(Isaiah.CHP51, ISAIAH.getNumVersesInChp(51));
	}
	
	@Test
	public void testIsaiahChp52NumVerses(){
		assertEquals(Isaiah.CHP52, ISAIAH.getNumVersesInChp(52));
	}
	
	@Test
	public void testIsaiahChp53NumVerses(){
		assertEquals(Isaiah.CHP53, ISAIAH.getNumVersesInChp(53));
	}
	
	@Test
	public void testIsaiahChp54NumVerses(){
		assertEquals(Isaiah.CHP54, ISAIAH.getNumVersesInChp(54));
	}
	
	@Test
	public void testIsaiahChp55NumVerses(){
		assertEquals(Isaiah.CHP55, ISAIAH.getNumVersesInChp(55));
	}
	
	@Test
	public void testIsaiahChp56NumVerses(){
		assertEquals(Isaiah.CHP56, ISAIAH.getNumVersesInChp(56));
	}
	
	@Test
	public void testIsaiahChp57NumVerses(){
		assertEquals(Isaiah.CHP57, ISAIAH.getNumVersesInChp(57));
	}
	
	@Test
	public void testIsaiahChp58NumVerses(){
		assertEquals(Isaiah.CHP58, ISAIAH.getNumVersesInChp(58));
	}
	
	@Test
	public void testIsaiahChp59NumVerses(){
		assertEquals(Isaiah.CHP59, ISAIAH.getNumVersesInChp(59));
	}
	
	@Test
	public void testIsaiahChp60NumVerses(){
		assertEquals(Isaiah.CHP60, ISAIAH.getNumVersesInChp(60));
	}
	
	@Test
	public void testIsaiahChp61NumVerses(){
		assertEquals(Isaiah.CHP61, ISAIAH.getNumVersesInChp(61));
	}
	
	@Test
	public void testIsaiahChp62NumVerses(){
		assertEquals(Isaiah.CHP62, ISAIAH.getNumVersesInChp(62));
	}
	
	@Test
	public void testIsaiahChp63NumVerses(){
		assertEquals(Isaiah.CHP63, ISAIAH.getNumVersesInChp(63));
	}
	
	@Test
	public void testIsaiahChp64NumVerses(){
		assertEquals(Isaiah.CHP64, ISAIAH.getNumVersesInChp(64));
	}
	
	@Test
	public void testIsaiahChp65NumVerses(){
		assertEquals(Isaiah.CHP65, ISAIAH.getNumVersesInChp(65));
	}
	
	@Test
	public void testIsaiahChp66NumVerses(){
		assertEquals(Isaiah.CHP66, ISAIAH.getNumVersesInChp(66));
	}
	
	/*
	 * Jeremiah number of verses checks
	 */
	@Test
	public void testJeremiahChp1NumVerses(){
		assertEquals(Jeremiah.CHP1, JEREMIAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testJeremiahChp2NumVerses(){
		assertEquals(Jeremiah.CHP2, JEREMIAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testJeremiahChp3NumVerses(){
		assertEquals(Jeremiah.CHP3, JEREMIAH.getNumVersesInChp(3));
	}
	
	@Test
	public void testJeremiahChp4NumVerses(){
		assertEquals(Jeremiah.CHP4, JEREMIAH.getNumVersesInChp(4));
	}
	
	@Test
	public void testJeremiahChp5NumVerses(){
		assertEquals(Jeremiah.CHP5, JEREMIAH.getNumVersesInChp(5));
	}
	
	@Test
	public void testJeremiahChp6NumVerses(){
		assertEquals(Jeremiah.CHP6, JEREMIAH.getNumVersesInChp(6));
	}
	
	@Test
	public void testJeremiahChp7NumVerses(){
		assertEquals(Jeremiah.CHP7, JEREMIAH.getNumVersesInChp(7));
	}
	
	@Test
	public void testJeremiahChp8NumVerses(){
		assertEquals(Jeremiah.CHP8, JEREMIAH.getNumVersesInChp(8));
	}
	
	@Test
	public void testJeremiahChp9NumVerses(){
		assertEquals(Jeremiah.CHP9, JEREMIAH.getNumVersesInChp(9));
	}
	
	@Test
	public void testJeremiahChp10NumVerses(){
		assertEquals(Jeremiah.CHP10, JEREMIAH.getNumVersesInChp(10));
	}
	
	@Test
	public void testJeremiahChp11NumVerses(){
		assertEquals(Jeremiah.CHP11, JEREMIAH.getNumVersesInChp(11));
	}
	
	@Test
	public void testJeremiahChp12NumVerses(){
		assertEquals(Jeremiah.CHP12, JEREMIAH.getNumVersesInChp(12));
	}
	
	@Test
	public void testJeremiahChp13NumVerses(){
		assertEquals(Jeremiah.CHP13, JEREMIAH.getNumVersesInChp(13));
	}
	
	@Test
	public void testJeremiahChp14NumVerses(){
		assertEquals(Jeremiah.CHP14, JEREMIAH.getNumVersesInChp(14));
	}
	
	@Test
	public void testJeremiahChp15NumVerses(){
		assertEquals(Jeremiah.CHP15, JEREMIAH.getNumVersesInChp(15));
	}
	
	@Test
	public void testJeremiahChp16NumVerses(){
		assertEquals(Jeremiah.CHP16, JEREMIAH.getNumVersesInChp(16));
	}
	
	@Test
	public void testJeremiahChp17NumVerses(){
		assertEquals(Jeremiah.CHP17, JEREMIAH.getNumVersesInChp(17));
	}
	
	@Test
	public void testJeremiahChp18NumVerses(){
		assertEquals(Jeremiah.CHP18, JEREMIAH.getNumVersesInChp(18));
	}
	
	@Test
	public void testJeremiahChp19NumVerses(){
		assertEquals(Jeremiah.CHP19, JEREMIAH.getNumVersesInChp(19));
	}
	
	@Test
	public void testJeremiahChp20NumVerses(){
		assertEquals(Jeremiah.CHP20, JEREMIAH.getNumVersesInChp(20));
	}
	
	@Test
	public void testJeremiahChp21NumVerses(){
		assertEquals(Jeremiah.CHP21, JEREMIAH.getNumVersesInChp(21));
	}
	
	@Test
	public void testJeremiahChp22NumVerses(){
		assertEquals(Jeremiah.CHP22, JEREMIAH.getNumVersesInChp(22));
	}
	
	@Test
	public void testJeremiahChp23NumVerses(){
		assertEquals(Jeremiah.CHP23, JEREMIAH.getNumVersesInChp(23));
	}
	
	@Test
	public void testJeremiahChp24NumVerses(){
		assertEquals(Jeremiah.CHP24, JEREMIAH.getNumVersesInChp(24));
	}
	
	@Test
	public void testJeremiahChp25NumVerses(){
		assertEquals(Jeremiah.CHP25, JEREMIAH.getNumVersesInChp(25));
	}
	
	@Test
	public void testJeremiahChp26NumVerses(){
		assertEquals(Jeremiah.CHP26, JEREMIAH.getNumVersesInChp(26));
	}
	
	@Test
	public void testJeremiahChp27NumVerses(){
		assertEquals(Jeremiah.CHP27, JEREMIAH.getNumVersesInChp(27));
	}
	
	@Test
	public void testJeremiahChp28NumVerses(){
		assertEquals(Jeremiah.CHP28, JEREMIAH.getNumVersesInChp(28));
	}
	
	@Test
	public void testJeremiahChp29NumVerses(){
		assertEquals(Jeremiah.CHP29, JEREMIAH.getNumVersesInChp(29));
	}
	
	@Test
	public void testJeremiahChp30NumVerses(){
		assertEquals(Jeremiah.CHP30, JEREMIAH.getNumVersesInChp(30));
	}
	
	@Test
	public void testJeremiahChp31NumVerses(){
		assertEquals(Jeremiah.CHP31, JEREMIAH.getNumVersesInChp(31));
	}
	
	@Test
	public void testJeremiahChp32NumVerses(){
		assertEquals(Jeremiah.CHP32, JEREMIAH.getNumVersesInChp(32));
	}
	
	@Test
	public void testJeremiahChp33NumVerses(){
		assertEquals(Jeremiah.CHP33, JEREMIAH.getNumVersesInChp(33));
	}
	
	@Test
	public void testJeremiahChp34NumVerses(){
		assertEquals(Jeremiah.CHP34, JEREMIAH.getNumVersesInChp(34));
	}
	
	@Test
	public void testJeremiahChp35NumVerses(){
		assertEquals(Jeremiah.CHP35, JEREMIAH.getNumVersesInChp(35));
	}
	
	@Test
	public void testJeremiahChp36NumVerses(){
		assertEquals(Jeremiah.CHP36, JEREMIAH.getNumVersesInChp(36));
	}
	
	@Test
	public void testJeremiahChp37NumVerses(){
		assertEquals(Jeremiah.CHP37, JEREMIAH.getNumVersesInChp(37));
	}
	
	@Test
	public void testJeremiahChp38NumVerses(){
		assertEquals(Jeremiah.CHP38, JEREMIAH.getNumVersesInChp(38));
	}
	
	@Test
	public void testJeremiahChp39NumVerses(){
		assertEquals(Jeremiah.CHP39, JEREMIAH.getNumVersesInChp(39));
	}
	
	@Test
	public void testJeremiahChp40NumVerses(){
		assertEquals(Jeremiah.CHP40, JEREMIAH.getNumVersesInChp(40));
	}
	
	@Test
	public void testJeremiahChp41NumVerses(){
		assertEquals(Jeremiah.CHP41, JEREMIAH.getNumVersesInChp(41));
	}
	
	@Test
	public void testJeremiahChp42NumVerses(){
		assertEquals(Jeremiah.CHP42, JEREMIAH.getNumVersesInChp(42));
	}
	
	@Test
	public void testJeremiahChp43NumVerses(){
		assertEquals(Jeremiah.CHP43, JEREMIAH.getNumVersesInChp(43));
	}
	
	@Test
	public void testJeremiahChp44NumVerses(){
		assertEquals(Jeremiah.CHP44, JEREMIAH.getNumVersesInChp(44));
	}
	
	@Test
	public void testJeremiahChp45NumVerses(){
		assertEquals(Jeremiah.CHP45, JEREMIAH.getNumVersesInChp(45));
	}
	
	@Test
	public void testJeremiahChp46NumVerses(){
		assertEquals(Jeremiah.CHP46, JEREMIAH.getNumVersesInChp(46));
	}
	
	@Test
	public void testJeremiahChp47NumVerses(){
		assertEquals(Jeremiah.CHP47, JEREMIAH.getNumVersesInChp(47));
	}
	
	@Test
	public void testJeremiahChp48NumVerses(){
		assertEquals(Jeremiah.CHP48, JEREMIAH.getNumVersesInChp(48));
	}
	
	@Test
	public void testJeremiahChp49NumVerses(){
		assertEquals(Jeremiah.CHP49, JEREMIAH.getNumVersesInChp(49));
	}
	
	@Test
	public void testJeremiahChp50NumVerses(){
		assertEquals(Jeremiah.CHP50, JEREMIAH.getNumVersesInChp(50));
	}
	
	@Test
	public void testJeremiahChp51NumVerses(){
		assertEquals(Jeremiah.CHP51, JEREMIAH.getNumVersesInChp(51));
	}
	
	@Test
	public void testJeremiahChp52NumVerses(){
		assertEquals(Jeremiah.CHP52, JEREMIAH.getNumVersesInChp(52));
	}
	
	/*
	 * Lamentations number of verses checks
	 */
	@Test
	public void testLamentationsChp1NumVerses(){
		assertEquals(Lamentations.CHP1, LAMENTATIONS.getNumVersesInChp(1));
	}
	
	@Test
	public void testLamentationsChp2NumVerses(){
		assertEquals(Lamentations.CHP2, LAMENTATIONS.getNumVersesInChp(2));
	}
	
	@Test
	public void testLamentationsChp3NumVerses(){
		assertEquals(Lamentations.CHP3, LAMENTATIONS.getNumVersesInChp(3));
	}
	
	@Test
	public void testLamentationsChp4NumVerses(){
		assertEquals(Lamentations.CHP4, LAMENTATIONS.getNumVersesInChp(4));
	}
	
	@Test
	public void testLamentationsChp5NumVerses(){
		assertEquals(Lamentations.CHP5, LAMENTATIONS.getNumVersesInChp(5));
	}
	
	/*
	 * Ezekiel number of verses checks
	 */
	@Test
	public void testEzekielChp1NumVerses(){
		assertEquals(Ezekiel.CHP1, EZEKIEL.getNumVersesInChp(1));
	}
	
	@Test
	public void testEzekielChp2NumVerses(){
		assertEquals(Ezekiel.CHP2, EZEKIEL.getNumVersesInChp(2));
	}
	
	@Test
	public void testEzekielChp3NumVerses(){
		assertEquals(Ezekiel.CHP3, EZEKIEL.getNumVersesInChp(3));
	}
	
	@Test
	public void testEzekielChp4NumVerses(){
		assertEquals(Ezekiel.CHP4, EZEKIEL.getNumVersesInChp(4));
	}
	
	@Test
	public void testEzekielChp5NumVerses(){
		assertEquals(Ezekiel.CHP5, EZEKIEL.getNumVersesInChp(5));
	}
	
	@Test
	public void testEzekielChp6NumVerses(){
		assertEquals(Ezekiel.CHP6, EZEKIEL.getNumVersesInChp(6));
	}
	
	@Test
	public void testEzekielChp7NumVerses(){
		assertEquals(Ezekiel.CHP7, EZEKIEL.getNumVersesInChp(7));
	}
	
	@Test
	public void testEzekielChp8NumVerses(){
		assertEquals(Ezekiel.CHP8, EZEKIEL.getNumVersesInChp(8));
	}
	
	@Test
	public void testEzekielChp9NumVerses(){
		assertEquals(Ezekiel.CHP9, EZEKIEL.getNumVersesInChp(9));
	}
	
	@Test
	public void testEzekielChp10NumVerses(){
		assertEquals(Ezekiel.CHP10, EZEKIEL.getNumVersesInChp(10));
	}
	
	@Test
	public void testEzekielChp11NumVerses(){
		assertEquals(Ezekiel.CHP11, EZEKIEL.getNumVersesInChp(11));
	}
	
	@Test
	public void testEzekielChp12NumVerses(){
		assertEquals(Ezekiel.CHP12, EZEKIEL.getNumVersesInChp(12));
	}
	
	@Test
	public void testEzekielChp13NumVerses(){
		assertEquals(Ezekiel.CHP13, EZEKIEL.getNumVersesInChp(13));
	}
	
	@Test
	public void testEzekielChp14NumVerses(){
		assertEquals(Ezekiel.CHP14, EZEKIEL.getNumVersesInChp(14));
	}
	
	@Test
	public void testEzekielChp15NumVerses(){
		assertEquals(Ezekiel.CHP15, EZEKIEL.getNumVersesInChp(15));
	}
	
	@Test
	public void testEzekielChp16NumVerses(){
		assertEquals(Ezekiel.CHP16, EZEKIEL.getNumVersesInChp(16));
	}
	
	@Test
	public void testEzekielChp17NumVerses(){
		assertEquals(Ezekiel.CHP17, EZEKIEL.getNumVersesInChp(17));
	}
	
	@Test
	public void testEzekielChp18NumVerses(){
		assertEquals(Ezekiel.CHP18, EZEKIEL.getNumVersesInChp(18));
	}
	
	@Test
	public void testEzekielChp19NumVerses(){
		assertEquals(Ezekiel.CHP19, EZEKIEL.getNumVersesInChp(19));
	}
	
	@Test
	public void testEzekielChp20NumVerses(){
		assertEquals(Ezekiel.CHP20, EZEKIEL.getNumVersesInChp(20));
	}
	
	@Test
	public void testEzekielChp21NumVerses(){
		assertEquals(Ezekiel.CHP21, EZEKIEL.getNumVersesInChp(21));
	}
	
	@Test
	public void testEzekielChp22NumVerses(){
		assertEquals(Ezekiel.CHP22, EZEKIEL.getNumVersesInChp(22));
	}
	
	@Test
	public void testEzekielChp23NumVerses(){
		assertEquals(Ezekiel.CHP23, EZEKIEL.getNumVersesInChp(23));
	}
	
	@Test
	public void testEzekielChp24NumVerses(){
		assertEquals(Ezekiel.CHP24, EZEKIEL.getNumVersesInChp(24));
	}
	
	@Test
	public void testEzekielChp25NumVerses(){
		assertEquals(Ezekiel.CHP25, EZEKIEL.getNumVersesInChp(25));
	}
	
	@Test
	public void testEzekielChp26NumVerses(){
		assertEquals(Ezekiel.CHP26, EZEKIEL.getNumVersesInChp(26));
	}
	
	@Test
	public void testEzekielChp27NumVerses(){
		assertEquals(Ezekiel.CHP27, EZEKIEL.getNumVersesInChp(27));
	}
	
	@Test
	public void testEzekielChp28NumVerses(){
		assertEquals(Ezekiel.CHP28, EZEKIEL.getNumVersesInChp(28));
	}
	
	@Test
	public void testEzekielChp29NumVerses(){
		assertEquals(Ezekiel.CHP29, EZEKIEL.getNumVersesInChp(29));
	}
	
	@Test
	public void testEzekielChp30NumVerses(){
		assertEquals(Ezekiel.CHP30, EZEKIEL.getNumVersesInChp(30));
	}
	
	@Test
	public void testEzekielChp31NumVerses(){
		assertEquals(Ezekiel.CHP31, EZEKIEL.getNumVersesInChp(31));
	}
	
	@Test
	public void testEzekielChp32NumVerses(){
		assertEquals(Ezekiel.CHP32, EZEKIEL.getNumVersesInChp(32));
	}
	
	@Test
	public void testEzekielChp33NumVerses(){
		assertEquals(Ezekiel.CHP33, EZEKIEL.getNumVersesInChp(33));
	}
	
	@Test
	public void testEzekielChp34NumVerses(){
		assertEquals(Ezekiel.CHP34, EZEKIEL.getNumVersesInChp(34));
	}
	
	@Test
	public void testEzekielChp35NumVerses(){
		assertEquals(Ezekiel.CHP35, EZEKIEL.getNumVersesInChp(35));
	}
	
	@Test
	public void testEzekielChp36NumVerses(){
		assertEquals(Ezekiel.CHP36, EZEKIEL.getNumVersesInChp(36));
	}
	
	@Test
	public void testEzekielChp37NumVerses(){
		assertEquals(Ezekiel.CHP37, EZEKIEL.getNumVersesInChp(37));
	}
	
	@Test
	public void testEzekielChp38NumVerses(){
		assertEquals(Ezekiel.CHP38, EZEKIEL.getNumVersesInChp(38));
	}
	
	@Test
	public void testEzekielChp39NumVerses(){
		assertEquals(Ezekiel.CHP39, EZEKIEL.getNumVersesInChp(39));
	}
	
	@Test
	public void testEzekielChp40NumVerses(){
		assertEquals(Ezekiel.CHP40, EZEKIEL.getNumVersesInChp(40));
	}
	
	@Test
	public void testEzekielChp41NumVerses(){
		assertEquals(Ezekiel.CHP41, EZEKIEL.getNumVersesInChp(41));
	}
	
	@Test
	public void testEzekielChp42NumVerses(){
		assertEquals(Ezekiel.CHP42, EZEKIEL.getNumVersesInChp(42));
	}
	
	@Test
	public void testEzekielChp43NumVerses(){
		assertEquals(Ezekiel.CHP43, EZEKIEL.getNumVersesInChp(43));
	}
	
	@Test
	public void testEzekielChp44NumVerses(){
		assertEquals(Ezekiel.CHP44, EZEKIEL.getNumVersesInChp(44));
	}
	
	@Test
	public void testEzekielChp45NumVerses(){
		assertEquals(Ezekiel.CHP45, EZEKIEL.getNumVersesInChp(45));
	}
	
	@Test
	public void testEzekielChp46NumVerses(){
		assertEquals(Ezekiel.CHP46, EZEKIEL.getNumVersesInChp(46));
	}
	
	@Test
	public void testEzekielChp47NumVerses(){
		assertEquals(Ezekiel.CHP47, EZEKIEL.getNumVersesInChp(47));
	}
	
	@Test
	public void testEzekielChp48NumVerses(){
		assertEquals(Ezekiel.CHP48, EZEKIEL.getNumVersesInChp(48));
	}
	
	/*
	 * Daniel number of verses checks
	 */
	@Test
	public void testDanielChp1NumVerses(){
		assertEquals(Daniel.CHP1, DANIEL.getNumVersesInChp(1));
	}
	
	@Test
	public void testDanielChp2NumVerses(){
		assertEquals(Daniel.CHP2, DANIEL.getNumVersesInChp(2));
	}
	
	@Test
	public void testDanielChp3NumVerses(){
		assertEquals(Daniel.CHP3, DANIEL.getNumVersesInChp(3));
	}
	
	@Test
	public void testDanielChp4NumVerses(){
		assertEquals(Daniel.CHP4, DANIEL.getNumVersesInChp(4));
	}
	
	@Test
	public void testDanielChp5NumVerses(){
		assertEquals(Daniel.CHP5, DANIEL.getNumVersesInChp(5));
	}
	
	@Test
	public void testDanielChp6NumVerses(){
		assertEquals(Daniel.CHP6, DANIEL.getNumVersesInChp(6));
	}
	
	@Test
	public void testDanielChp7NumVerses(){
		assertEquals(Daniel.CHP7, DANIEL.getNumVersesInChp(7));
	}
	
	@Test
	public void testDanielChp8NumVerses(){
		assertEquals(Daniel.CHP8, DANIEL.getNumVersesInChp(8));
	}
	
	@Test
	public void testDanielChp9NumVerses(){
		assertEquals(Daniel.CHP9, DANIEL.getNumVersesInChp(9));
	}
	
	@Test
	public void testDanielChp10NumVerses(){
		assertEquals(Daniel.CHP10, DANIEL.getNumVersesInChp(10));
	}
	
	@Test
	public void testDanielChp11NumVerses(){
		assertEquals(Daniel.CHP11, DANIEL.getNumVersesInChp(11));
	}
	
	@Test
	public void testDanielChp12NumVerses(){
		assertEquals(Daniel.CHP12, DANIEL.getNumVersesInChp(12));
	}
	
	/*
	 * Hosea number of verses checks
	 */
	@Test
	public void testHoseaChp1NumVerses(){
		assertEquals(Hosea.CHP1, HOSEA.getNumVersesInChp(1));
	}
	
	@Test
	public void testHoseaChp2NumVerses(){
		assertEquals(Hosea.CHP2, HOSEA.getNumVersesInChp(2));
	}
	
	@Test
	public void testHoseaChp3NumVerses(){
		assertEquals(Hosea.CHP3, HOSEA.getNumVersesInChp(3));
	}
	
	@Test
	public void testHoseaChp4NumVerses(){
		assertEquals(Hosea.CHP4, HOSEA.getNumVersesInChp(4));
	}
	
	@Test
	public void testHoseaChp5NumVerses(){
		assertEquals(Hosea.CHP5, HOSEA.getNumVersesInChp(5));
	}
	
	@Test
	public void testHoseaChp6NumVerses(){
		assertEquals(Hosea.CHP6, HOSEA.getNumVersesInChp(6));
	}
	
	@Test
	public void testHoseaChp7NumVerses(){
		assertEquals(Hosea.CHP7, HOSEA.getNumVersesInChp(7));
	}
	
	@Test
	public void testHoseaChp8NumVerses(){
		assertEquals(Hosea.CHP8, HOSEA.getNumVersesInChp(8));
	}
	
	@Test
	public void testHoseaChp9NumVerses(){
		assertEquals(Hosea.CHP9, HOSEA.getNumVersesInChp(9));
	}
	
	@Test
	public void testHoseaChp10NumVerses(){
		assertEquals(Hosea.CHP10, HOSEA.getNumVersesInChp(10));
	}
	
	@Test
	public void testHoseaChp11NumVerses(){
		assertEquals(Hosea.CHP11, HOSEA.getNumVersesInChp(11));
	}
	
	@Test
	public void testHoseaChp12NumVerses(){
		assertEquals(Hosea.CHP12, HOSEA.getNumVersesInChp(12));
	}
	
	@Test
	public void testHoseaChp13NumVerses(){
		assertEquals(Hosea.CHP13, HOSEA.getNumVersesInChp(13));
	}
	
	@Test
	public void testHoseaChp14NumVerses(){
		assertEquals(Hosea.CHP14, HOSEA.getNumVersesInChp(14));
	}
	
	/*
	 * Joel number of verses checks
	 */
	@Test
	public void testJoelChp1NumVerses(){
		assertEquals(Joel.CHP1, JOEL.getNumVersesInChp(1));
	}
	
	@Test
	public void testJoelChp2NumVerses(){
		assertEquals(Joel.CHP2, JOEL.getNumVersesInChp(2));
	}
	
	@Test
	public void testJoelChp3NumVerses(){
		assertEquals(Joel.CHP3, JOEL.getNumVersesInChp(3));
	}
	
	/*
	 * Amos number of verses checks
	 */
	@Test
	public void testAmosChp1NumVerses(){
		assertEquals(Amos.CHP1, AMOS.getNumVersesInChp(1));
	}
	
	@Test
	public void testAmosChp2NumVerses(){
		assertEquals(Amos.CHP2, AMOS.getNumVersesInChp(2));
	}
	
	@Test
	public void testAmosChp3NumVerses(){
		assertEquals(Amos.CHP3, AMOS.getNumVersesInChp(3));
	}
	
	@Test
	public void testAmosChp4NumVerses(){
		assertEquals(Amos.CHP4, AMOS.getNumVersesInChp(4));
	}
	
	@Test
	public void testAmosChp5NumVerses(){
		assertEquals(Amos.CHP5, AMOS.getNumVersesInChp(5));
	}
	
	@Test
	public void testAmosChp6NumVerses(){
		assertEquals(Amos.CHP6, AMOS.getNumVersesInChp(6));
	}
	
	@Test
	public void testAmosChp7NumVerses(){
		assertEquals(Amos.CHP7, AMOS.getNumVersesInChp(7));
	}
	
	@Test
	public void testAmosChp8NumVerses(){
		assertEquals(Amos.CHP8, AMOS.getNumVersesInChp(8));
	}
	
	@Test
	public void testAmosChp9NumVerses(){
		assertEquals(Amos.CHP9, AMOS.getNumVersesInChp(9));
	}
	
	/*
	 * Obadiah number of verses checks
	 */
	@Test
	public void testObadiahChp1NumVerses(){
		assertEquals(Obadiah.CHP1, OBADIAH.getNumVersesInChp(1));
	}
	
	/*
	 * Jonah number of verses checks
	 */
	@Test
	public void testJonahChp1NumVerses(){
		assertEquals(Jonah.CHP1, JONAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testJonahChp2NumVerses(){
		assertEquals(Jonah.CHP2, JONAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testJonahChp3NumVerses(){
		assertEquals(Jonah.CHP3, JONAH.getNumVersesInChp(3));
	}
	
	@Test
	public void testJonahChp4NumVerses(){
		assertEquals(Jonah.CHP4, JONAH.getNumVersesInChp(4));
	}
	
	/*
	 * Micah number of verses checks
	 */
	@Test
	public void testMicahChp1NumVerses(){
		assertEquals(Micah.CHP1, MICAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testMicahChp2NumVerses(){
		assertEquals(Micah.CHP2, MICAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testMicahChp3NumVerses(){
		assertEquals(Micah.CHP3, MICAH.getNumVersesInChp(3));
	}
	
	@Test
	public void testMicahChp4NumVerses(){
		assertEquals(Micah.CHP4, MICAH.getNumVersesInChp(4));
	}
	
	@Test
	public void testMicahChp5NumVerses(){
		assertEquals(Micah.CHP5, MICAH.getNumVersesInChp(5));
	}
	
	@Test
	public void testMicahChp6NumVerses(){
		assertEquals(Micah.CHP6, MICAH.getNumVersesInChp(6));
	}
	
	@Test
	public void testMicahChp7NumVerses(){
		assertEquals(Micah.CHP7, MICAH.getNumVersesInChp(7));
	}
	
	/*
	 * Nahum number of verses checks
	 */
	@Test
	public void testNahumChp1NumVerses(){
		assertEquals(Nahum.CHP1, NAHUM.getNumVersesInChp(1));
	}
	
	@Test
	public void testNahumChp2NumVerses(){
		assertEquals(Nahum.CHP2, NAHUM.getNumVersesInChp(2));
	}
	
	@Test
	public void testNahumChp3NumVerses(){
		assertEquals(Nahum.CHP3, NAHUM.getNumVersesInChp(3));
	}
	
	/*
	 * Habakkuk number of verses checks
	 */
	@Test
	public void testHabakkukChp1NumVerses(){
		assertEquals(Habakkuk.CHP1, HABAKKUK.getNumVersesInChp(1));
	}
	
	@Test
	public void testHabakkukChp2NumVerses(){
		assertEquals(Habakkuk.CHP2, HABAKKUK.getNumVersesInChp(2));
	}
	
	@Test
	public void testHabakkukChp3NumVerses(){
		assertEquals(Habakkuk.CHP3, HABAKKUK.getNumVersesInChp(3));
	}
	
	/*
	 * Zephaniah number of verses checks
	 */
	@Test
	public void testZephaniahChp1NumVerses(){
		assertEquals(Zephaniah.CHP1, ZEPHANIAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testZephaniahChp2NumVerses(){
		assertEquals(Zephaniah.CHP2, ZEPHANIAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testZephaniahChp3NumVerses(){
		assertEquals(Zephaniah.CHP3, ZEPHANIAH.getNumVersesInChp(3));
	}
	
	/*
	 * Haggai number of verses checks
	 */
	@Test
	public void testHaggaiChp1NumVerses(){
		assertEquals(Haggai.CHP1, HAGGAI.getNumVersesInChp(1));
	}
	
	@Test
	public void testHaggaiChp2NumVerses(){
		assertEquals(Haggai.CHP2, HAGGAI.getNumVersesInChp(2));
	}
	
	/*
	 * Zechariah number of verses checks
	 */
	@Test
	public void testZechariahChp1NumVerses(){
		assertEquals(Zechariah.CHP1, ZECHARIAH.getNumVersesInChp(1));
	}
	
	@Test
	public void testZechariahChp2NumVerses(){
		assertEquals(Zechariah.CHP2, ZECHARIAH.getNumVersesInChp(2));
	}
	
	@Test
	public void testZechariahChp3NumVerses(){
		assertEquals(Zechariah.CHP3, ZECHARIAH.getNumVersesInChp(3));
	}
	
	@Test
	public void testZechariahChp4NumVerses(){
		assertEquals(Zechariah.CHP4, ZECHARIAH.getNumVersesInChp(4));
	}
	
	@Test
	public void testZechariahChp5NumVerses(){
		assertEquals(Zechariah.CHP5, ZECHARIAH.getNumVersesInChp(5));
	}
	
	@Test
	public void testZechariahChp6NumVerses(){
		assertEquals(Zechariah.CHP6, ZECHARIAH.getNumVersesInChp(6));
	}
	
	@Test
	public void testZechariahChp7NumVerses(){
		assertEquals(Zechariah.CHP7, ZECHARIAH.getNumVersesInChp(7));
	}
	
	@Test
	public void testZechariahChp8NumVerses(){
		assertEquals(Zechariah.CHP8, ZECHARIAH.getNumVersesInChp(8));
	}
	
	@Test
	public void testZechariahChp9NumVerses(){
		assertEquals(Zechariah.CHP9, ZECHARIAH.getNumVersesInChp(9));
	}
	
	@Test
	public void testZechariahChp10NumVerses(){
		assertEquals(Zechariah.CHP10, ZECHARIAH.getNumVersesInChp(10));
	}
	
	@Test
	public void testZechariahChp11NumVerses(){
		assertEquals(Zechariah.CHP11, ZECHARIAH.getNumVersesInChp(11));
	}
	
	@Test
	public void testZechariahChp12NumVerses(){
		assertEquals(Zechariah.CHP12, ZECHARIAH.getNumVersesInChp(12));
	}
	
	@Test
	public void testZechariahChp13NumVerses(){
		assertEquals(Zechariah.CHP13, ZECHARIAH.getNumVersesInChp(13));
	}
	
	@Test
	public void testZechariahChp14NumVerses(){
		assertEquals(Zechariah.CHP14, ZECHARIAH.getNumVersesInChp(14));
	}
	
	/*
	 * Malachi number of verses checks
	 */
	@Test
	public void testMalachiChp1NumVerses(){
		assertEquals(Malachi.CHP1, MALACHI.getNumVersesInChp(1));
	}
	
	@Test
	public void testMalachiChp2NumVerses(){
		assertEquals(Malachi.CHP2, MALACHI.getNumVersesInChp(2));
	}
	
	@Test
	public void testMalachiChp3NumVerses(){
		assertEquals(Malachi.CHP3, MALACHI.getNumVersesInChp(3));
	}
	
	@Test
	public void testMalachiChp4NumVerses(){
		assertEquals(Malachi.CHP4, MALACHI.getNumVersesInChp(4));
	}
	
	/*
	 * Matthew number of verses checks
	 */
	@Test
	public void testMatthewChp1NumVerses(){
		assertEquals(Matthew.CHP1, MATTHEW.getNumVersesInChp(1));
	}
	
	@Test
	public void testMatthewChp2NumVerses(){
		assertEquals(Matthew.CHP2, MATTHEW.getNumVersesInChp(2));
	}
	
	@Test
	public void testMatthewChp3NumVerses(){
		assertEquals(Matthew.CHP3, MATTHEW.getNumVersesInChp(3));
	}
	
	@Test
	public void testMatthewChp4NumVerses(){
		assertEquals(Matthew.CHP4, MATTHEW.getNumVersesInChp(4));
	}
	
	@Test
	public void testMatthewChp5NumVerses(){
		assertEquals(Matthew.CHP5, MATTHEW.getNumVersesInChp(5));
	}
	
	@Test
	public void testMatthewChp6NumVerses(){
		assertEquals(Matthew.CHP6, MATTHEW.getNumVersesInChp(6));
	}
	
	@Test
	public void testMatthewChp7NumVerses(){
		assertEquals(Matthew.CHP7, MATTHEW.getNumVersesInChp(7));
	}
	
	@Test
	public void testMatthewChp8NumVerses(){
		assertEquals(Matthew.CHP8, MATTHEW.getNumVersesInChp(8));
	}
	
	@Test
	public void testMatthewChp9NumVerses(){
		assertEquals(Matthew.CHP9, MATTHEW.getNumVersesInChp(9));
	}
	
	@Test
	public void testMatthewChp10NumVerses(){
		assertEquals(Matthew.CHP10, MATTHEW.getNumVersesInChp(10));
	}
	
	@Test
	public void testMatthewChp11NumVerses(){
		assertEquals(Matthew.CHP11, MATTHEW.getNumVersesInChp(11));
	}
	
	@Test
	public void testMatthewChp12NumVerses(){
		assertEquals(Matthew.CHP12, MATTHEW.getNumVersesInChp(12));
	}
	
	@Test
	public void testMatthewChp13NumVerses(){
		assertEquals(Matthew.CHP13, MATTHEW.getNumVersesInChp(13));
	}
	
	@Test
	public void testMatthewChp14NumVerses(){
		assertEquals(Matthew.CHP14, MATTHEW.getNumVersesInChp(14));
	}
	
	@Test
	public void testMatthewChp15NumVerses(){
		assertEquals(Matthew.CHP15, MATTHEW.getNumVersesInChp(15));
	}
	
	@Test
	public void testMatthewChp16NumVerses(){
		assertEquals(Matthew.CHP16, MATTHEW.getNumVersesInChp(16));
	}
	
	@Test
	public void testMatthewChp17NumVerses(){
		assertEquals(Matthew.CHP17, MATTHEW.getNumVersesInChp(17));
	}
	
	@Test
	public void testMatthewChp18NumVerses(){
		assertEquals(Matthew.CHP18, MATTHEW.getNumVersesInChp(18));
	}
	
	@Test
	public void testMatthewChp19NumVerses(){
		assertEquals(Matthew.CHP19, MATTHEW.getNumVersesInChp(19));
	}
	
	@Test
	public void testMatthewChp20NumVerses(){
		assertEquals(Matthew.CHP20, MATTHEW.getNumVersesInChp(20));
	}
	
	@Test
	public void testMatthewChp21NumVerses(){
		assertEquals(Matthew.CHP21, MATTHEW.getNumVersesInChp(21));
	}
	
	@Test
	public void testMatthewChp22NumVerses(){
		assertEquals(Matthew.CHP22, MATTHEW.getNumVersesInChp(22));
	}
	
	@Test
	public void testMatthewChp23NumVerses(){
		assertEquals(Matthew.CHP23, MATTHEW.getNumVersesInChp(23));
	}
	
	@Test
	public void testMatthewChp24NumVerses(){
		assertEquals(Matthew.CHP24, MATTHEW.getNumVersesInChp(24));
	}
	
	@Test
	public void testMatthewChp25NumVerses(){
		assertEquals(Matthew.CHP25, MATTHEW.getNumVersesInChp(25));
	}
	
	@Test
	public void testMatthewChp26NumVerses(){
		assertEquals(Matthew.CHP26, MATTHEW.getNumVersesInChp(26));
	}
	
	@Test
	public void testMatthewChp27NumVerses(){
		assertEquals(Matthew.CHP27, MATTHEW.getNumVersesInChp(27));
	}
	
	@Test
	public void testMatthewChp28NumVerses(){
		assertEquals(Matthew.CHP28, MATTHEW.getNumVersesInChp(28));
	}
	
	/*
	 * Mark number of verses checks
	 */
	@Test
	public void testMarkChp1NumVerses(){
		assertEquals(Mark.CHP1, MARK.getNumVersesInChp(1));
	}
	
	@Test
	public void testMarkChp2NumVerses(){
		assertEquals(Mark.CHP2, MARK.getNumVersesInChp(2));
	}
	
	@Test
	public void testMarkChp3NumVerses(){
		assertEquals(Mark.CHP3, MARK.getNumVersesInChp(3));
	}
	
	@Test
	public void testMarkChp4NumVerses(){
		assertEquals(Mark.CHP4, MARK.getNumVersesInChp(4));
	}
	
	@Test
	public void testMarkChp5NumVerses(){
		assertEquals(Mark.CHP5, MARK.getNumVersesInChp(5));
	}
	
	@Test
	public void testMarkChp6NumVerses(){
		assertEquals(Mark.CHP6, MARK.getNumVersesInChp(6));
	}
	
	@Test
	public void testMarkChp7NumVerses(){
		assertEquals(Mark.CHP7, MARK.getNumVersesInChp(7));
	}
	
	@Test
	public void testMarkChp8NumVerses(){
		assertEquals(Mark.CHP8, MARK.getNumVersesInChp(8));
	}
	
	@Test
	public void testMarkChp9NumVerses(){
		assertEquals(Mark.CHP9, MARK.getNumVersesInChp(9));
	}
	
	@Test
	public void testMarkChp10NumVerses(){
		assertEquals(Mark.CHP10, MARK.getNumVersesInChp(10));
	}
	
	@Test
	public void testMarkChp11NumVerses(){
		assertEquals(Mark.CHP11, MARK.getNumVersesInChp(11));
	}
	
	@Test
	public void testMarkChp12NumVerses(){
		assertEquals(Mark.CHP12, MARK.getNumVersesInChp(12));
	}
	
	@Test
	public void testMarkChp13NumVerses(){
		assertEquals(Mark.CHP13, MARK.getNumVersesInChp(13));
	}
	
	@Test
	public void testMarkChp14NumVerses(){
		assertEquals(Mark.CHP14, MARK.getNumVersesInChp(14));
	}
	
	@Test
	public void testMarkChp15NumVerses(){
		assertEquals(Mark.CHP15, MARK.getNumVersesInChp(15));
	}
	
	@Test
	public void testMarkChp16NumVerses(){
		assertEquals(Mark.CHP16, MARK.getNumVersesInChp(16));
	}
	
	/*
	 * Luke number of verses checks
	 */
	@Test
	public void testLukeChp1NumVerses(){
		assertEquals(Luke.CHP1, LUKE.getNumVersesInChp(1));
	}
	
	@Test
	public void testLukeChp2NumVerses(){
		assertEquals(Luke.CHP2, LUKE.getNumVersesInChp(2));
	}
	
	@Test
	public void testLukeChp3NumVerses(){
		assertEquals(Luke.CHP3, LUKE.getNumVersesInChp(3));
	}
	
	@Test
	public void testLukeChp4NumVerses(){
		assertEquals(Luke.CHP4, LUKE.getNumVersesInChp(4));
	}
	
	@Test
	public void testLukeChp5NumVerses(){
		assertEquals(Luke.CHP5, LUKE.getNumVersesInChp(5));
	}
	
	@Test
	public void testLukeChp6NumVerses(){
		assertEquals(Luke.CHP6, LUKE.getNumVersesInChp(6));
	}
	
	@Test
	public void testLukeChp7NumVerses(){
		assertEquals(Luke.CHP7, LUKE.getNumVersesInChp(7));
	}
	
	@Test
	public void testLukeChp8NumVerses(){
		assertEquals(Luke.CHP8, LUKE.getNumVersesInChp(8));
	}
	
	@Test
	public void testLukeChp9NumVerses(){
		assertEquals(Luke.CHP9, LUKE.getNumVersesInChp(9));
	}
	
	@Test
	public void testLukeChp10NumVerses(){
		assertEquals(Luke.CHP10, LUKE.getNumVersesInChp(10));
	}
	
	@Test
	public void testLukeChp11NumVerses(){
		assertEquals(Luke.CHP11, LUKE.getNumVersesInChp(11));
	}
	
	@Test
	public void testLukeChp12NumVerses(){
		assertEquals(Luke.CHP12, LUKE.getNumVersesInChp(12));
	}
	
	@Test
	public void testLukeChp13NumVerses(){
		assertEquals(Luke.CHP13, LUKE.getNumVersesInChp(13));
	}
	
	@Test
	public void testLukeChp14NumVerses(){
		assertEquals(Luke.CHP14, LUKE.getNumVersesInChp(14));
	}
	
	@Test
	public void testLukeChp15NumVerses(){
		assertEquals(Luke.CHP15, LUKE.getNumVersesInChp(15));
	}
	
	@Test
	public void testLukeChp16NumVerses(){
		assertEquals(Luke.CHP16, LUKE.getNumVersesInChp(16));
	}
	
	@Test
	public void testLukeChp17NumVerses(){
		assertEquals(Luke.CHP17, LUKE.getNumVersesInChp(17));
	}
	
	@Test
	public void testLukeChp18NumVerses(){
		assertEquals(Luke.CHP18, LUKE.getNumVersesInChp(18));
	}
	
	@Test
	public void testLukeChp19NumVerses(){
		assertEquals(Luke.CHP19, LUKE.getNumVersesInChp(19));
	}
	
	@Test
	public void testLukeChp20NumVerses(){
		assertEquals(Luke.CHP20, LUKE.getNumVersesInChp(20));
	}
	
	@Test
	public void testLukeChp21NumVerses(){
		assertEquals(Luke.CHP21, LUKE.getNumVersesInChp(21));
	}
	
	@Test
	public void testLukeChp22NumVerses(){
		assertEquals(Luke.CHP22, LUKE.getNumVersesInChp(22));
	}
	
	@Test
	public void testLukeChp23NumVerses(){
		assertEquals(Luke.CHP23, LUKE.getNumVersesInChp(23));
	}
	
	@Test
	public void testLukeChp24NumVerses(){
		assertEquals(Luke.CHP24, LUKE.getNumVersesInChp(24));
	}
	
	/*
	 * John number of verses checks
	 */
	@Test
	public void testJohnChp1NumVerses(){
		assertEquals(John.CHP1, JOHN.getNumVersesInChp(1));
	}
	
	@Test
	public void testJohnChp2NumVerses(){
		assertEquals(John.CHP2, JOHN.getNumVersesInChp(2));
	}
	
	@Test
	public void testJohnChp3NumVerses(){
		assertEquals(John.CHP3, JOHN.getNumVersesInChp(3));
	}
	
	@Test
	public void testJohnChp4NumVerses(){
		assertEquals(John.CHP4, JOHN.getNumVersesInChp(4));
	}
	
	@Test
	public void testJohnChp5NumVerses(){
		assertEquals(John.CHP5, JOHN.getNumVersesInChp(5));
	}
	
	@Test
	public void testJohnChp6NumVerses(){
		assertEquals(John.CHP6, JOHN.getNumVersesInChp(6));
	}
	
	@Test
	public void testJohnChp7NumVerses(){
		assertEquals(John.CHP7, JOHN.getNumVersesInChp(7));
	}
	
	@Test
	public void testJohnChp8NumVerses(){
		assertEquals(John.CHP8, JOHN.getNumVersesInChp(8));
	}
	
	@Test
	public void testJohnChp9NumVerses(){
		assertEquals(John.CHP9, JOHN.getNumVersesInChp(9));
	}
	
	@Test
	public void testJohnChp10NumVerses(){
		assertEquals(John.CHP10, JOHN.getNumVersesInChp(10));
	}
	
	@Test
	public void testJohnChp11NumVerses(){
		assertEquals(John.CHP11, JOHN.getNumVersesInChp(11));
	}
	
	@Test
	public void testJohnChp12NumVerses(){
		assertEquals(John.CHP12, JOHN.getNumVersesInChp(12));
	}
	
	@Test
	public void testJohnChp13NumVerses(){
		assertEquals(John.CHP13, JOHN.getNumVersesInChp(13));
	}
	
	@Test
	public void testJohnChp14NumVerses(){
		assertEquals(John.CHP14, JOHN.getNumVersesInChp(14));
	}
	
	@Test
	public void testJohnChp15NumVerses(){
		assertEquals(John.CHP15, JOHN.getNumVersesInChp(15));
	}
	
	@Test
	public void testJohnChp16NumVerses(){
		assertEquals(John.CHP16, JOHN.getNumVersesInChp(16));
	}
	
	@Test
	public void testJohnChp17NumVerses(){
		assertEquals(John.CHP17, JOHN.getNumVersesInChp(17));
	}
	
	@Test
	public void testJohnChp18NumVerses(){
		assertEquals(John.CHP18, JOHN.getNumVersesInChp(18));
	}
	
	@Test
	public void testJohnChp19NumVerses(){
		assertEquals(John.CHP19, JOHN.getNumVersesInChp(19));
	}
	
	@Test
	public void testJohnChp20NumVerses(){
		assertEquals(John.CHP20, JOHN.getNumVersesInChp(20));
	}
	
	@Test
	public void testJohnChp21NumVerses(){
		assertEquals(John.CHP21, JOHN.getNumVersesInChp(21));
	}
	
	/*
	 * Acts number of verses checks
	 */
	@Test
	public void testActsChp1NumVerses(){
		assertEquals(Acts.CHP1, ACTS.getNumVersesInChp(1));
	}
	
	@Test
	public void testActsChp2NumVerses(){
		assertEquals(Acts.CHP2, ACTS.getNumVersesInChp(2));
	}
	
	@Test
	public void testActsChp3NumVerses(){
		assertEquals(Acts.CHP3, ACTS.getNumVersesInChp(3));
	}
	
	@Test
	public void testActsChp4NumVerses(){
		assertEquals(Acts.CHP4, ACTS.getNumVersesInChp(4));
	}
	
	@Test
	public void testActsChp5NumVerses(){
		assertEquals(Acts.CHP5, ACTS.getNumVersesInChp(5));
	}
	
	@Test
	public void testActsChp6NumVerses(){
		assertEquals(Acts.CHP6, ACTS.getNumVersesInChp(6));
	}
	
	@Test
	public void testActsChp7NumVerses(){
		assertEquals(Acts.CHP7, ACTS.getNumVersesInChp(7));
	}
	
	@Test
	public void testActsChp8NumVerses(){
		assertEquals(Acts.CHP8, ACTS.getNumVersesInChp(8));
	}
	
	@Test
	public void testActsChp9NumVerses(){
		assertEquals(Acts.CHP9, ACTS.getNumVersesInChp(9));
	}
	
	@Test
	public void testActsChp10NumVerses(){
		assertEquals(Acts.CHP10, ACTS.getNumVersesInChp(10));
	}
	
	@Test
	public void testActsChp11NumVerses(){
		assertEquals(Acts.CHP11, ACTS.getNumVersesInChp(11));
	}
	
	@Test
	public void testActsChp12NumVerses(){
		assertEquals(Acts.CHP12, ACTS.getNumVersesInChp(12));
	}
	
	@Test
	public void testActsChp13NumVerses(){
		assertEquals(Acts.CHP13, ACTS.getNumVersesInChp(13));
	}
	
	@Test
	public void testActsChp14NumVerses(){
		assertEquals(Acts.CHP14, ACTS.getNumVersesInChp(14));
	}
	
	@Test
	public void testActsChp15NumVerses(){
		assertEquals(Acts.CHP15, ACTS.getNumVersesInChp(15));
	}
	
	@Test
	public void testActsChp16NumVerses(){
		assertEquals(Acts.CHP16, ACTS.getNumVersesInChp(16));
	}
	
	@Test
	public void testActsChp17NumVerses(){
		assertEquals(Acts.CHP17, ACTS.getNumVersesInChp(17));
	}
	
	@Test
	public void testActsChp18NumVerses(){
		assertEquals(Acts.CHP18, ACTS.getNumVersesInChp(18));
	}
	
	@Test
	public void testActsChp19NumVerses(){
		assertEquals(Acts.CHP19, ACTS.getNumVersesInChp(19));
	}
	
	@Test
	public void testActsChp20NumVerses(){
		assertEquals(Acts.CHP20, ACTS.getNumVersesInChp(20));
	}
	
	@Test
	public void testActsChp21NumVerses(){
		assertEquals(Acts.CHP21, ACTS.getNumVersesInChp(21));
	}
	
	@Test
	public void testActsChp22NumVerses(){
		assertEquals(Acts.CHP22, ACTS.getNumVersesInChp(22));
	}
	
	@Test
	public void testActsChp23NumVerses(){
		assertEquals(Acts.CHP23, ACTS.getNumVersesInChp(23));
	}
	
	@Test
	public void testActsChp24NumVerses(){
		assertEquals(Acts.CHP24, ACTS.getNumVersesInChp(24));
	}
	
	@Test
	public void testActsChp25NumVerses(){
		assertEquals(Acts.CHP25, ACTS.getNumVersesInChp(25));
	}
	
	@Test
	public void testActsChp26NumVerses(){
		assertEquals(Acts.CHP26, ACTS.getNumVersesInChp(26));
	}
	
	@Test
	public void testActsChp27NumVerses(){
		assertEquals(Acts.CHP27, ACTS.getNumVersesInChp(27));
	}
	
	@Test
	public void testActsChp28NumVerses(){
		assertEquals(Acts.CHP28, ACTS.getNumVersesInChp(28));
	}
	
	/*
	 * Romans number of verses checks
	 */
	@Test
	public void testRomansChp1NumVerses(){
		assertEquals(Romans.CHP1, ROMANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testRomansChp2NumVerses(){
		assertEquals(Romans.CHP2, ROMANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testRomansChp3NumVerses(){
		assertEquals(Romans.CHP3, ROMANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testRomansChp4NumVerses(){
		assertEquals(Romans.CHP4, ROMANS.getNumVersesInChp(4));
	}
	
	@Test
	public void testRomansChp5NumVerses(){
		assertEquals(Romans.CHP5, ROMANS.getNumVersesInChp(5));
	}
	
	@Test
	public void testRomansChp6NumVerses(){
		assertEquals(Romans.CHP6, ROMANS.getNumVersesInChp(6));
	}
	
	@Test
	public void testRomansChp7NumVerses(){
		assertEquals(Romans.CHP7, ROMANS.getNumVersesInChp(7));
	}
	
	@Test
	public void testRomansChp8NumVerses(){
		assertEquals(Romans.CHP8, ROMANS.getNumVersesInChp(8));
	}
	
	@Test
	public void testRomansChp9NumVerses(){
		assertEquals(Romans.CHP9, ROMANS.getNumVersesInChp(9));
	}
	
	@Test
	public void testRomansChp10NumVerses(){
		assertEquals(Romans.CHP10, ROMANS.getNumVersesInChp(10));
	}
	
	@Test
	public void testRomansChp11NumVerses(){
		assertEquals(Romans.CHP11, ROMANS.getNumVersesInChp(11));
	}
	
	@Test
	public void testRomansChp12NumVerses(){
		assertEquals(Romans.CHP12, ROMANS.getNumVersesInChp(12));
	}
	
	@Test
	public void testRomansChp13NumVerses(){
		assertEquals(Romans.CHP13, ROMANS.getNumVersesInChp(13));
	}
	
	@Test
	public void testRomansChp14NumVerses(){
		assertEquals(Romans.CHP14, ROMANS.getNumVersesInChp(14));
	}
	
	@Test
	public void testRomansChp15NumVerses(){
		assertEquals(Romans.CHP15, ROMANS.getNumVersesInChp(15));
	}
	
	@Test
	public void testRomansChp16NumVerses(){
		assertEquals(Romans.CHP16, ROMANS.getNumVersesInChp(16));
	}
	
	/*
	 * 1 Corinthians number of verses checks
	 */
	@Test
	public void test1CorinthiansChp1NumVerses(){
		assertEquals(FirstCorinthians.CHP1, FIRST_CORINTHIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void test1CorinthiansChp2NumVerses(){
		assertEquals(FirstCorinthians.CHP2, FIRST_CORINTHIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void test1CorinthiansChp3NumVerses(){
		assertEquals(FirstCorinthians.CHP3, FIRST_CORINTHIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void test1CorinthiansChp4NumVerses(){
		assertEquals(FirstCorinthians.CHP4, FIRST_CORINTHIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void test1CorinthiansChp5NumVerses(){
		assertEquals(FirstCorinthians.CHP5, FIRST_CORINTHIANS.getNumVersesInChp(5));
	}
	
	@Test
	public void test1CorinthiansChp6NumVerses(){
		assertEquals(FirstCorinthians.CHP6, FIRST_CORINTHIANS.getNumVersesInChp(6));
	}
	
	@Test
	public void test1CorinthiansChp7NumVerses(){
		assertEquals(FirstCorinthians.CHP7, FIRST_CORINTHIANS.getNumVersesInChp(7));
	}
	
	@Test
	public void test1CorinthiansChp8NumVerses(){
		assertEquals(FirstCorinthians.CHP8, FIRST_CORINTHIANS.getNumVersesInChp(8));
	}
	
	@Test
	public void test1CorinthiansChp9NumVerses(){
		assertEquals(FirstCorinthians.CHP9, FIRST_CORINTHIANS.getNumVersesInChp(9));
	}
	
	@Test
	public void test1CorinthiansChp10NumVerses(){
		assertEquals(FirstCorinthians.CHP10, FIRST_CORINTHIANS.getNumVersesInChp(10));
	}
	
	@Test
	public void test1CorinthiansChp11NumVerses(){
		assertEquals(FirstCorinthians.CHP11, FIRST_CORINTHIANS.getNumVersesInChp(11));
	}
	
	@Test
	public void test1CorinthiansChp12NumVerses(){
		assertEquals(FirstCorinthians.CHP12, FIRST_CORINTHIANS.getNumVersesInChp(12));
	}
	
	@Test
	public void test1CorinthiansChp13NumVerses(){
		assertEquals(FirstCorinthians.CHP13, FIRST_CORINTHIANS.getNumVersesInChp(13));
	}
	
	@Test
	public void test1CorinthiansChp14NumVerses(){
		assertEquals(FirstCorinthians.CHP14, FIRST_CORINTHIANS.getNumVersesInChp(14));
	}
	
	@Test
	public void test1CorinthiansChp15NumVerses(){
		assertEquals(FirstCorinthians.CHP15, FIRST_CORINTHIANS.getNumVersesInChp(15));
	}
	
	@Test
	public void test1CorinthiansChp16NumVerses(){
		assertEquals(FirstCorinthians.CHP16, FIRST_CORINTHIANS.getNumVersesInChp(16));
	}
	
	/*
	 * 2 Corinthians number of verses checks
	 */
	@Test
	public void test2CorinthiansChp1NumVerses(){
		assertEquals(SecondCorinthians.CHP1, SECOND_CORINTHIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void test2CorinthiansChp2NumVerses(){
		assertEquals(SecondCorinthians.CHP2, SECOND_CORINTHIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void test2CorinthiansChp3NumVerses(){
		assertEquals(SecondCorinthians.CHP3, SECOND_CORINTHIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void test2CorinthiansChp4NumVerses(){
		assertEquals(SecondCorinthians.CHP4, SECOND_CORINTHIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void test2CorinthiansChp5NumVerses(){
		assertEquals(SecondCorinthians.CHP5, SECOND_CORINTHIANS.getNumVersesInChp(5));
	}
	
	@Test
	public void test2CorinthiansChp6NumVerses(){
		assertEquals(SecondCorinthians.CHP6, SECOND_CORINTHIANS.getNumVersesInChp(6));
	}
	
	@Test
	public void test2CorinthiansChp7NumVerses(){
		assertEquals(SecondCorinthians.CHP7, SECOND_CORINTHIANS.getNumVersesInChp(7));
	}
	
	@Test
	public void test2CorinthiansChp8NumVerses(){
		assertEquals(SecondCorinthians.CHP8, SECOND_CORINTHIANS.getNumVersesInChp(8));
	}
	
	@Test
	public void test2CorinthiansChp9NumVerses(){
		assertEquals(SecondCorinthians.CHP9, SECOND_CORINTHIANS.getNumVersesInChp(9));
	}
	
	@Test
	public void test2CorinthiansChp10NumVerses(){
		assertEquals(SecondCorinthians.CHP10, SECOND_CORINTHIANS.getNumVersesInChp(10));
	}
	
	@Test
	public void test2CorinthiansChp11NumVerses(){
		assertEquals(SecondCorinthians.CHP11, SECOND_CORINTHIANS.getNumVersesInChp(11));
	}
	
	@Test
	public void test2CorinthiansChp12NumVerses(){
		assertEquals(SecondCorinthians.CHP12, SECOND_CORINTHIANS.getNumVersesInChp(12));
	}
	
	@Test
	public void test2CorinthiansChp13NumVerses(){
		assertEquals(SecondCorinthians.CHP13, SECOND_CORINTHIANS.getNumVersesInChp(13));
	}
	
	/*
	 * Galatians number of verses checks
	 */
	@Test
	public void testGalatiansChp1NumVerses(){
		assertEquals(Galatians.CHP1, GALATIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testGalatiansChp2NumVerses(){
		assertEquals(Galatians.CHP2, GALATIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testGalatiansChp3NumVerses(){
		assertEquals(Galatians.CHP3, GALATIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testGalatiansChp4NumVerses(){
		assertEquals(Galatians.CHP4, GALATIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void testGalatiansChp5NumVerses(){
		assertEquals(Galatians.CHP5, GALATIANS.getNumVersesInChp(5));
	}
	
	@Test
	public void testGalatiansChp6NumVerses(){
		assertEquals(Galatians.CHP6, GALATIANS.getNumVersesInChp(6));
	}
	
	/*
	 * Ephesians number of verses checks
	 */
	@Test
	public void testEphesiansChp1NumVerses(){
		assertEquals(Ephesians.CHP1, EPHESIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testEphesiansChp2NumVerses(){
		assertEquals(Ephesians.CHP2, EPHESIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testEphesiansChp3NumVerses(){
		assertEquals(Ephesians.CHP3, EPHESIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testEphesiansChp4NumVerses(){
		assertEquals(Ephesians.CHP4, EPHESIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void testEphesiansChp5NumVerses(){
		assertEquals(Ephesians.CHP5, EPHESIANS.getNumVersesInChp(5));
	}
	
	@Test
	public void testEphesiansChp6NumVerses(){
		assertEquals(Ephesians.CHP6, EPHESIANS.getNumVersesInChp(6));
	}
	
	/*
	 * Philippians number of verses checks
	 */
	@Test
	public void testPhilippiansChp1NumVerses(){
		assertEquals(Philippians.CHP1, PHILIPPIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testPhilippiansChp2NumVerses(){
		assertEquals(Philippians.CHP2, PHILIPPIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testPhilippiansChp3NumVerses(){
		assertEquals(Philippians.CHP3, PHILIPPIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testPhilippiansChp4NumVerses(){
		assertEquals(Philippians.CHP4, PHILIPPIANS.getNumVersesInChp(4));
	}
	
	/*
	 * Colossians number of verses checks
	 */
	@Test
	public void testColossiansChp1NumVerses(){
		assertEquals(Colossians.CHP1, COLOSSIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void testColossiansChp2NumVerses(){
		assertEquals(Colossians.CHP2, COLOSSIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void testColossiansChp3NumVerses(){
		assertEquals(Colossians.CHP3, COLOSSIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void testColossiansChp4NumVerses(){
		assertEquals(Colossians.CHP4, COLOSSIANS.getNumVersesInChp(4));
	}
	
	/*
	 * 1 Thessalonians number of verses checks
	 */
	@Test
	public void test1ThessaloniansChp1NumVerses(){
		assertEquals(FirstThessalonians.CHP1, FIRST_THESSALONIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void test1ThessaloniansChp2NumVerses(){
		assertEquals(FirstThessalonians.CHP2, FIRST_THESSALONIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void test1ThessaloniansChp3NumVerses(){
		assertEquals(FirstThessalonians.CHP3, FIRST_THESSALONIANS.getNumVersesInChp(3));
	}
	
	@Test
	public void test1ThessaloniansChp4NumVerses(){
		assertEquals(FirstThessalonians.CHP4, FIRST_THESSALONIANS.getNumVersesInChp(4));
	}
	
	@Test
	public void test1ThessaloniansChp5NumVerses(){
		assertEquals(FirstThessalonians.CHP5, FIRST_THESSALONIANS.getNumVersesInChp(5));
	}
	
	/*
	 * 2 Thessalonians number of verses checks
	 */
	@Test
	public void test2ThessaloniansChp1NumVerses(){
		assertEquals(SecondThessalonians.CHP1, SECOND_THESSALONIANS.getNumVersesInChp(1));
	}
	
	@Test
	public void test2ThessaloniansChp2NumVerses(){
		assertEquals(SecondThessalonians.CHP2, SECOND_THESSALONIANS.getNumVersesInChp(2));
	}
	
	@Test
	public void test2ThessaloniansChp3NumVerses(){
		assertEquals(SecondThessalonians.CHP3, SECOND_THESSALONIANS.getNumVersesInChp(3));
	}
	
	/*
	 * 1 Timothy number of verses checks
	 */
	@Test
	public void test1TimothyChp1NumVerses(){
		assertEquals(FirstTimothy.CHP1, FIRST_TIMOTHY.getNumVersesInChp(1));
	}
	
	@Test
	public void test1TimothyChp2NumVerses(){
		assertEquals(FirstTimothy.CHP2, FIRST_TIMOTHY.getNumVersesInChp(2));
	}
	
	@Test
	public void test1TimothyChp3NumVerses(){
		assertEquals(FirstTimothy.CHP3, FIRST_TIMOTHY.getNumVersesInChp(3));
	}
	
	@Test
	public void test1TimothyChp4NumVerses(){
		assertEquals(FirstTimothy.CHP4, FIRST_TIMOTHY.getNumVersesInChp(4));
	}
	
	@Test
	public void test1TimothyChp5NumVerses(){
		assertEquals(FirstTimothy.CHP5, FIRST_TIMOTHY.getNumVersesInChp(5));
	}
	
	@Test
	public void test1TimothyChp6NumVerses(){
		assertEquals(FirstTimothy.CHP6, FIRST_TIMOTHY.getNumVersesInChp(6));
	}
	
	/*
	 * 2 Timothy number of verses checks
	 */
	@Test
	public void test2TimothyChp1NumVerses(){
		assertEquals(SecondTimothy.CHP1, SECOND_TIMOTHY.getNumVersesInChp(1));
	}
	
	@Test
	public void test2TimothyChp2NumVerses(){
		assertEquals(SecondTimothy.CHP2, SECOND_TIMOTHY.getNumVersesInChp(2));
	}
	
	@Test
	public void test2TimothyChp3NumVerses(){
		assertEquals(SecondTimothy.CHP3, SECOND_TIMOTHY.getNumVersesInChp(3));
	}
	
	@Test
	public void test2TimothyChp4NumVerses(){
		assertEquals(SecondTimothy.CHP4, SECOND_TIMOTHY.getNumVersesInChp(4));
	}
	
	/*
	 * Titus number of verses checks
	 */
	@Test
	public void testTitusChp1NumVerses(){
		assertEquals(Titus.CHP1, TITUS.getNumVersesInChp(1));
	}
	
	@Test
	public void testTitusChp2NumVerses(){
		assertEquals(Titus.CHP2, TITUS.getNumVersesInChp(2));
	}
	
	@Test
	public void testTitusChp3NumVerses(){
		assertEquals(Titus.CHP3, TITUS.getNumVersesInChp(3));
	}
	
	/*
	 * Philemon number of verses checks
	 */
	@Test
	public void testPhilemonChp1NumVerses(){
		assertEquals(Philemon.CHP1, PHILEMON.getNumVersesInChp(1));
	}
	
	/*
	 * Hebrews number of verses checks
	 */
	@Test
	public void testHebrewsChp1NumVerses(){
		assertEquals(Hebrews.CHP1, HEBREWS.getNumVersesInChp(1));
	}
	
	@Test
	public void testHebrewsChp2NumVerses(){
		assertEquals(Hebrews.CHP2, HEBREWS.getNumVersesInChp(2));
	}
	
	@Test
	public void testHebrewsChp3NumVerses(){
		assertEquals(Hebrews.CHP3, HEBREWS.getNumVersesInChp(3));
	}
	
	@Test
	public void testHebrewsChp4NumVerses(){
		assertEquals(Hebrews.CHP4, HEBREWS.getNumVersesInChp(4));
	}
	
	@Test
	public void testHebrewsChp5NumVerses(){
		assertEquals(Hebrews.CHP5, HEBREWS.getNumVersesInChp(5));
	}
	
	@Test
	public void testHebrewsChp6NumVerses(){
		assertEquals(Hebrews.CHP6, HEBREWS.getNumVersesInChp(6));
	}
	
	@Test
	public void testHebrewsChp7NumVerses(){
		assertEquals(Hebrews.CHP7, HEBREWS.getNumVersesInChp(7));
	}
	
	@Test
	public void testHebrewsChp8NumVerses(){
		assertEquals(Hebrews.CHP8, HEBREWS.getNumVersesInChp(8));
	}
	
	@Test
	public void testHebrewsChp9NumVerses(){
		assertEquals(Hebrews.CHP9, HEBREWS.getNumVersesInChp(9));
	}
	
	@Test
	public void testHebrewsChp10NumVerses(){
		assertEquals(Hebrews.CHP10, HEBREWS.getNumVersesInChp(10));
	}
	
	@Test
	public void testHebrewsChp11NumVerses(){
		assertEquals(Hebrews.CHP11, HEBREWS.getNumVersesInChp(11));
	}
	
	@Test
	public void testHebrewsChp12NumVerses(){
		assertEquals(Hebrews.CHP12, HEBREWS.getNumVersesInChp(12));
	}
	
	@Test
	public void testHebrewsChp13NumVerses(){
		assertEquals(Hebrews.CHP13, HEBREWS.getNumVersesInChp(13));
	}
	
	/*
	 * James number of verses checks
	 */
	@Test
	public void testJamesChp1NumVerses(){
		assertEquals(James.CHP1, JAMES.getNumVersesInChp(1));
	}
	
	@Test
	public void testJamesChp2NumVerses(){
		assertEquals(James.CHP2, JAMES.getNumVersesInChp(2));
	}
	
	@Test
	public void testJamesChp3NumVerses(){
		assertEquals(James.CHP3, JAMES.getNumVersesInChp(3));
	}
	
	@Test
	public void testJamesChp4NumVerses(){
		assertEquals(James.CHP4, JAMES.getNumVersesInChp(4));
	}
	
	@Test
	public void testJamesChp5NumVerses(){
		assertEquals(James.CHP5, JAMES.getNumVersesInChp(5));
	}
	
	/*
	 * 1 Peter number of verses checks
	 */
	@Test
	public void test1PeterChp1NumVerses(){
		assertEquals(FirstPeter.CHP1, FIRST_PETER.getNumVersesInChp(1));
	}
	
	@Test
	public void test1PeterChp2NumVerses(){
		assertEquals(FirstPeter.CHP2, FIRST_PETER.getNumVersesInChp(2));
	}
	
	@Test
	public void test1PeterChp3NumVerses(){
		assertEquals(FirstPeter.CHP3, FIRST_PETER.getNumVersesInChp(3));
	}
	
	@Test
	public void test1PeterChp4NumVerses(){
		assertEquals(FirstPeter.CHP4, FIRST_PETER.getNumVersesInChp(4));
	}
	
	@Test
	public void test1PeterChp5NumVerses(){
		assertEquals(FirstPeter.CHP5, FIRST_PETER.getNumVersesInChp(5));
	}
	
	/*
	 * 2 Peter number of verses checks
	 */
	@Test
	public void test2PeterChp1NumVerses(){
		assertEquals(SecondPeter.CHP1, SECOND_PETER.getNumVersesInChp(1));
	}
	
	@Test
	public void test2PeterChp2NumVerses(){
		assertEquals(SecondPeter.CHP2, SECOND_PETER.getNumVersesInChp(2));
	}
	
	@Test
	public void test2PeterChp3NumVerses(){
		assertEquals(SecondPeter.CHP3, SECOND_PETER.getNumVersesInChp(3));
	}
	
	/*
	 * 1 John number of verses checks
	 */
	@Test
	public void test1JohnChp1NumVerses(){
		assertEquals(FirstJohn.CHP1, FIRST_JOHN.getNumVersesInChp(1));
	}
	
	@Test
	public void test1JohnChp2NumVerses(){
		assertEquals(FirstJohn.CHP2, FIRST_JOHN.getNumVersesInChp(2));
	}
	
	@Test
	public void test1JohnChp3NumVerses(){
		assertEquals(FirstJohn.CHP3, FIRST_JOHN.getNumVersesInChp(3));
	}
	
	@Test
	public void test1JohnChp4NumVerses(){
		assertEquals(FirstJohn.CHP4, FIRST_JOHN.getNumVersesInChp(4));
	}
	
	@Test
	public void test1JohnChp5NumVerses(){
		assertEquals(FirstJohn.CHP5, FIRST_JOHN.getNumVersesInChp(5));
	}
	
	/*
	 * 2 John number of verses checks
	 */
	@Test
	public void test2JohnChp1NumVerses(){
		assertEquals(SecondJohn.CHP1, SECOND_JOHN.getNumVersesInChp(1));
	}
	
	/*
	 * 3 John number of verses checks
	 */
	@Test
	public void test3JohnChp1NumVerses(){
		assertEquals(ThirdJohn.CHP1, THIRD_JOHN.getNumVersesInChp(1));
	}
	
	/*
	 * Jude number of verses checks
	 */
	@Test
	public void testJudeChp1NumVerses(){
		assertEquals(Jude.CHP1, JUDE.getNumVersesInChp(1));
	}
	
	/*
	 * Revelation number of verses checks
	 */
	@Test
	public void testRevelationChp1NumVerses(){
		assertEquals(Revelation.CHP1, REVELATION.getNumVersesInChp(1));
	}
	
	@Test
	public void testRevelationChp2NumVerses(){
		assertEquals(Revelation.CHP2, REVELATION.getNumVersesInChp(2));
	}
	
	@Test
	public void testRevelationChp3NumVerses(){
		assertEquals(Revelation.CHP3, REVELATION.getNumVersesInChp(3));
	}
	
	@Test
	public void testRevelationChp4NumVerses(){
		assertEquals(Revelation.CHP4, REVELATION.getNumVersesInChp(4));
	}
	
	@Test
	public void testRevelationChp5NumVerses(){
		assertEquals(Revelation.CHP5, REVELATION.getNumVersesInChp(5));
	}
	
	@Test
	public void testRevelationChp6NumVerses(){
		assertEquals(Revelation.CHP6, REVELATION.getNumVersesInChp(6));
	}
	
	@Test
	public void testRevelationChp7NumVerses(){
		assertEquals(Revelation.CHP7, REVELATION.getNumVersesInChp(7));
	}
	
	@Test
	public void testRevelationChp8NumVerses(){
		assertEquals(Revelation.CHP8, REVELATION.getNumVersesInChp(8));
	}
	
	@Test
	public void testRevelationChp9NumVerses(){
		assertEquals(Revelation.CHP9, REVELATION.getNumVersesInChp(9));
	}
	
	@Test
	public void testRevelationChp10NumVerses(){
		assertEquals(Revelation.CHP10, REVELATION.getNumVersesInChp(10));
	}
	
	@Test
	public void testRevelationChp11NumVerses(){
		assertEquals(Revelation.CHP11, REVELATION.getNumVersesInChp(11));
	}
	
	@Test
	public void testRevelationChp12NumVerses(){
		assertEquals(Revelation.CHP12, REVELATION.getNumVersesInChp(12));
	}
	
	@Test
	public void testRevelationChp13NumVerses(){
		assertEquals(Revelation.CHP13, REVELATION.getNumVersesInChp(13));
	}
	
	@Test
	public void testRevelationChp14NumVerses(){
		assertEquals(Revelation.CHP14, REVELATION.getNumVersesInChp(14));
	}
	
	@Test
	public void testRevelationChp15NumVerses(){
		assertEquals(Revelation.CHP15, REVELATION.getNumVersesInChp(15));
	}
	
	@Test
	public void testRevelationChp16NumVerses(){
		assertEquals(Revelation.CHP16, REVELATION.getNumVersesInChp(16));
	}
	
	@Test
	public void testRevelationChp17NumVerses(){
		assertEquals(Revelation.CHP17, REVELATION.getNumVersesInChp(17));
	}
	
	@Test
	public void testRevelationChp18NumVerses(){
		assertEquals(Revelation.CHP18, REVELATION.getNumVersesInChp(18));
	}
	
	@Test
	public void testRevelationChp19NumVerses(){
		assertEquals(Revelation.CHP19, REVELATION.getNumVersesInChp(19));
	}
	
	@Test
	public void testRevelationChp20NumVerses(){
		assertEquals(Revelation.CHP20, REVELATION.getNumVersesInChp(20));
	}
	
	@Test
	public void testRevelationChp21NumVerses(){
		assertEquals(Revelation.CHP21, REVELATION.getNumVersesInChp(21));
	}
	
	@Test
	public void testRevelationChp22NumVerses(){
		assertEquals(Revelation.CHP22, REVELATION.getNumVersesInChp(22));
	}
	
}
