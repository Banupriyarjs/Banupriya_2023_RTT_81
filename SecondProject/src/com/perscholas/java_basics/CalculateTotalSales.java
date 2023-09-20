package com.perscholas.java_basics;

import java.text.DecimalFormat;

public class CalculateTotalSales {

public static  final int SALES_TAX=10;
	
	public static void main(String[] args) {
		
		double coffee= 2.99d;
		double expresso=4.59d;
		double cappuccino=5.50d;
		
		double totalSales;
		double subTotal;
		//3 Items of first product,4 items of 2nd product,2 items of third product
		subTotal=(3*coffee)+(4*expresso)+(2*cappuccino);
		
		totalSales= subTotal + ((subTotal*SALES_TAX)/100);
		
				
		System.out.println("Total Sales = "+totalSales);
		
		System.out.println("\nTotal Sales(formatted) =  "+ String.format("%.2f", totalSales));
		
		//Another way of formatting
		//DecimalFormat df= new DecimalFormat("0.00");
		
		
	     DecimalFormat df= new DecimalFormat("#,###.00");
	     System.out.println("Total Sales = "+df.format(23726376237627.3267346));
		
		
		

	}

}
