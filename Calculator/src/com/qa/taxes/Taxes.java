package com.qa.taxes;

public class Taxes {

	public static int calculateTaxPercentage(int salary) {
		if (salary >= 0 && salary < 15000) {
			return 0;
		} else if (salary >= 15000 && salary < 20000) {
			return 10;
		} else if (salary >= 20000 && salary < 30000) {
			return 15;
		} else if (salary >= 30000 && salary < 45000) {
			return 20;
		} else if (salary >= 45000) {
			return 25;
		} else {
			// If salary is below 0
			return -1;
		}
	}

	public static double calculateTax(int salary) {
		int percentage = calculateTaxPercentage(salary);
		double tax = (percentage / 100.0) * salary;
		System.out.println("The amount of tax for a salary of £" + salary + " is £" + tax);
		return tax;
	}

	public static void main(String[] args) {
		System.out.println(calculateTax(16799));
		System.out.println(calculateTax(25678));
		System.out.println(calculateTax(31233));
	}

}
