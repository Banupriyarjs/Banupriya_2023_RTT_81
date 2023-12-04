package org.perscholas.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.dao.EmployeeDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.formbean.CreateEmployeeFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;
    public void createCustomer(CreateEmployeeFormBean form)
    {
        log.debug("id:"+form.getId());
        log.debug("firstname:"+form.getFirstName());
        log.debug("lastname:"+form.getLastName());
        log.debug("department:"+form.getDepartmentName());

   Employee employee = employeeDAO.findById(form.getId());

         if(employee==null)
        {
            employee=new Employee();
            log.debug("Employee is null"+form.getId());
        }

        // set the incoming values to be save to the database
        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setDepartment(form.getDepartmentName());
        employeeDAO.save(employee);
    }


}
