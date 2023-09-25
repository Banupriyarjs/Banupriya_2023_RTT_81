package loops;

public class NestedForLoop {
	
	public static void main(String[] args)
	{
		int week=3;
		int day=7;
		
		//Example 1
		//Prints Week and no of days in a week
		for(int i=1;i<=week;i++)
		{
			System.out.println("Week "+ i);
			for(int j=1;j<=day;j++)
			{
				System.out.println("Day "+j);
			}
		}
		
		
		//Example 2 
		//prints pyramid
		for(int outer=1;outer<=10;outer++)
		{
			for(int inner=1;inner<=outer;inner++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}

}
