package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Album;

public class TestAlbum1 {
	String album = "BORN PINK";
	String artist = "BLACKPINK";
	String genre = "K-Pop";
	int songs = 8;
	Album bp = new Album(album, artist, genre, songs);
	String printedAlbum = album + " by " + artist + " Genre: " + genre 
			+ " Songs: " + songs;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testArtistName() {
		assertEquals(artist, bp.getArtist());
	}
	@Test
	public void testAlbumName() {
		assertEquals(album, bp.getAlbumName());
	}
	@Test
	public void testGenre() {
		assertEquals(genre, bp.getGenre());
	}
	@Test
	public void testNumSongs() {
		assertEquals(songs, bp.getNumberOfSongs());
	}
	@Test
	public void testPrintFullAlbum() {
		assertEquals(printedAlbum, bp.printFullAlbum());
	}
	
}
