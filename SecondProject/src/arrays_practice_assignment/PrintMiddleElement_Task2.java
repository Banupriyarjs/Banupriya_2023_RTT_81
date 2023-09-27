package arrays_practice_assignment;

public class PrintMiddleElement_Task2 {

	public static void main(String[] args) {

		/*
		 * Task 2: Write a program that returns the middle element in an array. Give the
		 * following values to the integer array: {13, 5, 7, 68, 2} and produce the
		 * following output: 7
		 */
		
		int[] number= {13,5,7,68,2};
	//	System.out.println(number.length/2);
		
		if(number.length%2==0)
		{
			System.out.println(number[number.length/2]);
			System.out.println("Middle Number(s) : Number 1:"+number[(number.length/2)-1]+"\tNumber 2: "+number[number.length/2]);
		}
		else
		{
			 System.out.println("Middle Number is : "+number[number.length/2]);
		}
		
		
		
	}

}
