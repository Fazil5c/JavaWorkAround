package com.loop;

public class MyNumber {
	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	int sumUptoN() {
		int temp = 0;
		for (int i = 1; i <= number; i++) {
			temp = temp + i;
		}
		return temp;
	}

	public boolean isPrimeNumber() {
		boolean result = true;
		for (int i = 2; i <= number; i++) {
			if (number != i)
				if (number % i == 0)
					result = false;
		}
		return result;
	}

	public int sumOfDivisors() {
		int temp = 0;
		for (int i = 2; i <= number; i++) {
			if (number != i)
				if (number % i == 0)
					temp = temp + i;
		}
		return temp;
	}

	public void printANumberTriangle() {
		for(int i=1;i<=number;i++)
		{
		  for(int j=1;j<=i;j++) {
			  System.out.print(j);
		  }
		  System.out.println();
		}
	}
}
