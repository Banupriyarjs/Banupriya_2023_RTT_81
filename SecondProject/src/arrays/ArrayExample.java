package arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int arraySize=20;
		
		double[] doubleArray=new double[arraySize];
		String[] stringArray= new String[arraySize];
		
		stringArray[0]="One";
		stringArray[1]="Two";
		stringArray[2]="Three";
		stringArray[3]="Four";
		stringArray[4]="Five";
		stringArray[5]="Six";
		stringArray[6]="Seven";
		stringArray[7]="Eight";
		stringArray[8]="Nine";
		stringArray[9]="Ten";
		
		
		System.out.println("The value of position 0 is:"+stringArray[0]);
		
		for(int pos=0;pos<stringArray.length;pos++)
		{
			System.out.println("The value of Position "+pos+ ": "+stringArray[pos]);
		}
		
		
		
		System.out.println("******************");
		for(String pos:stringArray)
			System.out.println(pos);

		//Write the for loop to count no of nulls
		
		int count=0;
		for(int i=0;i<stringArray.length;i++)
		{
			if(stringArray[i]==null)
				count++;
		}
		
		
		//Enhanced for loop
		 count=0;
		for(String s: stringArray)
		{
			if(s==null)
				count++;
		}
		
		System.out.println("No. of nulls: "+count);
		
		//write a for loop that tells the location of the first null in the arrray
		//this is going to use the non enhanced for loop;
		
		int firstnull=-1;  //not found indicator -1
		
		for(int i=0;i<stringArray.length;i++)
		{
			if(stringArray[i]==null)
			{
				firstnull=i;
			    break;
			}
			
		}
		
		System.out.println("Index of first null : "+firstnull);
	}

}
