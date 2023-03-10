package com.qa.numbers;

import java.util.ArrayList;

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

	public static void convertToWord(int num) {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int n;
		// Add each digit to the digits arrayList
		while (num > 0) {
			// Get the last digit
			n = num % 10;
			// Add current digit to the digits arrayList
			digits.add(n);
			// Divide the number by 10 (to get the next digit in the next loop)
			num = num / 10;
		}
		String word = "";
		// Loop through digits array - backwards (the first digit is at the end of the
		// array)
		// Match corresponding work to the digit - add to word
		for (int i = digits.size() - 1; i >= 0; i--) {

		}
		System.out.println(digits);
	}

	public static void main(String[] args) {
		System.out.println(addDigits(192));
		System.out.println(addDigits(74));
		System.out.println(addDigits(3462));
		System.out.println(addDigits(11));

		convertToWord(135);
	}

}
