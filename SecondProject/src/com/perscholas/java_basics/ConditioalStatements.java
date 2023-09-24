package com.perscholas.java_basics;

import java.util.Scanner;

public class ConditioalStatements {

	public static void main(String[] args) {
	
		//Question 1
		int x=7;
		//int x=15;
		
		if(x<10)
			System.out.println("x is less than 10");
		
		//Question 2
		if(x<10)
			System.out.println("x is less than 10");
		else
			System.out.println("x is greater than 10");
		
		//Question 3
		 x=50;
		
		if(x<10)
			System.out.println("x is less than 10");
		else if(x>10 && x<20)
			System.out.println("Between 10 and 20");
		else
			System.out.println("Greater than or equal to 20");
		
		//Question 4
		
		x=15;
				
		if(x<10)
			System.out.println("Out of range");
		else if(x<10 || x>20)
			System.out.println("“In range");
		
		
	//Question 5
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your Score:");
		int score=input.nextInt();
		
		if(score>=90 && score<=100)
			System.out.println("Grade A");
		else if(score>=80 && score<=89)
			System.out.println("Grade B");
		else if(score>=70 && score<=79)
			System.out.println("Grade C");
		else if(score>=60 && score<=69)
			System.out.println("Grade D");
		else if(score<60)
			System.out.println("Grade F");
		else if(score<0 || score>100)
			System.out.println("Out of scope");
		
	 //Question 6
		
		System.out.println("Enter the day of the week: ");
		int day=input.nextInt();
		
		switch(day)
		{
			case 1:
				    System.out.println("Monday");
				    break;
			case 2:
			    System.out.println("Tuesday");
			    break;
			case 3:
			    System.out.println("Wednesday");
			    break;
			case 4:
			    System.out.println("Thursday");
			    break;
			case 5:
			    System.out.println("Friday");
			    break;
			case 6:
			    System.out.println("Saturday");
			    break;
			case 7:
			    System.out.println("Sunday");
			    break;
			default:
				System.out.println("Out of Range");
				break;
		}
		
	}

}
