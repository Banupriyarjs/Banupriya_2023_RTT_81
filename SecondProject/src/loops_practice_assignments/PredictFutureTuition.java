package loops_practice_assignments;

import java.util.Scanner;

public class PredictFutureTuition {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your tuition : ");

		double tuition = input.nextInt();

		double doubledTuition = tuition * 2;

		for (int i = 1; i <= 20; i++) {
			tuition = 1.07 * tuition;

			//System.out.println(i + " year: " + tuition);
			if (tuition >= doubledTuition) {
				System.out.printf("Tuiton will be doubled in %d years", i);
				break;
			}

		}

	    tuition = 10000; // Year 0
		int year = 0;
		while (tuition < 20000) {// loop
			tuition = tuition * 1.07;// next year's tuition
			year++;
		}

		
		System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);

	}

}
