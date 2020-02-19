package com.cg.iter.test2;
public class MediaItem extends Item{

	private int runtime;
	
	public MediaItem(int id, int copies, String title,int runtime,String director, String genre, int year) {
		super(id, copies, title);
		this.runtime= runtime;
		Video v = new Video(id, copies, title, runtime, director, genre, year);
	}
	public MediaItem(int id, int copies, String title, int runtime, String genre, String artist) {
		super(id, copies, title);
		this.runtime= runtime;
		Cd c = new Cd(id, copies, title, runtime, genre, artist);
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	

}
