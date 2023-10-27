package org.perscholas.database.dao;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.OrderDetail;

public class OrderDetailDAO {
	public OrderDetail findById(Integer orderId) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM OrderDetail od WHERE od.id = :orderId"; // Example of HQL to get all records of user class

		System.out.println(hql);

		TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);

		query.setParameter("id", orderId);

		OrderDetail result = query.getSingleResult();
		return result;
	}

	public void save(OrderDetail orderDetail) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		// session.beginTransaction();
		// session.save(save);

		Transaction t = session.beginTransaction();
		session.saveOrUpdate(orderDetail);
		t.commit();
		session.close();

	}

	/*public OrderDetail findByOrderIdAndProductId(Integer orderId, Integer productId) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM OrderDetail od WHERE od.orderId = :orderId AND od.productId=:productId"; // Example of HQL to
																									// get all records
																									// of user class

		System.out.println(hql);

		TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);

		query.setParameter("orderId", orderId);
		query.setParameter("productId", productId);
		try {

			OrderDetail result = query.getSingleResult();
			session.close();
			return result;
		} catch (NoResultException nre) {
			return null;
		}

	}*/
	public OrderDetail findByOrderIdAndProductId(Integer orderId, Integer productId) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM OrderDetail od WHERE od.order.id = :orderId and od.product.id = :productId"; // Example of HQL to get all records of user class

		TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
		query.setParameter("orderId", orderId);
		query.setParameter("productId", productId);

		try {
			OrderDetail result = query.getSingleResult();
			
			return result;
		} catch (NoResultException nre) {
			return null;
		}
	}
}
