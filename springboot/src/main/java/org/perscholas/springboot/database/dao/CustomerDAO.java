package org.perscholas.springboot.database.dao;

import org.perscholas.springboot.database.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //optional
public interface CustomerDAO extends JpaRepository<Customer, Long> {
public Customer findById(int id);
@Query("select c from Customer c WHERE c.firstName=:firstName")
List<Customer> findFirstName(String firstName);
}
