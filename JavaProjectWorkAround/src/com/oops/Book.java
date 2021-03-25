package com.oops;

public class Book {
	private int noOfCopies;

	Book(int noOfCopies) {
      this.noOfCopies=noOfCopies;
	}

	void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0)
			this.noOfCopies = noOfCopies;
	}

	int getNoOfCopies() {
		return noOfCopies;
	}

	void increaseNoOfCopies(int valueToIncrease) {
		setNoOfCopies(this.noOfCopies + valueToIncrease);
	}

	void decreaseNoOfCopies(int valueToDecrease) {
		setNoOfCopies(this.noOfCopies - valueToDecrease);
	}

}
