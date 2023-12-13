package org.perscholas.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class CustomerDetailController { @Autowired
   private CustomerDAO customerDAO;
    @GetMapping("/customer/customerdetail/{id}")
    public ModelAndView viewCustomerDetail(@RequestParam Integer id)
    {
        ModelAndView response =new ModelAndView();
        response.setViewName("customer/customerdetail");
        Customer customer=customerDAO.findById(id);
       CreateCustomerFormBean form= new CreateCustomerFormBean();
        if(customer !=null)
        {
            form.setId(customer.getId());
            form.setFirstName(customer.getFirstName());
            form.setLastName(customer.getLastName());
            form.setPhone(customer.getPhone());
            form.setCity(customer.getCity());
            form.setImageUrl(customer.getImageUrl());

        }
        else
        {
            log.warn("Customer with id "+id+" was not found");
        }
       // response.addObject("form",form);response
        return response;
    }
}
