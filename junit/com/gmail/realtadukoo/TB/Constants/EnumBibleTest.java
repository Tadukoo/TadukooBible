package com.gmail.realtadukoo.TB.Constants;

import static com.gmail.realtadukoo.TB.Constants.EnumBible.*;
import static org.junit.Assert.assertEquals;

import com.gmail.realtadukoo.TB.Constants.Verses.*;
import org.junit.Test;

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
		assertEquals(Genesis.CHP1, GENESIS.getNum(1));
	}
	
	@Test
	public void testGenesisChp2NumVerses(){
		assertEquals(Genesis.CHP2, GENESIS.getNum(2));
	}
	
	@Test
	public void testGenesisChp3NumVerses(){
		assertEquals(Genesis.CHP3, GENESIS.getNum(3));
	}
	
	@Test
	public void testGenesisChp4NumVerses(){
		assertEquals(Genesis.CHP4, GENESIS.getNum(4));
	}
	
	@Test
	public void testGenesisChp5NumVerses(){
		assertEquals(Genesis.CHP5, GENESIS.getNum(5));
	}
	
	@Test
	public void testGenesisChp6NumVerses(){
		assertEquals(Genesis.CHP6, GENESIS.getNum(6));
	}
	
	@Test
	public void testGenesisChp7NumVerses(){
		assertEquals(Genesis.CHP7, GENESIS.getNum(7));
	}
	
	@Test
	public void testGenesisChp8NumVerses(){
		assertEquals(Genesis.CHP8, GENESIS.getNum(8));
	}
	
	@Test
	public void testGenesisChp9NumVerses(){
		assertEquals(Genesis.CHP9, GENESIS.getNum(9));
	}
	
	@Test
	public void testGenesisChp10NumVerses(){
		assertEquals(Genesis.CHP10, GENESIS.getNum(10));
	}
	
	@Test
	public void testGenesisChp11NumVerses(){
		assertEquals(Genesis.CHP11, GENESIS.getNum(11));
	}
	
	@Test
	public void testGenesisChp12NumVerses(){
		assertEquals(Genesis.CHP12, GENESIS.getNum(12));
	}
	
	@Test
	public void testGenesisChp13NumVerses(){
		assertEquals(Genesis.CHP13, GENESIS.getNum(13));
	}
	
	@Test
	public void testGenesisChp14NumVerses(){
		assertEquals(Genesis.CHP14, GENESIS.getNum(14));
	}
	
	@Test
	public void testGenesisChp15NumVerses(){
		assertEquals(Genesis.CHP15, GENESIS.getNum(15));
	}
	
	@Test
	public void testGenesisChp16NumVerses(){
		assertEquals(Genesis.CHP16, GENESIS.getNum(16));
	}
	
	@Test
	public void testGenesisChp17NumVerses(){
		assertEquals(Genesis.CHP17, GENESIS.getNum(17));
	}
	
	@Test
	public void testGenesisChp18NumVerses(){
		assertEquals(Genesis.CHP18, GENESIS.getNum(18));
	}
	
	@Test
	public void testGenesisChp19NumVerses(){
		assertEquals(Genesis.CHP19, GENESIS.getNum(19));
	}
	
	@Test
	public void testGenesisChp20NumVerses(){
		assertEquals(Genesis.CHP20, GENESIS.getNum(20));
	}
	
	@Test
	public void testGenesisChp21NumVerses(){
		assertEquals(Genesis.CHP21, GENESIS.getNum(21));
	}
	
	@Test
	public void testGenesisChp22NumVerses(){
		assertEquals(Genesis.CHP22, GENESIS.getNum(22));
	}
	
	@Test
	public void testGenesisChp23NumVerses(){
		assertEquals(Genesis.CHP23, GENESIS.getNum(23));
	}
	
	@Test
	public void testGenesisChp24NumVerses(){
		assertEquals(Genesis.CHP24, GENESIS.getNum(24));
	}
	
	@Test
	public void testGenesisChp25NumVerses(){
		assertEquals(Genesis.CHP25, GENESIS.getNum(25));
	}
	
	@Test
	public void testGenesisChp26NumVerses(){
		assertEquals(Genesis.CHP26, GENESIS.getNum(26));
	}
	
	@Test
	public void testGenesisChp27NumVerses(){
		assertEquals(Genesis.CHP27, GENESIS.getNum(27));
	}
	
	@Test
	public void testGenesisChp28NumVerses(){
		assertEquals(Genesis.CHP28, GENESIS.getNum(28));
	}
	
	@Test
	public void testGenesisChp29NumVerses(){
		assertEquals(Genesis.CHP29, GENESIS.getNum(29));
	}
	
	@Test
	public void testGenesisChp30NumVerses(){
		assertEquals(Genesis.CHP30, GENESIS.getNum(30));
	}
	
	@Test
	public void testGenesisChp31NumVerses(){
		assertEquals(Genesis.CHP31, GENESIS.getNum(31));
	}
	
	@Test
	public void testGenesisChp32NumVerses(){
		assertEquals(Genesis.CHP32, GENESIS.getNum(32));
	}
	
	@Test
	public void testGenesisChp33NumVerses(){
		assertEquals(Genesis.CHP33, GENESIS.getNum(33));
	}
	
	@Test
	public void testGenesisChp34NumVerses(){
		assertEquals(Genesis.CHP34, GENESIS.getNum(34));
	}
	
	@Test
	public void testGenesisChp35NumVerses(){
		assertEquals(Genesis.CHP35, GENESIS.getNum(35));
	}
	
	@Test
	public void testGenesisChp36NumVerses(){
		assertEquals(Genesis.CHP36, GENESIS.getNum(36));
	}
	
	@Test
	public void testGenesisChp37NumVerses(){
		assertEquals(Genesis.CHP37, GENESIS.getNum(37));
	}
	
	@Test
	public void testGenesisChp38NumVerses(){
		assertEquals(Genesis.CHP38, GENESIS.getNum(38));
	}
	
	@Test
	public void testGenesisChp39NumVerses(){
		assertEquals(Genesis.CHP39, GENESIS.getNum(39));
	}
	
	@Test
	public void testGenesisChp40NumVerses(){
		assertEquals(Genesis.CHP40, GENESIS.getNum(40));
	}
	
	@Test
	public void testGenesisChp41NumVerses(){
		assertEquals(Genesis.CHP41, GENESIS.getNum(41));
	}
	
	@Test
	public void testGenesisChp42NumVerses(){
		assertEquals(Genesis.CHP42, GENESIS.getNum(42));
	}
	
	@Test
	public void testGenesisChp43NumVerses(){
		assertEquals(Genesis.CHP43, GENESIS.getNum(43));
	}
	
	@Test
	public void testGenesisChp44NumVerses(){
		assertEquals(Genesis.CHP44, GENESIS.getNum(44));
	}
	
	@Test
	public void testGenesisChp45NumVerses(){
		assertEquals(Genesis.CHP45, GENESIS.getNum(45));
	}
	
	@Test
	public void testGenesisChp46NumVerses(){
		assertEquals(Genesis.CHP46, GENESIS.getNum(46));
	}
	
	@Test
	public void testGenesisChp47NumVerses(){
		assertEquals(Genesis.CHP47, GENESIS.getNum(47));
	}
	
	@Test
	public void testGenesisChp48NumVerses(){
		assertEquals(Genesis.CHP48, GENESIS.getNum(48));
	}
	
	@Test
	public void testGenesisChp49NumVerses(){
		assertEquals(Genesis.CHP49, GENESIS.getNum(49));
	}
	
	@Test
	public void testGenesisChp50NumVerses(){
		assertEquals(Genesis.CHP50, GENESIS.getNum(50));
	}
	
	/*
	 * Exodus number of verses checks
	 */
	@Test
	public void testExodusChp1NumVerses(){
		assertEquals(Exodus.CHP1, EXODUS.getNum(1));
	}
	
	@Test
	public void testExodusChp2NumVerses(){
		assertEquals(Exodus.CHP2, EXODUS.getNum(2));
	}
	
	@Test
	public void testExodusChp3NumVerses(){
		assertEquals(Exodus.CHP3, EXODUS.getNum(3));
	}
	
	@Test
	public void testExodusChp4NumVerses(){
		assertEquals(Exodus.CHP4, EXODUS.getNum(4));
	}
	
	@Test
	public void testExodusChp5NumVerses(){
		assertEquals(Exodus.CHP5, EXODUS.getNum(5));
	}
	
	@Test
	public void testExodusChp6NumVerses(){
		assertEquals(Exodus.CHP6, EXODUS.getNum(6));
	}
	
	@Test
	public void testExodusChp7NumVerses(){
		assertEquals(Exodus.CHP7, EXODUS.getNum(7));
	}
	
	@Test
	public void testExodusChp8NumVerses(){
		assertEquals(Exodus.CHP8, EXODUS.getNum(8));
	}
	
	@Test
	public void testExodusChp9NumVerses(){
		assertEquals(Exodus.CHP9, EXODUS.getNum(9));
	}
	
	@Test
	public void testExodusChp10NumVerses(){
		assertEquals(Exodus.CHP10, EXODUS.getNum(10));
	}
	
	@Test
	public void testExodusChp11NumVerses(){
		assertEquals(Exodus.CHP11, EXODUS.getNum(11));
	}
	
	@Test
	public void testExodusChp12NumVerses(){
		assertEquals(Exodus.CHP12, EXODUS.getNum(12));
	}
	
	@Test
	public void testExodusChp13NumVerses(){
		assertEquals(Exodus.CHP13, EXODUS.getNum(13));
	}
	
	@Test
	public void testExodusChp14NumVerses(){
		assertEquals(Exodus.CHP14, EXODUS.getNum(14));
	}
	
	@Test
	public void testExodusChp15NumVerses(){
		assertEquals(Exodus.CHP15, EXODUS.getNum(15));
	}
	
	@Test
	public void testExodusChp16NumVerses(){
		assertEquals(Exodus.CHP16, EXODUS.getNum(16));
	}
	
	@Test
	public void testExodusChp17NumVerses(){
		assertEquals(Exodus.CHP17, EXODUS.getNum(17));
	}
	
	@Test
	public void testExodusChp18NumVerses(){
		assertEquals(Exodus.CHP18, EXODUS.getNum(18));
	}
	
	@Test
	public void testExodusChp19NumVerses(){
		assertEquals(Exodus.CHP19, EXODUS.getNum(19));
	}
	
	@Test
	public void testExodusChp20NumVerses(){
		assertEquals(Exodus.CHP20, EXODUS.getNum(20));
	}
	
	@Test
	public void testExodusChp21NumVerses(){
		assertEquals(Exodus.CHP21, EXODUS.getNum(21));
	}
	
	@Test
	public void testExodusChp22NumVerses(){
		assertEquals(Exodus.CHP22, EXODUS.getNum(22));
	}
	
	@Test
	public void testExodusChp23NumVerses(){
		assertEquals(Exodus.CHP23, EXODUS.getNum(23));
	}
	
	@Test
	public void testExodusChp24NumVerses(){
		assertEquals(Exodus.CHP24, EXODUS.getNum(24));
	}
	
	@Test
	public void testExodusChp25NumVerses(){
		assertEquals(Exodus.CHP25, EXODUS.getNum(25));
	}
	
	@Test
	public void testExodusChp26NumVerses(){
		assertEquals(Exodus.CHP26, EXODUS.getNum(26));
	}
	
	@Test
	public void testExodusChp27NumVerses(){
		assertEquals(Exodus.CHP27, EXODUS.getNum(27));
	}
	
	@Test
	public void testExodusChp28NumVerses(){
		assertEquals(Exodus.CHP28, EXODUS.getNum(28));
	}
	
	@Test
	public void testExodusChp29NumVerses(){
		assertEquals(Exodus.CHP29, EXODUS.getNum(29));
	}
	
	@Test
	public void testExodusChp30NumVerses(){
		assertEquals(Exodus.CHP30, EXODUS.getNum(30));
	}
	
	@Test
	public void testExodusChp31NumVerses(){
		assertEquals(Exodus.CHP31, EXODUS.getNum(31));
	}
	
	@Test
	public void testExodusChp32NumVerses(){
		assertEquals(Exodus.CHP32, EXODUS.getNum(32));
	}
	
	@Test
	public void testExodusChp33NumVerses(){
		assertEquals(Exodus.CHP33, EXODUS.getNum(33));
	}
	
	@Test
	public void testExodusChp34NumVerses(){
		assertEquals(Exodus.CHP34, EXODUS.getNum(34));
	}
	
	@Test
	public void testExodusChp35NumVerses(){
		assertEquals(Exodus.CHP35, EXODUS.getNum(35));
	}
	
	@Test
	public void testExodusChp36NumVerses(){
		assertEquals(Exodus.CHP36, EXODUS.getNum(36));
	}
	
	@Test
	public void testExodusChp37NumVerses(){
		assertEquals(Exodus.CHP37, EXODUS.getNum(37));
	}
	
	@Test
	public void testExodusChp38NumVerses(){
		assertEquals(Exodus.CHP38, EXODUS.getNum(38));
	}
	
	@Test
	public void testExodusChp39NumVerses(){
		assertEquals(Exodus.CHP39, EXODUS.getNum(39));
	}
	
	@Test
	public void testExodusChp40NumVerses(){
		assertEquals(Exodus.CHP40, EXODUS.getNum(40));
	}
	
	/*
	 * Leviticus number of verses checks
	 */
	@Test
	public void testLeviticusChp1NumVerses(){
		assertEquals(Leviticus.CHP1, LEVITICUS.getNum(1));
	}
	
	@Test
	public void testLeviticusChp2NumVerses(){
		assertEquals(Leviticus.CHP2, LEVITICUS.getNum(2));
	}
	
	@Test
	public void testLeviticusChp3NumVerses(){
		assertEquals(Leviticus.CHP3, LEVITICUS.getNum(3));
	}
	
	@Test
	public void testLeviticusChp4NumVerses(){
		assertEquals(Leviticus.CHP4, LEVITICUS.getNum(4));
	}
	
	@Test
	public void testLeviticusChp5NumVerses(){
		assertEquals(Leviticus.CHP5, LEVITICUS.getNum(5));
	}
	
	@Test
	public void testLeviticusChp6NumVerses(){
		assertEquals(Leviticus.CHP6, LEVITICUS.getNum(6));
	}
	
	@Test
	public void testLeviticusChp7NumVerses(){
		assertEquals(Leviticus.CHP7, LEVITICUS.getNum(7));
	}
	
	@Test
	public void testLeviticusChp8NumVerses(){
		assertEquals(Leviticus.CHP8, LEVITICUS.getNum(8));
	}
	
	@Test
	public void testLeviticusChp9NumVerses(){
		assertEquals(Leviticus.CHP9, LEVITICUS.getNum(9));
	}
	
	@Test
	public void testLeviticusChp10NumVerses(){
		assertEquals(Leviticus.CHP10, LEVITICUS.getNum(10));
	}
	
	@Test
	public void testLeviticusChp11NumVerses(){
		assertEquals(Leviticus.CHP11, LEVITICUS.getNum(11));
	}
	
	@Test
	public void testLeviticusChp12NumVerses(){
		assertEquals(Leviticus.CHP12, LEVITICUS.getNum(12));
	}
	
	@Test
	public void testLeviticusChp13NumVerses(){
		assertEquals(Leviticus.CHP13, LEVITICUS.getNum(13));
	}
	
	@Test
	public void testLeviticusChp14NumVerses(){
		assertEquals(Leviticus.CHP14, LEVITICUS.getNum(14));
	}
	
	@Test
	public void testLeviticusChp15NumVerses(){
		assertEquals(Leviticus.CHP15, LEVITICUS.getNum(15));
	}
	
	@Test
	public void testLeviticusChp16NumVerses(){
		assertEquals(Leviticus.CHP16, LEVITICUS.getNum(16));
	}
	
	@Test
	public void testLeviticusChp17NumVerses(){
		assertEquals(Leviticus.CHP17, LEVITICUS.getNum(17));
	}
	
	@Test
	public void testLeviticusChp18NumVerses(){
		assertEquals(Leviticus.CHP18, LEVITICUS.getNum(18));
	}
	
	@Test
	public void testLeviticusChp19NumVerses(){
		assertEquals(Leviticus.CHP19, LEVITICUS.getNum(19));
	}
	
	@Test
	public void testLeviticusChp20NumVerses(){
		assertEquals(Leviticus.CHP20, LEVITICUS.getNum(20));
	}
	
	@Test
	public void testLeviticusChp21NumVerses(){
		assertEquals(Leviticus.CHP21, LEVITICUS.getNum(21));
	}
	
	@Test
	public void testLeviticusChp22NumVerses(){
		assertEquals(Leviticus.CHP22, LEVITICUS.getNum(22));
	}
	
	@Test
	public void testLeviticusChp23NumVerses(){
		assertEquals(Leviticus.CHP23, LEVITICUS.getNum(23));
	}
	
	@Test
	public void testLeviticusChp24NumVerses(){
		assertEquals(Leviticus.CHP24, LEVITICUS.getNum(24));
	}
	
	@Test
	public void testLeviticusChp25NumVerses(){
		assertEquals(Leviticus.CHP25, LEVITICUS.getNum(25));
	}
	
	@Test
	public void testLeviticusChp26NumVerses(){
		assertEquals(Leviticus.CHP26, LEVITICUS.getNum(26));
	}
	
	@Test
	public void testLeviticusChp27NumVerses(){
		assertEquals(Leviticus.CHP27, LEVITICUS.getNum(27));
	}
	
	/*
	 * Numbers number of verses checks
	 */
	@Test
	public void testNumbersChp1NumVerses(){
		assertEquals(Numbers.CHP1, NUMBERS.getNum(1));
	}
	
	@Test
	public void testNumbersChp2NumVerses(){
		assertEquals(Numbers.CHP2, NUMBERS.getNum(2));
	}
	
	@Test
	public void testNumbersChp3NumVerses(){
		assertEquals(Numbers.CHP3, NUMBERS.getNum(3));
	}
	
	@Test
	public void testNumbersChp4NumVerses(){
		assertEquals(Numbers.CHP4, NUMBERS.getNum(4));
	}
	
	@Test
	public void testNumbersChp5NumVerses(){
		assertEquals(Numbers.CHP5, NUMBERS.getNum(5));
	}
	
	@Test
	public void testNumbersChp6NumVerses(){
		assertEquals(Numbers.CHP6, NUMBERS.getNum(6));
	}
	
	@Test
	public void testNumbersChp7NumVerses(){
		assertEquals(Numbers.CHP7, NUMBERS.getNum(7));
	}
	
	@Test
	public void testNumbersChp8NumVerses(){
		assertEquals(Numbers.CHP8, NUMBERS.getNum(8));
	}
	
	@Test
	public void testNumbersChp9NumVerses(){
		assertEquals(Numbers.CHP9, NUMBERS.getNum(9));
	}
	
	@Test
	public void testNumbersChp10NumVerses(){
		assertEquals(Numbers.CHP10, NUMBERS.getNum(10));
	}
	
	@Test
	public void testNumbersChp11NumVerses(){
		assertEquals(Numbers.CHP11, NUMBERS.getNum(11));
	}
	
	@Test
	public void testNumbersChp12NumVerses(){
		assertEquals(Numbers.CHP12, NUMBERS.getNum(12));
	}
	
	@Test
	public void testNumbersChp13NumVerses(){
		assertEquals(Numbers.CHP13, NUMBERS.getNum(13));
	}
	
	@Test
	public void testNumbersChp14NumVerses(){
		assertEquals(Numbers.CHP14, NUMBERS.getNum(14));
	}
	
	@Test
	public void testNumbersChp15NumVerses(){
		assertEquals(Numbers.CHP15, NUMBERS.getNum(15));
	}
	
	@Test
	public void testNumbersChp16NumVerses(){
		assertEquals(Numbers.CHP16, NUMBERS.getNum(16));
	}
	
	@Test
	public void testNumbersChp17NumVerses(){
		assertEquals(Numbers.CHP17, NUMBERS.getNum(17));
	}
	
	@Test
	public void testNumbersChp18NumVerses(){
		assertEquals(Numbers.CHP18, NUMBERS.getNum(18));
	}
	
	@Test
	public void testNumbersChp19NumVerses(){
		assertEquals(Numbers.CHP19, NUMBERS.getNum(19));
	}
	
	@Test
	public void testNumbersChp20NumVerses(){
		assertEquals(Numbers.CHP20, NUMBERS.getNum(20));
	}
	
	@Test
	public void testNumbersChp21NumVerses(){
		assertEquals(Numbers.CHP21, NUMBERS.getNum(21));
	}
	
	@Test
	public void testNumbersChp22NumVerses(){
		assertEquals(Numbers.CHP22, NUMBERS.getNum(22));
	}
	
	@Test
	public void testNumbersChp23NumVerses(){
		assertEquals(Numbers.CHP23, NUMBERS.getNum(23));
	}
	
	@Test
	public void testNumbersChp24NumVerses(){
		assertEquals(Numbers.CHP24, NUMBERS.getNum(24));
	}
	
	@Test
	public void testNumbersChp25NumVerses(){
		assertEquals(Numbers.CHP25, NUMBERS.getNum(25));
	}
	
	@Test
	public void testNumbersChp26NumVerses(){
		assertEquals(Numbers.CHP26, NUMBERS.getNum(26));
	}
	
	@Test
	public void testNumbersChp27NumVerses(){
		assertEquals(Numbers.CHP27, NUMBERS.getNum(27));
	}
	
	@Test
	public void testNumbersChp28NumVerses(){
		assertEquals(Numbers.CHP28, NUMBERS.getNum(28));
	}
	
	@Test
	public void testNumbersChp29NumVerses(){
		assertEquals(Numbers.CHP29, NUMBERS.getNum(29));
	}
	
	@Test
	public void testNumbersChp30NumVerses(){
		assertEquals(Numbers.CHP30, NUMBERS.getNum(30));
	}
	
	@Test
	public void testNumbersChp31NumVerses(){
		assertEquals(Numbers.CHP31, NUMBERS.getNum(31));
	}
	
	@Test
	public void testNumbersChp32NumVerses(){
		assertEquals(Numbers.CHP32, NUMBERS.getNum(32));
	}
	
	@Test
	public void testNumbersChp33NumVerses(){
		assertEquals(Numbers.CHP33, NUMBERS.getNum(33));
	}
	
	@Test
	public void testNumbersChp34NumVerses(){
		assertEquals(Numbers.CHP34, NUMBERS.getNum(34));
	}
	
	@Test
	public void testNumbersChp35NumVerses(){
		assertEquals(Numbers.CHP35, NUMBERS.getNum(35));
	}
	
	@Test
	public void testNumbersChp36NumVerses(){
		assertEquals(Numbers.CHP36, NUMBERS.getNum(36));
	}
	
	/*
	 * Deuteronomy number of verses checks
	 */
	@Test
	public void testDeuteronomyChp1NumVerses(){
		assertEquals(Deuteronomy.CHP1, DEUTERONOMY.getNum(1));
	}
	
	@Test
	public void testDeuteronomyChp2NumVerses(){
		assertEquals(Deuteronomy.CHP2, DEUTERONOMY.getNum(2));
	}
	
	@Test
	public void testDeuteronomyChp3NumVerses(){
		assertEquals(Deuteronomy.CHP3, DEUTERONOMY.getNum(3));
	}
	
	@Test
	public void testDeuteronomyChp4NumVerses(){
		assertEquals(Deuteronomy.CHP4, DEUTERONOMY.getNum(4));
	}
	
	@Test
	public void testDeuteronomyChp5NumVerses(){
		assertEquals(Deuteronomy.CHP5, DEUTERONOMY.getNum(5));
	}
	
	@Test
	public void testDeuteronomyChp6NumVerses(){
		assertEquals(Deuteronomy.CHP6, DEUTERONOMY.getNum(6));
	}
	
	@Test
	public void testDeuteronomyChp7NumVerses(){
		assertEquals(Deuteronomy.CHP7, DEUTERONOMY.getNum(7));
	}
	
	@Test
	public void testDeuteronomyChp8NumVerses(){
		assertEquals(Deuteronomy.CHP8, DEUTERONOMY.getNum(8));
	}
	
	@Test
	public void testDeuteronomyChp9NumVerses(){
		assertEquals(Deuteronomy.CHP9, DEUTERONOMY.getNum(9));
	}
	
	@Test
	public void testDeuteronomyChp10NumVerses(){
		assertEquals(Deuteronomy.CHP10, DEUTERONOMY.getNum(10));
	}
	
	@Test
	public void testDeuteronomyChp11NumVerses(){
		assertEquals(Deuteronomy.CHP11, DEUTERONOMY.getNum(11));
	}
	
	@Test
	public void testDeuteronomyChp12NumVerses(){
		assertEquals(Deuteronomy.CHP12, DEUTERONOMY.getNum(12));
	}
	
	@Test
	public void testDeuteronomyChp13NumVerses(){
		assertEquals(Deuteronomy.CHP13, DEUTERONOMY.getNum(13));
	}
	
	@Test
	public void testDeuteronomyChp14NumVerses(){
		assertEquals(Deuteronomy.CHP14, DEUTERONOMY.getNum(14));
	}
	
	@Test
	public void testDeuteronomyChp15NumVerses(){
		assertEquals(Deuteronomy.CHP15, DEUTERONOMY.getNum(15));
	}
	
	@Test
	public void testDeuteronomyChp16NumVerses(){
		assertEquals(Deuteronomy.CHP16, DEUTERONOMY.getNum(16));
	}
	
	@Test
	public void testDeuteronomyChp17NumVerses(){
		assertEquals(Deuteronomy.CHP17, DEUTERONOMY.getNum(17));
	}
	
	@Test
	public void testDeuteronomyChp18NumVerses(){
		assertEquals(Deuteronomy.CHP18, DEUTERONOMY.getNum(18));
	}
	
	@Test
	public void testDeuteronomyChp19NumVerses(){
		assertEquals(Deuteronomy.CHP19, DEUTERONOMY.getNum(19));
	}
	
	@Test
	public void testDeuteronomyChp20NumVerses(){
		assertEquals(Deuteronomy.CHP20, DEUTERONOMY.getNum(20));
	}
	
	@Test
	public void testDeuteronomyChp21NumVerses(){
		assertEquals(Deuteronomy.CHP21, DEUTERONOMY.getNum(21));
	}
	
	@Test
	public void testDeuteronomyChp22NumVerses(){
		assertEquals(Deuteronomy.CHP22, DEUTERONOMY.getNum(22));
	}
	
	@Test
	public void testDeuteronomyChp23NumVerses(){
		assertEquals(Deuteronomy.CHP23, DEUTERONOMY.getNum(23));
	}
	
	@Test
	public void testDeuteronomyChp24NumVerses(){
		assertEquals(Deuteronomy.CHP24, DEUTERONOMY.getNum(24));
	}
	
	@Test
	public void testDeuteronomyChp25NumVerses(){
		assertEquals(Deuteronomy.CHP25, DEUTERONOMY.getNum(25));
	}
	
	@Test
	public void testDeuteronomyChp26NumVerses(){
		assertEquals(Deuteronomy.CHP26, DEUTERONOMY.getNum(26));
	}
	
	@Test
	public void testDeuteronomyChp27NumVerses(){
		assertEquals(Deuteronomy.CHP27, DEUTERONOMY.getNum(27));
	}
	
	@Test
	public void testDeuteronomyChp28NumVerses(){
		assertEquals(Deuteronomy.CHP28, DEUTERONOMY.getNum(28));
	}
	
	@Test
	public void testDeuteronomyChp29NumVerses(){
		assertEquals(Deuteronomy.CHP29, DEUTERONOMY.getNum(29));
	}
	
	@Test
	public void testDeuteronomyChp30NumVerses(){
		assertEquals(Deuteronomy.CHP30, DEUTERONOMY.getNum(30));
	}
	
	@Test
	public void testDeuteronomyChp31NumVerses(){
		assertEquals(Deuteronomy.CHP31, DEUTERONOMY.getNum(31));
	}
	
	@Test
	public void testDeuteronomyChp32NumVerses(){
		assertEquals(Deuteronomy.CHP32, DEUTERONOMY.getNum(32));
	}
	
	@Test
	public void testDeuteronomyChp33NumVerses(){
		assertEquals(Deuteronomy.CHP33, DEUTERONOMY.getNum(33));
	}
	
	@Test
	public void testDeuteronomyChp34NumVerses(){
		assertEquals(Deuteronomy.CHP34, DEUTERONOMY.getNum(34));
	}
	
	/*
	 * Joshua number of verses checks
	 */
	@Test
	public void testJoshuaChp1NumVerses(){
		assertEquals(Joshua.CHP1, JOSHUA.getNum(1));
	}
	
	@Test
	public void testJoshuaChp2NumVerses(){
		assertEquals(Joshua.CHP2, JOSHUA.getNum(2));
	}
	
	@Test
	public void testJoshuaChp3NumVerses(){
		assertEquals(Joshua.CHP3, JOSHUA.getNum(3));
	}
	
	@Test
	public void testJoshuaChp4NumVerses(){
		assertEquals(Joshua.CHP4, JOSHUA.getNum(4));
	}
	
	@Test
	public void testJoshuaChp5NumVerses(){
		assertEquals(Joshua.CHP5, JOSHUA.getNum(5));
	}
	
	@Test
	public void testJoshuaChp6NumVerses(){
		assertEquals(Joshua.CHP6, JOSHUA.getNum(6));
	}
	
	@Test
	public void testJoshuaChp7NumVerses(){
		assertEquals(Joshua.CHP7, JOSHUA.getNum(7));
	}
	
	@Test
	public void testJoshuaChp8NumVerses(){
		assertEquals(Joshua.CHP8, JOSHUA.getNum(8));
	}
	
	@Test
	public void testJoshuaChp9NumVerses(){
		assertEquals(Joshua.CHP9, JOSHUA.getNum(9));
	}
	
	@Test
	public void testJoshuaChp10NumVerses(){
		assertEquals(Joshua.CHP10, JOSHUA.getNum(10));
	}
	
	@Test
	public void testJoshuaChp11NumVerses(){
		assertEquals(Joshua.CHP11, JOSHUA.getNum(11));
	}
	
	@Test
	public void testJoshuaChp12NumVerses(){
		assertEquals(Joshua.CHP12, JOSHUA.getNum(12));
	}
	
	@Test
	public void testJoshuaChp13NumVerses(){
		assertEquals(Joshua.CHP13, JOSHUA.getNum(13));
	}
	
	@Test
	public void testJoshuaChp14NumVerses(){
		assertEquals(Joshua.CHP14, JOSHUA.getNum(14));
	}
	
	@Test
	public void testJoshuaChp15NumVerses(){
		assertEquals(Joshua.CHP15, JOSHUA.getNum(15));
	}
	
	@Test
	public void testJoshuaChp16NumVerses(){
		assertEquals(Joshua.CHP16, JOSHUA.getNum(16));
	}
	
	@Test
	public void testJoshuaChp17NumVerses(){
		assertEquals(Joshua.CHP17, JOSHUA.getNum(17));
	}
	
	@Test
	public void testJoshuaChp18NumVerses(){
		assertEquals(Joshua.CHP18, JOSHUA.getNum(18));
	}
	
	@Test
	public void testJoshuaChp19NumVerses(){
		assertEquals(Joshua.CHP19, JOSHUA.getNum(19));
	}
	
	@Test
	public void testJoshuaChp20NumVerses(){
		assertEquals(Joshua.CHP20, JOSHUA.getNum(20));
	}
	
	@Test
	public void testJoshuaChp21NumVerses(){
		assertEquals(Joshua.CHP21, JOSHUA.getNum(21));
	}
	
	@Test
	public void testJoshuaChp22NumVerses(){
		assertEquals(Joshua.CHP22, JOSHUA.getNum(22));
	}
	
	@Test
	public void testJoshuaChp23NumVerses(){
		assertEquals(Joshua.CHP23, JOSHUA.getNum(23));
	}
	
	@Test
	public void testJoshuaChp24NumVerses(){
		assertEquals(Joshua.CHP24, JOSHUA.getNum(24));
	}
	
	/*
	 * Judges number of verses checks
	 */
	@Test
	public void testJudgesChp1NumVerses(){
		assertEquals(Judges.CHP1, JUDGES.getNum(1));
	}
	
	@Test
	public void testJudgesChp2NumVerses(){
		assertEquals(Judges.CHP2, JUDGES.getNum(2));
	}
	
	@Test
	public void testJudgesChp3NumVerses(){
		assertEquals(Judges.CHP3, JUDGES.getNum(3));
	}
	
	@Test
	public void testJudgesChp4NumVerses(){
		assertEquals(Judges.CHP4, JUDGES.getNum(4));
	}
	
	@Test
	public void testJudgesChp5NumVerses(){
		assertEquals(Judges.CHP5, JUDGES.getNum(5));
	}
	
	@Test
	public void testJudgesChp6NumVerses(){
		assertEquals(Judges.CHP6, JUDGES.getNum(6));
	}
	
	@Test
	public void testJudgesChp7NumVerses(){
		assertEquals(Judges.CHP7, JUDGES.getNum(7));
	}
	
	@Test
	public void testJudgesChp8NumVerses(){
		assertEquals(Judges.CHP8, JUDGES.getNum(8));
	}
	
	@Test
	public void testJudgesChp9NumVerses(){
		assertEquals(Judges.CHP9, JUDGES.getNum(9));
	}
	
	@Test
	public void testJudgesChp10NumVerses(){
		assertEquals(Judges.CHP10, JUDGES.getNum(10));
	}
	
	@Test
	public void testJudgesChp11NumVerses(){
		assertEquals(Judges.CHP11, JUDGES.getNum(11));
	}
	
	@Test
	public void testJudgesChp12NumVerses(){
		assertEquals(Judges.CHP12, JUDGES.getNum(12));
	}
	
	@Test
	public void testJudgesChp13NumVerses(){
		assertEquals(Judges.CHP13, JUDGES.getNum(13));
	}
	
	@Test
	public void testJudgesChp14NumVerses(){
		assertEquals(Judges.CHP14, JUDGES.getNum(14));
	}
	
	@Test
	public void testJudgesChp15NumVerses(){
		assertEquals(Judges.CHP15, JUDGES.getNum(15));
	}
	
	@Test
	public void testJudgesChp16NumVerses(){
		assertEquals(Judges.CHP16, JUDGES.getNum(16));
	}
	
	@Test
	public void testJudgesChp17NumVerses(){
		assertEquals(Judges.CHP17, JUDGES.getNum(17));
	}
	
	@Test
	public void testJudgesChp18NumVerses(){
		assertEquals(Judges.CHP18, JUDGES.getNum(18));
	}
	
	@Test
	public void testJudgesChp19NumVerses(){
		assertEquals(Judges.CHP19, JUDGES.getNum(19));
	}
	
	@Test
	public void testJudgesChp20NumVerses(){
		assertEquals(Judges.CHP20, JUDGES.getNum(20));
	}
	
	@Test
	public void testJudgesChp21NumVerses(){
		assertEquals(Judges.CHP21, JUDGES.getNum(21));
	}
	
	/*
	 * Ruth number of verses checks
	 */
	@Test
	public void testRuthChp1NumVerses(){
		assertEquals(Ruth.CHP1, RUTH.getNum(1));
	}
	
	@Test
	public void testRuthChp2NumVerses(){
		assertEquals(Ruth.CHP2, RUTH.getNum(2));
	}
	
	@Test
	public void testRuthChp3NumVerses(){
		assertEquals(Ruth.CHP3, RUTH.getNum(3));
	}
	
	@Test
	public void testRuthChp4NumVerses(){
		assertEquals(Ruth.CHP4, RUTH.getNum(4));
	}
	
	/*
	 * 1 Samuel number of verses checks
	 */
	@Test
	public void test1SamuelChp1NumVerses(){
		assertEquals(FirstSamuel.CHP1, FIRST_SAMUEL.getNum(1));
	}
	
	@Test
	public void test1SamuelChp2NumVerses(){
		assertEquals(FirstSamuel.CHP2, FIRST_SAMUEL.getNum(2));
	}
	
	@Test
	public void test1SamuelChp3NumVerses(){
		assertEquals(FirstSamuel.CHP3, FIRST_SAMUEL.getNum(3));
	}
	
	@Test
	public void test1SamuelChp4NumVerses(){
		assertEquals(FirstSamuel.CHP4, FIRST_SAMUEL.getNum(4));
	}
	
	@Test
	public void test1SamuelChp5NumVerses(){
		assertEquals(FirstSamuel.CHP5, FIRST_SAMUEL.getNum(5));
	}
	
	@Test
	public void test1SamuelChp6NumVerses(){
		assertEquals(FirstSamuel.CHP6, FIRST_SAMUEL.getNum(6));
	}
	
	@Test
	public void test1SamuelChp7NumVerses(){
		assertEquals(FirstSamuel.CHP7, FIRST_SAMUEL.getNum(7));
	}
	
	@Test
	public void test1SamuelChp8NumVerses(){
		assertEquals(FirstSamuel.CHP8, FIRST_SAMUEL.getNum(8));
	}
	
	@Test
	public void test1SamuelChp9NumVerses(){
		assertEquals(FirstSamuel.CHP9, FIRST_SAMUEL.getNum(9));
	}
	
	@Test
	public void test1SamuelChp10NumVerses(){
		assertEquals(FirstSamuel.CHP10, FIRST_SAMUEL.getNum(10));
	}
	
	@Test
	public void test1SamuelChp11NumVerses(){
		assertEquals(FirstSamuel.CHP11, FIRST_SAMUEL.getNum(11));
	}
	
	@Test
	public void test1SamuelChp12NumVerses(){
		assertEquals(FirstSamuel.CHP12, FIRST_SAMUEL.getNum(12));
	}
	
	@Test
	public void test1SamuelChp13NumVerses(){
		assertEquals(FirstSamuel.CHP13, FIRST_SAMUEL.getNum(13));
	}
	
	@Test
	public void test1SamuelChp14NumVerses(){
		assertEquals(FirstSamuel.CHP14, FIRST_SAMUEL.getNum(14));
	}
	
	@Test
	public void test1SamuelChp15NumVerses(){
		assertEquals(FirstSamuel.CHP15, FIRST_SAMUEL.getNum(15));
	}
	
	@Test
	public void test1SamuelChp16NumVerses(){
		assertEquals(FirstSamuel.CHP16, FIRST_SAMUEL.getNum(16));
	}
	
	@Test
	public void test1SamuelChp17NumVerses(){
		assertEquals(FirstSamuel.CHP17, FIRST_SAMUEL.getNum(17));
	}
	
	@Test
	public void test1SamuelChp18NumVerses(){
		assertEquals(FirstSamuel.CHP18, FIRST_SAMUEL.getNum(18));
	}
	
	@Test
	public void test1SamuelChp19NumVerses(){
		assertEquals(FirstSamuel.CHP19, FIRST_SAMUEL.getNum(19));
	}
	
	@Test
	public void test1SamuelChp20NumVerses(){
		assertEquals(FirstSamuel.CHP20, FIRST_SAMUEL.getNum(20));
	}
	
	@Test
	public void test1SamuelChp21NumVerses(){
		assertEquals(FirstSamuel.CHP21, FIRST_SAMUEL.getNum(21));
	}
	
	@Test
	public void test1SamuelChp22NumVerses(){
		assertEquals(FirstSamuel.CHP22, FIRST_SAMUEL.getNum(22));
	}
	
	@Test
	public void test1SamuelChp23NumVerses(){
		assertEquals(FirstSamuel.CHP23, FIRST_SAMUEL.getNum(23));
	}
	
	@Test
	public void test1SamuelChp24NumVerses(){
		assertEquals(FirstSamuel.CHP24, FIRST_SAMUEL.getNum(24));
	}
	
	@Test
	public void test1SamuelChp25NumVerses(){
		assertEquals(FirstSamuel.CHP25, FIRST_SAMUEL.getNum(25));
	}
	
	@Test
	public void test1SamuelChp26NumVerses(){
		assertEquals(FirstSamuel.CHP26, FIRST_SAMUEL.getNum(26));
	}
	
	@Test
	public void test1SamuelChp27NumVerses(){
		assertEquals(FirstSamuel.CHP27, FIRST_SAMUEL.getNum(27));
	}
	
	@Test
	public void test1SamuelChp28NumVerses(){
		assertEquals(FirstSamuel.CHP28, FIRST_SAMUEL.getNum(28));
	}
	
	@Test
	public void test1SamuelChp29NumVerses(){
		assertEquals(FirstSamuel.CHP29, FIRST_SAMUEL.getNum(29));
	}
	
	@Test
	public void test1SamuelChp30NumVerses(){
		assertEquals(FirstSamuel.CHP30, FIRST_SAMUEL.getNum(30));
	}
	
	@Test
	public void test1SamuelChp31NumVerses(){
		assertEquals(FirstSamuel.CHP31, FIRST_SAMUEL.getNum(31));
	}
	
	/*
	 * 2 Samuel number of verses checks
	 */
	@Test
	public void test2SamuelChp1NumVerses(){
		assertEquals(SecondSamuel.CHP1, SECOND_SAMUEL.getNum(1));
	}
	
	@Test
	public void test2SamuelChp2NumVerses(){
		assertEquals(SecondSamuel.CHP2, SECOND_SAMUEL.getNum(2));
	}
	
	@Test
	public void test2SamuelChp3NumVerses(){
		assertEquals(SecondSamuel.CHP3, SECOND_SAMUEL.getNum(3));
	}
	
	@Test
	public void test2SamuelChp4NumVerses(){
		assertEquals(SecondSamuel.CHP4, SECOND_SAMUEL.getNum(4));
	}
	
	@Test
	public void test2SamuelChp5NumVerses(){
		assertEquals(SecondSamuel.CHP5, SECOND_SAMUEL.getNum(5));
	}
	
	@Test
	public void test2SamuelChp6NumVerses(){
		assertEquals(SecondSamuel.CHP6, SECOND_SAMUEL.getNum(6));
	}
	
	@Test
	public void test2SamuelChp7NumVerses(){
		assertEquals(SecondSamuel.CHP7, SECOND_SAMUEL.getNum(7));
	}
	
	@Test
	public void test2SamuelChp8NumVerses(){
		assertEquals(SecondSamuel.CHP8, SECOND_SAMUEL.getNum(8));
	}
	
	@Test
	public void test2SamuelChp9NumVerses(){
		assertEquals(SecondSamuel.CHP9, SECOND_SAMUEL.getNum(9));
	}
	
	@Test
	public void test2SamuelChp10NumVerses(){
		assertEquals(SecondSamuel.CHP10, SECOND_SAMUEL.getNum(10));
	}
	
	@Test
	public void test2SamuelChp11NumVerses(){
		assertEquals(SecondSamuel.CHP11, SECOND_SAMUEL.getNum(11));
	}
	
	@Test
	public void test2SamuelChp12NumVerses(){
		assertEquals(SecondSamuel.CHP12, SECOND_SAMUEL.getNum(12));
	}
	
	@Test
	public void test2SamuelChp13NumVerses(){
		assertEquals(SecondSamuel.CHP13, SECOND_SAMUEL.getNum(13));
	}
	
	@Test
	public void test2SamuelChp14NumVerses(){
		assertEquals(SecondSamuel.CHP14, SECOND_SAMUEL.getNum(14));
	}
	
	@Test
	public void test2SamuelChp15NumVerses(){
		assertEquals(SecondSamuel.CHP15, SECOND_SAMUEL.getNum(15));
	}
	
	@Test
	public void test2SamuelChp16NumVerses(){
		assertEquals(SecondSamuel.CHP16, SECOND_SAMUEL.getNum(16));
	}
	
	@Test
	public void test2SamuelChp17NumVerses(){
		assertEquals(SecondSamuel.CHP17, SECOND_SAMUEL.getNum(17));
	}
	
	@Test
	public void test2SamuelChp18NumVerses(){
		assertEquals(SecondSamuel.CHP18, SECOND_SAMUEL.getNum(18));
	}
	
	@Test
	public void test2SamuelChp19NumVerses(){
		assertEquals(SecondSamuel.CHP19, SECOND_SAMUEL.getNum(19));
	}
	
	@Test
	public void test2SamuelChp20NumVerses(){
		assertEquals(SecondSamuel.CHP20, SECOND_SAMUEL.getNum(20));
	}
	
	@Test
	public void test2SamuelChp21NumVerses(){
		assertEquals(SecondSamuel.CHP21, SECOND_SAMUEL.getNum(21));
	}
	
	@Test
	public void test2SamuelChp22NumVerses(){
		assertEquals(SecondSamuel.CHP22, SECOND_SAMUEL.getNum(22));
	}
	
	@Test
	public void test2SamuelChp23NumVerses(){
		assertEquals(SecondSamuel.CHP23, SECOND_SAMUEL.getNum(23));
	}
	
	@Test
	public void test2SamuelChp24NumVerses(){
		assertEquals(SecondSamuel.CHP24, SECOND_SAMUEL.getNum(24));
	}
	
	/*
	 * 1 Kings number of verses checks
	 */
	@Test
	public void test1KingsChp1NumVerses(){
		assertEquals(FirstKings.CHP1, FIRST_KINGS.getNum(1));
	}
	
	@Test
	public void test1KingsChp2NumVerses(){
		assertEquals(FirstKings.CHP2, FIRST_KINGS.getNum(2));
	}
	
	@Test
	public void test1KingsChp3NumVerses(){
		assertEquals(FirstKings.CHP3, FIRST_KINGS.getNum(3));
	}
	
	@Test
	public void test1KingsChp4NumVerses(){
		assertEquals(FirstKings.CHP4, FIRST_KINGS.getNum(4));
	}
	
	@Test
	public void test1KingsChp5NumVerses(){
		assertEquals(FirstKings.CHP5, FIRST_KINGS.getNum(5));
	}
	
	@Test
	public void test1KingsChp6NumVerses(){
		assertEquals(FirstKings.CHP6, FIRST_KINGS.getNum(6));
	}
	
	@Test
	public void test1KingsChp7NumVerses(){
		assertEquals(FirstKings.CHP7, FIRST_KINGS.getNum(7));
	}
	
	@Test
	public void test1KingsChp8NumVerses(){
		assertEquals(FirstKings.CHP8, FIRST_KINGS.getNum(8));
	}
	
	@Test
	public void test1KingsChp9NumVerses(){
		assertEquals(FirstKings.CHP9, FIRST_KINGS.getNum(9));
	}
	
	@Test
	public void test1KingsChp10NumVerses(){
		assertEquals(FirstKings.CHP10, FIRST_KINGS.getNum(10));
	}
	
	@Test
	public void test1KingsChp11NumVerses(){
		assertEquals(FirstKings.CHP11, FIRST_KINGS.getNum(11));
	}
	
	@Test
	public void test1KingsChp12NumVerses(){
		assertEquals(FirstKings.CHP12, FIRST_KINGS.getNum(12));
	}
	
	@Test
	public void test1KingsChp13NumVerses(){
		assertEquals(FirstKings.CHP13, FIRST_KINGS.getNum(13));
	}
	
	@Test
	public void test1KingsChp14NumVerses(){
		assertEquals(FirstKings.CHP14, FIRST_KINGS.getNum(14));
	}
	
	@Test
	public void test1KingsChp15NumVerses(){
		assertEquals(FirstKings.CHP15, FIRST_KINGS.getNum(15));
	}
	
	@Test
	public void test1KingsChp16NumVerses(){
		assertEquals(FirstKings.CHP16, FIRST_KINGS.getNum(16));
	}
	
	@Test
	public void test1KingsChp17NumVerses(){
		assertEquals(FirstKings.CHP17, FIRST_KINGS.getNum(17));
	}
	
	@Test
	public void test1KingsChp18NumVerses(){
		assertEquals(FirstKings.CHP18, FIRST_KINGS.getNum(18));
	}
	
	@Test
	public void test1KingsChp19NumVerses(){
		assertEquals(FirstKings.CHP19, FIRST_KINGS.getNum(19));
	}
	
	@Test
	public void test1KingsChp20NumVerses(){
		assertEquals(FirstKings.CHP20, FIRST_KINGS.getNum(20));
	}
	
	@Test
	public void test1KingsChp21NumVerses(){
		assertEquals(FirstKings.CHP21, FIRST_KINGS.getNum(21));
	}
	
	@Test
	public void test1KingsChp22NumVerses(){
		assertEquals(FirstKings.CHP22, FIRST_KINGS.getNum(22));
	}
	
	/*
	 * 2 Kings number of verses checks
	 */
	@Test
	public void test2KingsChp1NumVerses(){
		assertEquals(SecondKings.CHP1, SECOND_KINGS.getNum(1));
	}
	
	@Test
	public void test2KingsChp2NumVerses(){
		assertEquals(SecondKings.CHP2, SECOND_KINGS.getNum(2));
	}
	
	@Test
	public void test2KingsChp3NumVerses(){
		assertEquals(SecondKings.CHP3, SECOND_KINGS.getNum(3));
	}
	
	@Test
	public void test2KingsChp4NumVerses(){
		assertEquals(SecondKings.CHP4, SECOND_KINGS.getNum(4));
	}
	
	@Test
	public void test2KingsChp5NumVerses(){
		assertEquals(SecondKings.CHP5, SECOND_KINGS.getNum(5));
	}
	
	@Test
	public void test2KingsChp6NumVerses(){
		assertEquals(SecondKings.CHP6, SECOND_KINGS.getNum(6));
	}
	
	@Test
	public void test2KingsChp7NumVerses(){
		assertEquals(SecondKings.CHP7, SECOND_KINGS.getNum(7));
	}
	
	@Test
	public void test2KingsChp8NumVerses(){
		assertEquals(SecondKings.CHP8, SECOND_KINGS.getNum(8));
	}
	
	@Test
	public void test2KingsChp9NumVerses(){
		assertEquals(SecondKings.CHP9, SECOND_KINGS.getNum(9));
	}
	
	@Test
	public void test2KingsChp10NumVerses(){
		assertEquals(SecondKings.CHP10, SECOND_KINGS.getNum(10));
	}
	
	@Test
	public void test2KingsChp11NumVerses(){
		assertEquals(SecondKings.CHP11, SECOND_KINGS.getNum(11));
	}
	
	@Test
	public void test2KingsChp12NumVerses(){
		assertEquals(SecondKings.CHP12, SECOND_KINGS.getNum(12));
	}
	
	@Test
	public void test2KingsChp13NumVerses(){
		assertEquals(SecondKings.CHP13, SECOND_KINGS.getNum(13));
	}
	
	@Test
	public void test2KingsChp14NumVerses(){
		assertEquals(SecondKings.CHP14, SECOND_KINGS.getNum(14));
	}
	
	@Test
	public void test2KingsChp15NumVerses(){
		assertEquals(SecondKings.CHP15, SECOND_KINGS.getNum(15));
	}
	
	@Test
	public void test2KingsChp16NumVerses(){
		assertEquals(SecondKings.CHP16, SECOND_KINGS.getNum(16));
	}
	
	@Test
	public void test2KingsChp17NumVerses(){
		assertEquals(SecondKings.CHP17, SECOND_KINGS.getNum(17));
	}
	
	@Test
	public void test2KingsChp18NumVerses(){
		assertEquals(SecondKings.CHP18, SECOND_KINGS.getNum(18));
	}
	
	@Test
	public void test2KingsChp19NumVerses(){
		assertEquals(SecondKings.CHP19, SECOND_KINGS.getNum(19));
	}
	
	@Test
	public void test2KingsChp20NumVerses(){
		assertEquals(SecondKings.CHP20, SECOND_KINGS.getNum(20));
	}
	
	@Test
	public void test2KingsChp21NumVerses(){
		assertEquals(SecondKings.CHP21, SECOND_KINGS.getNum(21));
	}
	
	@Test
	public void test2KingsChp22NumVerses(){
		assertEquals(SecondKings.CHP22, SECOND_KINGS.getNum(22));
	}
	
	@Test
	public void test2KingsChp23NumVerses(){
		assertEquals(SecondKings.CHP23, SECOND_KINGS.getNum(23));
	}
	
	@Test
	public void test2KingsChp24NumVerses(){
		assertEquals(SecondKings.CHP24, SECOND_KINGS.getNum(24));
	}
	
	@Test
	public void test2KingsChp25NumVerses(){
		assertEquals(SecondKings.CHP25, SECOND_KINGS.getNum(25));
	}
	
	/*
	 * 1 Chronicles number of verses checks
	 */
	@Test
	public void test1ChroniclesChp1NumVerses(){
		assertEquals(FirstChronicles.CHP1, FIRST_CHRONICLES.getNum(1));
	}
	
	@Test
	public void test1ChroniclesChp2NumVerses(){
		assertEquals(FirstChronicles.CHP2, FIRST_CHRONICLES.getNum(2));
	}
	
	@Test
	public void test1ChroniclesChp3NumVerses(){
		assertEquals(FirstChronicles.CHP3, FIRST_CHRONICLES.getNum(3));
	}
	
	@Test
	public void test1ChroniclesChp4NumVerses(){
		assertEquals(FirstChronicles.CHP4, FIRST_CHRONICLES.getNum(4));
	}
	
	@Test
	public void test1ChroniclesChp5NumVerses(){
		assertEquals(FirstChronicles.CHP5, FIRST_CHRONICLES.getNum(5));
	}
	
	@Test
	public void test1ChroniclesChp6NumVerses(){
		assertEquals(FirstChronicles.CHP6, FIRST_CHRONICLES.getNum(6));
	}
	
	@Test
	public void test1ChroniclesChp7NumVerses(){
		assertEquals(FirstChronicles.CHP7, FIRST_CHRONICLES.getNum(7));
	}
	
	@Test
	public void test1ChroniclesChp8NumVerses(){
		assertEquals(FirstChronicles.CHP8, FIRST_CHRONICLES.getNum(8));
	}
	
	@Test
	public void test1ChroniclesChp9NumVerses(){
		assertEquals(FirstChronicles.CHP9, FIRST_CHRONICLES.getNum(9));
	}
	
	@Test
	public void test1ChroniclesChp10NumVerses(){
		assertEquals(FirstChronicles.CHP10, FIRST_CHRONICLES.getNum(10));
	}
	
	@Test
	public void test1ChroniclesChp11NumVerses(){
		assertEquals(FirstChronicles.CHP11, FIRST_CHRONICLES.getNum(11));
	}
	
	@Test
	public void test1ChroniclesChp12NumVerses(){
		assertEquals(FirstChronicles.CHP12, FIRST_CHRONICLES.getNum(12));
	}
	
	@Test
	public void test1ChroniclesChp13NumVerses(){
		assertEquals(FirstChronicles.CHP13, FIRST_CHRONICLES.getNum(13));
	}
	
	@Test
	public void test1ChroniclesChp14NumVerses(){
		assertEquals(FirstChronicles.CHP14, FIRST_CHRONICLES.getNum(14));
	}
	
	@Test
	public void test1ChroniclesChp15NumVerses(){
		assertEquals(FirstChronicles.CHP15, FIRST_CHRONICLES.getNum(15));
	}
	
	@Test
	public void test1ChroniclesChp16NumVerses(){
		assertEquals(FirstChronicles.CHP16, FIRST_CHRONICLES.getNum(16));
	}
	
	@Test
	public void test1ChroniclesChp17NumVerses(){
		assertEquals(FirstChronicles.CHP17, FIRST_CHRONICLES.getNum(17));
	}
	
	@Test
	public void test1ChroniclesChp18NumVerses(){
		assertEquals(FirstChronicles.CHP18, FIRST_CHRONICLES.getNum(18));
	}
	
	@Test
	public void test1ChroniclesChp19NumVerses(){
		assertEquals(FirstChronicles.CHP19, FIRST_CHRONICLES.getNum(19));
	}
	
	@Test
	public void test1ChroniclesChp20NumVerses(){
		assertEquals(FirstChronicles.CHP20, FIRST_CHRONICLES.getNum(20));
	}
	
	@Test
	public void test1ChroniclesChp21NumVerses(){
		assertEquals(FirstChronicles.CHP21, FIRST_CHRONICLES.getNum(21));
	}
	
	@Test
	public void test1ChroniclesChp22NumVerses(){
		assertEquals(FirstChronicles.CHP22, FIRST_CHRONICLES.getNum(22));
	}
	
	@Test
	public void test1ChroniclesChp23NumVerses(){
		assertEquals(FirstChronicles.CHP23, FIRST_CHRONICLES.getNum(23));
	}
	
	@Test
	public void test1ChroniclesChp24NumVerses(){
		assertEquals(FirstChronicles.CHP24, FIRST_CHRONICLES.getNum(24));
	}
	
	@Test
	public void test1ChroniclesChp25NumVerses(){
		assertEquals(FirstChronicles.CHP25, FIRST_CHRONICLES.getNum(25));
	}
	
	@Test
	public void test1ChroniclesChp26NumVerses(){
		assertEquals(FirstChronicles.CHP26, FIRST_CHRONICLES.getNum(26));
	}
	
	@Test
	public void test1ChroniclesChp27NumVerses(){
		assertEquals(FirstChronicles.CHP27, FIRST_CHRONICLES.getNum(27));
	}
	
	@Test
	public void test1ChroniclesChp28NumVerses(){
		assertEquals(FirstChronicles.CHP28, FIRST_CHRONICLES.getNum(28));
	}
	
	@Test
	public void test1ChroniclesChp29NumVerses(){
		assertEquals(FirstChronicles.CHP29, FIRST_CHRONICLES.getNum(29));
	}
	
	/*
	 * 2 Chronicles number of verses checks
	 */
	@Test
	public void test2ChroniclesChp1NumVerses(){
		assertEquals(SecondChronicles.CHP1, SECOND_CHRONICLES.getNum(1));
	}
	
	@Test
	public void test2ChroniclesChp2NumVerses(){
		assertEquals(SecondChronicles.CHP2, SECOND_CHRONICLES.getNum(2));
	}
	
	@Test
	public void test2ChroniclesChp3NumVerses(){
		assertEquals(SecondChronicles.CHP3, SECOND_CHRONICLES.getNum(3));
	}
	
	@Test
	public void test2ChroniclesChp4NumVerses(){
		assertEquals(SecondChronicles.CHP4, SECOND_CHRONICLES.getNum(4));
	}
	
	@Test
	public void test2ChroniclesChp5NumVerses(){
		assertEquals(SecondChronicles.CHP5, SECOND_CHRONICLES.getNum(5));
	}
	
	@Test
	public void test2ChroniclesChp6NumVerses(){
		assertEquals(SecondChronicles.CHP6, SECOND_CHRONICLES.getNum(6));
	}
	
	@Test
	public void test2ChroniclesChp7NumVerses(){
		assertEquals(SecondChronicles.CHP7, SECOND_CHRONICLES.getNum(7));
	}
	
	@Test
	public void test2ChroniclesChp8NumVerses(){
		assertEquals(SecondChronicles.CHP8, SECOND_CHRONICLES.getNum(8));
	}
	
	@Test
	public void test2ChroniclesChp9NumVerses(){
		assertEquals(SecondChronicles.CHP9, SECOND_CHRONICLES.getNum(9));
	}
	
	@Test
	public void test2ChroniclesChp10NumVerses(){
		assertEquals(SecondChronicles.CHP10, SECOND_CHRONICLES.getNum(10));
	}
	
	@Test
	public void test2ChroniclesChp11NumVerses(){
		assertEquals(SecondChronicles.CHP11, SECOND_CHRONICLES.getNum(11));
	}
	
	@Test
	public void test2ChroniclesChp12NumVerses(){
		assertEquals(SecondChronicles.CHP12, SECOND_CHRONICLES.getNum(12));
	}
	
	@Test
	public void test2ChroniclesChp13NumVerses(){
		assertEquals(SecondChronicles.CHP13, SECOND_CHRONICLES.getNum(13));
	}
	
	@Test
	public void test2ChroniclesChp14NumVerses(){
		assertEquals(SecondChronicles.CHP14, SECOND_CHRONICLES.getNum(14));
	}
	
	@Test
	public void test2ChroniclesChp15NumVerses(){
		assertEquals(SecondChronicles.CHP15, SECOND_CHRONICLES.getNum(15));
	}
	
	@Test
	public void test2ChroniclesChp16NumVerses(){
		assertEquals(SecondChronicles.CHP16, SECOND_CHRONICLES.getNum(16));
	}
	
	@Test
	public void test2ChroniclesChp17NumVerses(){
		assertEquals(SecondChronicles.CHP17, SECOND_CHRONICLES.getNum(17));
	}
	
	@Test
	public void test2ChroniclesChp18NumVerses(){
		assertEquals(SecondChronicles.CHP18, SECOND_CHRONICLES.getNum(18));
	}
	
	@Test
	public void test2ChroniclesChp19NumVerses(){
		assertEquals(SecondChronicles.CHP19, SECOND_CHRONICLES.getNum(19));
	}
	
	@Test
	public void test2ChroniclesChp20NumVerses(){
		assertEquals(SecondChronicles.CHP20, SECOND_CHRONICLES.getNum(20));
	}
	
	@Test
	public void test2ChroniclesChp21NumVerses(){
		assertEquals(SecondChronicles.CHP21, SECOND_CHRONICLES.getNum(21));
	}
	
	@Test
	public void test2ChroniclesChp22NumVerses(){
		assertEquals(SecondChronicles.CHP22, SECOND_CHRONICLES.getNum(22));
	}
	
	@Test
	public void test2ChroniclesChp23NumVerses(){
		assertEquals(SecondChronicles.CHP23, SECOND_CHRONICLES.getNum(23));
	}
	
	@Test
	public void test2ChroniclesChp24NumVerses(){
		assertEquals(SecondChronicles.CHP24, SECOND_CHRONICLES.getNum(24));
	}
	
	@Test
	public void test2ChroniclesChp25NumVerses(){
		assertEquals(SecondChronicles.CHP25, SECOND_CHRONICLES.getNum(25));
	}
	
	@Test
	public void test2ChroniclesChp26NumVerses(){
		assertEquals(SecondChronicles.CHP26, SECOND_CHRONICLES.getNum(26));
	}
	
	@Test
	public void test2ChroniclesChp27NumVerses(){
		assertEquals(SecondChronicles.CHP27, SECOND_CHRONICLES.getNum(27));
	}
	
	@Test
	public void test2ChroniclesChp28NumVerses(){
		assertEquals(SecondChronicles.CHP28, SECOND_CHRONICLES.getNum(28));
	}
	
	@Test
	public void test2ChroniclesChp29NumVerses(){
		assertEquals(SecondChronicles.CHP29, SECOND_CHRONICLES.getNum(29));
	}
	
	@Test
	public void test2ChroniclesChp30NumVerses(){
		assertEquals(SecondChronicles.CHP30, SECOND_CHRONICLES.getNum(30));
	}
	
	@Test
	public void test2ChroniclesChp31NumVerses(){
		assertEquals(SecondChronicles.CHP31, SECOND_CHRONICLES.getNum(31));
	}
	
	@Test
	public void test2ChroniclesChp32NumVerses(){
		assertEquals(SecondChronicles.CHP32, SECOND_CHRONICLES.getNum(32));
	}
	
	@Test
	public void test2ChroniclesChp33NumVerses(){
		assertEquals(SecondChronicles.CHP33, SECOND_CHRONICLES.getNum(33));
	}
	
	@Test
	public void test2ChroniclesChp34NumVerses(){
		assertEquals(SecondChronicles.CHP34, SECOND_CHRONICLES.getNum(34));
	}
	
	@Test
	public void test2ChroniclesChp35NumVerses(){
		assertEquals(SecondChronicles.CHP35, SECOND_CHRONICLES.getNum(35));
	}
	
	@Test
	public void test2ChroniclesChp36NumVerses(){
		assertEquals(SecondChronicles.CHP36, SECOND_CHRONICLES.getNum(36));
	}
	
	/*
	 * Ezra number of verses checks
	 */
	@Test
	public void testEzraChp1NumVerses(){
		assertEquals(Ezra.CHP1, EZRA.getNum(1));
	}
	
	@Test
	public void testEzraChp2NumVerses(){
		assertEquals(Ezra.CHP2, EZRA.getNum(2));
	}
	
	@Test
	public void testEzraChp3NumVerses(){
		assertEquals(Ezra.CHP3, EZRA.getNum(3));
	}
	
	@Test
	public void testEzraChp4NumVerses(){
		assertEquals(Ezra.CHP4, EZRA.getNum(4));
	}
	
	@Test
	public void testEzraChp5NumVerses(){
		assertEquals(Ezra.CHP5, EZRA.getNum(5));
	}
	
	@Test
	public void testEzraChp6NumVerses(){
		assertEquals(Ezra.CHP6, EZRA.getNum(6));
	}
	
	@Test
	public void testEzraChp7NumVerses(){
		assertEquals(Ezra.CHP7, EZRA.getNum(7));
	}
	
	@Test
	public void testEzraChp8NumVerses(){
		assertEquals(Ezra.CHP8, EZRA.getNum(8));
	}
	
	@Test
	public void testEzraChp9NumVerses(){
		assertEquals(Ezra.CHP9, EZRA.getNum(9));
	}
	
	@Test
	public void testEzraChp10NumVerses(){
		assertEquals(Ezra.CHP10, EZRA.getNum(10));
	}
	
	/*
	 * Nehemiah number of verses checks
	 */
	@Test
	public void testNehemiahChp1NumVerses(){
		assertEquals(Nehemiah.CHP1, NEHEMIAH.getNum(1));
	}
	
	@Test
	public void testNehemiahChp2NumVerses(){
		assertEquals(Nehemiah.CHP2, NEHEMIAH.getNum(2));
	}
	
	@Test
	public void testNehemiahChp3NumVerses(){
		assertEquals(Nehemiah.CHP3, NEHEMIAH.getNum(3));
	}
	
	@Test
	public void testNehemiahChp4NumVerses(){
		assertEquals(Nehemiah.CHP4, NEHEMIAH.getNum(4));
	}
	
	@Test
	public void testNehemiahChp5NumVerses(){
		assertEquals(Nehemiah.CHP5, NEHEMIAH.getNum(5));
	}
	
	@Test
	public void testNehemiahChp6NumVerses(){
		assertEquals(Nehemiah.CHP6, NEHEMIAH.getNum(6));
	}
	
	@Test
	public void testNehemiahChp7NumVerses(){
		assertEquals(Nehemiah.CHP7, NEHEMIAH.getNum(7));
	}
	
	@Test
	public void testNehemiahChp8NumVerses(){
		assertEquals(Nehemiah.CHP8, NEHEMIAH.getNum(8));
	}
	
	@Test
	public void testNehemiahChp9NumVerses(){
		assertEquals(Nehemiah.CHP9, NEHEMIAH.getNum(9));
	}
	
	@Test
	public void testNehemiahChp10NumVerses(){
		assertEquals(Nehemiah.CHP10, NEHEMIAH.getNum(10));
	}
	
	@Test
	public void testNehemiahChp11NumVerses(){
		assertEquals(Nehemiah.CHP11, NEHEMIAH.getNum(11));
	}
	
	@Test
	public void testNehemiahChp12NumVerses(){
		assertEquals(Nehemiah.CHP12, NEHEMIAH.getNum(12));
	}
	
	@Test
	public void testNehemiahChp13NumVerses(){
		assertEquals(Nehemiah.CHP13, NEHEMIAH.getNum(13));
	}
	
	/*
	 * Esther number of verses checks
	 */
	@Test
	public void testEstherChp1NumVerses(){
		assertEquals(Esther.CHP1, ESTHER.getNum(1));
	}
	
	@Test
	public void testEstherChp2NumVerses(){
		assertEquals(Esther.CHP2, ESTHER.getNum(2));
	}
	
	@Test
	public void testEstherChp3NumVerses(){
		assertEquals(Esther.CHP3, ESTHER.getNum(3));
	}
	
	@Test
	public void testEstherChp4NumVerses(){
		assertEquals(Esther.CHP4, ESTHER.getNum(4));
	}
	
	@Test
	public void testEstherChp5NumVerses(){
		assertEquals(Esther.CHP5, ESTHER.getNum(5));
	}
	
	@Test
	public void testEstherChp6NumVerses(){
		assertEquals(Esther.CHP6, ESTHER.getNum(6));
	}
	
	@Test
	public void testEstherChp7NumVerses(){
		assertEquals(Esther.CHP7, ESTHER.getNum(7));
	}
	
	@Test
	public void testEstherChp8NumVerses(){
		assertEquals(Esther.CHP8, ESTHER.getNum(8));
	}
	
	@Test
	public void testEstherChp9NumVerses(){
		assertEquals(Esther.CHP9, ESTHER.getNum(9));
	}
	
	@Test
	public void testEstherChp10NumVerses(){
		assertEquals(Esther.CHP10, ESTHER.getNum(10));
	}
	
	/*
	 * Job number of verses checks
	 */
	@Test
	public void testJobChp1NumVerses(){
		assertEquals(Job.CHP1, JOB.getNum(1));
	}
	
	@Test
	public void testJobChp2NumVerses(){
		assertEquals(Job.CHP2, JOB.getNum(2));
	}
	
	@Test
	public void testJobChp3NumVerses(){
		assertEquals(Job.CHP3, JOB.getNum(3));
	}
	
	@Test
	public void testJobChp4NumVerses(){
		assertEquals(Job.CHP4, JOB.getNum(4));
	}
	
	@Test
	public void testJobChp5NumVerses(){
		assertEquals(Job.CHP5, JOB.getNum(5));
	}
	
	@Test
	public void testJobChp6NumVerses(){
		assertEquals(Job.CHP6, JOB.getNum(6));
	}
	
	@Test
	public void testJobChp7NumVerses(){
		assertEquals(Job.CHP7, JOB.getNum(7));
	}
	
	@Test
	public void testJobChp8NumVerses(){
		assertEquals(Job.CHP8, JOB.getNum(8));
	}
	
	@Test
	public void testJobChp9NumVerses(){
		assertEquals(Job.CHP9, JOB.getNum(9));
	}
	
	@Test
	public void testJobChp10NumVerses(){
		assertEquals(Job.CHP10, JOB.getNum(10));
	}
	
	@Test
	public void testJobChp11NumVerses(){
		assertEquals(Job.CHP11, JOB.getNum(11));
	}
	
	@Test
	public void testJobChp12NumVerses(){
		assertEquals(Job.CHP12, JOB.getNum(12));
	}
	
	@Test
	public void testJobChp13NumVerses(){
		assertEquals(Job.CHP13, JOB.getNum(13));
	}
	
	@Test
	public void testJobChp14NumVerses(){
		assertEquals(Job.CHP14, JOB.getNum(14));
	}
	
	@Test
	public void testJobChp15NumVerses(){
		assertEquals(Job.CHP15, JOB.getNum(15));
	}
	
	@Test
	public void testJobChp16NumVerses(){
		assertEquals(Job.CHP16, JOB.getNum(16));
	}
	
	@Test
	public void testJobChp17NumVerses(){
		assertEquals(Job.CHP17, JOB.getNum(17));
	}
	
	@Test
	public void testJobChp18NumVerses(){
		assertEquals(Job.CHP18, JOB.getNum(18));
	}
	
	@Test
	public void testJobChp19NumVerses(){
		assertEquals(Job.CHP19, JOB.getNum(19));
	}
	
	@Test
	public void testJobChp20NumVerses(){
		assertEquals(Job.CHP20, JOB.getNum(20));
	}
	
	@Test
	public void testJobChp21NumVerses(){
		assertEquals(Job.CHP21, JOB.getNum(21));
	}
	
	@Test
	public void testJobChp22NumVerses(){
		assertEquals(Job.CHP22, JOB.getNum(22));
	}
	
	@Test
	public void testJobChp23NumVerses(){
		assertEquals(Job.CHP23, JOB.getNum(23));
	}
	
	@Test
	public void testJobChp24NumVerses(){
		assertEquals(Job.CHP24, JOB.getNum(24));
	}
	
	@Test
	public void testJobChp25NumVerses(){
		assertEquals(Job.CHP25, JOB.getNum(25));
	}
	
	@Test
	public void testJobChp26NumVerses(){
		assertEquals(Job.CHP26, JOB.getNum(26));
	}
	
	@Test
	public void testJobChp27NumVerses(){
		assertEquals(Job.CHP27, JOB.getNum(27));
	}
	
	@Test
	public void testJobChp28NumVerses(){
		assertEquals(Job.CHP28, JOB.getNum(28));
	}
	
	@Test
	public void testJobChp29NumVerses(){
		assertEquals(Job.CHP29, JOB.getNum(29));
	}
	
	@Test
	public void testJobChp30NumVerses(){
		assertEquals(Job.CHP30, JOB.getNum(30));
	}
	
	@Test
	public void testJobChp31NumVerses(){
		assertEquals(Job.CHP31, JOB.getNum(31));
	}
	
	@Test
	public void testJobChp32NumVerses(){
		assertEquals(Job.CHP32, JOB.getNum(32));
	}
	
	@Test
	public void testJobChp33NumVerses(){
		assertEquals(Job.CHP33, JOB.getNum(33));
	}
	
	@Test
	public void testJobChp34NumVerses(){
		assertEquals(Job.CHP34, JOB.getNum(34));
	}
	
	@Test
	public void testJobChp35NumVerses(){
		assertEquals(Job.CHP35, JOB.getNum(35));
	}
	
	@Test
	public void testJobChp36NumVerses(){
		assertEquals(Job.CHP36, JOB.getNum(36));
	}
	
	@Test
	public void testJobChp37NumVerses(){
		assertEquals(Job.CHP37, JOB.getNum(37));
	}
	
	@Test
	public void testJobChp38NumVerses(){
		assertEquals(Job.CHP38, JOB.getNum(38));
	}
	
	@Test
	public void testJobChp39NumVerses(){
		assertEquals(Job.CHP39, JOB.getNum(39));
	}
	
	@Test
	public void testJobChp40NumVerses(){
		assertEquals(Job.CHP40, JOB.getNum(40));
	}
	
	@Test
	public void testJobChp41NumVerses(){
		assertEquals(Job.CHP41, JOB.getNum(41));
	}
	
	@Test
	public void testJobChp42NumVerses(){
		assertEquals(Job.CHP42, JOB.getNum(42));
	}
	
	/*
	 * Psalms number of verses checks
	 */
	@Test
	public void testPsalmsChp1NumVerses(){
		assertEquals(Psalms.CHP1, PSALMS.getNum(1));
	}
	
	@Test
	public void testPsalmsChp2NumVerses(){
		assertEquals(Psalms.CHP2, PSALMS.getNum(2));
	}
	
	@Test
	public void testPsalmsChp3NumVerses(){
		assertEquals(Psalms.CHP3, PSALMS.getNum(3));
	}
	
	@Test
	public void testPsalmsChp4NumVerses(){
		assertEquals(Psalms.CHP4, PSALMS.getNum(4));
	}
	
	@Test
	public void testPsalmsChp5NumVerses(){
		assertEquals(Psalms.CHP5, PSALMS.getNum(5));
	}
	
	@Test
	public void testPsalmsChp6NumVerses(){
		assertEquals(Psalms.CHP6, PSALMS.getNum(6));
	}
	
	@Test
	public void testPsalmsChp7NumVerses(){
		assertEquals(Psalms.CHP7, PSALMS.getNum(7));
	}
	
	@Test
	public void testPsalmsChp8NumVerses(){
		assertEquals(Psalms.CHP8, PSALMS.getNum(8));
	}
	
	@Test
	public void testPsalmsChp9NumVerses(){
		assertEquals(Psalms.CHP9, PSALMS.getNum(9));
	}
	
	@Test
	public void testPsalmsChp10NumVerses(){
		assertEquals(Psalms.CHP10, PSALMS.getNum(10));
	}
	
	@Test
	public void testPsalmsChp11NumVerses(){
		assertEquals(Psalms.CHP11, PSALMS.getNum(11));
	}
	
	@Test
	public void testPsalmsChp12NumVerses(){
		assertEquals(Psalms.CHP12, PSALMS.getNum(12));
	}
	
	@Test
	public void testPsalmsChp13NumVerses(){
		assertEquals(Psalms.CHP13, PSALMS.getNum(13));
	}
	
	@Test
	public void testPsalmsChp14NumVerses(){
		assertEquals(Psalms.CHP14, PSALMS.getNum(14));
	}
	
	@Test
	public void testPsalmsChp15NumVerses(){
		assertEquals(Psalms.CHP15, PSALMS.getNum(15));
	}
	
	@Test
	public void testPsalmsChp16NumVerses(){
		assertEquals(Psalms.CHP16, PSALMS.getNum(16));
	}
	
	@Test
	public void testPsalmsChp17NumVerses(){
		assertEquals(Psalms.CHP17, PSALMS.getNum(17));
	}
	
	@Test
	public void testPsalmsChp18NumVerses(){
		assertEquals(Psalms.CHP18, PSALMS.getNum(18));
	}
	
	@Test
	public void testPsalmsChp19NumVerses(){
		assertEquals(Psalms.CHP19, PSALMS.getNum(19));
	}
	
	@Test
	public void testPsalmsChp20NumVerses(){
		assertEquals(Psalms.CHP20, PSALMS.getNum(20));
	}
	
	@Test
	public void testPsalmsChp21NumVerses(){
		assertEquals(Psalms.CHP21, PSALMS.getNum(21));
	}
	
	@Test
	public void testPsalmsChp22NumVerses(){
		assertEquals(Psalms.CHP22, PSALMS.getNum(22));
	}
	
	@Test
	public void testPsalmsChp23NumVerses(){
		assertEquals(Psalms.CHP23, PSALMS.getNum(23));
	}
	
	@Test
	public void testPsalmsChp24NumVerses(){
		assertEquals(Psalms.CHP24, PSALMS.getNum(24));
	}
	
	@Test
	public void testPsalmsChp25NumVerses(){
		assertEquals(Psalms.CHP25, PSALMS.getNum(25));
	}
	
	@Test
	public void testPsalmsChp26NumVerses(){
		assertEquals(Psalms.CHP26, PSALMS.getNum(26));
	}
	
	@Test
	public void testPsalmsChp27NumVerses(){
		assertEquals(Psalms.CHP27, PSALMS.getNum(27));
	}
	
	@Test
	public void testPsalmsChp28NumVerses(){
		assertEquals(Psalms.CHP28, PSALMS.getNum(28));
	}
	
	@Test
	public void testPsalmsChp29NumVerses(){
		assertEquals(Psalms.CHP29, PSALMS.getNum(29));
	}
	
	@Test
	public void testPsalmsChp30NumVerses(){
		assertEquals(Psalms.CHP30, PSALMS.getNum(30));
	}
	
	@Test
	public void testPsalmsChp31NumVerses(){
		assertEquals(Psalms.CHP31, PSALMS.getNum(31));
	}
	
	@Test
	public void testPsalmsChp32NumVerses(){
		assertEquals(Psalms.CHP32, PSALMS.getNum(32));
	}
	
	@Test
	public void testPsalmsChp33NumVerses(){
		assertEquals(Psalms.CHP33, PSALMS.getNum(33));
	}
	
	@Test
	public void testPsalmsChp34NumVerses(){
		assertEquals(Psalms.CHP34, PSALMS.getNum(34));
	}
	
	@Test
	public void testPsalmsChp35NumVerses(){
		assertEquals(Psalms.CHP35, PSALMS.getNum(35));
	}
	
	@Test
	public void testPsalmsChp36NumVerses(){
		assertEquals(Psalms.CHP36, PSALMS.getNum(36));
	}
	
	@Test
	public void testPsalmsChp37NumVerses(){
		assertEquals(Psalms.CHP37, PSALMS.getNum(37));
	}
	
	@Test
	public void testPsalmsChp38NumVerses(){
		assertEquals(Psalms.CHP38, PSALMS.getNum(38));
	}
	
	@Test
	public void testPsalmsChp39NumVerses(){
		assertEquals(Psalms.CHP39, PSALMS.getNum(39));
	}
	
	@Test
	public void testPsalmsChp40NumVerses(){
		assertEquals(Psalms.CHP40, PSALMS.getNum(40));
	}
	
	@Test
	public void testPsalmsChp41NumVerses(){
		assertEquals(Psalms.CHP41, PSALMS.getNum(41));
	}
	
	@Test
	public void testPsalmsChp42NumVerses(){
		assertEquals(Psalms.CHP42, PSALMS.getNum(42));
	}
	
	@Test
	public void testPsalmsChp43NumVerses(){
		assertEquals(Psalms.CHP43, PSALMS.getNum(43));
	}
	
	@Test
	public void testPsalmsChp44NumVerses(){
		assertEquals(Psalms.CHP44, PSALMS.getNum(44));
	}
	
	@Test
	public void testPsalmsChp45NumVerses(){
		assertEquals(Psalms.CHP45, PSALMS.getNum(45));
	}
	
	@Test
	public void testPsalmsChp46NumVerses(){
		assertEquals(Psalms.CHP46, PSALMS.getNum(46));
	}
	
	@Test
	public void testPsalmsChp47NumVerses(){
		assertEquals(Psalms.CHP47, PSALMS.getNum(47));
	}
	
	@Test
	public void testPsalmsChp48NumVerses(){
		assertEquals(Psalms.CHP48, PSALMS.getNum(48));
	}
	
	@Test
	public void testPsalmsChp49NumVerses(){
		assertEquals(Psalms.CHP49, PSALMS.getNum(49));
	}
	
	@Test
	public void testPsalmsChp50NumVerses(){
		assertEquals(Psalms.CHP50, PSALMS.getNum(50));
	}
	
	@Test
	public void testPsalmsChp51NumVerses(){
		assertEquals(Psalms.CHP51, PSALMS.getNum(51));
	}
	
	@Test
	public void testPsalmsChp52NumVerses(){
		assertEquals(Psalms.CHP52, PSALMS.getNum(52));
	}
	
	@Test
	public void testPsalmsChp53NumVerses(){
		assertEquals(Psalms.CHP53, PSALMS.getNum(53));
	}
	
	@Test
	public void testPsalmsChp54NumVerses(){
		assertEquals(Psalms.CHP54, PSALMS.getNum(54));
	}
	
	@Test
	public void testPsalmsChp55NumVerses(){
		assertEquals(Psalms.CHP55, PSALMS.getNum(55));
	}
	
	@Test
	public void testPsalmsChp56NumVerses(){
		assertEquals(Psalms.CHP56, PSALMS.getNum(56));
	}
	
	@Test
	public void testPsalmsChp57NumVerses(){
		assertEquals(Psalms.CHP57, PSALMS.getNum(57));
	}
	
	@Test
	public void testPsalmsChp58NumVerses(){
		assertEquals(Psalms.CHP58, PSALMS.getNum(58));
	}
	
	@Test
	public void testPsalmsChp59NumVerses(){
		assertEquals(Psalms.CHP59, PSALMS.getNum(59));
	}
	
	@Test
	public void testPsalmsChp60NumVerses(){
		assertEquals(Psalms.CHP60, PSALMS.getNum(60));
	}
	
	@Test
	public void testPsalmsChp61NumVerses(){
		assertEquals(Psalms.CHP61, PSALMS.getNum(61));
	}
	
	@Test
	public void testPsalmsChp62NumVerses(){
		assertEquals(Psalms.CHP62, PSALMS.getNum(62));
	}
	
	@Test
	public void testPsalmsChp63NumVerses(){
		assertEquals(Psalms.CHP63, PSALMS.getNum(63));
	}
	
	@Test
	public void testPsalmsChp64NumVerses(){
		assertEquals(Psalms.CHP64, PSALMS.getNum(64));
	}
	
	@Test
	public void testPsalmsChp65NumVerses(){
		assertEquals(Psalms.CHP65, PSALMS.getNum(65));
	}
	
	@Test
	public void testPsalmsChp66NumVerses(){
		assertEquals(Psalms.CHP66, PSALMS.getNum(66));
	}
	
	@Test
	public void testPsalmsChp67NumVerses(){
		assertEquals(Psalms.CHP67, PSALMS.getNum(67));
	}
	
	@Test
	public void testPsalmsChp68NumVerses(){
		assertEquals(Psalms.CHP68, PSALMS.getNum(68));
	}
	
	@Test
	public void testPsalmsChp69NumVerses(){
		assertEquals(Psalms.CHP69, PSALMS.getNum(69));
	}
	
	@Test
	public void testPsalmsChp70NumVerses(){
		assertEquals(Psalms.CHP70, PSALMS.getNum(70));
	}
	
	@Test
	public void testPsalmsChp71NumVerses(){
		assertEquals(Psalms.CHP71, PSALMS.getNum(71));
	}
	
	@Test
	public void testPsalmsChp72NumVerses(){
		assertEquals(Psalms.CHP72, PSALMS.getNum(72));
	}
	
	@Test
	public void testPsalmsChp73NumVerses(){
		assertEquals(Psalms.CHP73, PSALMS.getNum(73));
	}
	
	@Test
	public void testPsalmsChp74NumVerses(){
		assertEquals(Psalms.CHP74, PSALMS.getNum(74));
	}
	
	@Test
	public void testPsalmsChp75NumVerses(){
		assertEquals(Psalms.CHP75, PSALMS.getNum(75));
	}
	
	@Test
	public void testPsalmsChp76NumVerses(){
		assertEquals(Psalms.CHP76, PSALMS.getNum(76));
	}
	
	@Test
	public void testPsalmsChp77NumVerses(){
		assertEquals(Psalms.CHP77, PSALMS.getNum(77));
	}
	
	@Test
	public void testPsalmsChp78NumVerses(){
		assertEquals(Psalms.CHP78, PSALMS.getNum(78));
	}
	
	@Test
	public void testPsalmsChp79NumVerses(){
		assertEquals(Psalms.CHP79, PSALMS.getNum(79));
	}
	
	@Test
	public void testPsalmsChp80NumVerses(){
		assertEquals(Psalms.CHP80, PSALMS.getNum(80));
	}
	
	@Test
	public void testPsalmsChp81NumVerses(){
		assertEquals(Psalms.CHP81, PSALMS.getNum(81));
	}
	
	@Test
	public void testPsalmsChp82NumVerses(){
		assertEquals(Psalms.CHP82, PSALMS.getNum(82));
	}
	
	@Test
	public void testPsalmsChp83NumVerses(){
		assertEquals(Psalms.CHP83, PSALMS.getNum(83));
	}
	
	@Test
	public void testPsalmsChp84NumVerses(){
		assertEquals(Psalms.CHP84, PSALMS.getNum(84));
	}
	
	@Test
	public void testPsalmsChp85NumVerses(){
		assertEquals(Psalms.CHP85, PSALMS.getNum(85));
	}
	
	@Test
	public void testPsalmsChp86NumVerses(){
		assertEquals(Psalms.CHP86, PSALMS.getNum(86));
	}
	
	@Test
	public void testPsalmsChp87NumVerses(){
		assertEquals(Psalms.CHP87, PSALMS.getNum(87));
	}
	
	@Test
	public void testPsalmsChp88NumVerses(){
		assertEquals(Psalms.CHP88, PSALMS.getNum(88));
	}
	
	@Test
	public void testPsalmsChp89NumVerses(){
		assertEquals(Psalms.CHP89, PSALMS.getNum(89));
	}
	
	@Test
	public void testPsalmsChp90NumVerses(){
		assertEquals(Psalms.CHP90, PSALMS.getNum(90));
	}
	
	@Test
	public void testPsalmsChp91NumVerses(){
		assertEquals(Psalms.CHP91, PSALMS.getNum(91));
	}
	
	@Test
	public void testPsalmsChp92NumVerses(){
		assertEquals(Psalms.CHP92, PSALMS.getNum(92));
	}
	
	@Test
	public void testPsalmsChp93NumVerses(){
		assertEquals(Psalms.CHP93, PSALMS.getNum(93));
	}
	
	@Test
	public void testPsalmsChp94NumVerses(){
		assertEquals(Psalms.CHP94, PSALMS.getNum(94));
	}
	
	@Test
	public void testPsalmsChp95NumVerses(){
		assertEquals(Psalms.CHP95, PSALMS.getNum(95));
	}
	
	@Test
	public void testPsalmsChp96NumVerses(){
		assertEquals(Psalms.CHP96, PSALMS.getNum(96));
	}
	
	@Test
	public void testPsalmsChp97NumVerses(){
		assertEquals(Psalms.CHP97, PSALMS.getNum(97));
	}
	
	@Test
	public void testPsalmsChp98NumVerses(){
		assertEquals(Psalms.CHP98, PSALMS.getNum(98));
	}
	
	@Test
	public void testPsalmsChp99NumVerses(){
		assertEquals(Psalms.CHP99, PSALMS.getNum(99));
	}
	
	@Test
	public void testPsalmsChp100NumVerses(){
		assertEquals(Psalms.CHP100, PSALMS.getNum(100));
	}
	
	@Test
	public void testPsalmsChp101NumVerses(){
		assertEquals(Psalms.CHP101, PSALMS.getNum(101));
	}
	
	@Test
	public void testPsalmsChp102NumVerses(){
		assertEquals(Psalms.CHP102, PSALMS.getNum(102));
	}
	
	@Test
	public void testPsalmsChp103NumVerses(){
		assertEquals(Psalms.CHP103, PSALMS.getNum(103));
	}
	
	@Test
	public void testPsalmsChp104NumVerses(){
		assertEquals(Psalms.CHP104, PSALMS.getNum(104));
	}
	
	@Test
	public void testPsalmsChp105NumVerses(){
		assertEquals(Psalms.CHP105, PSALMS.getNum(105));
	}
	
	@Test
	public void testPsalmsChp106NumVerses(){
		assertEquals(Psalms.CHP106, PSALMS.getNum(106));
	}
	
	@Test
	public void testPsalmsChp107NumVerses(){
		assertEquals(Psalms.CHP107, PSALMS.getNum(107));
	}
	
	@Test
	public void testPsalmsChp108NumVerses(){
		assertEquals(Psalms.CHP108, PSALMS.getNum(108));
	}
	
	@Test
	public void testPsalmsChp109NumVerses(){
		assertEquals(Psalms.CHP109, PSALMS.getNum(109));
	}
	
	@Test
	public void testPsalmsChp110NumVerses(){
		assertEquals(Psalms.CHP110, PSALMS.getNum(110));
	}
	
	@Test
	public void testPsalmsChp111NumVerses(){
		assertEquals(Psalms.CHP111, PSALMS.getNum(111));
	}
	
	@Test
	public void testPsalmsChp112NumVerses(){
		assertEquals(Psalms.CHP112, PSALMS.getNum(112));
	}
	
	@Test
	public void testPsalmsChp113NumVerses(){
		assertEquals(Psalms.CHP113, PSALMS.getNum(113));
	}
	
	@Test
	public void testPsalmsChp114NumVerses(){
		assertEquals(Psalms.CHP114, PSALMS.getNum(114));
	}
	
	@Test
	public void testPsalmsChp115NumVerses(){
		assertEquals(Psalms.CHP115, PSALMS.getNum(115));
	}
	
	@Test
	public void testPsalmsChp116NumVerses(){
		assertEquals(Psalms.CHP116, PSALMS.getNum(116));
	}
	
	@Test
	public void testPsalmsChp117NumVerses(){
		assertEquals(Psalms.CHP117, PSALMS.getNum(117));
	}
	
	@Test
	public void testPsalmsChp118NumVerses(){
		assertEquals(Psalms.CHP118, PSALMS.getNum(118));
	}
	
	@Test
	public void testPsalmsChp119NumVerses(){
		assertEquals(Psalms.CHP119, PSALMS.getNum(119));
	}
	
	@Test
	public void testPsalmsChp120NumVerses(){
		assertEquals(Psalms.CHP120, PSALMS.getNum(120));
	}
	
	@Test
	public void testPsalmsChp121NumVerses(){
		assertEquals(Psalms.CHP121, PSALMS.getNum(121));
	}
	
	@Test
	public void testPsalmsChp122NumVerses(){
		assertEquals(Psalms.CHP122, PSALMS.getNum(122));
	}
	
	@Test
	public void testPsalmsChp123NumVerses(){
		assertEquals(Psalms.CHP123, PSALMS.getNum(123));
	}
	
	@Test
	public void testPsalmsChp124NumVerses(){
		assertEquals(Psalms.CHP124, PSALMS.getNum(124));
	}
	
	@Test
	public void testPsalmsChp125NumVerses(){
		assertEquals(Psalms.CHP125, PSALMS.getNum(125));
	}
	
	@Test
	public void testPsalmsChp126NumVerses(){
		assertEquals(Psalms.CHP126, PSALMS.getNum(126));
	}
	
	@Test
	public void testPsalmsChp127NumVerses(){
		assertEquals(Psalms.CHP127, PSALMS.getNum(127));
	}
	
	@Test
	public void testPsalmsChp128NumVerses(){
		assertEquals(Psalms.CHP128, PSALMS.getNum(128));
	}
	
	@Test
	public void testPsalmsChp129NumVerses(){
		assertEquals(Psalms.CHP129, PSALMS.getNum(129));
	}
	
	@Test
	public void testPsalmsChp130NumVerses(){
		assertEquals(Psalms.CHP130, PSALMS.getNum(130));
	}
	
	@Test
	public void testPsalmsChp131NumVerses(){
		assertEquals(Psalms.CHP131, PSALMS.getNum(131));
	}
	
	@Test
	public void testPsalmsChp132NumVerses(){
		assertEquals(Psalms.CHP132, PSALMS.getNum(132));
	}
	
	@Test
	public void testPsalmsChp133NumVerses(){
		assertEquals(Psalms.CHP133, PSALMS.getNum(133));
	}
	
	@Test
	public void testPsalmsChp134NumVerses(){
		assertEquals(Psalms.CHP134, PSALMS.getNum(134));
	}
	
	@Test
	public void testPsalmsChp135NumVerses(){
		assertEquals(Psalms.CHP135, PSALMS.getNum(135));
	}
	
	@Test
	public void testPsalmsChp136NumVerses(){
		assertEquals(Psalms.CHP136, PSALMS.getNum(136));
	}
	
	@Test
	public void testPsalmsChp137NumVerses(){
		assertEquals(Psalms.CHP137, PSALMS.getNum(137));
	}
	
	@Test
	public void testPsalmsChp138NumVerses(){
		assertEquals(Psalms.CHP138, PSALMS.getNum(138));
	}
	
	@Test
	public void testPsalmsChp139NumVerses(){
		assertEquals(Psalms.CHP139, PSALMS.getNum(139));
	}
	
	@Test
	public void testPsalmsChp140NumVerses(){
		assertEquals(Psalms.CHP140, PSALMS.getNum(140));
	}
	
	@Test
	public void testPsalmsChp141NumVerses(){
		assertEquals(Psalms.CHP141, PSALMS.getNum(141));
	}
	
	@Test
	public void testPsalmsChp142NumVerses(){
		assertEquals(Psalms.CHP142, PSALMS.getNum(142));
	}
	
	@Test
	public void testPsalmsChp143NumVerses(){
		assertEquals(Psalms.CHP143, PSALMS.getNum(143));
	}
	
	@Test
	public void testPsalmsChp144NumVerses(){
		assertEquals(Psalms.CHP144, PSALMS.getNum(144));
	}
	
	@Test
	public void testPsalmsChp145NumVerses(){
		assertEquals(Psalms.CHP145, PSALMS.getNum(145));
	}
	
	@Test
	public void testPsalmsChp146NumVerses(){
		assertEquals(Psalms.CHP146, PSALMS.getNum(146));
	}
	
	@Test
	public void testPsalmsChp147NumVerses(){
		assertEquals(Psalms.CHP147, PSALMS.getNum(147));
	}
	
	@Test
	public void testPsalmsChp148NumVerses(){
		assertEquals(Psalms.CHP148, PSALMS.getNum(148));
	}
	
	@Test
	public void testPsalmsChp149NumVerses(){
		assertEquals(Psalms.CHP149, PSALMS.getNum(149));
	}
	
	@Test
	public void testPsalmsChp150NumVerses(){
		assertEquals(Psalms.CHP150, PSALMS.getNum(150));
	}
	
	/*
	 * Proverbs number of verses checks
	 */
	@Test
	public void testProverbsChp1NumVerses(){
		assertEquals(Proverbs.CHP1, PROVERBS.getNum(1));
	}
	
	@Test
	public void testProverbsChp2NumVerses(){
		assertEquals(Proverbs.CHP2, PROVERBS.getNum(2));
	}
	
	@Test
	public void testProverbsChp3NumVerses(){
		assertEquals(Proverbs.CHP3, PROVERBS.getNum(3));
	}
	
	@Test
	public void testProverbsChp4NumVerses(){
		assertEquals(Proverbs.CHP4, PROVERBS.getNum(4));
	}
	
	@Test
	public void testProverbsChp5NumVerses(){
		assertEquals(Proverbs.CHP5, PROVERBS.getNum(5));
	}
	
	@Test
	public void testProverbsChp6NumVerses(){
		assertEquals(Proverbs.CHP6, PROVERBS.getNum(6));
	}
	
	@Test
	public void testProverbsChp7NumVerses(){
		assertEquals(Proverbs.CHP7, PROVERBS.getNum(7));
	}
	
	@Test
	public void testProverbsChp8NumVerses(){
		assertEquals(Proverbs.CHP8, PROVERBS.getNum(8));
	}
	
	@Test
	public void testProverbsChp9NumVerses(){
		assertEquals(Proverbs.CHP9, PROVERBS.getNum(9));
	}
	
	@Test
	public void testProverbsChp10NumVerses(){
		assertEquals(Proverbs.CHP10, PROVERBS.getNum(10));
	}
	
	@Test
	public void testProverbsChp11NumVerses(){
		assertEquals(Proverbs.CHP11, PROVERBS.getNum(11));
	}
	
	@Test
	public void testProverbsChp12NumVerses(){
		assertEquals(Proverbs.CHP12, PROVERBS.getNum(12));
	}
	
	@Test
	public void testProverbsChp13NumVerses(){
		assertEquals(Proverbs.CHP13, PROVERBS.getNum(13));
	}
	
	@Test
	public void testProverbsChp14NumVerses(){
		assertEquals(Proverbs.CHP14, PROVERBS.getNum(14));
	}
	
	@Test
	public void testProverbsChp15NumVerses(){
		assertEquals(Proverbs.CHP15, PROVERBS.getNum(15));
	}
	
	@Test
	public void testProverbsChp16NumVerses(){
		assertEquals(Proverbs.CHP16, PROVERBS.getNum(16));
	}
	
	@Test
	public void testProverbsChp17NumVerses(){
		assertEquals(Proverbs.CHP17, PROVERBS.getNum(17));
	}
	
	@Test
	public void testProverbsChp18NumVerses(){
		assertEquals(Proverbs.CHP18, PROVERBS.getNum(18));
	}
	
	@Test
	public void testProverbsChp19NumVerses(){
		assertEquals(Proverbs.CHP19, PROVERBS.getNum(19));
	}
	
	@Test
	public void testProverbsChp20NumVerses(){
		assertEquals(Proverbs.CHP20, PROVERBS.getNum(20));
	}
	
	@Test
	public void testProverbsChp21NumVerses(){
		assertEquals(Proverbs.CHP21, PROVERBS.getNum(21));
	}
	
	@Test
	public void testProverbsChp22NumVerses(){
		assertEquals(Proverbs.CHP22, PROVERBS.getNum(22));
	}
	
	@Test
	public void testProverbsChp23NumVerses(){
		assertEquals(Proverbs.CHP23, PROVERBS.getNum(23));
	}
	
	@Test
	public void testProverbsChp24NumVerses(){
		assertEquals(Proverbs.CHP24, PROVERBS.getNum(24));
	}
	
	@Test
	public void testProverbsChp25NumVerses(){
		assertEquals(Proverbs.CHP25, PROVERBS.getNum(25));
	}
	
	@Test
	public void testProverbsChp26NumVerses(){
		assertEquals(Proverbs.CHP26, PROVERBS.getNum(26));
	}
	
	@Test
	public void testProverbsChp27NumVerses(){
		assertEquals(Proverbs.CHP27, PROVERBS.getNum(27));
	}
	
	@Test
	public void testProverbsChp28NumVerses(){
		assertEquals(Proverbs.CHP28, PROVERBS.getNum(28));
	}
	
	@Test
	public void testProverbsChp29NumVerses(){
		assertEquals(Proverbs.CHP29, PROVERBS.getNum(29));
	}
	
	@Test
	public void testProverbsChp30NumVerses(){
		assertEquals(Proverbs.CHP30, PROVERBS.getNum(30));
	}
	
	@Test
	public void testProverbsChp31NumVerses(){
		assertEquals(Proverbs.CHP31, PROVERBS.getNum(31));
	}
	
	/*
	 * Ecclesiastes number of verses checks
	 */
	@Test
	public void testEcclesiastesChp1NumVerses(){
		assertEquals(Ecclesiastes.CHP1, ECCLESIASTES.getNum(1));
	}
	
	@Test
	public void testEcclesiastesChp2NumVerses(){
		assertEquals(Ecclesiastes.CHP2, ECCLESIASTES.getNum(2));
	}
	
	@Test
	public void testEcclesiastesChp3NumVerses(){
		assertEquals(Ecclesiastes.CHP3, ECCLESIASTES.getNum(3));
	}
	
	@Test
	public void testEcclesiastesChp4NumVerses(){
		assertEquals(Ecclesiastes.CHP4, ECCLESIASTES.getNum(4));
	}
	
	@Test
	public void testEcclesiastesChp5NumVerses(){
		assertEquals(Ecclesiastes.CHP5, ECCLESIASTES.getNum(5));
	}
	
	@Test
	public void testEcclesiastesChp6NumVerses(){
		assertEquals(Ecclesiastes.CHP6, ECCLESIASTES.getNum(6));
	}
	
	@Test
	public void testEcclesiastesChp7NumVerses(){
		assertEquals(Ecclesiastes.CHP7, ECCLESIASTES.getNum(7));
	}
	
	@Test
	public void testEcclesiastesChp8NumVerses(){
		assertEquals(Ecclesiastes.CHP8, ECCLESIASTES.getNum(8));
	}
	
	@Test
	public void testEcclesiastesChp9NumVerses(){
		assertEquals(Ecclesiastes.CHP9, ECCLESIASTES.getNum(9));
	}
	
	@Test
	public void testEcclesiastesChp10NumVerses(){
		assertEquals(Ecclesiastes.CHP10, ECCLESIASTES.getNum(10));
	}
	
	@Test
	public void testEcclesiastesChp11NumVerses(){
		assertEquals(Ecclesiastes.CHP11, ECCLESIASTES.getNum(11));
	}
	
	@Test
	public void testEcclesiastesChp12NumVerses(){
		assertEquals(Ecclesiastes.CHP12, ECCLESIASTES.getNum(12));
	}
	
	/*
	 * Song of Songs number of verses checks
	 */
	@Test
	public void testSongofSongsChp1NumVerses(){
		assertEquals(SongofSongs.CHP1, SONG_OF_SONGS.getNum(1));
	}
	
	@Test
	public void testSongofSongsChp2NumVerses(){
		assertEquals(SongofSongs.CHP2, SONG_OF_SONGS.getNum(2));
	}
	
	@Test
	public void testSongofSongsChp3NumVerses(){
		assertEquals(SongofSongs.CHP3, SONG_OF_SONGS.getNum(3));
	}
	
	@Test
	public void testSongofSongsChp4NumVerses(){
		assertEquals(SongofSongs.CHP4, SONG_OF_SONGS.getNum(4));
	}
	
	@Test
	public void testSongofSongsChp5NumVerses(){
		assertEquals(SongofSongs.CHP5, SONG_OF_SONGS.getNum(5));
	}
	
	@Test
	public void testSongofSongsChp6NumVerses(){
		assertEquals(SongofSongs.CHP6, SONG_OF_SONGS.getNum(6));
	}
	
	@Test
	public void testSongofSongsChp7NumVerses(){
		assertEquals(SongofSongs.CHP7, SONG_OF_SONGS.getNum(7));
	}
	
	@Test
	public void testSongofSongsChp8NumVerses(){
		assertEquals(SongofSongs.CHP8, SONG_OF_SONGS.getNum(8));
	}
	
	/*
	 * Isaiah number of verses checks
	 */
	@Test
	public void testIsaiahChp1NumVerses(){
		assertEquals(Isaiah.CHP1, ISAIAH.getNum(1));
	}
	
	@Test
	public void testIsaiahChp2NumVerses(){
		assertEquals(Isaiah.CHP2, ISAIAH.getNum(2));
	}
	
	@Test
	public void testIsaiahChp3NumVerses(){
		assertEquals(Isaiah.CHP3, ISAIAH.getNum(3));
	}
	
	@Test
	public void testIsaiahChp4NumVerses(){
		assertEquals(Isaiah.CHP4, ISAIAH.getNum(4));
	}
	
	@Test
	public void testIsaiahChp5NumVerses(){
		assertEquals(Isaiah.CHP5, ISAIAH.getNum(5));
	}
	
	@Test
	public void testIsaiahChp6NumVerses(){
		assertEquals(Isaiah.CHP6, ISAIAH.getNum(6));
	}
	
	@Test
	public void testIsaiahChp7NumVerses(){
		assertEquals(Isaiah.CHP7, ISAIAH.getNum(7));
	}
	
	@Test
	public void testIsaiahChp8NumVerses(){
		assertEquals(Isaiah.CHP8, ISAIAH.getNum(8));
	}
	
	@Test
	public void testIsaiahChp9NumVerses(){
		assertEquals(Isaiah.CHP9, ISAIAH.getNum(9));
	}
	
	@Test
	public void testIsaiahChp10NumVerses(){
		assertEquals(Isaiah.CHP10, ISAIAH.getNum(10));
	}
	
	@Test
	public void testIsaiahChp11NumVerses(){
		assertEquals(Isaiah.CHP11, ISAIAH.getNum(11));
	}
	
	@Test
	public void testIsaiahChp12NumVerses(){
		assertEquals(Isaiah.CHP12, ISAIAH.getNum(12));
	}
	
	@Test
	public void testIsaiahChp13NumVerses(){
		assertEquals(Isaiah.CHP13, ISAIAH.getNum(13));
	}
	
	@Test
	public void testIsaiahChp14NumVerses(){
		assertEquals(Isaiah.CHP14, ISAIAH.getNum(14));
	}
	
	@Test
	public void testIsaiahChp15NumVerses(){
		assertEquals(Isaiah.CHP15, ISAIAH.getNum(15));
	}
	
	@Test
	public void testIsaiahChp16NumVerses(){
		assertEquals(Isaiah.CHP16, ISAIAH.getNum(16));
	}
	
	@Test
	public void testIsaiahChp17NumVerses(){
		assertEquals(Isaiah.CHP17, ISAIAH.getNum(17));
	}
	
	@Test
	public void testIsaiahChp18NumVerses(){
		assertEquals(Isaiah.CHP18, ISAIAH.getNum(18));
	}
	
	@Test
	public void testIsaiahChp19NumVerses(){
		assertEquals(Isaiah.CHP19, ISAIAH.getNum(19));
	}
	
	@Test
	public void testIsaiahChp20NumVerses(){
		assertEquals(Isaiah.CHP20, ISAIAH.getNum(20));
	}
	
	@Test
	public void testIsaiahChp21NumVerses(){
		assertEquals(Isaiah.CHP21, ISAIAH.getNum(21));
	}
	
	@Test
	public void testIsaiahChp22NumVerses(){
		assertEquals(Isaiah.CHP22, ISAIAH.getNum(22));
	}
	
	@Test
	public void testIsaiahChp23NumVerses(){
		assertEquals(Isaiah.CHP23, ISAIAH.getNum(23));
	}
	
	@Test
	public void testIsaiahChp24NumVerses(){
		assertEquals(Isaiah.CHP24, ISAIAH.getNum(24));
	}
	
	@Test
	public void testIsaiahChp25NumVerses(){
		assertEquals(Isaiah.CHP25, ISAIAH.getNum(25));
	}
	
	@Test
	public void testIsaiahChp26NumVerses(){
		assertEquals(Isaiah.CHP26, ISAIAH.getNum(26));
	}
	
	@Test
	public void testIsaiahChp27NumVerses(){
		assertEquals(Isaiah.CHP27, ISAIAH.getNum(27));
	}
	
	@Test
	public void testIsaiahChp28NumVerses(){
		assertEquals(Isaiah.CHP28, ISAIAH.getNum(28));
	}
	
	@Test
	public void testIsaiahChp29NumVerses(){
		assertEquals(Isaiah.CHP29, ISAIAH.getNum(29));
	}
	
	@Test
	public void testIsaiahChp30NumVerses(){
		assertEquals(Isaiah.CHP30, ISAIAH.getNum(30));
	}
	
	@Test
	public void testIsaiahChp31NumVerses(){
		assertEquals(Isaiah.CHP31, ISAIAH.getNum(31));
	}
	
	@Test
	public void testIsaiahChp32NumVerses(){
		assertEquals(Isaiah.CHP32, ISAIAH.getNum(32));
	}
	
	@Test
	public void testIsaiahChp33NumVerses(){
		assertEquals(Isaiah.CHP33, ISAIAH.getNum(33));
	}
	
	@Test
	public void testIsaiahChp34NumVerses(){
		assertEquals(Isaiah.CHP34, ISAIAH.getNum(34));
	}
	
	@Test
	public void testIsaiahChp35NumVerses(){
		assertEquals(Isaiah.CHP35, ISAIAH.getNum(35));
	}
	
	@Test
	public void testIsaiahChp36NumVerses(){
		assertEquals(Isaiah.CHP36, ISAIAH.getNum(36));
	}
	
	@Test
	public void testIsaiahChp37NumVerses(){
		assertEquals(Isaiah.CHP37, ISAIAH.getNum(37));
	}
	
	@Test
	public void testIsaiahChp38NumVerses(){
		assertEquals(Isaiah.CHP38, ISAIAH.getNum(38));
	}
	
	@Test
	public void testIsaiahChp39NumVerses(){
		assertEquals(Isaiah.CHP39, ISAIAH.getNum(39));
	}
	
	@Test
	public void testIsaiahChp40NumVerses(){
		assertEquals(Isaiah.CHP40, ISAIAH.getNum(40));
	}
	
	@Test
	public void testIsaiahChp41NumVerses(){
		assertEquals(Isaiah.CHP41, ISAIAH.getNum(41));
	}
	
	@Test
	public void testIsaiahChp42NumVerses(){
		assertEquals(Isaiah.CHP42, ISAIAH.getNum(42));
	}
	
	@Test
	public void testIsaiahChp43NumVerses(){
		assertEquals(Isaiah.CHP43, ISAIAH.getNum(43));
	}
	
	@Test
	public void testIsaiahChp44NumVerses(){
		assertEquals(Isaiah.CHP44, ISAIAH.getNum(44));
	}
	
	@Test
	public void testIsaiahChp45NumVerses(){
		assertEquals(Isaiah.CHP45, ISAIAH.getNum(45));
	}
	
	@Test
	public void testIsaiahChp46NumVerses(){
		assertEquals(Isaiah.CHP46, ISAIAH.getNum(46));
	}
	
	@Test
	public void testIsaiahChp47NumVerses(){
		assertEquals(Isaiah.CHP47, ISAIAH.getNum(47));
	}
	
	@Test
	public void testIsaiahChp48NumVerses(){
		assertEquals(Isaiah.CHP48, ISAIAH.getNum(48));
	}
	
	@Test
	public void testIsaiahChp49NumVerses(){
		assertEquals(Isaiah.CHP49, ISAIAH.getNum(49));
	}
	
	@Test
	public void testIsaiahChp50NumVerses(){
		assertEquals(Isaiah.CHP50, ISAIAH.getNum(50));
	}
	
	@Test
	public void testIsaiahChp51NumVerses(){
		assertEquals(Isaiah.CHP51, ISAIAH.getNum(51));
	}
	
	@Test
	public void testIsaiahChp52NumVerses(){
		assertEquals(Isaiah.CHP52, ISAIAH.getNum(52));
	}
	
	@Test
	public void testIsaiahChp53NumVerses(){
		assertEquals(Isaiah.CHP53, ISAIAH.getNum(53));
	}
	
	@Test
	public void testIsaiahChp54NumVerses(){
		assertEquals(Isaiah.CHP54, ISAIAH.getNum(54));
	}
	
	@Test
	public void testIsaiahChp55NumVerses(){
		assertEquals(Isaiah.CHP55, ISAIAH.getNum(55));
	}
	
	@Test
	public void testIsaiahChp56NumVerses(){
		assertEquals(Isaiah.CHP56, ISAIAH.getNum(56));
	}
	
	@Test
	public void testIsaiahChp57NumVerses(){
		assertEquals(Isaiah.CHP57, ISAIAH.getNum(57));
	}
	
	@Test
	public void testIsaiahChp58NumVerses(){
		assertEquals(Isaiah.CHP58, ISAIAH.getNum(58));
	}
	
	@Test
	public void testIsaiahChp59NumVerses(){
		assertEquals(Isaiah.CHP59, ISAIAH.getNum(59));
	}
	
	@Test
	public void testIsaiahChp60NumVerses(){
		assertEquals(Isaiah.CHP60, ISAIAH.getNum(60));
	}
	
	@Test
	public void testIsaiahChp61NumVerses(){
		assertEquals(Isaiah.CHP61, ISAIAH.getNum(61));
	}
	
	@Test
	public void testIsaiahChp62NumVerses(){
		assertEquals(Isaiah.CHP62, ISAIAH.getNum(62));
	}
	
	@Test
	public void testIsaiahChp63NumVerses(){
		assertEquals(Isaiah.CHP63, ISAIAH.getNum(63));
	}
	
	@Test
	public void testIsaiahChp64NumVerses(){
		assertEquals(Isaiah.CHP64, ISAIAH.getNum(64));
	}
	
	@Test
	public void testIsaiahChp65NumVerses(){
		assertEquals(Isaiah.CHP65, ISAIAH.getNum(65));
	}
	
	@Test
	public void testIsaiahChp66NumVerses(){
		assertEquals(Isaiah.CHP66, ISAIAH.getNum(66));
	}
	
	/*
	 * Jeremiah number of verses checks
	 */
	@Test
	public void testJeremiahChp1NumVerses(){
		assertEquals(Jeremiah.CHP1, JEREMIAH.getNum(1));
	}
	
	@Test
	public void testJeremiahChp2NumVerses(){
		assertEquals(Jeremiah.CHP2, JEREMIAH.getNum(2));
	}
	
	@Test
	public void testJeremiahChp3NumVerses(){
		assertEquals(Jeremiah.CHP3, JEREMIAH.getNum(3));
	}
	
	@Test
	public void testJeremiahChp4NumVerses(){
		assertEquals(Jeremiah.CHP4, JEREMIAH.getNum(4));
	}
	
	@Test
	public void testJeremiahChp5NumVerses(){
		assertEquals(Jeremiah.CHP5, JEREMIAH.getNum(5));
	}
	
	@Test
	public void testJeremiahChp6NumVerses(){
		assertEquals(Jeremiah.CHP6, JEREMIAH.getNum(6));
	}
	
	@Test
	public void testJeremiahChp7NumVerses(){
		assertEquals(Jeremiah.CHP7, JEREMIAH.getNum(7));
	}
	
	@Test
	public void testJeremiahChp8NumVerses(){
		assertEquals(Jeremiah.CHP8, JEREMIAH.getNum(8));
	}
	
	@Test
	public void testJeremiahChp9NumVerses(){
		assertEquals(Jeremiah.CHP9, JEREMIAH.getNum(9));
	}
	
	@Test
	public void testJeremiahChp10NumVerses(){
		assertEquals(Jeremiah.CHP10, JEREMIAH.getNum(10));
	}
	
	@Test
	public void testJeremiahChp11NumVerses(){
		assertEquals(Jeremiah.CHP11, JEREMIAH.getNum(11));
	}
	
	@Test
	public void testJeremiahChp12NumVerses(){
		assertEquals(Jeremiah.CHP12, JEREMIAH.getNum(12));
	}
	
	@Test
	public void testJeremiahChp13NumVerses(){
		assertEquals(Jeremiah.CHP13, JEREMIAH.getNum(13));
	}
	
	@Test
	public void testJeremiahChp14NumVerses(){
		assertEquals(Jeremiah.CHP14, JEREMIAH.getNum(14));
	}
	
	@Test
	public void testJeremiahChp15NumVerses(){
		assertEquals(Jeremiah.CHP15, JEREMIAH.getNum(15));
	}
	
	@Test
	public void testJeremiahChp16NumVerses(){
		assertEquals(Jeremiah.CHP16, JEREMIAH.getNum(16));
	}
	
	@Test
	public void testJeremiahChp17NumVerses(){
		assertEquals(Jeremiah.CHP17, JEREMIAH.getNum(17));
	}
	
	@Test
	public void testJeremiahChp18NumVerses(){
		assertEquals(Jeremiah.CHP18, JEREMIAH.getNum(18));
	}
	
	@Test
	public void testJeremiahChp19NumVerses(){
		assertEquals(Jeremiah.CHP19, JEREMIAH.getNum(19));
	}
	
	@Test
	public void testJeremiahChp20NumVerses(){
		assertEquals(Jeremiah.CHP20, JEREMIAH.getNum(20));
	}
	
	@Test
	public void testJeremiahChp21NumVerses(){
		assertEquals(Jeremiah.CHP21, JEREMIAH.getNum(21));
	}
	
	@Test
	public void testJeremiahChp22NumVerses(){
		assertEquals(Jeremiah.CHP22, JEREMIAH.getNum(22));
	}
	
	@Test
	public void testJeremiahChp23NumVerses(){
		assertEquals(Jeremiah.CHP23, JEREMIAH.getNum(23));
	}
	
	@Test
	public void testJeremiahChp24NumVerses(){
		assertEquals(Jeremiah.CHP24, JEREMIAH.getNum(24));
	}
	
	@Test
	public void testJeremiahChp25NumVerses(){
		assertEquals(Jeremiah.CHP25, JEREMIAH.getNum(25));
	}
	
	@Test
	public void testJeremiahChp26NumVerses(){
		assertEquals(Jeremiah.CHP26, JEREMIAH.getNum(26));
	}
	
	@Test
	public void testJeremiahChp27NumVerses(){
		assertEquals(Jeremiah.CHP27, JEREMIAH.getNum(27));
	}
	
	@Test
	public void testJeremiahChp28NumVerses(){
		assertEquals(Jeremiah.CHP28, JEREMIAH.getNum(28));
	}
	
	@Test
	public void testJeremiahChp29NumVerses(){
		assertEquals(Jeremiah.CHP29, JEREMIAH.getNum(29));
	}
	
	@Test
	public void testJeremiahChp30NumVerses(){
		assertEquals(Jeremiah.CHP30, JEREMIAH.getNum(30));
	}
	
	@Test
	public void testJeremiahChp31NumVerses(){
		assertEquals(Jeremiah.CHP31, JEREMIAH.getNum(31));
	}
	
	@Test
	public void testJeremiahChp32NumVerses(){
		assertEquals(Jeremiah.CHP32, JEREMIAH.getNum(32));
	}
	
	@Test
	public void testJeremiahChp33NumVerses(){
		assertEquals(Jeremiah.CHP33, JEREMIAH.getNum(33));
	}
	
	@Test
	public void testJeremiahChp34NumVerses(){
		assertEquals(Jeremiah.CHP34, JEREMIAH.getNum(34));
	}
	
	@Test
	public void testJeremiahChp35NumVerses(){
		assertEquals(Jeremiah.CHP35, JEREMIAH.getNum(35));
	}
	
	@Test
	public void testJeremiahChp36NumVerses(){
		assertEquals(Jeremiah.CHP36, JEREMIAH.getNum(36));
	}
	
	@Test
	public void testJeremiahChp37NumVerses(){
		assertEquals(Jeremiah.CHP37, JEREMIAH.getNum(37));
	}
	
	@Test
	public void testJeremiahChp38NumVerses(){
		assertEquals(Jeremiah.CHP38, JEREMIAH.getNum(38));
	}
	
	@Test
	public void testJeremiahChp39NumVerses(){
		assertEquals(Jeremiah.CHP39, JEREMIAH.getNum(39));
	}
	
	@Test
	public void testJeremiahChp40NumVerses(){
		assertEquals(Jeremiah.CHP40, JEREMIAH.getNum(40));
	}
	
	@Test
	public void testJeremiahChp41NumVerses(){
		assertEquals(Jeremiah.CHP41, JEREMIAH.getNum(41));
	}
	
	@Test
	public void testJeremiahChp42NumVerses(){
		assertEquals(Jeremiah.CHP42, JEREMIAH.getNum(42));
	}
	
	@Test
	public void testJeremiahChp43NumVerses(){
		assertEquals(Jeremiah.CHP43, JEREMIAH.getNum(43));
	}
	
	@Test
	public void testJeremiahChp44NumVerses(){
		assertEquals(Jeremiah.CHP44, JEREMIAH.getNum(44));
	}
	
	@Test
	public void testJeremiahChp45NumVerses(){
		assertEquals(Jeremiah.CHP45, JEREMIAH.getNum(45));
	}
	
	@Test
	public void testJeremiahChp46NumVerses(){
		assertEquals(Jeremiah.CHP46, JEREMIAH.getNum(46));
	}
	
	@Test
	public void testJeremiahChp47NumVerses(){
		assertEquals(Jeremiah.CHP47, JEREMIAH.getNum(47));
	}
	
	@Test
	public void testJeremiahChp48NumVerses(){
		assertEquals(Jeremiah.CHP48, JEREMIAH.getNum(48));
	}
	
	@Test
	public void testJeremiahChp49NumVerses(){
		assertEquals(Jeremiah.CHP49, JEREMIAH.getNum(49));
	}
	
	@Test
	public void testJeremiahChp50NumVerses(){
		assertEquals(Jeremiah.CHP50, JEREMIAH.getNum(50));
	}
	
	@Test
	public void testJeremiahChp51NumVerses(){
		assertEquals(Jeremiah.CHP51, JEREMIAH.getNum(51));
	}
	
	@Test
	public void testJeremiahChp52NumVerses(){
		assertEquals(Jeremiah.CHP52, JEREMIAH.getNum(52));
	}
	
	/*
	 * Lamentations number of verses checks
	 */
	@Test
	public void testLamentationsChp1NumVerses(){
		assertEquals(Lamentations.CHP1, LAMENTATIONS.getNum(1));
	}
	
	@Test
	public void testLamentationsChp2NumVerses(){
		assertEquals(Lamentations.CHP2, LAMENTATIONS.getNum(2));
	}
	
	@Test
	public void testLamentationsChp3NumVerses(){
		assertEquals(Lamentations.CHP3, LAMENTATIONS.getNum(3));
	}
	
	@Test
	public void testLamentationsChp4NumVerses(){
		assertEquals(Lamentations.CHP4, LAMENTATIONS.getNum(4));
	}
	
	@Test
	public void testLamentationsChp5NumVerses(){
		assertEquals(Lamentations.CHP5, LAMENTATIONS.getNum(5));
	}
	
	/*
	 * Ezekiel number of verses checks
	 */
	@Test
	public void testEzekielChp1NumVerses(){
		assertEquals(Ezekiel.CHP1, EZEKIEL.getNum(1));
	}
	
	@Test
	public void testEzekielChp2NumVerses(){
		assertEquals(Ezekiel.CHP2, EZEKIEL.getNum(2));
	}
	
	@Test
	public void testEzekielChp3NumVerses(){
		assertEquals(Ezekiel.CHP3, EZEKIEL.getNum(3));
	}
	
	@Test
	public void testEzekielChp4NumVerses(){
		assertEquals(Ezekiel.CHP4, EZEKIEL.getNum(4));
	}
	
	@Test
	public void testEzekielChp5NumVerses(){
		assertEquals(Ezekiel.CHP5, EZEKIEL.getNum(5));
	}
	
	@Test
	public void testEzekielChp6NumVerses(){
		assertEquals(Ezekiel.CHP6, EZEKIEL.getNum(6));
	}
	
	@Test
	public void testEzekielChp7NumVerses(){
		assertEquals(Ezekiel.CHP7, EZEKIEL.getNum(7));
	}
	
	@Test
	public void testEzekielChp8NumVerses(){
		assertEquals(Ezekiel.CHP8, EZEKIEL.getNum(8));
	}
	
	@Test
	public void testEzekielChp9NumVerses(){
		assertEquals(Ezekiel.CHP9, EZEKIEL.getNum(9));
	}
	
	@Test
	public void testEzekielChp10NumVerses(){
		assertEquals(Ezekiel.CHP10, EZEKIEL.getNum(10));
	}
	
	@Test
	public void testEzekielChp11NumVerses(){
		assertEquals(Ezekiel.CHP11, EZEKIEL.getNum(11));
	}
	
	@Test
	public void testEzekielChp12NumVerses(){
		assertEquals(Ezekiel.CHP12, EZEKIEL.getNum(12));
	}
	
	@Test
	public void testEzekielChp13NumVerses(){
		assertEquals(Ezekiel.CHP13, EZEKIEL.getNum(13));
	}
	
	@Test
	public void testEzekielChp14NumVerses(){
		assertEquals(Ezekiel.CHP14, EZEKIEL.getNum(14));
	}
	
	@Test
	public void testEzekielChp15NumVerses(){
		assertEquals(Ezekiel.CHP15, EZEKIEL.getNum(15));
	}
	
	@Test
	public void testEzekielChp16NumVerses(){
		assertEquals(Ezekiel.CHP16, EZEKIEL.getNum(16));
	}
	
	@Test
	public void testEzekielChp17NumVerses(){
		assertEquals(Ezekiel.CHP17, EZEKIEL.getNum(17));
	}
	
	@Test
	public void testEzekielChp18NumVerses(){
		assertEquals(Ezekiel.CHP18, EZEKIEL.getNum(18));
	}
	
	@Test
	public void testEzekielChp19NumVerses(){
		assertEquals(Ezekiel.CHP19, EZEKIEL.getNum(19));
	}
	
	@Test
	public void testEzekielChp20NumVerses(){
		assertEquals(Ezekiel.CHP20, EZEKIEL.getNum(20));
	}
	
	@Test
	public void testEzekielChp21NumVerses(){
		assertEquals(Ezekiel.CHP21, EZEKIEL.getNum(21));
	}
	
	@Test
	public void testEzekielChp22NumVerses(){
		assertEquals(Ezekiel.CHP22, EZEKIEL.getNum(22));
	}
	
	@Test
	public void testEzekielChp23NumVerses(){
		assertEquals(Ezekiel.CHP23, EZEKIEL.getNum(23));
	}
	
	@Test
	public void testEzekielChp24NumVerses(){
		assertEquals(Ezekiel.CHP24, EZEKIEL.getNum(24));
	}
	
	@Test
	public void testEzekielChp25NumVerses(){
		assertEquals(Ezekiel.CHP25, EZEKIEL.getNum(25));
	}
	
	@Test
	public void testEzekielChp26NumVerses(){
		assertEquals(Ezekiel.CHP26, EZEKIEL.getNum(26));
	}
	
	@Test
	public void testEzekielChp27NumVerses(){
		assertEquals(Ezekiel.CHP27, EZEKIEL.getNum(27));
	}
	
	@Test
	public void testEzekielChp28NumVerses(){
		assertEquals(Ezekiel.CHP28, EZEKIEL.getNum(28));
	}
	
	@Test
	public void testEzekielChp29NumVerses(){
		assertEquals(Ezekiel.CHP29, EZEKIEL.getNum(29));
	}
	
	@Test
	public void testEzekielChp30NumVerses(){
		assertEquals(Ezekiel.CHP30, EZEKIEL.getNum(30));
	}
	
	@Test
	public void testEzekielChp31NumVerses(){
		assertEquals(Ezekiel.CHP31, EZEKIEL.getNum(31));
	}
	
	@Test
	public void testEzekielChp32NumVerses(){
		assertEquals(Ezekiel.CHP32, EZEKIEL.getNum(32));
	}
	
	@Test
	public void testEzekielChp33NumVerses(){
		assertEquals(Ezekiel.CHP33, EZEKIEL.getNum(33));
	}
	
	@Test
	public void testEzekielChp34NumVerses(){
		assertEquals(Ezekiel.CHP34, EZEKIEL.getNum(34));
	}
	
	@Test
	public void testEzekielChp35NumVerses(){
		assertEquals(Ezekiel.CHP35, EZEKIEL.getNum(35));
	}
	
	@Test
	public void testEzekielChp36NumVerses(){
		assertEquals(Ezekiel.CHP36, EZEKIEL.getNum(36));
	}
	
	@Test
	public void testEzekielChp37NumVerses(){
		assertEquals(Ezekiel.CHP37, EZEKIEL.getNum(37));
	}
	
	@Test
	public void testEzekielChp38NumVerses(){
		assertEquals(Ezekiel.CHP38, EZEKIEL.getNum(38));
	}
	
	@Test
	public void testEzekielChp39NumVerses(){
		assertEquals(Ezekiel.CHP39, EZEKIEL.getNum(39));
	}
	
	@Test
	public void testEzekielChp40NumVerses(){
		assertEquals(Ezekiel.CHP40, EZEKIEL.getNum(40));
	}
	
	@Test
	public void testEzekielChp41NumVerses(){
		assertEquals(Ezekiel.CHP41, EZEKIEL.getNum(41));
	}
	
	@Test
	public void testEzekielChp42NumVerses(){
		assertEquals(Ezekiel.CHP42, EZEKIEL.getNum(42));
	}
	
	@Test
	public void testEzekielChp43NumVerses(){
		assertEquals(Ezekiel.CHP43, EZEKIEL.getNum(43));
	}
	
	@Test
	public void testEzekielChp44NumVerses(){
		assertEquals(Ezekiel.CHP44, EZEKIEL.getNum(44));
	}
	
	@Test
	public void testEzekielChp45NumVerses(){
		assertEquals(Ezekiel.CHP45, EZEKIEL.getNum(45));
	}
	
	@Test
	public void testEzekielChp46NumVerses(){
		assertEquals(Ezekiel.CHP46, EZEKIEL.getNum(46));
	}
	
	@Test
	public void testEzekielChp47NumVerses(){
		assertEquals(Ezekiel.CHP47, EZEKIEL.getNum(47));
	}
	
	@Test
	public void testEzekielChp48NumVerses(){
		assertEquals(Ezekiel.CHP48, EZEKIEL.getNum(48));
	}
	
	/*
	 * Daniel number of verses checks
	 */
	@Test
	public void testDanielChp1NumVerses(){
		assertEquals(Daniel.CHP1, DANIEL.getNum(1));
	}
	
	@Test
	public void testDanielChp2NumVerses(){
		assertEquals(Daniel.CHP2, DANIEL.getNum(2));
	}
	
	@Test
	public void testDanielChp3NumVerses(){
		assertEquals(Daniel.CHP3, DANIEL.getNum(3));
	}
	
	@Test
	public void testDanielChp4NumVerses(){
		assertEquals(Daniel.CHP4, DANIEL.getNum(4));
	}
	
	@Test
	public void testDanielChp5NumVerses(){
		assertEquals(Daniel.CHP5, DANIEL.getNum(5));
	}
	
	@Test
	public void testDanielChp6NumVerses(){
		assertEquals(Daniel.CHP6, DANIEL.getNum(6));
	}
	
	@Test
	public void testDanielChp7NumVerses(){
		assertEquals(Daniel.CHP7, DANIEL.getNum(7));
	}
	
	@Test
	public void testDanielChp8NumVerses(){
		assertEquals(Daniel.CHP8, DANIEL.getNum(8));
	}
	
	@Test
	public void testDanielChp9NumVerses(){
		assertEquals(Daniel.CHP9, DANIEL.getNum(9));
	}
	
	@Test
	public void testDanielChp10NumVerses(){
		assertEquals(Daniel.CHP10, DANIEL.getNum(10));
	}
	
	@Test
	public void testDanielChp11NumVerses(){
		assertEquals(Daniel.CHP11, DANIEL.getNum(11));
	}
	
	@Test
	public void testDanielChp12NumVerses(){
		assertEquals(Daniel.CHP12, DANIEL.getNum(12));
	}
	
	/*
	 * Hosea number of verses checks
	 */
	@Test
	public void testHoseaChp1NumVerses(){
		assertEquals(Hosea.CHP1, HOSEA.getNum(1));
	}
	
	@Test
	public void testHoseaChp2NumVerses(){
		assertEquals(Hosea.CHP2, HOSEA.getNum(2));
	}
	
	@Test
	public void testHoseaChp3NumVerses(){
		assertEquals(Hosea.CHP3, HOSEA.getNum(3));
	}
	
	@Test
	public void testHoseaChp4NumVerses(){
		assertEquals(Hosea.CHP4, HOSEA.getNum(4));
	}
	
	@Test
	public void testHoseaChp5NumVerses(){
		assertEquals(Hosea.CHP5, HOSEA.getNum(5));
	}
	
	@Test
	public void testHoseaChp6NumVerses(){
		assertEquals(Hosea.CHP6, HOSEA.getNum(6));
	}
	
	@Test
	public void testHoseaChp7NumVerses(){
		assertEquals(Hosea.CHP7, HOSEA.getNum(7));
	}
	
	@Test
	public void testHoseaChp8NumVerses(){
		assertEquals(Hosea.CHP8, HOSEA.getNum(8));
	}
	
	@Test
	public void testHoseaChp9NumVerses(){
		assertEquals(Hosea.CHP9, HOSEA.getNum(9));
	}
	
	@Test
	public void testHoseaChp10NumVerses(){
		assertEquals(Hosea.CHP10, HOSEA.getNum(10));
	}
	
	@Test
	public void testHoseaChp11NumVerses(){
		assertEquals(Hosea.CHP11, HOSEA.getNum(11));
	}
	
	@Test
	public void testHoseaChp12NumVerses(){
		assertEquals(Hosea.CHP12, HOSEA.getNum(12));
	}
	
	@Test
	public void testHoseaChp13NumVerses(){
		assertEquals(Hosea.CHP13, HOSEA.getNum(13));
	}
	
	@Test
	public void testHoseaChp14NumVerses(){
		assertEquals(Hosea.CHP14, HOSEA.getNum(14));
	}
	
	/*
	 * Joel number of verses checks
	 */
	@Test
	public void testJoelChp1NumVerses(){
		assertEquals(Joel.CHP1, JOEL.getNum(1));
	}
	
	@Test
	public void testJoelChp2NumVerses(){
		assertEquals(Joel.CHP2, JOEL.getNum(2));
	}
	
	@Test
	public void testJoelChp3NumVerses(){
		assertEquals(Joel.CHP3, JOEL.getNum(3));
	}
	
	/*
	 * Amos number of verses checks
	 */
	@Test
	public void testAmosChp1NumVerses(){
		assertEquals(Amos.CHP1, AMOS.getNum(1));
	}
	
	@Test
	public void testAmosChp2NumVerses(){
		assertEquals(Amos.CHP2, AMOS.getNum(2));
	}
	
	@Test
	public void testAmosChp3NumVerses(){
		assertEquals(Amos.CHP3, AMOS.getNum(3));
	}
	
	@Test
	public void testAmosChp4NumVerses(){
		assertEquals(Amos.CHP4, AMOS.getNum(4));
	}
	
	@Test
	public void testAmosChp5NumVerses(){
		assertEquals(Amos.CHP5, AMOS.getNum(5));
	}
	
	@Test
	public void testAmosChp6NumVerses(){
		assertEquals(Amos.CHP6, AMOS.getNum(6));
	}
	
	@Test
	public void testAmosChp7NumVerses(){
		assertEquals(Amos.CHP7, AMOS.getNum(7));
	}
	
	@Test
	public void testAmosChp8NumVerses(){
		assertEquals(Amos.CHP8, AMOS.getNum(8));
	}
	
	@Test
	public void testAmosChp9NumVerses(){
		assertEquals(Amos.CHP9, AMOS.getNum(9));
	}
	
	/*
	 * Obadiah number of verses checks
	 */
	@Test
	public void testObadiahChp1NumVerses(){
		assertEquals(Obadiah.CHP1, OBADIAH.getNum(1));
	}
	
	/*
	 * Jonah number of verses checks
	 */
	@Test
	public void testJonahChp1NumVerses(){
		assertEquals(Jonah.CHP1, JONAH.getNum(1));
	}
	
	@Test
	public void testJonahChp2NumVerses(){
		assertEquals(Jonah.CHP2, JONAH.getNum(2));
	}
	
	@Test
	public void testJonahChp3NumVerses(){
		assertEquals(Jonah.CHP3, JONAH.getNum(3));
	}
	
	@Test
	public void testJonahChp4NumVerses(){
		assertEquals(Jonah.CHP4, JONAH.getNum(4));
	}
	
	/*
	 * Micah number of verses checks
	 */
	@Test
	public void testMicahChp1NumVerses(){
		assertEquals(Micah.CHP1, MICAH.getNum(1));
	}
	
	@Test
	public void testMicahChp2NumVerses(){
		assertEquals(Micah.CHP2, MICAH.getNum(2));
	}
	
	@Test
	public void testMicahChp3NumVerses(){
		assertEquals(Micah.CHP3, MICAH.getNum(3));
	}
	
	@Test
	public void testMicahChp4NumVerses(){
		assertEquals(Micah.CHP4, MICAH.getNum(4));
	}
	
	@Test
	public void testMicahChp5NumVerses(){
		assertEquals(Micah.CHP5, MICAH.getNum(5));
	}
	
	@Test
	public void testMicahChp6NumVerses(){
		assertEquals(Micah.CHP6, MICAH.getNum(6));
	}
	
	@Test
	public void testMicahChp7NumVerses(){
		assertEquals(Micah.CHP7, MICAH.getNum(7));
	}
	
	/*
	 * Nahum number of verses checks
	 */
	@Test
	public void testNahumChp1NumVerses(){
		assertEquals(Nahum.CHP1, NAHUM.getNum(1));
	}
	
	@Test
	public void testNahumChp2NumVerses(){
		assertEquals(Nahum.CHP2, NAHUM.getNum(2));
	}
	
	@Test
	public void testNahumChp3NumVerses(){
		assertEquals(Nahum.CHP3, NAHUM.getNum(3));
	}
	
	/*
	 * Habakkuk number of verses checks
	 */
	@Test
	public void testHabakkukChp1NumVerses(){
		assertEquals(Habakkuk.CHP1, HABAKKUK.getNum(1));
	}
	
	@Test
	public void testHabakkukChp2NumVerses(){
		assertEquals(Habakkuk.CHP2, HABAKKUK.getNum(2));
	}
	
	@Test
	public void testHabakkukChp3NumVerses(){
		assertEquals(Habakkuk.CHP3, HABAKKUK.getNum(3));
	}
	
	/*
	 * Zephaniah number of verses checks
	 */
	@Test
	public void testZephaniahChp1NumVerses(){
		assertEquals(Zephaniah.CHP1, ZEPHANIAH.getNum(1));
	}
	
	@Test
	public void testZephaniahChp2NumVerses(){
		assertEquals(Zephaniah.CHP2, ZEPHANIAH.getNum(2));
	}
	
	@Test
	public void testZephaniahChp3NumVerses(){
		assertEquals(Zephaniah.CHP3, ZEPHANIAH.getNum(3));
	}
	
	/*
	 * Haggai number of verses checks
	 */
	@Test
	public void testHaggaiChp1NumVerses(){
		assertEquals(Haggai.CHP1, HAGGAI.getNum(1));
	}
	
	@Test
	public void testHaggaiChp2NumVerses(){
		assertEquals(Haggai.CHP2, HAGGAI.getNum(2));
	}
	
	/*
	 * Zechariah number of verses checks
	 */
	@Test
	public void testZechariahChp1NumVerses(){
		assertEquals(Zechariah.CHP1, ZECHARIAH.getNum(1));
	}
	
	@Test
	public void testZechariahChp2NumVerses(){
		assertEquals(Zechariah.CHP2, ZECHARIAH.getNum(2));
	}
	
	@Test
	public void testZechariahChp3NumVerses(){
		assertEquals(Zechariah.CHP3, ZECHARIAH.getNum(3));
	}
	
	@Test
	public void testZechariahChp4NumVerses(){
		assertEquals(Zechariah.CHP4, ZECHARIAH.getNum(4));
	}
	
	@Test
	public void testZechariahChp5NumVerses(){
		assertEquals(Zechariah.CHP5, ZECHARIAH.getNum(5));
	}
	
	@Test
	public void testZechariahChp6NumVerses(){
		assertEquals(Zechariah.CHP6, ZECHARIAH.getNum(6));
	}
	
	@Test
	public void testZechariahChp7NumVerses(){
		assertEquals(Zechariah.CHP7, ZECHARIAH.getNum(7));
	}
	
	@Test
	public void testZechariahChp8NumVerses(){
		assertEquals(Zechariah.CHP8, ZECHARIAH.getNum(8));
	}
	
	@Test
	public void testZechariahChp9NumVerses(){
		assertEquals(Zechariah.CHP9, ZECHARIAH.getNum(9));
	}
	
	@Test
	public void testZechariahChp10NumVerses(){
		assertEquals(Zechariah.CHP10, ZECHARIAH.getNum(10));
	}
	
	@Test
	public void testZechariahChp11NumVerses(){
		assertEquals(Zechariah.CHP11, ZECHARIAH.getNum(11));
	}
	
	@Test
	public void testZechariahChp12NumVerses(){
		assertEquals(Zechariah.CHP12, ZECHARIAH.getNum(12));
	}
	
	@Test
	public void testZechariahChp13NumVerses(){
		assertEquals(Zechariah.CHP13, ZECHARIAH.getNum(13));
	}
	
	@Test
	public void testZechariahChp14NumVerses(){
		assertEquals(Zechariah.CHP14, ZECHARIAH.getNum(14));
	}
	
	/*
	 * Malachi number of verses checks
	 */
	@Test
	public void testMalachiChp1NumVerses(){
		assertEquals(Malachi.CHP1, MALACHI.getNum(1));
	}
	
	@Test
	public void testMalachiChp2NumVerses(){
		assertEquals(Malachi.CHP2, MALACHI.getNum(2));
	}
	
	@Test
	public void testMalachiChp3NumVerses(){
		assertEquals(Malachi.CHP3, MALACHI.getNum(3));
	}
	
	@Test
	public void testMalachiChp4NumVerses(){
		assertEquals(Malachi.CHP4, MALACHI.getNum(4));
	}
	
	/*
	 * Matthew number of verses checks
	 */
	@Test
	public void testMatthewChp1NumVerses(){
		assertEquals(Matthew.CHP1, MATTHEW.getNum(1));
	}
	
	@Test
	public void testMatthewChp2NumVerses(){
		assertEquals(Matthew.CHP2, MATTHEW.getNum(2));
	}
	
	@Test
	public void testMatthewChp3NumVerses(){
		assertEquals(Matthew.CHP3, MATTHEW.getNum(3));
	}
	
	@Test
	public void testMatthewChp4NumVerses(){
		assertEquals(Matthew.CHP4, MATTHEW.getNum(4));
	}
	
	@Test
	public void testMatthewChp5NumVerses(){
		assertEquals(Matthew.CHP5, MATTHEW.getNum(5));
	}
	
	@Test
	public void testMatthewChp6NumVerses(){
		assertEquals(Matthew.CHP6, MATTHEW.getNum(6));
	}
	
	@Test
	public void testMatthewChp7NumVerses(){
		assertEquals(Matthew.CHP7, MATTHEW.getNum(7));
	}
	
	@Test
	public void testMatthewChp8NumVerses(){
		assertEquals(Matthew.CHP8, MATTHEW.getNum(8));
	}
	
	@Test
	public void testMatthewChp9NumVerses(){
		assertEquals(Matthew.CHP9, MATTHEW.getNum(9));
	}
	
	@Test
	public void testMatthewChp10NumVerses(){
		assertEquals(Matthew.CHP10, MATTHEW.getNum(10));
	}
	
	@Test
	public void testMatthewChp11NumVerses(){
		assertEquals(Matthew.CHP11, MATTHEW.getNum(11));
	}
	
	@Test
	public void testMatthewChp12NumVerses(){
		assertEquals(Matthew.CHP12, MATTHEW.getNum(12));
	}
	
	@Test
	public void testMatthewChp13NumVerses(){
		assertEquals(Matthew.CHP13, MATTHEW.getNum(13));
	}
	
	@Test
	public void testMatthewChp14NumVerses(){
		assertEquals(Matthew.CHP14, MATTHEW.getNum(14));
	}
	
	@Test
	public void testMatthewChp15NumVerses(){
		assertEquals(Matthew.CHP15, MATTHEW.getNum(15));
	}
	
	@Test
	public void testMatthewChp16NumVerses(){
		assertEquals(Matthew.CHP16, MATTHEW.getNum(16));
	}
	
	@Test
	public void testMatthewChp17NumVerses(){
		assertEquals(Matthew.CHP17, MATTHEW.getNum(17));
	}
	
	@Test
	public void testMatthewChp18NumVerses(){
		assertEquals(Matthew.CHP18, MATTHEW.getNum(18));
	}
	
	@Test
	public void testMatthewChp19NumVerses(){
		assertEquals(Matthew.CHP19, MATTHEW.getNum(19));
	}
	
	@Test
	public void testMatthewChp20NumVerses(){
		assertEquals(Matthew.CHP20, MATTHEW.getNum(20));
	}
	
	@Test
	public void testMatthewChp21NumVerses(){
		assertEquals(Matthew.CHP21, MATTHEW.getNum(21));
	}
	
	@Test
	public void testMatthewChp22NumVerses(){
		assertEquals(Matthew.CHP22, MATTHEW.getNum(22));
	}
	
	@Test
	public void testMatthewChp23NumVerses(){
		assertEquals(Matthew.CHP23, MATTHEW.getNum(23));
	}
	
	@Test
	public void testMatthewChp24NumVerses(){
		assertEquals(Matthew.CHP24, MATTHEW.getNum(24));
	}
	
	@Test
	public void testMatthewChp25NumVerses(){
		assertEquals(Matthew.CHP25, MATTHEW.getNum(25));
	}
	
	@Test
	public void testMatthewChp26NumVerses(){
		assertEquals(Matthew.CHP26, MATTHEW.getNum(26));
	}
	
	@Test
	public void testMatthewChp27NumVerses(){
		assertEquals(Matthew.CHP27, MATTHEW.getNum(27));
	}
	
	@Test
	public void testMatthewChp28NumVerses(){
		assertEquals(Matthew.CHP28, MATTHEW.getNum(28));
	}
	
	/*
	 * Mark number of verses checks
	 */
	@Test
	public void testMarkChp1NumVerses(){
		assertEquals(Mark.CHP1, MARK.getNum(1));
	}
	
	@Test
	public void testMarkChp2NumVerses(){
		assertEquals(Mark.CHP2, MARK.getNum(2));
	}
	
	@Test
	public void testMarkChp3NumVerses(){
		assertEquals(Mark.CHP3, MARK.getNum(3));
	}
	
	@Test
	public void testMarkChp4NumVerses(){
		assertEquals(Mark.CHP4, MARK.getNum(4));
	}
	
	@Test
	public void testMarkChp5NumVerses(){
		assertEquals(Mark.CHP5, MARK.getNum(5));
	}
	
	@Test
	public void testMarkChp6NumVerses(){
		assertEquals(Mark.CHP6, MARK.getNum(6));
	}
	
	@Test
	public void testMarkChp7NumVerses(){
		assertEquals(Mark.CHP7, MARK.getNum(7));
	}
	
	@Test
	public void testMarkChp8NumVerses(){
		assertEquals(Mark.CHP8, MARK.getNum(8));
	}
	
	@Test
	public void testMarkChp9NumVerses(){
		assertEquals(Mark.CHP9, MARK.getNum(9));
	}
	
	@Test
	public void testMarkChp10NumVerses(){
		assertEquals(Mark.CHP10, MARK.getNum(10));
	}
	
	@Test
	public void testMarkChp11NumVerses(){
		assertEquals(Mark.CHP11, MARK.getNum(11));
	}
	
	@Test
	public void testMarkChp12NumVerses(){
		assertEquals(Mark.CHP12, MARK.getNum(12));
	}
	
	@Test
	public void testMarkChp13NumVerses(){
		assertEquals(Mark.CHP13, MARK.getNum(13));
	}
	
	@Test
	public void testMarkChp14NumVerses(){
		assertEquals(Mark.CHP14, MARK.getNum(14));
	}
	
	@Test
	public void testMarkChp15NumVerses(){
		assertEquals(Mark.CHP15, MARK.getNum(15));
	}
	
	@Test
	public void testMarkChp16NumVerses(){
		assertEquals(Mark.CHP16, MARK.getNum(16));
	}
	
	/*
	 * Luke number of verses checks
	 */
	@Test
	public void testLukeChp1NumVerses(){
		assertEquals(Luke.CHP1, LUKE.getNum(1));
	}
	
	@Test
	public void testLukeChp2NumVerses(){
		assertEquals(Luke.CHP2, LUKE.getNum(2));
	}
	
	@Test
	public void testLukeChp3NumVerses(){
		assertEquals(Luke.CHP3, LUKE.getNum(3));
	}
	
	@Test
	public void testLukeChp4NumVerses(){
		assertEquals(Luke.CHP4, LUKE.getNum(4));
	}
	
	@Test
	public void testLukeChp5NumVerses(){
		assertEquals(Luke.CHP5, LUKE.getNum(5));
	}
	
	@Test
	public void testLukeChp6NumVerses(){
		assertEquals(Luke.CHP6, LUKE.getNum(6));
	}
	
	@Test
	public void testLukeChp7NumVerses(){
		assertEquals(Luke.CHP7, LUKE.getNum(7));
	}
	
	@Test
	public void testLukeChp8NumVerses(){
		assertEquals(Luke.CHP8, LUKE.getNum(8));
	}
	
	@Test
	public void testLukeChp9NumVerses(){
		assertEquals(Luke.CHP9, LUKE.getNum(9));
	}
	
	@Test
	public void testLukeChp10NumVerses(){
		assertEquals(Luke.CHP10, LUKE.getNum(10));
	}
	
	@Test
	public void testLukeChp11NumVerses(){
		assertEquals(Luke.CHP11, LUKE.getNum(11));
	}
	
	@Test
	public void testLukeChp12NumVerses(){
		assertEquals(Luke.CHP12, LUKE.getNum(12));
	}
	
	@Test
	public void testLukeChp13NumVerses(){
		assertEquals(Luke.CHP13, LUKE.getNum(13));
	}
	
	@Test
	public void testLukeChp14NumVerses(){
		assertEquals(Luke.CHP14, LUKE.getNum(14));
	}
	
	@Test
	public void testLukeChp15NumVerses(){
		assertEquals(Luke.CHP15, LUKE.getNum(15));
	}
	
	@Test
	public void testLukeChp16NumVerses(){
		assertEquals(Luke.CHP16, LUKE.getNum(16));
	}
	
	@Test
	public void testLukeChp17NumVerses(){
		assertEquals(Luke.CHP17, LUKE.getNum(17));
	}
	
	@Test
	public void testLukeChp18NumVerses(){
		assertEquals(Luke.CHP18, LUKE.getNum(18));
	}
	
	@Test
	public void testLukeChp19NumVerses(){
		assertEquals(Luke.CHP19, LUKE.getNum(19));
	}
	
	@Test
	public void testLukeChp20NumVerses(){
		assertEquals(Luke.CHP20, LUKE.getNum(20));
	}
	
	@Test
	public void testLukeChp21NumVerses(){
		assertEquals(Luke.CHP21, LUKE.getNum(21));
	}
	
	@Test
	public void testLukeChp22NumVerses(){
		assertEquals(Luke.CHP22, LUKE.getNum(22));
	}
	
	@Test
	public void testLukeChp23NumVerses(){
		assertEquals(Luke.CHP23, LUKE.getNum(23));
	}
	
	@Test
	public void testLukeChp24NumVerses(){
		assertEquals(Luke.CHP24, LUKE.getNum(24));
	}
	
	/*
	 * John number of verses checks
	 */
	@Test
	public void testJohnChp1NumVerses(){
		assertEquals(John.CHP1, JOHN.getNum(1));
	}
	
	@Test
	public void testJohnChp2NumVerses(){
		assertEquals(John.CHP2, JOHN.getNum(2));
	}
	
	@Test
	public void testJohnChp3NumVerses(){
		assertEquals(John.CHP3, JOHN.getNum(3));
	}
	
	@Test
	public void testJohnChp4NumVerses(){
		assertEquals(John.CHP4, JOHN.getNum(4));
	}
	
	@Test
	public void testJohnChp5NumVerses(){
		assertEquals(John.CHP5, JOHN.getNum(5));
	}
	
	@Test
	public void testJohnChp6NumVerses(){
		assertEquals(John.CHP6, JOHN.getNum(6));
	}
	
	@Test
	public void testJohnChp7NumVerses(){
		assertEquals(John.CHP7, JOHN.getNum(7));
	}
	
	@Test
	public void testJohnChp8NumVerses(){
		assertEquals(John.CHP8, JOHN.getNum(8));
	}
	
	@Test
	public void testJohnChp9NumVerses(){
		assertEquals(John.CHP9, JOHN.getNum(9));
	}
	
	@Test
	public void testJohnChp10NumVerses(){
		assertEquals(John.CHP10, JOHN.getNum(10));
	}
	
	@Test
	public void testJohnChp11NumVerses(){
		assertEquals(John.CHP11, JOHN.getNum(11));
	}
	
	@Test
	public void testJohnChp12NumVerses(){
		assertEquals(John.CHP12, JOHN.getNum(12));
	}
	
	@Test
	public void testJohnChp13NumVerses(){
		assertEquals(John.CHP13, JOHN.getNum(13));
	}
	
	@Test
	public void testJohnChp14NumVerses(){
		assertEquals(John.CHP14, JOHN.getNum(14));
	}
	
	@Test
	public void testJohnChp15NumVerses(){
		assertEquals(John.CHP15, JOHN.getNum(15));
	}
	
	@Test
	public void testJohnChp16NumVerses(){
		assertEquals(John.CHP16, JOHN.getNum(16));
	}
	
	@Test
	public void testJohnChp17NumVerses(){
		assertEquals(John.CHP17, JOHN.getNum(17));
	}
	
	@Test
	public void testJohnChp18NumVerses(){
		assertEquals(John.CHP18, JOHN.getNum(18));
	}
	
	@Test
	public void testJohnChp19NumVerses(){
		assertEquals(John.CHP19, JOHN.getNum(19));
	}
	
	@Test
	public void testJohnChp20NumVerses(){
		assertEquals(John.CHP20, JOHN.getNum(20));
	}
	
	@Test
	public void testJohnChp21NumVerses(){
		assertEquals(John.CHP21, JOHN.getNum(21));
	}
	
	/*
	 * Acts number of verses checks
	 */
	@Test
	public void testActsChp1NumVerses(){
		assertEquals(Acts.CHP1, ACTS.getNum(1));
	}
	
	@Test
	public void testActsChp2NumVerses(){
		assertEquals(Acts.CHP2, ACTS.getNum(2));
	}
	
	@Test
	public void testActsChp3NumVerses(){
		assertEquals(Acts.CHP3, ACTS.getNum(3));
	}
	
	@Test
	public void testActsChp4NumVerses(){
		assertEquals(Acts.CHP4, ACTS.getNum(4));
	}
	
	@Test
	public void testActsChp5NumVerses(){
		assertEquals(Acts.CHP5, ACTS.getNum(5));
	}
	
	@Test
	public void testActsChp6NumVerses(){
		assertEquals(Acts.CHP6, ACTS.getNum(6));
	}
	
	@Test
	public void testActsChp7NumVerses(){
		assertEquals(Acts.CHP7, ACTS.getNum(7));
	}
	
	@Test
	public void testActsChp8NumVerses(){
		assertEquals(Acts.CHP8, ACTS.getNum(8));
	}
	
	@Test
	public void testActsChp9NumVerses(){
		assertEquals(Acts.CHP9, ACTS.getNum(9));
	}
	
	@Test
	public void testActsChp10NumVerses(){
		assertEquals(Acts.CHP10, ACTS.getNum(10));
	}
	
	@Test
	public void testActsChp11NumVerses(){
		assertEquals(Acts.CHP11, ACTS.getNum(11));
	}
	
	@Test
	public void testActsChp12NumVerses(){
		assertEquals(Acts.CHP12, ACTS.getNum(12));
	}
	
	@Test
	public void testActsChp13NumVerses(){
		assertEquals(Acts.CHP13, ACTS.getNum(13));
	}
	
	@Test
	public void testActsChp14NumVerses(){
		assertEquals(Acts.CHP14, ACTS.getNum(14));
	}
	
	@Test
	public void testActsChp15NumVerses(){
		assertEquals(Acts.CHP15, ACTS.getNum(15));
	}
	
	@Test
	public void testActsChp16NumVerses(){
		assertEquals(Acts.CHP16, ACTS.getNum(16));
	}
	
	@Test
	public void testActsChp17NumVerses(){
		assertEquals(Acts.CHP17, ACTS.getNum(17));
	}
	
	@Test
	public void testActsChp18NumVerses(){
		assertEquals(Acts.CHP18, ACTS.getNum(18));
	}
	
	@Test
	public void testActsChp19NumVerses(){
		assertEquals(Acts.CHP19, ACTS.getNum(19));
	}
	
	@Test
	public void testActsChp20NumVerses(){
		assertEquals(Acts.CHP20, ACTS.getNum(20));
	}
	
	@Test
	public void testActsChp21NumVerses(){
		assertEquals(Acts.CHP21, ACTS.getNum(21));
	}
	
	@Test
	public void testActsChp22NumVerses(){
		assertEquals(Acts.CHP22, ACTS.getNum(22));
	}
	
	@Test
	public void testActsChp23NumVerses(){
		assertEquals(Acts.CHP23, ACTS.getNum(23));
	}
	
	@Test
	public void testActsChp24NumVerses(){
		assertEquals(Acts.CHP24, ACTS.getNum(24));
	}
	
	@Test
	public void testActsChp25NumVerses(){
		assertEquals(Acts.CHP25, ACTS.getNum(25));
	}
	
	@Test
	public void testActsChp26NumVerses(){
		assertEquals(Acts.CHP26, ACTS.getNum(26));
	}
	
	@Test
	public void testActsChp27NumVerses(){
		assertEquals(Acts.CHP27, ACTS.getNum(27));
	}
	
	@Test
	public void testActsChp28NumVerses(){
		assertEquals(Acts.CHP28, ACTS.getNum(28));
	}
	
	/*
	 * Romans number of verses checks
	 */
	@Test
	public void testRomansChp1NumVerses(){
		assertEquals(Romans.CHP1, ROMANS.getNum(1));
	}
	
	@Test
	public void testRomansChp2NumVerses(){
		assertEquals(Romans.CHP2, ROMANS.getNum(2));
	}
	
	@Test
	public void testRomansChp3NumVerses(){
		assertEquals(Romans.CHP3, ROMANS.getNum(3));
	}
	
	@Test
	public void testRomansChp4NumVerses(){
		assertEquals(Romans.CHP4, ROMANS.getNum(4));
	}
	
	@Test
	public void testRomansChp5NumVerses(){
		assertEquals(Romans.CHP5, ROMANS.getNum(5));
	}
	
	@Test
	public void testRomansChp6NumVerses(){
		assertEquals(Romans.CHP6, ROMANS.getNum(6));
	}
	
	@Test
	public void testRomansChp7NumVerses(){
		assertEquals(Romans.CHP7, ROMANS.getNum(7));
	}
	
	@Test
	public void testRomansChp8NumVerses(){
		assertEquals(Romans.CHP8, ROMANS.getNum(8));
	}
	
	@Test
	public void testRomansChp9NumVerses(){
		assertEquals(Romans.CHP9, ROMANS.getNum(9));
	}
	
	@Test
	public void testRomansChp10NumVerses(){
		assertEquals(Romans.CHP10, ROMANS.getNum(10));
	}
	
	@Test
	public void testRomansChp11NumVerses(){
		assertEquals(Romans.CHP11, ROMANS.getNum(11));
	}
	
	@Test
	public void testRomansChp12NumVerses(){
		assertEquals(Romans.CHP12, ROMANS.getNum(12));
	}
	
	@Test
	public void testRomansChp13NumVerses(){
		assertEquals(Romans.CHP13, ROMANS.getNum(13));
	}
	
	@Test
	public void testRomansChp14NumVerses(){
		assertEquals(Romans.CHP14, ROMANS.getNum(14));
	}
	
	@Test
	public void testRomansChp15NumVerses(){
		assertEquals(Romans.CHP15, ROMANS.getNum(15));
	}
	
	@Test
	public void testRomansChp16NumVerses(){
		assertEquals(Romans.CHP16, ROMANS.getNum(16));
	}
	
	/*
	 * 1 Corinthians number of verses checks
	 */
	@Test
	public void test1CorinthiansChp1NumVerses(){
		assertEquals(FirstCorinthians.CHP1, FIRST_CORINTHIANS.getNum(1));
	}
	
	@Test
	public void test1CorinthiansChp2NumVerses(){
		assertEquals(FirstCorinthians.CHP2, FIRST_CORINTHIANS.getNum(2));
	}
	
	@Test
	public void test1CorinthiansChp3NumVerses(){
		assertEquals(FirstCorinthians.CHP3, FIRST_CORINTHIANS.getNum(3));
	}
	
	@Test
	public void test1CorinthiansChp4NumVerses(){
		assertEquals(FirstCorinthians.CHP4, FIRST_CORINTHIANS.getNum(4));
	}
	
	@Test
	public void test1CorinthiansChp5NumVerses(){
		assertEquals(FirstCorinthians.CHP5, FIRST_CORINTHIANS.getNum(5));
	}
	
	@Test
	public void test1CorinthiansChp6NumVerses(){
		assertEquals(FirstCorinthians.CHP6, FIRST_CORINTHIANS.getNum(6));
	}
	
	@Test
	public void test1CorinthiansChp7NumVerses(){
		assertEquals(FirstCorinthians.CHP7, FIRST_CORINTHIANS.getNum(7));
	}
	
	@Test
	public void test1CorinthiansChp8NumVerses(){
		assertEquals(FirstCorinthians.CHP8, FIRST_CORINTHIANS.getNum(8));
	}
	
	@Test
	public void test1CorinthiansChp9NumVerses(){
		assertEquals(FirstCorinthians.CHP9, FIRST_CORINTHIANS.getNum(9));
	}
	
	@Test
	public void test1CorinthiansChp10NumVerses(){
		assertEquals(FirstCorinthians.CHP10, FIRST_CORINTHIANS.getNum(10));
	}
	
	@Test
	public void test1CorinthiansChp11NumVerses(){
		assertEquals(FirstCorinthians.CHP11, FIRST_CORINTHIANS.getNum(11));
	}
	
	@Test
	public void test1CorinthiansChp12NumVerses(){
		assertEquals(FirstCorinthians.CHP12, FIRST_CORINTHIANS.getNum(12));
	}
	
	@Test
	public void test1CorinthiansChp13NumVerses(){
		assertEquals(FirstCorinthians.CHP13, FIRST_CORINTHIANS.getNum(13));
	}
	
	@Test
	public void test1CorinthiansChp14NumVerses(){
		assertEquals(FirstCorinthians.CHP14, FIRST_CORINTHIANS.getNum(14));
	}
	
	@Test
	public void test1CorinthiansChp15NumVerses(){
		assertEquals(FirstCorinthians.CHP15, FIRST_CORINTHIANS.getNum(15));
	}
	
	@Test
	public void test1CorinthiansChp16NumVerses(){
		assertEquals(FirstCorinthians.CHP16, FIRST_CORINTHIANS.getNum(16));
	}
	
	/*
	 * 2 Corinthians number of verses checks
	 */
	@Test
	public void test2CorinthiansChp1NumVerses(){
		assertEquals(SecondCorinthians.CHP1, SECOND_CORINTHIANS.getNum(1));
	}
	
	@Test
	public void test2CorinthiansChp2NumVerses(){
		assertEquals(SecondCorinthians.CHP2, SECOND_CORINTHIANS.getNum(2));
	}
	
	@Test
	public void test2CorinthiansChp3NumVerses(){
		assertEquals(SecondCorinthians.CHP3, SECOND_CORINTHIANS.getNum(3));
	}
	
	@Test
	public void test2CorinthiansChp4NumVerses(){
		assertEquals(SecondCorinthians.CHP4, SECOND_CORINTHIANS.getNum(4));
	}
	
	@Test
	public void test2CorinthiansChp5NumVerses(){
		assertEquals(SecondCorinthians.CHP5, SECOND_CORINTHIANS.getNum(5));
	}
	
	@Test
	public void test2CorinthiansChp6NumVerses(){
		assertEquals(SecondCorinthians.CHP6, SECOND_CORINTHIANS.getNum(6));
	}
	
	@Test
	public void test2CorinthiansChp7NumVerses(){
		assertEquals(SecondCorinthians.CHP7, SECOND_CORINTHIANS.getNum(7));
	}
	
	@Test
	public void test2CorinthiansChp8NumVerses(){
		assertEquals(SecondCorinthians.CHP8, SECOND_CORINTHIANS.getNum(8));
	}
	
	@Test
	public void test2CorinthiansChp9NumVerses(){
		assertEquals(SecondCorinthians.CHP9, SECOND_CORINTHIANS.getNum(9));
	}
	
	@Test
	public void test2CorinthiansChp10NumVerses(){
		assertEquals(SecondCorinthians.CHP10, SECOND_CORINTHIANS.getNum(10));
	}
	
	@Test
	public void test2CorinthiansChp11NumVerses(){
		assertEquals(SecondCorinthians.CHP11, SECOND_CORINTHIANS.getNum(11));
	}
	
	@Test
	public void test2CorinthiansChp12NumVerses(){
		assertEquals(SecondCorinthians.CHP12, SECOND_CORINTHIANS.getNum(12));
	}
	
	@Test
	public void test2CorinthiansChp13NumVerses(){
		assertEquals(SecondCorinthians.CHP13, SECOND_CORINTHIANS.getNum(13));
	}
	
	/*
	 * Galatians number of verses checks
	 */
	@Test
	public void testGalatiansChp1NumVerses(){
		assertEquals(Galatians.CHP1, GALATIANS.getNum(1));
	}
	
	@Test
	public void testGalatiansChp2NumVerses(){
		assertEquals(Galatians.CHP2, GALATIANS.getNum(2));
	}
	
	@Test
	public void testGalatiansChp3NumVerses(){
		assertEquals(Galatians.CHP3, GALATIANS.getNum(3));
	}
	
	@Test
	public void testGalatiansChp4NumVerses(){
		assertEquals(Galatians.CHP4, GALATIANS.getNum(4));
	}
	
	@Test
	public void testGalatiansChp5NumVerses(){
		assertEquals(Galatians.CHP5, GALATIANS.getNum(5));
	}
	
	@Test
	public void testGalatiansChp6NumVerses(){
		assertEquals(Galatians.CHP6, GALATIANS.getNum(6));
	}
	
	/*
	 * Ephesians number of verses checks
	 */
	@Test
	public void testEphesiansChp1NumVerses(){
		assertEquals(Ephesians.CHP1, EPHESIANS.getNum(1));
	}
	
	@Test
	public void testEphesiansChp2NumVerses(){
		assertEquals(Ephesians.CHP2, EPHESIANS.getNum(2));
	}
	
	@Test
	public void testEphesiansChp3NumVerses(){
		assertEquals(Ephesians.CHP3, EPHESIANS.getNum(3));
	}
	
	@Test
	public void testEphesiansChp4NumVerses(){
		assertEquals(Ephesians.CHP4, EPHESIANS.getNum(4));
	}
	
	@Test
	public void testEphesiansChp5NumVerses(){
		assertEquals(Ephesians.CHP5, EPHESIANS.getNum(5));
	}
	
	@Test
	public void testEphesiansChp6NumVerses(){
		assertEquals(Ephesians.CHP6, EPHESIANS.getNum(6));
	}
	
	/*
	 * Philippians number of verses checks
	 */
	@Test
	public void testPhilippiansChp1NumVerses(){
		assertEquals(Philippians.CHP1, PHILIPPIANS.getNum(1));
	}
	
	@Test
	public void testPhilippiansChp2NumVerses(){
		assertEquals(Philippians.CHP2, PHILIPPIANS.getNum(2));
	}
	
	@Test
	public void testPhilippiansChp3NumVerses(){
		assertEquals(Philippians.CHP3, PHILIPPIANS.getNum(3));
	}
	
	@Test
	public void testPhilippiansChp4NumVerses(){
		assertEquals(Philippians.CHP4, PHILIPPIANS.getNum(4));
	}
	
	/*
	 * Colossians number of verses checks
	 */
	@Test
	public void testColossiansChp1NumVerses(){
		assertEquals(Colossians.CHP1, COLOSSIANS.getNum(1));
	}
	
	@Test
	public void testColossiansChp2NumVerses(){
		assertEquals(Colossians.CHP2, COLOSSIANS.getNum(2));
	}
	
	@Test
	public void testColossiansChp3NumVerses(){
		assertEquals(Colossians.CHP3, COLOSSIANS.getNum(3));
	}
	
	@Test
	public void testColossiansChp4NumVerses(){
		assertEquals(Colossians.CHP4, COLOSSIANS.getNum(4));
	}
	
	/*
	 * 1 Thessalonians number of verses checks
	 */
	@Test
	public void test1ThessaloniansChp1NumVerses(){
		assertEquals(FirstThessalonians.CHP1, FIRST_THESSALONIANS.getNum(1));
	}
	
	@Test
	public void test1ThessaloniansChp2NumVerses(){
		assertEquals(FirstThessalonians.CHP2, FIRST_THESSALONIANS.getNum(2));
	}
	
	@Test
	public void test1ThessaloniansChp3NumVerses(){
		assertEquals(FirstThessalonians.CHP3, FIRST_THESSALONIANS.getNum(3));
	}
	
	@Test
	public void test1ThessaloniansChp4NumVerses(){
		assertEquals(FirstThessalonians.CHP4, FIRST_THESSALONIANS.getNum(4));
	}
	
	@Test
	public void test1ThessaloniansChp5NumVerses(){
		assertEquals(FirstThessalonians.CHP5, FIRST_THESSALONIANS.getNum(5));
	}
	
	/*
	 * 2 Thessalonians number of verses checks
	 */
	@Test
	public void test2ThessaloniansChp1NumVerses(){
		assertEquals(SecondThessalonians.CHP1, SECOND_THESSALONIANS.getNum(1));
	}
	
	@Test
	public void test2ThessaloniansChp2NumVerses(){
		assertEquals(SecondThessalonians.CHP2, SECOND_THESSALONIANS.getNum(2));
	}
	
	@Test
	public void test2ThessaloniansChp3NumVerses(){
		assertEquals(SecondThessalonians.CHP3, SECOND_THESSALONIANS.getNum(3));
	}
	
	/*
	 * 1 Timothy number of verses checks
	 */
	@Test
	public void test1TimothyChp1NumVerses(){
		assertEquals(FirstTimothy.CHP1, FIRST_TIMOTHY.getNum(1));
	}
	
	@Test
	public void test1TimothyChp2NumVerses(){
		assertEquals(FirstTimothy.CHP2, FIRST_TIMOTHY.getNum(2));
	}
	
	@Test
	public void test1TimothyChp3NumVerses(){
		assertEquals(FirstTimothy.CHP3, FIRST_TIMOTHY.getNum(3));
	}
	
	@Test
	public void test1TimothyChp4NumVerses(){
		assertEquals(FirstTimothy.CHP4, FIRST_TIMOTHY.getNum(4));
	}
	
	@Test
	public void test1TimothyChp5NumVerses(){
		assertEquals(FirstTimothy.CHP5, FIRST_TIMOTHY.getNum(5));
	}
	
	@Test
	public void test1TimothyChp6NumVerses(){
		assertEquals(FirstTimothy.CHP6, FIRST_TIMOTHY.getNum(6));
	}
	
	/*
	 * 2 Timothy number of verses checks
	 */
	@Test
	public void test2TimothyChp1NumVerses(){
		assertEquals(SecondTimothy.CHP1, SECOND_TIMOTHY.getNum(1));
	}
	
	@Test
	public void test2TimothyChp2NumVerses(){
		assertEquals(SecondTimothy.CHP2, SECOND_TIMOTHY.getNum(2));
	}
	
	@Test
	public void test2TimothyChp3NumVerses(){
		assertEquals(SecondTimothy.CHP3, SECOND_TIMOTHY.getNum(3));
	}
	
	@Test
	public void test2TimothyChp4NumVerses(){
		assertEquals(SecondTimothy.CHP4, SECOND_TIMOTHY.getNum(4));
	}
	
	/*
	 * Titus number of verses checks
	 */
	@Test
	public void testTitusChp1NumVerses(){
		assertEquals(Titus.CHP1, TITUS.getNum(1));
	}
	
	@Test
	public void testTitusChp2NumVerses(){
		assertEquals(Titus.CHP2, TITUS.getNum(2));
	}
	
	@Test
	public void testTitusChp3NumVerses(){
		assertEquals(Titus.CHP3, TITUS.getNum(3));
	}
	
	/*
	 * Philemon number of verses checks
	 */
	@Test
	public void testPhilemonChp1NumVerses(){
		assertEquals(Philemon.CHP1, PHILEMON.getNum(1));
	}
	
	/*
	 * Hebrews number of verses checks
	 */
	@Test
	public void testHebrewsChp1NumVerses(){
		assertEquals(Hebrews.CHP1, HEBREWS.getNum(1));
	}
	
	@Test
	public void testHebrewsChp2NumVerses(){
		assertEquals(Hebrews.CHP2, HEBREWS.getNum(2));
	}
	
	@Test
	public void testHebrewsChp3NumVerses(){
		assertEquals(Hebrews.CHP3, HEBREWS.getNum(3));
	}
	
	@Test
	public void testHebrewsChp4NumVerses(){
		assertEquals(Hebrews.CHP4, HEBREWS.getNum(4));
	}
	
	@Test
	public void testHebrewsChp5NumVerses(){
		assertEquals(Hebrews.CHP5, HEBREWS.getNum(5));
	}
	
	@Test
	public void testHebrewsChp6NumVerses(){
		assertEquals(Hebrews.CHP6, HEBREWS.getNum(6));
	}
	
	@Test
	public void testHebrewsChp7NumVerses(){
		assertEquals(Hebrews.CHP7, HEBREWS.getNum(7));
	}
	
	@Test
	public void testHebrewsChp8NumVerses(){
		assertEquals(Hebrews.CHP8, HEBREWS.getNum(8));
	}
	
	@Test
	public void testHebrewsChp9NumVerses(){
		assertEquals(Hebrews.CHP9, HEBREWS.getNum(9));
	}
	
	@Test
	public void testHebrewsChp10NumVerses(){
		assertEquals(Hebrews.CHP10, HEBREWS.getNum(10));
	}
	
	@Test
	public void testHebrewsChp11NumVerses(){
		assertEquals(Hebrews.CHP11, HEBREWS.getNum(11));
	}
	
	@Test
	public void testHebrewsChp12NumVerses(){
		assertEquals(Hebrews.CHP12, HEBREWS.getNum(12));
	}
	
	@Test
	public void testHebrewsChp13NumVerses(){
		assertEquals(Hebrews.CHP13, HEBREWS.getNum(13));
	}
	
	/*
	 * James number of verses checks
	 */
	@Test
	public void testJamesChp1NumVerses(){
		assertEquals(James.CHP1, JAMES.getNum(1));
	}
	
	@Test
	public void testJamesChp2NumVerses(){
		assertEquals(James.CHP2, JAMES.getNum(2));
	}
	
	@Test
	public void testJamesChp3NumVerses(){
		assertEquals(James.CHP3, JAMES.getNum(3));
	}
	
	@Test
	public void testJamesChp4NumVerses(){
		assertEquals(James.CHP4, JAMES.getNum(4));
	}
	
	@Test
	public void testJamesChp5NumVerses(){
		assertEquals(James.CHP5, JAMES.getNum(5));
	}
	
	/*
	 * 1 Peter number of verses checks
	 */
	@Test
	public void test1PeterChp1NumVerses(){
		assertEquals(FirstPeter.CHP1, FIRST_PETER.getNum(1));
	}
	
	@Test
	public void test1PeterChp2NumVerses(){
		assertEquals(FirstPeter.CHP2, FIRST_PETER.getNum(2));
	}
	
	@Test
	public void test1PeterChp3NumVerses(){
		assertEquals(FirstPeter.CHP3, FIRST_PETER.getNum(3));
	}
	
	@Test
	public void test1PeterChp4NumVerses(){
		assertEquals(FirstPeter.CHP4, FIRST_PETER.getNum(4));
	}
	
	@Test
	public void test1PeterChp5NumVerses(){
		assertEquals(FirstPeter.CHP5, FIRST_PETER.getNum(5));
	}
	
	/*
	 * 2 Peter number of verses checks
	 */
	@Test
	public void test2PeterChp1NumVerses(){
		assertEquals(SecondPeter.CHP1, SECOND_PETER.getNum(1));
	}
	
	@Test
	public void test2PeterChp2NumVerses(){
		assertEquals(SecondPeter.CHP2, SECOND_PETER.getNum(2));
	}
	
	@Test
	public void test2PeterChp3NumVerses(){
		assertEquals(SecondPeter.CHP3, SECOND_PETER.getNum(3));
	}
	
	/*
	 * 1 John number of verses checks
	 */
	@Test
	public void test1JohnChp1NumVerses(){
		assertEquals(FirstJohn.CHP1, FIRST_JOHN.getNum(1));
	}
	
	@Test
	public void test1JohnChp2NumVerses(){
		assertEquals(FirstJohn.CHP2, FIRST_JOHN.getNum(2));
	}
	
	@Test
	public void test1JohnChp3NumVerses(){
		assertEquals(FirstJohn.CHP3, FIRST_JOHN.getNum(3));
	}
	
	@Test
	public void test1JohnChp4NumVerses(){
		assertEquals(FirstJohn.CHP4, FIRST_JOHN.getNum(4));
	}
	
	@Test
	public void test1JohnChp5NumVerses(){
		assertEquals(FirstJohn.CHP5, FIRST_JOHN.getNum(5));
	}
	
	/*
	 * 2 John number of verses checks
	 */
	@Test
	public void test2JohnChp1NumVerses(){
		assertEquals(SecondJohn.CHP1, SECOND_JOHN.getNum(1));
	}
	
	/*
	 * 3 John number of verses checks
	 */
	@Test
	public void test3JohnChp1NumVerses(){
		assertEquals(ThirdJohn.CHP1, THIRD_JOHN.getNum(1));
	}
	
	/*
	 * Jude number of verses checks
	 */
	@Test
	public void testJudeChp1NumVerses(){
		assertEquals(Jude.CHP1, JUDE.getNum(1));
	}
	
	/*
	 * Revelation number of verses checks
	 */
	@Test
	public void testRevelationChp1NumVerses(){
		assertEquals(Revelation.CHP1, REVELATION.getNum(1));
	}
	
	@Test
	public void testRevelationChp2NumVerses(){
		assertEquals(Revelation.CHP2, REVELATION.getNum(2));
	}
	
	@Test
	public void testRevelationChp3NumVerses(){
		assertEquals(Revelation.CHP3, REVELATION.getNum(3));
	}
	
	@Test
	public void testRevelationChp4NumVerses(){
		assertEquals(Revelation.CHP4, REVELATION.getNum(4));
	}
	
	@Test
	public void testRevelationChp5NumVerses(){
		assertEquals(Revelation.CHP5, REVELATION.getNum(5));
	}
	
	@Test
	public void testRevelationChp6NumVerses(){
		assertEquals(Revelation.CHP6, REVELATION.getNum(6));
	}
	
	@Test
	public void testRevelationChp7NumVerses(){
		assertEquals(Revelation.CHP7, REVELATION.getNum(7));
	}
	
	@Test
	public void testRevelationChp8NumVerses(){
		assertEquals(Revelation.CHP8, REVELATION.getNum(8));
	}
	
	@Test
	public void testRevelationChp9NumVerses(){
		assertEquals(Revelation.CHP9, REVELATION.getNum(9));
	}
	
	@Test
	public void testRevelationChp10NumVerses(){
		assertEquals(Revelation.CHP10, REVELATION.getNum(10));
	}
	
	@Test
	public void testRevelationChp11NumVerses(){
		assertEquals(Revelation.CHP11, REVELATION.getNum(11));
	}
	
	@Test
	public void testRevelationChp12NumVerses(){
		assertEquals(Revelation.CHP12, REVELATION.getNum(12));
	}
	
	@Test
	public void testRevelationChp13NumVerses(){
		assertEquals(Revelation.CHP13, REVELATION.getNum(13));
	}
	
	@Test
	public void testRevelationChp14NumVerses(){
		assertEquals(Revelation.CHP14, REVELATION.getNum(14));
	}
	
	@Test
	public void testRevelationChp15NumVerses(){
		assertEquals(Revelation.CHP15, REVELATION.getNum(15));
	}
	
	@Test
	public void testRevelationChp16NumVerses(){
		assertEquals(Revelation.CHP16, REVELATION.getNum(16));
	}
	
	@Test
	public void testRevelationChp17NumVerses(){
		assertEquals(Revelation.CHP17, REVELATION.getNum(17));
	}
	
	@Test
	public void testRevelationChp18NumVerses(){
		assertEquals(Revelation.CHP18, REVELATION.getNum(18));
	}
	
	@Test
	public void testRevelationChp19NumVerses(){
		assertEquals(Revelation.CHP19, REVELATION.getNum(19));
	}
	
	@Test
	public void testRevelationChp20NumVerses(){
		assertEquals(Revelation.CHP20, REVELATION.getNum(20));
	}
	
	@Test
	public void testRevelationChp21NumVerses(){
		assertEquals(Revelation.CHP21, REVELATION.getNum(21));
	}
	
	@Test
	public void testRevelationChp22NumVerses(){
		assertEquals(Revelation.CHP22, REVELATION.getNum(22));
	}
	
}
