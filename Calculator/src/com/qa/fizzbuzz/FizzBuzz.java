package com.qa.fizzbuzz;

public class FizzBuzz {

	public static void returnFizzBuzz(int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
		} else if (num % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		returnFizzBuzz(4);
		returnFizzBuzz(9);
		returnFizzBuzz(20);
		returnFizzBuzz(15);
	}

}
