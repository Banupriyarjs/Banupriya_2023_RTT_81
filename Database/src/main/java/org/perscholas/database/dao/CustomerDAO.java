package org.perscholas.database.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;

public class CustomerDAO {
	// the desired behavior is .. return a single customer object or return null
	// null is indicating that it was not found
	public Customer findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// String hql = "FROM Customer c WHERE c.id = ?1"; // Example of HQL to get all
		// records of user class
		String hql = "FROM Customer c WHERE c.id = :id"; // Example of HQL to get all records of user class

		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
		// query.setParameter(1, id);
		query.setParameter("id", id);
		try {
			Customer result = query.getSingleResult();
			return result;
		} catch (NoResultException nre) {
			return null;
		}
	}

// by contrast a method that returns a list will always return a list
	// this kind of mthod never returns a null.
	// if there are no records the list will empty
	public List<Customer> findByFirstName(String fname) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// Example of HQL to get all records of user class
		// SQL is : select * from customers c where c.contact_firstname = :firstname and
		// c.contact_lastname = :lastname
		String hql = "FROM Customer c WHERE c.contactFirstName = :firstname";

		TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
		query.setParameter("firstname", fname);

		List<Customer> result = query.getResultList();
		return result;
	}

	public void save(Customer save) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		//session.beginTransaction();
		//session.save(save);

		Transaction t = session.beginTransaction();
		session.saveOrUpdate(save);
		t.commit();

	}

}
