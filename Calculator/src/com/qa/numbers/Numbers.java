package com.qa.numbers;

public class Numbers {

	public static int addDigits(int num) {
		int sum = 0;
		int digit = 0;
		// Add each digit to the sum
		while (num > 0) {
			// Get the last digit
			digit = num % 10;
			// Add current digit to the sum
			sum += digit;
			// Divide the number by 10 (to get the next digit in the next loop)
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(addDigits(192));
		System.out.println(addDigits(74));
		System.out.println(addDigits(3462));
		System.out.println(addDigits(11));
	}

}
