package org.perscholas.springboot.database.dao;

import org.perscholas.springboot.database.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //optional
public interface CustomerDAO extends JpaRepository<Customer, Long> {
public Customer findById(Integer id);
@Query("select c from Customer c WHERE c.firstName=:firstName")
List<Customer> findFirstName(String firstName);

//@Query("select c from Customer c WHERE c.firstName = :firstName OR c.lastName =:lastName")
@Query("select c from Customer c WHERE c.firstName LIKE :firstName AND c.lastName LIKE:lastName")
List<Customer> findByFnameAndLnameStartsWith(String firstName,String lastName);
}
