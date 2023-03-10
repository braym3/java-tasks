package com.qa.blackjack;

public class BlackJack {

	public static int findWinningNumber(int num1, int num2) {
		// Check both numbers are greater than 0
		if (num1 > 0 && num2 > 0) {
			// Find the closest number to 21 - no higher
			int num1Difference = 21 - num1;
			int num2Difference = 21 - num2;
			// If both numbers are under 21
			if (num1Difference >= 0 && num2Difference >= 0) {
				// If num1 is closer to 21 and doesn't go over - return num1
				if ((num1Difference < num2Difference) && (num1 <= 21)) {
					return num1;
					// If num2 is closer to 21 and doesn't go over - return num2
				} else if ((num2Difference < num1Difference) && (num2 <= 21)) {
					return num2;
					// If it's a tie, return num1 and print message
				} else {
					System.out.println("It's a tie!");
					return num1;
				}
				// If both are over 21 - return 0
			} else if ((num1 > 21) && (num2 > 21)) {
				System.out.println("Both numbers are over 21");
				return 0;
				// If only num1 is over 21 - return num2
			} else if (num1 > 21 && num2 <= 21) {
				return num2;
				// If only num2 is over 21 - return num1
			} else if (num2 > 21 && num1 <= 21) {
				return num1;
			}
		}

		// If either number is under 0 - return 0
		System.out.println("Error: Number is under 0");
		return 0;

	}

	public static void main(String[] args) {
		System.out.println(findWinningNumber(15, 20));
		System.out.println(findWinningNumber(8, 23));
		System.out.println(findWinningNumber(14, 14));
		System.out.println(findWinningNumber(-3, 20));
		System.out.println(findWinningNumber(24, 23));
	}

}
