package arrays_practice_assignment;

public class LoopingThroughArray_Task5 {

	public static void main(String[] args) {
		/*
		 * Write a program where you create an integer array with a length of 5. Loop
		 * through the array and assign the value of the loop control variable (e.g., i)
		 * to the corresponding index in the array.
		 */
		
		
		int[] numbers= {203,390,582,234,900};
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println("Value at index "+i+": "+ numbers[i]);
		}
			
		
	}

}
