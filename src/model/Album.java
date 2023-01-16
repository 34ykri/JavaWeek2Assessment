package model;

public class Album {
	private String albumName;
	private String artist;
	private int numberOfSongs;
	private String genre;
	
	public Album() {
		this.albumName = "n/a";
		this.artist = "n/a";
		this.genre = "n/a";
		this.numberOfSongs = 0;
	}
	public Album(String albumName, String artist) {
		this.albumName = albumName;
		this.artist = artist;
		this.genre = "not specified";
		this.numberOfSongs = 0;
	}
	
	public Album(String albumName, String artist, String genre, int numberOfSongs) {
		super();
		this.albumName = albumName;
		this.artist = artist;
		this.genre = genre;
		this.numberOfSongs = numberOfSongs;
	}

	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getNumberOfSongs() {
		return numberOfSongs;
	}
	public void setNumberOfSongs(int numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String printFullAlbum() {
		return albumName + " by " + artist + " Genre: " + genre 
				+ " Songs: " + numberOfSongs;
	}
	public String printAlbum() {
		return albumName + " by " + artist;
	}
}
