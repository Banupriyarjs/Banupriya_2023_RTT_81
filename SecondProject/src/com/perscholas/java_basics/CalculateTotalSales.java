package com.perscholas.java_basics;

public class CalculateTotalSales {

public static  final int SALES_TAX=10;
	
	public static void main(String[] args) {
		
		double coffee= 2.99d;
		double expresso=4.59d;
		double cappuccino=5.50d;
		
		double totalSales;
		double subTotal;
		
		subTotal=(3*coffee)+(4*expresso)+(2*cappuccino);
		
		totalSales= subTotal + ((subTotal*SALES_TAX)/100);
				
		System.out.println("Total Sales = "+totalSales);
		
		System.out.println("\nTotal Sales(formatted) =  "+ String.format("%.2f", totalSales));
		
		

	}

}
