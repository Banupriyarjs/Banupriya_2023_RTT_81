package org.perscholas.springboot.database.dao;

import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Employee,Long>
{
    public Employee findById(Integer id);

    @Query("select e from Employee e WHERE e.firstName LIKE :firstName AND e.lastName LIKE:lastName")
    List<Employee> findByFnameAndLnameStartsWith(String firstName, String lastName);
}


