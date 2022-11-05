package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.JOB;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JobBibleBooksTest{
	
	@Test
	public void testJobName(){
		assertEquals("Job", JOB.getName());
	}
	
	@Test
	public void testJobAuthor(){
		assertEquals("Unknown", JOB.getAuthor());
	}
	
	@Test
	public void testJobAliases(){
		assertEquals(ListUtil.createList(), JOB.getAliases());
	}
	
	@Test
	public void testJobChapters(){
		assertEquals(ListUtil.createList(22, 13, 26, 21, 27, 30, 21, 22, 35, 22, 20, 25, 28, 22, 35, 22, 16, 21, 29, 29, 34, 30, 17, 25, 6, 14, 23, 28, 25, 31, 40, 22, 33, 37, 16, 33, 24, 41, 30, 24, 34, 17), JOB.getChapters());
	}
	
	@Test
	public void testJobNumChapters(){
		assertEquals(42, JOB.getNumChapters());
	}
	
	@Test
	public void testJobChp1NumVerses(){
		assertEquals(22, JOB.getNumVersesInChp(1));
	}
	
	@Test
	public void testJobChp2NumVerses(){
		assertEquals(13, JOB.getNumVersesInChp(2));
	}
	
	@Test
	public void testJobChp3NumVerses(){
		assertEquals(26, JOB.getNumVersesInChp(3));
	}
	
	@Test
	public void testJobChp4NumVerses(){
		assertEquals(21, JOB.getNumVersesInChp(4));
	}
	
	@Test
	public void testJobChp5NumVerses(){
		assertEquals(27, JOB.getNumVersesInChp(5));
	}
	
	@Test
	public void testJobChp6NumVerses(){
		assertEquals(30, JOB.getNumVersesInChp(6));
	}
	
	@Test
	public void testJobChp7NumVerses(){
		assertEquals(21, JOB.getNumVersesInChp(7));
	}
	
	@Test
	public void testJobChp8NumVerses(){
		assertEquals(22, JOB.getNumVersesInChp(8));
	}
	
	@Test
	public void testJobChp9NumVerses(){
		assertEquals(35, JOB.getNumVersesInChp(9));
	}
	
	@Test
	public void testJobChp10NumVerses(){
		assertEquals(22, JOB.getNumVersesInChp(10));
	}
	
	@Test
	public void testJobChp11NumVerses(){
		assertEquals(20, JOB.getNumVersesInChp(11));
	}
	
	@Test
	public void testJobChp12NumVerses(){
		assertEquals(25, JOB.getNumVersesInChp(12));
	}
	
	@Test
	public void testJobChp13NumVerses(){
		assertEquals(28, JOB.getNumVersesInChp(13));
	}
	
	@Test
	public void testJobChp14NumVerses(){
		assertEquals(22, JOB.getNumVersesInChp(14));
	}
	
	@Test
	public void testJobChp15NumVerses(){
		assertEquals(35, JOB.getNumVersesInChp(15));
	}
	
	@Test
	public void testJobChp16NumVerses(){
		assertEquals(22, JOB.getNumVersesInChp(16));
	}
	
	@Test
	public void testJobChp17NumVerses(){
		assertEquals(16, JOB.getNumVersesInChp(17));
	}
	
	@Test
	public void testJobChp18NumVerses(){
		assertEquals(21, JOB.getNumVersesInChp(18));
	}
	
	@Test
	public void testJobChp19NumVerses(){
		assertEquals(29, JOB.getNumVersesInChp(19));
	}
	
	@Test
	public void testJobChp20NumVerses(){
		assertEquals(29, JOB.getNumVersesInChp(20));
	}
	
	@Test
	public void testJobChp21NumVerses(){
		assertEquals(34, JOB.getNumVersesInChp(21));
	}
	
	@Test
	public void testJobChp22NumVerses(){
		assertEquals(30, JOB.getNumVersesInChp(22));
	}
	
	@Test
	public void testJobChp23NumVerses(){
		assertEquals(17, JOB.getNumVersesInChp(23));
	}
	
	@Test
	public void testJobChp24NumVerses(){
		assertEquals(25, JOB.getNumVersesInChp(24));
	}
	
	@Test
	public void testJobChp25NumVerses(){
		assertEquals(6, JOB.getNumVersesInChp(25));
	}
	
	@Test
	public void testJobChp26NumVerses(){
		assertEquals(14, JOB.getNumVersesInChp(26));
	}
	
	@Test
	public void testJobChp27NumVerses(){
		assertEquals(23, JOB.getNumVersesInChp(27));
	}
	
	@Test
	public void testJobChp28NumVerses(){
		assertEquals(28, JOB.getNumVersesInChp(28));
	}
	
	@Test
	public void testJobChp29NumVerses(){
		assertEquals(25, JOB.getNumVersesInChp(29));
	}
	
	@Test
	public void testJobChp30NumVerses(){
		assertEquals(31, JOB.getNumVersesInChp(30));
	}
	
	@Test
	public void testJobChp31NumVerses(){
		assertEquals(40, JOB.getNumVersesInChp(31));
	}
	
	@Test
	public void testJobChp32NumVerses(){
		assertEquals(22, JOB.getNumVersesInChp(32));
	}
	
	@Test
	public void testJobChp33NumVerses(){
		assertEquals(33, JOB.getNumVersesInChp(33));
	}
	
	@Test
	public void testJobChp34NumVerses(){
		assertEquals(37, JOB.getNumVersesInChp(34));
	}
	
	@Test
	public void testJobChp35NumVerses(){
		assertEquals(16, JOB.getNumVersesInChp(35));
	}
	
	@Test
	public void testJobChp36NumVerses(){
		assertEquals(33, JOB.getNumVersesInChp(36));
	}
	
	@Test
	public void testJobChp37NumVerses(){
		assertEquals(24, JOB.getNumVersesInChp(37));
	}
	
	@Test
	public void testJobChp38NumVerses(){
		assertEquals(41, JOB.getNumVersesInChp(38));
	}
	
	@Test
	public void testJobChp39NumVerses(){
		assertEquals(30, JOB.getNumVersesInChp(39));
	}
	
	@Test
	public void testJobChp40NumVerses(){
		assertEquals(24, JOB.getNumVersesInChp(40));
	}
	
	@Test
	public void testJobChp41NumVerses(){
		assertEquals(34, JOB.getNumVersesInChp(41));
	}
	
	@Test
	public void testJobChp42NumVerses(){
		assertEquals(17, JOB.getNumVersesInChp(42));
	}
	
	@Test
	public void testFromName(){
		assertEquals(JOB, BibleBooks.fromName("Job"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(JOB, BibleBooks.fromString("Job"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(JOB, BibleBooks.fromInt(18));
	}
}
