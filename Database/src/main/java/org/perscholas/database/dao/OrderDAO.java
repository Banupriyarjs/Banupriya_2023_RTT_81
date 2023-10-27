package org.perscholas.database.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;

public class OrderDAO {

	public Order findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// String hql = "FROM Customer c WHERE c.id = ?1"; // Example of HQL to get all
		// records of user class
		String hql = "FROM Order o WHERE o.id = :id"; // Example of HQL to get all records of user class

		TypedQuery<Order> query = session.createQuery(hql, Order.class);

		query.setParameter("id", id);
		try {
			Order result = query.getSingleResult();
			session.close();

			return result;
		} catch (NoResultException nre) {
			return null;
		}
	}

	public List<Order> findByCustomerId(Integer customerId) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Order o WHERE o.customerId = :customerid";

		TypedQuery<Order> query = session.createQuery(hql, Order.class);
		query.setParameter("customerid", customerId);

		List<Order> result = query.getResultList();
		return result;

	}

	public void save(Order save) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		session.saveOrUpdate(save);
		t.commit();

	}

}
