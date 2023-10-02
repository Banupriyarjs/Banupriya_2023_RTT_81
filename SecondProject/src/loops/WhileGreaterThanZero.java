package loops;

public class WhileGreaterThanZero {
	
	public static void main(String[] args)
	{
		int i=1;
		
		
		while(i<=100)
		{
			if(i>=10)
			{
				System.out.println(i+" Greater than 10.So substracting 1 from i: "+(i-1));
			}
			else
			{
				System.out.println(i+" is less than 10 "+i);
			}
			i++;
		}
	}

}
