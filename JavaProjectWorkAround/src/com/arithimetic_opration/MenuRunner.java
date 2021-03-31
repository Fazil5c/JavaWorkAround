package com.arithimetic_opration;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1 :");
		int number1 = scanner.nextInt();
		System.out.print("Enter Number2 :");
		int number2 = scanner.nextInt();
		Menu menu = new Menu(number1, number2);

		int key;
		do {
			System.out.println("1 - Add");
			System.out.println("2 - Subtract");
			System.out.println("3 - Divide");
			System.out.println("4 - Multiply");
			System.out.println("5 - Exit");
			key = scanner.nextInt();
			switch (key) {
			case 1:
				System.out.println(menu.add2Numbers());
				break;
			case 2:
				System.out.println(menu.subtract2Numbers());
				break;
			case 3:
				System.out.println(menu.divide2Numbers());
				break;
			case 4:
				System.out.println(menu.multiply2Numbers());
				break;

			default:
				System.out.println("Invaild option selected");
				break;
			}
		} while (key!=5);
	}
}
