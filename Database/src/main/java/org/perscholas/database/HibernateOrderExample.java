package org.perscholas.database;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;

public class HibernateOrderExample {
	private OrderDAO orderDao = new OrderDAO();

	public void insertOrder() throws ParseException {
		Date date = new Date();

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date requiredDate = df.parse("2023-10-31");
		//if(orderDao.findByCustomerId(custId))
		//{
		Order o = new Order();
	//	o.setCustomerId(145);
		o.setComments("Shipping in progress");
		o.setOrderDate(date);
		o.setShippedDate(null);
		o.setStatus("In Process");
		o.setRequiredDate(requiredDate);

		orderDao.save(o);
		//}
		//else
		//{
			
		//}
	}
	public void queryOrder() {
		Order o = orderDao.findById(10100);
		
		Customer c = o.getCustomer();
		
		System.out.println("Order " + o.getId() + " was made by customer " + c.getCustomerName() + " on " + o.getOrderDate());
		
		// all the customers orders
		List<Order> orders = c.getOrders();
		for ( Order order : orders ) { 
			System.out.println("Order " + order.getId());
		}
	}
	public void fetchOrder(int custId) {
		System.out.println("Orders placed by the customer\n");
		OrderDAO orderDAO = new OrderDAO();
		List<Order> orders = orderDAO.findByCustomerId(custId);
		for (Order o : orders) {
			System.out.println(o.getId() + " | " + o.getOrderDate() + " | "
					+ o.getRequiredDate() + " | " + o.getStatus() + " | " + o.getComments());
		}

	}
	public void updateOrder() {
		OrderDAO orderDAO = new OrderDAO();
		Date date = new Date();
		Order o = orderDAO.findById(10426);
		// System.out.println("Customer Name : "+c.getCustomerName());
		if (o != null) {
			o.setStatus("Shipped");
		//	o.setCustomerId(119);
			o.setOrderDate(date);
			orderDAO.save(o);
		}

		else {
			System.out.println("Customer does not exist");
		}
	
	}
	
	public static void main(String[] args) {

		HibernateOrderExample hoe = new HibernateOrderExample();
		try {
			//x.createOrder();
			hoe.queryOrder();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*OrderDAO orderDAO = new OrderDAO();

		Order order = orderDAO.findById(10100);

		System.out.println(order.getId() + " | " + order.getCustomerId() + " | " + order.getOrderDate() + " | "
				+ order.getRequiredDate() + " | " + order.getShippedDate() + " | " + order.getStatus() + " | "
				+ order.getComments());

		//Fetch Orders for a customer
        Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Customer ID:");
		
		int customerId=scanner.nextInt();
		hoe.fetchOrder(customerId);
		
		// Insert Order
		try {
			hoe.insertOrder();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
