package arrays_practice_assignment;

import java.util.Arrays;

public class ArrayInAcendingOrder_Task9 {

	public static void main(String[] args) {
		/*
		 * Task 9: Write a program to sort the following int array in ascending order:
		 * {4, 2, 9, 13, 1, 0}. Print the array in ascending order, and print the
		 * smallest and the largest element of the array. The output will look like the
		 * following: Array in ascending order: 0, 1, 2, 4, 9, 13 The smallest number is
		 * 0 The biggest number is 13
		 */
		
		int[] numbers= {4,2,9,13,1,7};
		
		//Sorting Array
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
		
		//Finding minimum and Maximum values 
		int minimum = numbers[0];
		int max = numbers[0];
		for (int num : numbers) {
			if (num < minimum)
				minimum = num;
			if (num > max)
				max = num;
		}

		System.out.printf("Minimum Value : %d\tMaximum Value : %d", minimum, max);

		
		
		
	}
}
