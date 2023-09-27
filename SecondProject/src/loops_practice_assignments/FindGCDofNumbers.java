package loops_practice_assignments;

import java.util.Scanner;

public class FindGCDofNumbers {

	public static void main(String[] args) {
		/*
		 * Declare two variables, say x and y. Run a loop for x and y from 1 to max of x
		 * and y. Check that the number divides both (x and y) numbers completely or
		 * not. If divides completely store it in a variable. Divide the stored number.
		 */
		int gcd = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int number1 = input.nextInt();
		
		System.out.println("Enter a positive number:");
		System.exit(1);
		
		
		

		System.out.println("Enter the second number : ");
		int number2 = input.nextInt();
          
		for (int i = 1; i <= number1 && i <= number2; i++) {
			
			//System.out.println(i);
			if (number1 % i == 0 && number2 % i == 0)
				gcd = i;
		}
		System.out.printf("GCD of %d and %d is %d", number1, number2, gcd);
		input.close();

	}

}
