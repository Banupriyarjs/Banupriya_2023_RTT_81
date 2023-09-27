package arrays_practice_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class FavoriteThings_Task11 {

	public static void main(String[] args) {
		/*
		 * Task 11: Write some Java code that asks the user how many favorite things
		 * they have. Based on their answer, you should create a String array of the
		 * correct size. Then ask the user to enter the things and store them in the
		 * array you created. Finally, print out the contents of the array.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter how many favorite things you have : ");
		int things = input.nextInt();

		String[] favorites = new String[things];
		input.nextLine();

		for (int i = 0; i < things; i++) {
			System.out.println("Enter your thing : ");
			favorites[i] = input.nextLine();
		}
		// System.out.println(Arrays.toString(favorites));

		for (String t : favorites) {
			System.out.println(t);
		}
	}
}
