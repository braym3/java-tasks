package com.qa.flowchart;

public class Flowchart {

	public static int input(int num1, int num2, boolean b) {
		if (b) {
			return num1 + num2;
		} else {
			return num1 * num2;

		}
	}

	public static void flowchartInput(int a) {
		System.out.println("");
		if (a > 2000) {
			System.out.print("A");
			if (a > 6000) {
				System.out.print("C");
			} else {
				System.out.print("B");
				if (a > 4000) {
					System.out.print("D");
				} else {
					System.out.print("E");
				}
			}
		} else {
			System.out.print("1");
			if (a > 100) {
				System.out.print("3");
				if (a > 600) {
					System.out.print("5");
				} else {
					System.out.print("4");
					if (a > 500) {
						System.out.print("6");
					} else {
						System.out.print("7");
					}
				}
			} else {
				System.out.print("2");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(input(2, 4, true));
		System.out.println(input(2, 4, false));
		System.out.println("");
		flowchartInput(350);
		flowchartInput(4000);
		flowchartInput(632);
	}

}