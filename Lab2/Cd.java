package com.cg.iter.test2;

public class Cd extends MediaItem {
	private String artist;
	private String genre;

	public Cd(int id, int copies, String title, int runtime, String genre, String artist) {
		super(id, copies, title, runtime, genre, artist);
		this.artist = artist;
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
