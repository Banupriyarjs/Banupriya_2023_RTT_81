package javaprograms;

public class ConditionalOperators {
	public static void main(String[] args) {
		boolean conditionOne = false;
		boolean conditionTwo = false;
		
		if (conditionOne == conditionTwo)
			System.out.println("Both variables are Same");

		if (conditionOne && conditionTwo)
			System.out.println("Both variables are True");

		if (conditionOne || conditionTwo)
			System.out.println("Either or both of the variable is True");

		if (!conditionOne && !conditionOne)
			System.out.println("Neither is true");

		int x = 10;
		if ((x > 3) && (x < 20))
			System.out.println("x is between 3 and 20");

		int y = 4;
		if ((y % 2) == 0)
			System.out.println("This is an even number ");
		else
			System.out.println("This is an odd number ");

	}

}
