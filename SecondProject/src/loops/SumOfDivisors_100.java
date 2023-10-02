package loops;

public class SumOfDivisors_100 {

	public static void main(String[] args) {
		int sumOfDivisors=0;
		for (int i = 1; i <= 100; i++) {
			sumOfDivisors = sumOfDivisors + (i / 2);

			System.out.println("i : "+i+"\ti/2 : "+i/2);
		}

		System.out.println("Sum of Reminders : " + sumOfDivisors);
	}

}
