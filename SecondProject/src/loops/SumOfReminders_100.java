package loops;

public class SumOfReminders_100 {
	
	public static void main(String[] args)
	{
		int sumOfReminders=0;
		
		
		for(int i=1;i<=100;i++)
		{
			sumOfReminders= sumOfReminders+(i%2);
			
			//System.out.println("i : "+i+"\ti%2 : "+i%2);
		}
		
		System.out.println("Sum of Reminders : "+sumOfReminders);
	}
	

}
