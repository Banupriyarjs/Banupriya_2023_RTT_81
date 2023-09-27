package arrays;

public class MultiplyingIndexvalue_Task6 {

	/*
	 * Task 6: Write a program where you create an integer array of 5 numbers. Loop
	 * through the array and assign the value of the loop control variable
	 * multiplied by 2 to the corresponding index in the array
	 */
	public static void main(String[] args) {
		int[] numbers = { 10, 5, 15, 20, 40 };

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Value at index multiplied by 2 " + i + ": " + numbers[i] * 2);
		}

	}
}
