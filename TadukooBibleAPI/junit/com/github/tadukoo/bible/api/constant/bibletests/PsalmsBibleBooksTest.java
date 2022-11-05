package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.PSALMS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PsalmsBibleBooksTest{
	
	@Test
	public void testPsalmsName(){
		assertEquals("Psalms", PSALMS.getName());
	}
	
	@Test
	public void testPsalmsAuthor(){
		assertEquals("Many people", PSALMS.getAuthor());
	}
	
	@Test
	public void testPsalmsAliases(){
		assertEquals(ListUtil.createList("Psalm", "Psa", "Ps"), PSALMS.getAliases());
	}
	
	@Test
	public void testPsalmsChapters(){
		assertEquals(ListUtil.createList(6, 12, 8, 8, 12, 10, 17, 9, 20, 18, 7, 8, 6, 7, 5, 11, 15, 50, 14, 9, 13, 31, 6, 10, 22, 12, 14, 9, 11, 12, 24, 11, 22, 22, 28, 12, 40, 22, 13, 17, 13, 11, 5, 26, 17, 11, 9, 14, 20, 23, 19, 9, 6, 7, 23, 13, 11, 11, 17, 12, 8, 12, 11, 10, 13, 20, 7, 35, 36, 5, 24, 20, 28, 23, 10, 12, 20, 72, 13, 19, 16, 8, 18, 12, 13, 17, 7, 18, 52, 17, 16, 15, 5, 23, 11, 13, 12, 9, 9, 5, 8, 28, 22, 35, 45, 48, 43, 13, 31, 7, 10, 10, 9, 8, 18, 19, 2, 29, 176, 7, 8, 9, 4, 8, 5, 6, 5, 6, 8, 8, 3, 18, 3, 3, 21, 26, 9, 8, 24, 13, 10, 7, 12, 15, 21, 10, 20, 14, 9, 6), PSALMS.getChapters());
	}
	
	@Test
	public void testPsalmsNumChapters(){
		assertEquals(150, PSALMS.getNumChapters());
	}
	
	@Test
	public void testPsalmsChp1NumVerses(){
		assertEquals(6, PSALMS.getNumVersesInChp(1));
	}
	
	@Test
	public void testPsalmsChp2NumVerses(){
		assertEquals(12, PSALMS.getNumVersesInChp(2));
	}
	
	@Test
	public void testPsalmsChp3NumVerses(){
		assertEquals(8, PSALMS.getNumVersesInChp(3));
	}
	
	@Test
	public void testPsalmsChp4NumVerses(){
		assertEquals(8, PSALMS.getNumVersesInChp(4));
	}
	
	@Test
	public void testPsalmsChp5NumVerses(){
		assertEquals(12, PSALMS.getNumVersesInChp(5));
	}
	
	@Test
	public void testPsalmsChp6NumVerses(){
		assertEquals(10, PSALMS.getNumVersesInChp(6));
	}
	
	@Test
	public void testPsalmsChp7NumVerses(){
		assertEquals(17, PSALMS.getNumVersesInChp(7));
	}
	
	@Test
	public void testPsalmsChp8NumVerses(){
		assertEquals(9, PSALMS.getNumVersesInChp(8));
	}
	
	@Test
	public void testPsalmsChp9NumVerses(){
		assertEquals(20, PSALMS.getNumVersesInChp(9));
	}
	
	@Test
	public void testPsalmsChp10NumVerses(){
		assertEquals(18, PSALMS.getNumVersesInChp(10));
	}
	
	@Test
	public void testPsalmsChp11NumVerses(){
		assertEquals(7, PSALMS.getNumVersesInChp(11));
	}
	
	@Test
	public void testPsalmsChp12NumVerses(){
		assertEquals(8, PSALMS.getNumVersesInChp(12));
	}
	
	@Test
	public void testPsalmsChp13NumVerses(){
		assertEquals(6, PSALMS.getNumVersesInChp(13));
	}
	
	@Test
	public void testPsalmsChp14NumVerses(){
		assertEquals(7, PSALMS.getNumVersesInChp(14));
	}
	
	@Test
	public void testPsalmsChp15NumVerses(){
		assertEquals(5, PSALMS.getNumVersesInChp(15));
	}
	
	@Test
	public void testPsalmsChp16NumVerses(){
		assertEquals(11, PSALMS.getNumVersesInChp(16));
	}
	
	@Test
	public void testPsalmsChp17NumVerses(){
		assertEquals(15, PSALMS.getNumVersesInChp(17));
	}
	
	@Test
	public void testPsalmsChp18NumVerses(){
		assertEquals(50, PSALMS.getNumVersesInChp(18));
	}
	
	@Test
	public void testPsalmsChp19NumVerses(){
		assertEquals(14, PSALMS.getNumVersesInChp(19));
	}
	
	@Test
	public void testPsalmsChp20NumVerses(){
		assertEquals(9, PSALMS.getNumVersesInChp(20));
	}
	
	@Test
	public void testPsalmsChp21NumVerses(){
		assertEquals(13, PSALMS.getNumVersesInChp(21));
	}
	
	@Test
	public void testPsalmsChp22NumVerses(){
		assertEquals(31, PSALMS.getNumVersesInChp(22));
	}
	
	@Test
	public void testPsalmsChp23NumVerses(){
		assertEquals(6, PSALMS.getNumVersesInChp(23));
	}
	
	@Test
	public void testPsalmsChp24NumVerses(){
		assertEquals(10, PSALMS.getNumVersesInChp(24));
	}
	
	@Test
	public void testPsalmsChp25NumVerses(){
		assertEquals(22, PSALMS.getNumVersesInChp(25));
	}
	
	@Test
	public void testPsalmsChp26NumVerses(){
		assertEquals(12, PSALMS.getNumVersesInChp(26));
	}
	
	@Test
	public void testPsalmsChp27NumVerses(){
		assertEquals(14, PSALMS.getNumVersesInChp(27));
	}
	
	@Test
	public void testPsalmsChp28NumVerses(){
		assertEquals(9, PSALMS.getNumVersesInChp(28));
	}
	
	@Test
	public void testPsalmsChp29NumVerses(){
		assertEquals(11, PSALMS.getNumVersesInChp(29));
	}
	
	@Test
	public void testPsalmsChp30NumVerses(){
		assertEquals(12, PSALMS.getNumVersesInChp(30));
	}
	
	@Test
	public void testPsalmsChp31NumVerses(){
		assertEquals(24, PSALMS.getNumVersesInChp(31));
	}
	
	@Test
	public void testPsalmsChp32NumVerses(){
		assertEquals(11, PSALMS.getNumVersesInChp(32));
	}
	
	@Test
	public void testPsalmsChp33NumVerses(){
		assertEquals(22, PSALMS.getNumVersesInChp(33));
	}
	
	@Test
	public void testPsalmsChp34NumVerses(){
		assertEquals(22, PSALMS.getNumVersesInChp(34));
	}
	
	@Test
	public void testPsalmsChp35NumVerses(){
		assertEquals(28, PSALMS.getNumVersesInChp(35));
	}
	
	@Test
	public void testPsalmsChp36NumVerses(){
		assertEquals(12, PSALMS.getNumVersesInChp(36));
	}
	
	@Test
	public void testPsalmsChp37NumVerses(){
		assertEquals(40, PSALMS.getNumVersesInChp(37));
	}
	
	@Test
	public void testPsalmsChp38NumVerses(){
		assertEquals(22, PSALMS.getNumVersesInChp(38));
	}
	
	@Test
	public void testPsalmsChp39NumVerses(){
		assertEquals(13, PSALMS.getNumVersesInChp(39));
	}
	
	@Test
	public void testPsalmsChp40NumVerses(){
		assertEquals(17, PSALMS.getNumVersesInChp(40));
	}
	
	@Test
	public void testPsalmsChp41NumVerses(){
		assertEquals(13, PSALMS.getNumVersesInChp(41));
	}
	
	@Test
	public void testPsalmsChp42NumVerses(){
		assertEquals(11, PSALMS.getNumVersesInChp(42));
	}
	
	@Test
	public void testPsalmsChp43NumVerses(){
		assertEquals(5, PSALMS.getNumVersesInChp(43));
	}
	
	@Test
	public void testPsalmsChp44NumVerses(){
		assertEquals(26, PSALMS.getNumVersesInChp(44));
	}
	
	@Test
	public void testPsalmsChp45NumVerses(){
		assertEquals(17, PSALMS.getNumVersesInChp(45));
	}
	
	@Test
	public void testPsalmsChp46NumVerses(){
		assertEquals(11, PSALMS.getNumVersesInChp(46));
	}
	
	@Test
	public void testPsalmsChp47NumVerses(){
		assertEquals(9, PSALMS.getNumVersesInChp(47));
	}
	
	@Test
	public void testPsalmsChp48NumVerses(){
		assertEquals(14, PSALMS.getNumVersesInChp(48));
	}
	
	@Test
	public void testPsalmsChp49NumVerses(){
		assertEquals(20, PSALMS.getNumVersesInChp(49));
	}
	
	@Test
	public void testPsalmsChp50NumVerses(){
		assertEquals(23, PSALMS.getNumVersesInChp(50));
	}
	
	@Test
	public void testPsalmsChp51NumVerses(){
		assertEquals(19, PSALMS.getNumVersesInChp(51));
	}
	
	@Test
	public void testPsalmsChp52NumVerses(){
		assertEquals(9, PSALMS.getNumVersesInChp(52));
	}
	
	@Test
	public void testPsalmsChp53NumVerses(){
		assertEquals(6, PSALMS.getNumVersesInChp(53));
	}
	
	@Test
	public void testPsalmsChp54NumVerses(){
		assertEquals(7, PSALMS.getNumVersesInChp(54));
	}
	
	@Test
	public void testPsalmsChp55NumVerses(){
		assertEquals(23, PSALMS.getNumVersesInChp(55));
	}
	
	@Test
	public void testPsalmsChp56NumVerses(){
		assertEquals(13, PSALMS.getNumVersesInChp(56));
	}
	
	@Test
	public void testPsalmsChp57NumVerses(){
		assertEquals(11, PSALMS.getNumVersesInChp(57));
	}
	
	@Test
	public void testPsalmsChp58NumVerses(){
		assertEquals(11, PSALMS.getNumVersesInChp(58));
	}
	
	@Test
	public void testPsalmsChp59NumVerses(){
		assertEquals(17, PSALMS.getNumVersesInChp(59));
	}
	
	@Test
	public void testPsalmsChp60NumVerses(){
		assertEquals(12, PSALMS.getNumVersesInChp(60));
	}
	
	@Test
	public void testPsalmsChp61NumVerses(){
		assertEquals(8, PSALMS.getNumVersesInChp(61));
	}
	
	@Test
	public void testPsalmsChp62NumVerses(){
		assertEquals(12, PSALMS.getNumVersesInChp(62));
	}
	
	@Test
	public void testPsalmsChp63NumVerses(){
		assertEquals(11, PSALMS.getNumVersesInChp(63));
	}
	
	@Test
	public void testPsalmsChp64NumVerses(){
		assertEquals(10, PSALMS.getNumVersesInChp(64));
	}
	
	@Test
	public void testPsalmsChp65NumVerses(){
		assertEquals(13, PSALMS.getNumVersesInChp(65));
	}
	
	@Test
	public void testPsalmsChp66NumVerses(){
		assertEquals(20, PSALMS.getNumVersesInChp(66));
	}
	
	@Test
	public void testPsalmsChp67NumVerses(){
		assertEquals(7, PSALMS.getNumVersesInChp(67));
	}
	
	@Test
	public void testPsalmsChp68NumVerses(){
		assertEquals(35, PSALMS.getNumVersesInChp(68));
	}
	
	@Test
	public void testPsalmsChp69NumVerses(){
		assertEquals(36, PSALMS.getNumVersesInChp(69));
	}
	
	@Test
	public void testPsalmsChp70NumVerses(){
		assertEquals(5, PSALMS.getNumVersesInChp(70));
	}
	
	@Test
	public void testPsalmsChp71NumVerses(){
		assertEquals(24, PSALMS.getNumVersesInChp(71));
	}
	
	@Test
	public void testPsalmsChp72NumVerses(){
		assertEquals(20, PSALMS.getNumVersesInChp(72));
	}
	
	@Test
	public void testPsalmsChp73NumVerses(){
		assertEquals(28, PSALMS.getNumVersesInChp(73));
	}
	
	@Test
	public void testPsalmsChp74NumVerses(){
		assertEquals(23, PSALMS.getNumVersesInChp(74));
	}
	
	@Test
	public void testPsalmsChp75NumVerses(){
		assertEquals(10, PSALMS.getNumVersesInChp(75));
	}
	
	@Test
	public void testPsalmsChp76NumVerses(){
		assertEquals(12, PSALMS.getNumVersesInChp(76));
	}
	
	@Test
	public void testPsalmsChp77NumVerses(){
		assertEquals(20, PSALMS.getNumVersesInChp(77));
	}
	
	@Test
	public void testPsalmsChp78NumVerses(){
		assertEquals(72, PSALMS.getNumVersesInChp(78));
	}
	
	@Test
	public void testPsalmsChp79NumVerses(){
		assertEquals(13, PSALMS.getNumVersesInChp(79));
	}
	
	@Test
	public void testPsalmsChp80NumVerses(){
		assertEquals(19, PSALMS.getNumVersesInChp(80));
	}
	
	@Test
	public void testPsalmsChp81NumVerses(){
		assertEquals(16, PSALMS.getNumVersesInChp(81));
	}
	
	@Test
	public void testPsalmsChp82NumVerses(){
		assertEquals(8, PSALMS.getNumVersesInChp(82));
	}
	
	@Test
	public void testPsalmsChp83NumVerses(){
		assertEquals(18, PSALMS.getNumVersesInChp(83));
	}
	
	@Test
	public void testPsalmsChp84NumVerses(){
		assertEquals(12, PSALMS.getNumVersesInChp(84));
	}
	
	@Test
	public void testPsalmsChp85NumVerses(){
		assertEquals(13, PSALMS.getNumVersesInChp(85));
	}
	
	@Test
	public void testPsalmsChp86NumVerses(){
		assertEquals(17, PSALMS.getNumVersesInChp(86));
	}
	
	@Test
	public void testPsalmsChp87NumVerses(){
		assertEquals(7, PSALMS.getNumVersesInChp(87));
	}
	
	@Test
	public void testPsalmsChp88NumVerses(){
		assertEquals(18, PSALMS.getNumVersesInChp(88));
	}
	
	@Test
	public void testPsalmsChp89NumVerses(){
		assertEquals(52, PSALMS.getNumVersesInChp(89));
	}
	
	@Test
	public void testPsalmsChp90NumVerses(){
		assertEquals(17, PSALMS.getNumVersesInChp(90));
	}
	
	@Test
	public void testPsalmsChp91NumVerses(){
		assertEquals(16, PSALMS.getNumVersesInChp(91));
	}
	
	@Test
	public void testPsalmsChp92NumVerses(){
		assertEquals(15, PSALMS.getNumVersesInChp(92));
	}
	
	@Test
	public void testPsalmsChp93NumVerses(){
		assertEquals(5, PSALMS.getNumVersesInChp(93));
	}
	
	@Test
	public void testPsalmsChp94NumVerses(){
		assertEquals(23, PSALMS.getNumVersesInChp(94));
	}
	
	@Test
	public void testPsalmsChp95NumVerses(){
		assertEquals(11, PSALMS.getNumVersesInChp(95));
	}
	
	@Test
	public void testPsalmsChp96NumVerses(){
		assertEquals(13, PSALMS.getNumVersesInChp(96));
	}
	
	@Test
	public void testPsalmsChp97NumVerses(){
		assertEquals(12, PSALMS.getNumVersesInChp(97));
	}
	
	@Test
	public void testPsalmsChp98NumVerses(){
		assertEquals(9, PSALMS.getNumVersesInChp(98));
	}
	
	@Test
	public void testPsalmsChp99NumVerses(){
		assertEquals(9, PSALMS.getNumVersesInChp(99));
	}
	
	@Test
	public void testPsalmsChp100NumVerses(){
		assertEquals(5, PSALMS.getNumVersesInChp(100));
	}
	
	@Test
	public void testPsalmsChp101NumVerses(){
		assertEquals(8, PSALMS.getNumVersesInChp(101));
	}
	
	@Test
	public void testPsalmsChp102NumVerses(){
		assertEquals(28, PSALMS.getNumVersesInChp(102));
	}
	
	@Test
	public void testPsalmsChp103NumVerses(){
		assertEquals(22, PSALMS.getNumVersesInChp(103));
	}
	
	@Test
	public void testPsalmsChp104NumVerses(){
		assertEquals(35, PSALMS.getNumVersesInChp(104));
	}
	
	@Test
	public void testPsalmsChp105NumVerses(){
		assertEquals(45, PSALMS.getNumVersesInChp(105));
	}
	
	@Test
	public void testPsalmsChp106NumVerses(){
		assertEquals(48, PSALMS.getNumVersesInChp(106));
	}
	
	@Test
	public void testPsalmsChp107NumVerses(){
		assertEquals(43, PSALMS.getNumVersesInChp(107));
	}
	
	@Test
	public void testPsalmsChp108NumVerses(){
		assertEquals(13, PSALMS.getNumVersesInChp(108));
	}
	
	@Test
	public void testPsalmsChp109NumVerses(){
		assertEquals(31, PSALMS.getNumVersesInChp(109));
	}
	
	@Test
	public void testPsalmsChp110NumVerses(){
		assertEquals(7, PSALMS.getNumVersesInChp(110));
	}
	
	@Test
	public void testPsalmsChp111NumVerses(){
		assertEquals(10, PSALMS.getNumVersesInChp(111));
	}
	
	@Test
	public void testPsalmsChp112NumVerses(){
		assertEquals(10, PSALMS.getNumVersesInChp(112));
	}
	
	@Test
	public void testPsalmsChp113NumVerses(){
		assertEquals(9, PSALMS.getNumVersesInChp(113));
	}
	
	@Test
	public void testPsalmsChp114NumVerses(){
		assertEquals(8, PSALMS.getNumVersesInChp(114));
	}
	
	@Test
	public void testPsalmsChp115NumVerses(){
		assertEquals(18, PSALMS.getNumVersesInChp(115));
	}
	
	@Test
	public void testPsalmsChp116NumVerses(){
		assertEquals(19, PSALMS.getNumVersesInChp(116));
	}
	
	@Test
	public void testPsalmsChp117NumVerses(){
		assertEquals(2, PSALMS.getNumVersesInChp(117));
	}
	
	@Test
	public void testPsalmsChp118NumVerses(){
		assertEquals(29, PSALMS.getNumVersesInChp(118));
	}
	
	@Test
	public void testPsalmsChp119NumVerses(){
		assertEquals(176, PSALMS.getNumVersesInChp(119));
	}
	
	@Test
	public void testPsalmsChp120NumVerses(){
		assertEquals(7, PSALMS.getNumVersesInChp(120));
	}
	
	@Test
	public void testPsalmsChp121NumVerses(){
		assertEquals(8, PSALMS.getNumVersesInChp(121));
	}
	
	@Test
	public void testPsalmsChp122NumVerses(){
		assertEquals(9, PSALMS.getNumVersesInChp(122));
	}
	
	@Test
	public void testPsalmsChp123NumVerses(){
		assertEquals(4, PSALMS.getNumVersesInChp(123));
	}
	
	@Test
	public void testPsalmsChp124NumVerses(){
		assertEquals(8, PSALMS.getNumVersesInChp(124));
	}
	
	@Test
	public void testPsalmsChp125NumVerses(){
		assertEquals(5, PSALMS.getNumVersesInChp(125));
	}
	
	@Test
	public void testPsalmsChp126NumVerses(){
		assertEquals(6, PSALMS.getNumVersesInChp(126));
	}
	
	@Test
	public void testPsalmsChp127NumVerses(){
		assertEquals(5, PSALMS.getNumVersesInChp(127));
	}
	
	@Test
	public void testPsalmsChp128NumVerses(){
		assertEquals(6, PSALMS.getNumVersesInChp(128));
	}
	
	@Test
	public void testPsalmsChp129NumVerses(){
		assertEquals(8, PSALMS.getNumVersesInChp(129));
	}
	
	@Test
	public void testPsalmsChp130NumVerses(){
		assertEquals(8, PSALMS.getNumVersesInChp(130));
	}
	
	@Test
	public void testPsalmsChp131NumVerses(){
		assertEquals(3, PSALMS.getNumVersesInChp(131));
	}
	
	@Test
	public void testPsalmsChp132NumVerses(){
		assertEquals(18, PSALMS.getNumVersesInChp(132));
	}
	
	@Test
	public void testPsalmsChp133NumVerses(){
		assertEquals(3, PSALMS.getNumVersesInChp(133));
	}
	
	@Test
	public void testPsalmsChp134NumVerses(){
		assertEquals(3, PSALMS.getNumVersesInChp(134));
	}
	
	@Test
	public void testPsalmsChp135NumVerses(){
		assertEquals(21, PSALMS.getNumVersesInChp(135));
	}
	
	@Test
	public void testPsalmsChp136NumVerses(){
		assertEquals(26, PSALMS.getNumVersesInChp(136));
	}
	
	@Test
	public void testPsalmsChp137NumVerses(){
		assertEquals(9, PSALMS.getNumVersesInChp(137));
	}
	
	@Test
	public void testPsalmsChp138NumVerses(){
		assertEquals(8, PSALMS.getNumVersesInChp(138));
	}
	
	@Test
	public void testPsalmsChp139NumVerses(){
		assertEquals(24, PSALMS.getNumVersesInChp(139));
	}
	
	@Test
	public void testPsalmsChp140NumVerses(){
		assertEquals(13, PSALMS.getNumVersesInChp(140));
	}
	
	@Test
	public void testPsalmsChp141NumVerses(){
		assertEquals(10, PSALMS.getNumVersesInChp(141));
	}
	
	@Test
	public void testPsalmsChp142NumVerses(){
		assertEquals(7, PSALMS.getNumVersesInChp(142));
	}
	
	@Test
	public void testPsalmsChp143NumVerses(){
		assertEquals(12, PSALMS.getNumVersesInChp(143));
	}
	
	@Test
	public void testPsalmsChp144NumVerses(){
		assertEquals(15, PSALMS.getNumVersesInChp(144));
	}
	
	@Test
	public void testPsalmsChp145NumVerses(){
		assertEquals(21, PSALMS.getNumVersesInChp(145));
	}
	
	@Test
	public void testPsalmsChp146NumVerses(){
		assertEquals(10, PSALMS.getNumVersesInChp(146));
	}
	
	@Test
	public void testPsalmsChp147NumVerses(){
		assertEquals(20, PSALMS.getNumVersesInChp(147));
	}
	
	@Test
	public void testPsalmsChp148NumVerses(){
		assertEquals(14, PSALMS.getNumVersesInChp(148));
	}
	
	@Test
	public void testPsalmsChp149NumVerses(){
		assertEquals(9, PSALMS.getNumVersesInChp(149));
	}
	
	@Test
	public void testPsalmsChp150NumVerses(){
		assertEquals(6, PSALMS.getNumVersesInChp(150));
	}
	
	@Test
	public void testFromName(){
		assertEquals(PSALMS, BibleBooks.fromName("Psalms"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(PSALMS, BibleBooks.fromString("Psalms"));
	}
	
	@Test
	public void testFromAliasPsalm(){
		assertEquals(PSALMS, BibleBooks.fromString("Psalm"));
	}
	
	@Test
	public void testFromAliasPsa(){
		assertEquals(PSALMS, BibleBooks.fromString("Psa"));
	}
	
	@Test
	public void testFromAliasPs(){
		assertEquals(PSALMS, BibleBooks.fromString("Ps"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(PSALMS, BibleBooks.fromInt(19));
	}
}
