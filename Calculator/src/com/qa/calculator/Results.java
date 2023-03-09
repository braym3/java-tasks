package com.qa.calculator;

public class Results {

	public String[] subjects = { "Physics", "Chemistry", "Biology", "Overall" };
	public int[] marks = new int[4];
	public int[] percentages = new int[4];
	public boolean[] passGrades = new boolean[4];

	public Results(int physics, int chemistry, int biology) {
		this.marks[0] = physics;
		this.marks[1] = chemistry;
		this.marks[2] = biology;
		this.marks[3] = physics + chemistry + biology;

		// Find overall percentage and overall pass grade
		for (int i = 0; i < marks.length; i++) {
			int maxMarks = 150;
			// If finding out the overall percentage (last item in array) - max marks
			// accounts for all exams
			if (i == marks.length - 1) {
				// Total max marks = max marks for each exam * number of exams
				maxMarks = maxMarks * (marks.length - 1);
			}

			percentages[i] = (marks[i] * 100) / maxMarks;
			passGrades[i] = percentages[i] >= 60;
		}
	}

	public void displayResults() {
		for (int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i] + " =		" + this.marks[i]);
		}
	}

	public void displayPercentage() {

		System.out.println("\nOverall percentage = " + this.percentages[3] + " %");
		// Count failed modules
		int failed = 0;
		for (int i = 0; i < subjects.length; i++) {
			if (!passGrades[i]) {
				failed++;
				System.out.println(
						"Sorry, you have failed " + subjects[i] + " with a percentage of " + percentages[i] + " %");
			}
		}
		if (failed == 0) {
			System.out.println("Congratulations! You have passed.\n");
		}

	}

	public static void main(String[] args) {
		Results myResults = new Results(131, 83, 117);
		myResults.displayResults();
		myResults.displayPercentage();

	}

}
