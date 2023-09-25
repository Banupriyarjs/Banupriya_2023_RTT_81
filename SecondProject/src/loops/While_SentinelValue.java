package loops;

import java.util.Scanner;

public class While_SentinelValue {

	/*
	 * Controlling a Loop with a Sentinel Value ● Write a program that reads and
	 * calculates the sum of an unspecified number of integers. The input 0
	 * signifies the end of the input. ● If data is not 0, it is added to the sum,
	 * and the next input data are read. If data is 0, the loop body is not
	 * executed, and the while loop terminates. ● If the first input read is 0, the
	 * loop body never executes, and the resulting sum is 0.
	 * 
	 * Suggested Output ● Enter an int value (the program exits if the input is 0):2
	 * ● Enter an int value (the program exits if the input is 0): 3 ● Enter an int
	 * value (the program exits if the input is 0): 4 ● Enter an int value (the
	 * program exits if the input is 0): 0 ● The sum is 9
	 */
	public static void main(String[] args)
	{

	// Create a Scanner
	Scanner input = new Scanner(System.in);
	// Read an initial data
	System.out.print("Enter an int value (the program exits if the input is 0): ");
	int data = input.nextInt();
	// Keep reading data until the input is 0
	int sum = 0;
	while(data!=0)
	{
		sum += data;
		// Read the next data
		System.out.print("Enter an int value (the program exits if the input is 0): ");
		data = input.nextInt();
	}System.out.println("The sum is "+sum);

	}
}
