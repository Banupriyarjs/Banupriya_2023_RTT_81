package org.perscholas.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.database.entity.User;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.security.AuthenticatedUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerService {
    @Autowired
    CustomerDAO customerDAO;
    @Autowired
    private AuthenticatedUserService authenticatedUserService;
   //public void createCustomer(CreateCustomerFormBean form)
   public Customer createCustomer(CreateCustomerFormBean form)
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
          //these line of code loads the current logged in user record from the database
           User user=authenticatedUserService.loadCurrentUser();
           //then we can set user id onto customer record we are about to create
           //I am doing here because I only want to update the userid on the customer when it is being created.
           //customer.setUserId(user.getId());
         //Added to implement hibernate one to many relationship
          customer.setUser(user);
       }

       // set the incoming values to be save to the database
       customer.setFirstName(form.getFirstName());
       customer.setLastName(form.getLastName());
       customer.setPhone(form.getPhone());
       customer.setCity(form.getCity());
       customer.setImageUrl(form.getImageUrl());
       //customerDAO.save(customer);
       return customerDAO.save(customer);
   }

}

