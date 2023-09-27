package arrays;

import java.util.Arrays;

public class DeleteArrayElement {

	public static void main(String[] args) {
		
		int[] numbers= {0,1,2,3,4,5};
		
		System.out.println("Original :"+Arrays.toString(numbers));
		
		int postitionToDelete=2;
		
		for(int pos=postitionToDelete;pos<numbers.length-1;pos++)
		{
			numbers[pos]=numbers[pos+1];
		}
		System.out.println("After Move :"+Arrays.toString(numbers));
		
		//make a array  that is smaller than the original
		int[] target=new int[numbers.length-1];
		for(int pos=0;pos<target.length;pos++)
		{
			target[pos]=numbers[pos];
		}
		System.out.println("After Copy :"+Arrays.toString(target));
		
	}

}
