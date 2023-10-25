package org.perscholas.database;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.entity.Order;

public class CreateAndUpdateOrder {

	private OrderDAO orderdao=new OrderDAO();
	public static void main(String[] args) {
		CreateAndUpdateOrder oc=new CreateAndUpdateOrder();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Customer ID:");
		
		int customerId=scanner.nextInt();
		
		OrderDAO orderDao= new OrderDAO();
		
		orderDao.findByCustomerId(customerId);
		
		try {
			oc.insertOrder();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void insertOrder() throws ParseException {
		Date date=new Date();
		
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Date requiredDate=df.parse("2023-10-31");
		Order o = new Order();
		o.setCustomerId(145);
		o.setComments("Shipping in progress");
		o.setOrderDate(date);
		o.setShippedDate(null);
		o.setStatus("In Process");
		o.setRequiredDate(requiredDate);
		
		orderdao.save(o);

		/*System.out.println("id Before save:" + o.getId());
		System.out.println("Order Saved");

		System.out.println("id After save:" + o.getId());*/

	}
	
	
}
