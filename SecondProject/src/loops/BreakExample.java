package loops;

public class BreakExample {

	public static void main(String[] args) {
		int sum=0;
		int number=0;
		while(number<20)
		{
			number++;
			sum+=number;
			if(number>=40)
			{
				break;
			}
			
		}
		System.out.println("Code will not execute after the break");
		System.out.println("Number: "+number);
		System.out.println("Sum: "+sum);
	}

}
