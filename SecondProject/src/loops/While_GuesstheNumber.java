package loops;

import java.util.Scanner;

public class While_GuesstheNumber {

	public static void main(String[] args) {
		// Generate a random number to be guessed
		int number = (int) (Math.random()* 101 );
		
		System.out.println("Guess a magic number between 0 and 100");
		System.out.println(number);
		
		Scanner input = new Scanner(System.in);

		int guess = -1;
		while (guess != number) {
			System.out.println("\nEnter your guess: ");
			guess = input.nextInt();
			if (guess == number)
				System.out.println("Yes, the number is " + number);
			else if (guess > number)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");

		}
		input.close();
	}

}
