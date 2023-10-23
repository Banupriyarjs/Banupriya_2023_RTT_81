package org.perscholas.database;

import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.entity.Order;

public class HibernateOrderExample {

	public static void main(String[] args) {
    OrderDAO orderDAO = new OrderDAO();
		
		Order order = orderDAO.findById(10100);
		
		System.out.println( order.getId() + " | " +order.getCustomerId()+ " | "+ order.getOrderDate() +  " | "+ order.getRequiredDate()+" | " +order.getShippedDate()+ " | " +order.getStatus()+ " | " +order.getComments());

	}

}
