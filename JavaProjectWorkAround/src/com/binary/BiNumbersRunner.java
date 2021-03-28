package com.binary;

import java.math.BigDecimal;

public class BiNumbersRunner {

	public static void main(String[] args) {
	BiNumbers numbers =new BiNumbers(2,3);
	System.out.println(numbers.add());
	System.out.println(numbers.multiply());
	numbers.doubleTheValue();
	System.out.println(numbers.getFirstNumber());
	System.out.println(numbers.getSecoundNumber());
	BigDecimal number1=new BigDecimal("2.333");
	BigDecimal number2=new BigDecimal("4.333");
	number1.add(number2);
	
	}
}


//