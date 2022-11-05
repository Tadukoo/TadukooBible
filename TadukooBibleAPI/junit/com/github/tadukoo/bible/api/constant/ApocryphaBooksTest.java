package com.github.tadukoo.bible.api.constant;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.ApocryphaBooks.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApocryphaBooksTest{
	
	@Test
	public void testTobitName(){
		assertEquals("Tobit", TOBIT.getName());
	}
	
	@Test
	public void testJudithName(){
		assertEquals("Judith", JUDITH.getName());
	}
	
	@Test
	public void testAdditionstoEstherName(){
		assertEquals("Additions to Esther", ADDITIONS_TO_ESTHER.getName());
	}
	
	@Test
	public void testFirstMaccabeesName(){
		assertEquals("1 Maccabees", FIRST_MACCABEES.getName());
	}
	
	@Test
	public void testSecondMaccabeesName(){
		assertEquals("2 Maccabees", SECOND_MACCABEES.getName());
	}
	
	@Test
	public void testWisdomName(){
		assertEquals("Wisdom", WISDOM.getName());
	}
	
	@Test
	public void testSirachName(){
		assertEquals("Sirach", SIRACH.getName());
	}
	
	@Test
	public void testBaruchName(){
		assertEquals("Baruch", BARUCH.getName());
	}
	
	@Test
	public void testLetterofJeremiahName(){
		assertEquals("Letter of Jeremiah", LETTER_OF_JEREMIAH.getName());
	}
	
	@Test
	public void testPrayerofAzariahandtheSongoftheThreeYoungMenName(){
		assertEquals("Prayer of Azariah and the Song of the Three Young Men", PRAYER_OF_AZARIAH_AND_SONG_OF_THREE_YOUNG_MEN.getName());
	}
	
	@Test
	public void testSusannaName(){
		assertEquals("Susanna", SUSANNA.getName());
	}
	
	@Test
	public void testBelandtheDragonName(){
		assertEquals("Bel and the Dragon", BEL_AND_THE_DRAGON.getName());
	}
	
	@Test
	public void testFirstEsdrasName(){
		assertEquals("1 Esdras", FIRST_ESDRAS.getName());
	}
	
	@Test
	public void testSecondEsdrasName(){
		assertEquals("2 Esdras", SECOND_ESDRAS.getName());
	}
	
	@Test
	public void testThirdMaccabeesName(){
		assertEquals("3 Maccabees", THIRD_MACCABEES.getName());
	}
	
	@Test
	public void testFourthMaccabeesName(){
		assertEquals("4 Maccabees", FOURTH_MACCABEES.getName());
	}
	
	@Test
	public void testPsalm151Name(){
		assertEquals("Psalm 151", PSALM_151.getName());
	}
	
	@Test
	public void testOdesName(){
		assertEquals("Odes", ODES.getName());
	}
	
	@Test
	public void testPrayerofManassehName(){
		assertEquals("Prayer of Manasseh", PRAYER_OF_MANASSEH.getName());
	}
	
	@Test
	public void testFourthBaruchName(){
		assertEquals("4 Baruch", FOURTH_BARUCH.getName());
	}
	
	@Test
	public void testJubileesName(){
		assertEquals("Jubilees", JUBILEES.getName());
	}
	
	@Test
	public void testEnochName(){
		assertEquals("Enoch", ENOCH.getName());
	}
	
	@Test
	public void testFirstMeqabyanName(){
		assertEquals("1 Meqabyan", FIRST_MEQABYAN.getName());
	}
	
	@Test
	public void testSecondMeqabyanName(){
		assertEquals("2 Meqabyan", SECOND_MEQABYAN.getName());
	}
	
	@Test
	public void testThirdMeqabyanName(){
		assertEquals("3 Meqabyan", THIRD_MEQABYAN.getName());
	}
}
