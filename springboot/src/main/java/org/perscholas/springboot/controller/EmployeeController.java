package org.perscholas.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.EmployeeDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.database.entity.Employee;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.formbean.CreateEmployeeFormBean;
import org.perscholas.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;
@Autowired
private EmployeeService employeeService;
    @GetMapping("/employee/create")
    public ModelAndView createEmployee() {
        ModelAndView response = new ModelAndView("/employee/create");
        return response;
    }
@GetMapping("/employee/createSubmit")
    public ModelAndView createAndSubmitEmployee(CreateEmployeeFormBean form)
    {
       /*ModelAndView response= new ModelAndView("/employee/create");
       Employee employee=new Employee();
       employee.setFirstName(form.getFirstName());
       employee.setLastName(form.getLastName());
       employee.setDepartment(form.getDepartmentName());
       employeeDAO.save(employee);
        return response;*/

        ModelAndView response = new ModelAndView("/employee/create");

        employeeService.createCustomer(form);
        log.debug("In create customer with incoming args ");
        return response;
    }

    @GetMapping("/employee/search")
    public ModelAndView searchByFnameAndLame(@RequestParam(required = false) String firstname, @RequestParam(required = false) String lastname) {
        ModelAndView response = new ModelAndView("employee/search");
        log.debug("In the employee search controller method:search parameter:"+firstname+" "+lastname);
        if(firstname!=null || lastname!=null)
        {
            List<Employee> employees=employeeDAO.findByFnameAndLnameStartsWith(firstname+"%",lastname+"%");
            response.addObject("employeesByName",employees);
            response.addObject("firstname",firstname);
            response.addObject("lastname",lastname);
            for (Employee employee :employees)
            {
                log.debug("customer: id "+employee.getId()+" First Name "+employee.getFirstName()+" Last Name "+employee.getLastName());

            }

        }
        return response;
    }
    @GetMapping("/employee/edit/{id}")
    public ModelAndView editCustomer(@PathVariable int id)
    {
        ModelAndView response = new ModelAndView("employee/create");
        Employee employee=employeeDAO.findById(id);

       CreateEmployeeFormBean empForm=new CreateEmployeeFormBean();
        if(employee !=null)
        {
            empForm.setId(employee.getId());
            empForm.setFirstName(employee.getFirstName());
            empForm.setLastName(employee.getLastName());
            empForm.setDepartmentName(employee.getDepartment());


        }
        else
        {
            log.warn("Employee with id "+id+" was not found");
        }
        response.addObject("form",empForm);
        return response;
    }
}
