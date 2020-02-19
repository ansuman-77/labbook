package com.cg.iter.test2;

public abstract class Item {
	private int id;
	private int copies;
	private String title;

	public Item(int id, int copies, String title) {
		super();
		this.id = id;
		this.copies = copies;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", copies=" + copies + ", title=" + title + "]";
	}

	//print checkIN, checkOut, AddItem
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}