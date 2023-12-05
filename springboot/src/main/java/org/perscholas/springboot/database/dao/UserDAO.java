package org.perscholas.springboot.database.dao;

import org.perscholas.springboot.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<Employee,Long> {
}
