package org.perscholas.database;

import java.util.List;

import org.perscholas.database.dao.CustomerDAO;
import org.perscholas.database.entity.Customer;

public class CreateAndUpdateCustomer {
	private CustomerDAO customerDAO = new CustomerDAO();

	public void insertCustomerExample() {
		Customer c = new Customer();
		c.setCustomerName("Series Reminder");
		c.setContactFirstName("Peter");
		c.setContactLastName("Parker");
		c.setAddressLine1("Address Line 1");
		c.setAddressLine2("Address Line2");
		c.setCity("Atlanta");
		c.setState("Georgia");
		c.setPostal_code("30088");
		c.setCountry("USA");
		c.setCreditLimit(10000.00);
		c.setPhone("404-456=1293");
		customerDAO.save(c);

		System.out.println("id Before save:" + c.getId());
		System.out.println("Cutomer Saved");

		System.out.println("id After save:" + c.getId());

	}

	public void updateCustomerExample() {
		Customer c = customerDAO.findById(527);
		// System.out.println("Customer Name : "+c.getCustomerName());
		if (c != null) {
			c.setContactFirstName("Updted First Name");
			c.setContactLastName("Updted Last Name");
			c.setCreditLimit(10000.00);

			customerDAO.save(c);
		}

		else {
			System.out.println("Customer does not exist");
		}
	
	}
	public void listQuery()
	{
		List<Customer> cusomers=customerDAO.findByFirstName(null);
		System.out.println("We found "+cusomers.size()+" records in the database");
	}
	public static void main(String[] args) {
		CreateAndUpdateCustomer crup = new CreateAndUpdateCustomer();
		// crup.insertCustomerExample();
		//crup.updateCustomerExample();
		crup.listQuery();
	}
}
