package com.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming =new Book(100);
		Book effectiveJava=new Book(150);
		Book cleanCode =new Book(200);
			
		//artOfComputerProgramming.noOfCopies=10;
		//effectiveJava.noOfCopies=20;
		//cleanCode.noOfCopies=30;
		
				
		artOfComputerProgramming.setNoOfCopies(50);
		effectiveJava.setNoOfCopies(60);
		
		artOfComputerProgramming.increaseNoOfCopies(30);
		effectiveJava.increaseNoOfCopies(10);
		
		artOfComputerProgramming.decreaseNoOfCopies(10);
		effectiveJava.decreaseNoOfCopies(10);
		
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		

	}
}
