package com.cg.iter.test2;

public class JournalPaper extends WrittenItem {
	private int year;

	public JournalPaper(int id, int copies, String title, String author, int year) {
		super(id, copies, title, author, year);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
