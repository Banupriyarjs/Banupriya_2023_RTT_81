package arrays_practice_assignment;

public class ArrayLength_Task4 {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an integer array with 5 elements (i.e.,
		 * numbers). The numbers can be any integers. Print out the value at the first
		 * index and the last index using length - 1 as the index. Now try printing the
		 * value at index = length (e.g., myArray[myArray.length] ). Notice the type of
		 * exception which is produced. Now try to assign a value to the array index 5.
		 * You should get the same type of exception
		 */
		
		int[] number=new int[5];
		number[0]=10;
		number[1]=20;
		number[2]=30;
		number[3]=30;
		number[4]=40;
		
		int length=number.length;
		System.out.println("Value at the First Index: "+ number[0]);
		
		System.out.println("Value at the Last Index: "+ number[length-1]);
		
		//System.out.println(number[length]); //ArrayIndexOutOfBoundsException
		
		//System.out.println(number[5]); //ArrayIndexOutOfBoundsException

	}

}
