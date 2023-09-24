package controlflowstatements;

import java.util.Scanner;

public class CalculateBMI {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input weight in Kilograms : ");
		double weight=scanner.nextDouble();
		System.out.println("Input height in meters : ");
		double height=scanner.nextDouble();
		
		double BMI=weight/(height*height);
		
		if(BMI<18.5)
			System.out.println("Under Weight");

		else if(BMI>=18.5 && BMI<25)
			System.out.println("Normal");

		else if(BMI>=25 && BMI<30)
			System.out.println("OverWeight");
		else
			System.out.println("Obese");
		System.out.println("\nThe Body Mass Index(BMI) is " +BMI+" kg/m2");
		
		scanner.close();
		
		
		
	}

}
