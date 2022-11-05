package com.github.tadukoo.bible.api.constant.bibletests;

import com.github.tadukoo.bible.api.constant.BibleBooks;
import com.github.tadukoo.util.ListUtil;
import org.junit.jupiter.api.Test;

import static com.github.tadukoo.bible.api.constant.BibleBooks.SONG_OF_SONGS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongofSongsBibleTestBooks{
	
	@Test
	public void testSongofSongsName(){
		assertEquals("Song of Songs", SONG_OF_SONGS.getName());
	}
	
	@Test
	public void testSongofSongsAuthor(){
		assertEquals("Solomon", SONG_OF_SONGS.getAuthor());
	}
	
	@Test
	public void testSongofSongsAliases(){
		assertEquals(ListUtil.createList("Song of Solomon", "Song", "So"), SONG_OF_SONGS.getAliases());
	}
	
	@Test
	public void testSongofSongsChapters(){
		assertEquals(ListUtil.createList(17, 17, 11, 16, 16, 13, 13, 14), SONG_OF_SONGS.getChapters());
	}
	
	@Test
	public void testSongofSongsNumChapters(){
		assertEquals(8, SONG_OF_SONGS.getNumChapters());
	}
	
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
	
	@Test
	public void testFromName(){
		assertEquals(SONG_OF_SONGS, BibleBooks.fromName("Song of Songs"));
	}
	
	@Test
	public void testFromStringName(){
		assertEquals(SONG_OF_SONGS, BibleBooks.fromString("Song of Songs"));
	}
	
	@Test
	public void testFromAliasSongofSolomon(){
		assertEquals(SONG_OF_SONGS, BibleBooks.fromString("Song of Solomon"));
	}
	
	@Test
	public void testFromAliasSong(){
		assertEquals(SONG_OF_SONGS, BibleBooks.fromString("Song"));
	}
	
	@Test
	public void testFromAliasSo(){
		assertEquals(SONG_OF_SONGS, BibleBooks.fromString("So"));
	}
	
	@Test
	public void testFromInt(){
		assertEquals(SONG_OF_SONGS, BibleBooks.fromInt(22));
	}
}
