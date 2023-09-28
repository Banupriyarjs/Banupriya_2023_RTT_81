package classesandmethods;

import java.util.Scanner;

public class Calculator {

	double result;

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.menu();

	}

	public void menu() {
		double output = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Choose the operation to perform :");
		System.out.println("1-Addition");
		System.out.println("2-Substraction");
		System.out.println("3-Multiplication");
		System.out.println("4-Division");

		int operation = input.nextInt();

		System.out.println("Enter the first number: ");
		double number1 = input.nextInt();
		System.out.println("\nEnter the second number: ");
		double number2 = input.nextInt();
		if (operation == 1) {
			output = add(number1, number2);
			System.out.printf("Result of adding two numbers %.2f and %.2f = %.2f", number1, number2, output);
		} else if (operation == 2) {
			output = substract(number1, number2);
			System.out.printf("Result of Substracting %.2f and %.2f = %.2f", number1, number2, output);

		} else if (operation == 3) {
			output = multiply(number1, number2);
			System.out.printf("Result of Multiplying %.2f and %.2f = %.2f", number1, number2, output);

		} else if (operation == 4) {
			output = divide(number1, number2);
			System.out.printf("Result of Dividing %f by %.2f = %.2f", number1, number2, output);

		}

	}

	public double add(double number1, double number2) {

		result = number1 + number2;

		return result;
	}

	public double substract(double number1, double number2) {

		result = number1 - number2;

		return result;
	}

	public double multiply(double number1, double number2) {

		result = number1 * number2;

		return result;
	}

	public double divide(double number1, double number2) {

		result = number1 / number2;

		return result;
	}
}
