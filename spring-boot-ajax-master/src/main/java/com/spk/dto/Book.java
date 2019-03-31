package com.spk.dto;

public class Book {
	private String isbn;
	private String bookName;
	private String author;
	private Double price;
	private String publication;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String isbn, String bookName, String author, Double price, String publication) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.publication = publication;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ ", publication=" + publication + "]";
	}

}
