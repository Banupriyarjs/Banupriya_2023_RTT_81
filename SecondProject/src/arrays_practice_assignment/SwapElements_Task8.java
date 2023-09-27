package arrays_practice_assignment;

public class SwapElements_Task8 {

	public static void main(String[] args) {
		/*
		 * Task 8: Write a program that creates a String array of 5 elements and swaps
		 * the first element with the middle element without creating a new array
		 */
		
		
		int[] numbers= {1,2,3,4,5};
		int middleIndex=numbers.length/2;
		int temp=0;
		System.out.println(middleIndex);
		for(int i=0;i<numbers.length;i++)
		{
			temp=numbers[0];
			if(i==0)
			{
				temp=numbers[0];
				numbers[0]=numbers[middleIndex];
				numbers[middleIndex]=temp;
			}
			
			System.out.println("Value at Index "+i+ ":"+numbers[i]);
		}
	}

}
