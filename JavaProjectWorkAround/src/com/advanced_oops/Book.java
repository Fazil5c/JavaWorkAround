package com.advanced_oops;

import java.util.ArrayList;

public class Book {
	
	private int bookId;
	private String name;
	private String author;
	private ArrayList reviews=new ArrayList<>();

	public Book(int bookId, String name, String author) {
		this.bookId=bookId;
		this.name=name;
		this.author=author;
	}
	
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	/*
	 * public String toString() { return(bookId +" "+name+" "+author+" "+reviews); }
	 */

	
}
