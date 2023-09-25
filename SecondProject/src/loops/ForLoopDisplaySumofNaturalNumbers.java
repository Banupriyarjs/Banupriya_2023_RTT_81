package loops;

public class ForLoopDisplaySumofNaturalNumbers {
	
	public static void main(String[] args)
	{
		int sum=0;
		int n=1000;
		
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of Natural Numbers: "+sum);
	}

}
