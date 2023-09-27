package arrays_practice_assignment;

public class PrintArray_Task1 {

	/*Task 1: Write a program that creates an array of integers with a length of 3. Assign
	the values 1, 2, and 3 to the indexes. Print out each array element.*/

	public static void main(String[] args)
	{
		int[] array=new int[3];
		
		array[0]=100;
		array[1]=200;
		array[2]=300;
		
		for(int n:array)
			System.out.println(n);
		
	}
}
