package com.perscholas.java_basics;

public class PrimitiveDataTypesAssignment {

	public static void main(String[] args) {
		
		int inum1=100;
		int inum2=200;
		
		int isum;
		
		double dnum1=20.3d,dnum2=45.83d;
		double dsum;
		System.out.println("Program 1 -Adding Integers:");
		isum=inum1+inum2;
		System.out.println("Sum of Integer numbers : "+isum);
		
		System.out.println("Program 2 -Adding Double Numbers:");
		dsum=dnum1+dnum2;
		System.out.println("Sum of Double numbers : "+dsum);
		
		
		
		System.out.println("Program 3 -Adding Integer and Double Numbers:");
		int inumber=45;
		double dnumber=78.3d;
		double result=inumber+dnumber;
		System.out.println("Sum of Integer and double numbers : "+result);
		
		System.out.println("Program 4 -Divide larger number by a smaller number :");
		int idivNumber1=8989;
		int idviNumber2=72;
		int idivResult;
		
		idivResult=idivNumber1/idviNumber2;
		System.out.println("Result of Division by larger number by a smaller number : "+idivResult);
		
		double ddivNumber1;
		ddivNumber1=idivNumber1;
		//Type mismatch: cannot convert from double to int. If you try to assign a double type to an integer type.
		//idivResult=ddivNumber1/idviNumber2;
		idivResult=(int)ddivNumber1/idviNumber2;
		
		System.out.println("If you try to assign a double value to an integer type throws error.\n"
				+ "[Type mismatch: cannot convert from double to int] ");
		
		
		
		
		

	}

}
