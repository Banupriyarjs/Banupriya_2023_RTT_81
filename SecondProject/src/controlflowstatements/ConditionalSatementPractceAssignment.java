package controlflowstatements;

import java.util.Scanner;

/*Create a program that lets the users input their filing status and
		income. Display how much tax the user would have to pay
		according to status and income.
		*/
public class ConditionalSatementPractceAssignment {

	int tax = 0;

	public void calculateTax(String status, int income) {

		if (status.equals("single")) {
			calculateForSingle(income);
		} else if (status.equals("married filing jointly")) {
			calculateForMarriedFilingjointly(income);
		} else if (status.equals("married filing separately")) {
			calculateForMarriedFilingSeparately(income);
		} else if (status.equals("head of household")) {
			calculateForHeadofHousehold(income);
		}
		System.out.println("Tax to be paid(%) : " + tax + "%\t" + "Amount($) : $" + income * tax / 100);

	}

	private void calculateForMarriedFilingSeparately(int income) {
		if (income >= 0 && income <= 8350) {
			tax = 10;

		} else if (income >= 8351 && income <= 33950) {
			tax = 15;

		} else if (income >= 33951 && income <= 68525) {
			tax = 25;

		} else if (income >= 68526 && income <= 104425) {
			tax = 28;

		} else if (income >= 104426 && income <= 186475) {
			tax = 33;

		} else if (income >= 186476) {
			tax = 35;
		} 

	}

	private void calculateForHeadofHousehold(int income) {
		if (income >= 0 && income <= 11950) {
			tax = 10;

		} else if (income >= 11951 && income <= 45500) {
			tax = 15;

		} else if (income >= 45501 && income <= 117450) {
			tax = 25;

		} else if (income >= 117451 && income <= 190200) {
			tax = 28;

		} else if (income >= 190201 && income <= 372950) {
			tax = 33;

		} else if (income >= 372951) {
			tax = 35;
		}
	}

	private void calculateForMarriedFilingjointly(int income) {
		if (income >= 0 && income <= 16700) {
			tax = 10;

		} else if (income >= 16701 && income <= 67900) {
			tax = 15;

		} else if (income >= 67901 && income <= 137050) {
			tax = 25;

		} else if (income >= 137051 && income <= 208850) {
			tax = 28;

		} else if (income >= 208851 && income <= 372950) {
			tax = 33;

		} else if (income >= 372951) {
			tax = 35;
		}
	}

	private void calculateForSingle(int income) {

		if (income >= 0 && income <= 8350) {
			tax = 10;

		} else if (income >= 8351 && income <= 33950) {
			tax = 15;

		} else if (income >= 33951 && income <= 82250) {
			tax = 25;

		} else if (income >= 82251 && income <= 171550) {
			tax = 28;

		} else if (income >= 171551 && income <= 372950) {
			tax = 33;

		} else if (income >= 372950) {
			tax = 35;
		} 
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ConditionalSatementPractceAssignment tax = new ConditionalSatementPractceAssignment();
		System.out.println("Enter Your Status: ");
		String status = input.nextLine().trim().toLowerCase();
		if (status.equals("single") || status.equals("married filing jointly")
				|| status.equals("married filing separately") || status.equals("head of household")) {

			System.out.println("Enter Your Income : ");
			int income = input.nextInt();
			if (income >= 0)
				tax.calculateTax(status, income);
			else
				System.out.println("Negative Income Provided.Enter the Right Income");

		} else {
			System.out.println("\nWrong Status.Enter the Correct Status");
		}

		input.close();

	}

}
