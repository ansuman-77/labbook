package com.cg.iter.test2;

public class WrittenItem extends Item {
	private String author;

	public WrittenItem(int id, int copies, String title,String author, int year) {
		super(id, copies, title);
		this.author = author;
		JournalPaper jp = new JournalPaper(copies, copies, author, author, year);
	}
	
	

	public WrittenItem(int id, int copies, String title, String author) {
		super(id, copies, title);
		this.author = author;
		Book B = new Book(id, copies,title, author);
	}



	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
