package com.github.tadukoo.bible.api.constant.verses;

import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.EnumBible.SONG_OF_SONGS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongofSongsVerseTest{
	
	@Test
	public void testSongofSongsChp1NumVerses(){
		assertEquals(17, SONG_OF_SONGS.getNumVersesInChp(1));
	}
	
	@Test
	public void testSongofSongsChp2NumVerses(){
		assertEquals(17, SONG_OF_SONGS.getNumVersesInChp(2));
	}
	
	@Test
	public void testSongofSongsChp3NumVerses(){
		assertEquals(11, SONG_OF_SONGS.getNumVersesInChp(3));
	}
	
	@Test
	public void testSongofSongsChp4NumVerses(){
		assertEquals(16, SONG_OF_SONGS.getNumVersesInChp(4));
	}
	
	@Test
	public void testSongofSongsChp5NumVerses(){
		assertEquals(16, SONG_OF_SONGS.getNumVersesInChp(5));
	}
	
	@Test
	public void testSongofSongsChp6NumVerses(){
		assertEquals(13, SONG_OF_SONGS.getNumVersesInChp(6));
	}
	
	@Test
	public void testSongofSongsChp7NumVerses(){
		assertEquals(13, SONG_OF_SONGS.getNumVersesInChp(7));
	}
	
	@Test
	public void testSongofSongsChp8NumVerses(){
		assertEquals(14, SONG_OF_SONGS.getNumVersesInChp(8));
	}
}
