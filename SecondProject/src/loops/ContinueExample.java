package loops;

public class ContinueExample {
	public static void main(String[] args) {
		int sum = 0;
		int number = 0;
		while (number < 20) {
			number++;
			sum += number;
			if (number >= 5) {
				continue;
			}
         System.out.println("Sum "+sum);
         System.out.println("Number: " + number);
		}

		
		System.out.println("Sum: " + sum);
	}
}
