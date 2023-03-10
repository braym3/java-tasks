package com.qa.calculator;

public class Calculator {

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public static double divide(double num1, double num2) {
		if (num1 > num2) {
			return num1 / num2;
		} else {
			System.out.printf("The division cannot be performed. " + num1 + " is smaller than " + num2);
			return 0;
		}
	}

	public static void main(String[] args) {
		// Add 5 and 3
		System.out.println(add(5, 3));

		// Multiply 5 and 3
		System.out.println(multiply(5, 3));

		// Subtract 23 and 15
		System.out.println(subtract(23, 15));

		// Divide 284 and 33
		System.out.println(divide(284, 33));
		
		// Divide 11 by 62
		double result = divide(11, 62);
		if (result != 0) {
			System.out.println(divide(11, 62));
		}
	}

}
