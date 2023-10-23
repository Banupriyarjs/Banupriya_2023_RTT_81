package org.perscholas.database.dao;

import javax.persistence.TypedQuery;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;

public class CustomerDAO {
	public Customer findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		//String hql = "FROM Customer c WHERE c.id = ?1"; // Example of HQL to get all records of user class
		String hql = "FROM Customer c WHERE c.id = :id"; // Example of HQL to get all records of user class

		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
		//query.setParameter(1, id);
		query.setParameter("id", id);

		Customer result = query.getSingleResult();
		return result;
	}

}
