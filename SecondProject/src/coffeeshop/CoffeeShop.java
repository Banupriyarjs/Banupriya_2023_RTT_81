package coffeeshop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {

	List<Product> products = new ArrayList<>();

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

		/*printProduct(coffee);
		printProduct(tea);
		printProduct(cookie);*/
		printAllProducts();

	}

	public void printProduct(Product product) {
		System.out.println("Product Name : " + product.getName() + "  Price : " + product.getPrice());
	}

	public void printAllProducts() {
		for (Product product : products) {
			printProduct(product);
		}
	}

	public static void main(String[] args) {

		CoffeeShop cs = new CoffeeShop();
		cs.setupProducts();

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

}
