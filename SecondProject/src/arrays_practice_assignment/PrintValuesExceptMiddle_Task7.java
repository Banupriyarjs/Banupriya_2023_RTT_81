package arrays_practice_assignment;

public class PrintValuesExceptMiddle_Task7 {

	public static void main(String[] args) {
		/*
		 * ● Task 7: Write a program where you create an array of 5 elements. Loop
		 * through the array and print the value of each element, except for the middle
		 * (index 2) element.
		 */
		
		int[] numbers= {1,2,3,4,5};
		
		int middleindex=numbers.length/2;
		
		//System.out.println(middleindex);
		
		for(int i=0;i<numbers.length;i++)
		{
			if(i==middleindex)
				continue;
			System.out.println("Value at Index "+i +": "+numbers[i]);
		}

	}

}
