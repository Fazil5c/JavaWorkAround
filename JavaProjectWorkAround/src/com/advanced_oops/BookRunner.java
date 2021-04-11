package com.advanced_oops;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "Oops with Java", "Ranga");
		book.addReview(new Review(34566, "Good", 5));
		book.addReview(new Review(54656, "Avg", 3));
		System.out.println(book);
		

	}

}
