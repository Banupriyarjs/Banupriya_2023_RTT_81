package coffeeshop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {

	List<Product> products = new ArrayList<>();
	// this is the class member variable to make it easier
	Scanner input = new Scanner(System.in);

	public void setupProducts() {
		Product coffee = new Product();
		coffee.setName("Coffee");
		coffee.setPrice(5.44);
		products.add(coffee);

		Product tea = new Product();
		tea.setName("Tea");
		tea.setPrice(4.33);
		products.add(tea);

		Product cookie = new Product();
		cookie.setName("Cookie");
		cookie.setPrice(6.77);
		products.add(cookie);

		Product donut = new Product();
		donut.setName("Donut");
		donut.setPrice(3.50);
		products.add(donut);
		/*
		 * printProduct(coffee); printProduct(tea); printProduct(cookie);
		 */

	}

	public void example() {
		double coffee = 2.99d;
		double expresso = 4.59d;
		double cappuccino = 5.50d;

		double totalSales;
		double subTotal;
		// 3 Items of first product,4 items of 2nd product,2 items of third product
		subTotal = (3 * coffee) + (4 * expresso) + (2 * cappuccino);

		// totalSales= subTotal + ((subTotal*SALES_TAX)/100);

		double salestax = subTotal * 0.10;

		totalSales = subTotal + salestax;

		DecimalFormat df = new DecimalFormat("$0.00");

		System.out.println("Total Sales = " + df.format(totalSales));
	}

	public void printProduct(Product product) {
		System.out.println("Product Name : " + product.getName() + "  Price : " + product.getPrice());
	}

	public void printAllProducts() {
		for (Product product : products) {
			printProduct(product);
		}
	}

	public int userSelect() {
		System.out.println("1. Print the menu items and prices");
		System.out.println("2. Add an item to your order");
		System.out.println("3. Print the items in your order.");
		System.out.println("4. Checkout.");

		System.out.println("\nWhat do you want to do?");

		int select = input.nextInt();
		return select;
	}

	public static void main(String[] args) {

		CoffeeShop cs = new CoffeeShop();
		cs.setupProducts();

		int userSelection = cs.userSelect();

		if (userSelection == 1) {
			cs.printAllProducts();
		} else {
			System.out.println("User Input " + userSelection + " is unknnown.Try again");
		}
	}

}
