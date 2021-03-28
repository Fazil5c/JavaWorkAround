package interestcalculator;

import java.math.BigDecimal;

public class SimpleInterestCalculatoreRunner {

	public static void main(String[] args) {
		SimpleInterestCalculator calc = new SimpleInterestCalculator("4200000", "7");
		BigDecimal totalValue = calc.calculateTotalValue(5);
		System.out.println(totalValue);
	}
}
