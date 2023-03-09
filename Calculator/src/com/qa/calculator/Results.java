package com.qa.calculator;

public class Results {

	public int physics, chemistry, biology, total, percentage;

	public Results(int physics, int chemistry, int biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.total = physics + chemistry + biology;
		this.percentage = (this.total * 100) / 450;
	}

	public void displayResults() {
		System.out.println("Physics =	" + this.physics);
		System.out.println("Chemistry =	" + this.chemistry);
		System.out.println("Biology =	" + this.biology);
		System.out.println("Total =		" + this.total);
	}

	public void displayPercentage() {
		System.out.println("\nOverall percentage =	" + this.percentage + " %\n");
	}

	public static void main(String[] args) {
		Results myResults = new Results(131, 83, 117);
		myResults.displayResults();
		myResults.displayPercentage();

	}

}
