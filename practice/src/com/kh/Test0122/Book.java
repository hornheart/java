package com.kh.Test0122;

public class Book {
	//필드
	private String title; //제목
	private String genre; //장르
	private String author; //저자
	private int number; //책번호
	// alt + shift + s => o
	public Book(String title, String genre, String author, int number) {
		super();
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.number = number;
	}
	public Book(String title, String genre) {
		super();
		this.title = title;
		this.genre = genre;
	}
	// alt + shift + s => r
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	// alt + shift + s => s
	@Override
	public String toString() {
		return "Book [title=" + title + ", genre=" + genre + ", author=" + author + ", number=" + number + "]";
	}


}
