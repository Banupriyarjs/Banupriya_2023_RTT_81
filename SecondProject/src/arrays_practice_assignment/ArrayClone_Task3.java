package arrays_practice_assignment;

import java.util.Arrays;

public class ArrayClone_Task3 {

	public static void main(String[] args) {
		/*
		 * ask 3: Write a program that creates an array of String type and initializes
		 * it with the strings “red,” “green,” “blue,” and “yellow.” 
		 * Print out the array length.
		 *  Make a copy using the clone( ) method.
		 *  Use the Arrays.toString( ) method on the new array to verify that the original array was copied
		 */
		
		
		String[] sourceColors= {"red","green","blue","yellow"};
		
		System.out.println("\nArray Length : "+sourceColors.length);
		
		String[] targetColors=sourceColors.clone();
		
		System.out.println("\nSource Array : "+Arrays.toString(sourceColors));
		System.out.println("\nSource Array : "+Arrays.toString(targetColors));
		
		

	}

}
