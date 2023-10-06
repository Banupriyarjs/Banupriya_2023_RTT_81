package exception;
import java.util.Scanner;

public class GCDWithCustomException {

	boolean isInteger = false;

	public static void main(String[] args) throws NumericException {

		NumericException ne = new NumericException("User Defined Exception");

		Scanner scanner = new Scanner(System.in);
		int n1 = 0, n2 = 0;

		if (readPostiveNumber(scanner) > 0) {
			n1 = readPostiveNumber(scanner);

			n2 = readPostiveNumber(scanner);

			int gcd = 1;
			int min = Math.min(n1, n2);

			for (int k = 1; k <= min; k++) {
				if ((n1 % k == 0) && (n2 % k == 0)) {
					gcd = k;
				}
			}

			System.out.printf("The gcd of %d and %d is %d", n1, n2, gcd);
		}

	}

	public static int readPostiveNumber(Scanner scanner) throws NumericException {
		int number = -1;
		try {
			System.out.println("Enter a number : ");
			if (scanner.hasNextInt() == true) {
				number = scanner.nextInt();
				if (number <= 0) {
					throw new NumericException("\nPlease enter a postive number greater than zero");
				}

			} else {
				throw new NumericException("\nPlease enter a numeric value greater than zero");

			}

		} catch (Exception e) {
			// e.printStackTrace();;
			System.out.println("Caught a user defined exception");
			System.out.println(e.getMessage());

		}
		return number;
	}

}
