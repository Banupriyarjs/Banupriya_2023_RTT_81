package org.perscholas.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerService {
    @Autowired
    CustomerDAO customerDAO;
   public void createCustomer(CreateCustomerFormBean form)
   {
       log.debug("id:"+form.getId());
       log.debug("firstname:"+form.getFirstName());
       log.debug("lastname:"+form.getLastName());
       log.debug("phone:"+form.getPhone());
       log.debug("city"+form.getCity());

       // if the form.id is null then this is a create - if it is not null then it is an edit
       // first we attempt to load it from the database ( basically we assume that it is going to be an edit )
       // if it was found in the database we know the incoming id was valid so we can edit it
       Customer customer = customerDAO.findById(form.getId());

       // if the customer is null then we know that this is a create and we have to make a new object
       if(customer==null)
       {
           customer=new Customer();
       }

       // set the incoming values to be save to the database
       customer.setFirstName(form.getFirstName());
       customer.setLastName(form.getLastName());
       customer.setPhone(form.getPhone());
       customer.setCity(form.getCity());
       customerDAO.save(customer);
   }

}

