package arrays;

import java.util.Arrays;

public class AdvanceArrays {

	public static void main(String[] args) {

		String[] strings = { "one", "two", "three", "four" };
		// string is immutable so toUpperCase does not modify the string itself
		String str = "abc";
		str.toUpperCase();

		// Array library will modify the array
		Arrays.sort(strings);

		System.out.println(Arrays.toString(strings));

		// find the minimum and maximum values of the array

		int[] numbers = { 10, 34, 12, 7, 589, 100 };

		int minimum = numbers[0];
		int max = numbers[0];
		for (int num : numbers) {
			if (num < minimum)
				minimum = num;
			if (num > max)
				max = num;
		}

		System.out.printf("Minimum Value : %d\tMaxium Value : %d", minimum, max);

	}

}
