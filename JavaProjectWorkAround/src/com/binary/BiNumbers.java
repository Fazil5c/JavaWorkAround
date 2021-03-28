package com.binary;

public class BiNumbers {
	private int firstNumber;
	private int secoundNumber;

	BiNumbers(int firstNumber, int secoundNumber) {
		this.firstNumber = firstNumber;
		this.secoundNumber = secoundNumber;
			}
	BiNumbers(int firstNumber)
	{
		
	}
	int add() {
		int sum = this.firstNumber + this.secoundNumber;
		return sum;
	}

	int multiply() {
		int mulptiply = this.firstNumber * this.secoundNumber;
		return mulptiply;
	}

	void doubleTheValue() {
		this.firstNumber = this.firstNumber * 2;
		this.secoundNumber = this.secoundNumber * 2;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecoundNumber() {
		return secoundNumber;
	}

	public void setSecoundNumber(int secoundNumber) {
		this.secoundNumber = secoundNumber;
	}

}