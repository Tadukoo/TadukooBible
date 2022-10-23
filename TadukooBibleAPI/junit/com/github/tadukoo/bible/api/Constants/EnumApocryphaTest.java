package com.github.tadukoo.bible.api.Constants;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.Constants.EnumApocrypha.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnumApocryphaTest{
	
	@Test
	public void testTobitName(){
		assertEquals("Tobit", TOBIT.getBook());
	}
	
	@Test
	public void testJudithName(){
		assertEquals("Judith", JUDITH.getBook());
	}
	
	@Test
	public void testAdditionstoEstherName(){
		assertEquals("Additions to Esther", ADDITIONS_TO_ESTHER.getBook());
	}
	
	@Test
	public void testFirstMaccabeesName(){
		assertEquals("1 Maccabees", FIRST_MACCABEES.getBook());
	}
	
	@Test
	public void testSecondMaccabeesName(){
		assertEquals("2 Maccabees", SECOND_MACCABEES.getBook());
	}
	
	@Test
	public void testWisdomName(){
		assertEquals("Wisdom", WISDOM.getBook());
	}
	
	@Test
	public void testSirachName(){
		assertEquals("Sirach", SIRACH.getBook());
	}
	
	@Test
	public void testBaruchName(){
		assertEquals("Baruch", BARUCH.getBook());
	}
	
	@Test
	public void testLetterofJeremiahName(){
		assertEquals("Letter of Jeremiah", LETTER_OF_JEREMIAH.getBook());
	}
	
	@Test
	public void testPrayerofAzariahandtheSongoftheThreeYoungMenName(){
		assertEquals("Prayer of Azariah and the Song of the Three Young Men", PRAYER_OF_AZARIAH_AND_SONG_OF_THREE_YOUNG_MEN.getBook());
	}
	
	@Test
	public void testSusannaName(){
		assertEquals("Susanna", SUSANNA.getBook());
	}
	
	@Test
	public void testBelandtheDragonName(){
		assertEquals("Bel and the Dragon", BEL_AND_THE_DRAGON.getBook());
	}
	
	@Test
	public void testFirstEsdrasName(){
		assertEquals("1 Esdras", FIRST_ESDRAS.getBook());
	}
	
	@Test
	public void testSecondEsdrasName(){
		assertEquals("2 Esdras", SECOND_ESDRAS.getBook());
	}
	
	@Test
	public void testThirdMaccabeesName(){
		assertEquals("3 Maccabees", THIRD_MACCABEES.getBook());
	}
	
	@Test
	public void testFourthMaccabeesName(){
		assertEquals("4 Maccabees", FOURTH_MACCABEES.getBook());
	}
	
	@Test
	public void testPsalm151Name(){
		assertEquals("Psalm 151", PSALM_151.getBook());
	}
	
	@Test
	public void testOdesName(){
		assertEquals("Odes", ODES.getBook());
	}
	
	@Test
	public void testPrayerofManassehName(){
		assertEquals("Prayer of Manasseh", PRAYER_OF_MANASSEH.getBook());
	}
	
	@Test
	public void testFourthBaruchName(){
		assertEquals("4 Baruch", FOURTH_BARUCH.getBook());
	}
	
	@Test
	public void testJubileesName(){
		assertEquals("Jubilees", JUBILEES.getBook());
	}
	
	@Test
	public void testEnochName(){
		assertEquals("Enoch", ENOCH.getBook());
	}
	
	@Test
	public void testFirstMeqabyanName(){
		assertEquals("1 Meqabyan", FIRST_MEQABYAN.getBook());
	}
	
	@Test
	public void testSecondMeqabyanName(){
		assertEquals("2 Meqabyan", SECOND_MEQABYAN.getBook());
	}
	
	@Test
	public void testThirdMeqabyanName(){
		assertEquals("3 Meqabyan", THIRD_MEQABYAN.getBook());
	}
}
