package controlflowstatements;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Year: ");
		int year=input.nextInt();
		if((year%4==0 && year%100!=0 )||year%400==0)
			System.out.println(year+" is a Leap Year");
		else
			System.out.println(year+" is not a Leap Year");
		
		input.close();
		

	}

}
