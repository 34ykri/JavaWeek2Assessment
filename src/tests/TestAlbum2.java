package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Album;

public class TestAlbum2 {
	String artist = "Destroy Lonely";
	String album = "NO STYLIST";
	Album ns = new Album(album,artist);

	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void testNotEmpty() {
		assertNotNull(ns);
	}
	@Test
	public void testAlbumNameTrue() {
		assertTrue(ns.getAlbumName() == album);
	}
	@Test
	public void testPrintAlbum() {
		String albumText = "NO STYLIST by Destroy Lonely";
		assertEquals(albumText, ns.printAlbum());
	}

}
