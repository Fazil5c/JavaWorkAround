package com.arithimetic_opration;

public class Menu {
	private int number1, number2;

	public Menu(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public int add2Numbers() {
		return number1 + number2;
	}

	public int subtract2Numbers() {
		return number1 - number2;
	}

	public int divide2Numbers() {
		return number1 / number2;
	}

	public int multiply2Numbers() {
		return number1 * number2;
	}

}
