package org.perscholas.springboot.controller;

import io.micrometer.common.util.StringUtils;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.perscholas.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
// add a label to the existing form input for first name
// add a 2nd form input for last name
// change the controller to accept the new form input for last name as well as first name
// change the query to search by first name OR last name
// change the query to use like for both first name and last name
// make both search fields populate the user input if it was given
// --- component scan phase 1
// 1. Find all classes with @Component, @Service, @Repository, @Controller, @RestController and instantiate them and add them to the spring context
// 2. Find all classes with @Configuration and instantiate them and add them to the Spring context
// 3. Runs all the methods in the Configuration classes and anything marked with @Bean will be added them to the Spring context
// 4. Find all classes with @ControllerAdvice and add them to the Spring context

// -- component scan phase 2
// 1. Inject all of the dependencies using @Autowired

// -- component scan phase 3
// 1. Run all of the methods marked with @PostConstruct
@Slf4j
@Controller
public class CustomerController {
    //This points to the website url

    @Autowired
    private CustomerDAO customerDao;
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer/create")
    public ModelAndView createCustomer() {
        ModelAndView response = new ModelAndView("customer/create");
        log.debug("In create customer with no args - log.debug");
        log.info("In create customer with no args - log.info");
        return response;
    }
    //Model to find the customers by first name
    @GetMapping("/customer/search")
    public ModelAndView search(@RequestParam(required = false) String firstname) {
        ModelAndView response = new ModelAndView("customer/search");
        log.debug("In the customer search controller method:search parameter:"+firstname);
        if(firstname!=null)
        {
            List<Customer> customers=customerDao.findFirstName(firstname);
            response.addObject("customersVar",customers);
            response.addObject("search",firstname);
            for (Customer customer :customers)

            {
                log.debug("customer: id "+customer.getId()+" First Name "+customer.getFirstName()+" Last Name "+customer.getLastName());
                log.debug("customer: Phone "+customer.getPhone()+" City "+customer.getCity());
            }

        }
        return response;
    }
    //Model to find the customers using the first name and the last name
    @GetMapping("/customer/searchbyname")
    public ModelAndView searchByFnameAndLame(@RequestParam(required = false) String firstname,@RequestParam(required = false) String lastname) {
        ModelAndView response = new ModelAndView("customer/search");
        log.debug("In the customer search controller method:search parameter:"+firstname+" "+lastname);
        if(firstname!=null || lastname!=null)
        {
            List<Customer> customers=customerDao.findByFnameAndLnameStartsWith(firstname+"%",lastname+"%");
            response.addObject("customersByName",customers);
            response.addObject("firstname",firstname);
            response.addObject("lastname",lastname);
            for (Customer customer :customers)

            {
                log.debug("customer: id "+customer.getId()+" First Name "+customer.getFirstName()+" Last Name "+customer.getLastName());
                log.debug("customer: Phone "+customer.getPhone()+" City "+customer.getCity());
            }

        }
        return response;
    }
    @GetMapping("/customer/createSubmit")
    public ModelAndView createCustomerSubmit(@Valid CreateCustomerFormBean form, BindingResult bindingResult) {
    /*ModelAndView response = new ModelAndView("customer/create");
       // ModelAndView response = new ModelAndView("redirect:/customer/search");

        customerService.createCustomer(form);
        log.debug("In create customer with incoming args ");
        return response;*/
        if (bindingResult.hasErrors()) {
            log.info("######################### In create customer submit - has errors #########################");
            ModelAndView response = new ModelAndView("customer/create");

            for (ObjectError error : bindingResult.getAllErrors()) {
                log.info("error: " + error.getDefaultMessage());
            }

            response.addObject("form", form);
            response.addObject("errors", bindingResult);
            return response;
        }

        log.info("######################### In create customer submit - no error found #########################");

        Customer c = customerService.createCustomer(form);

        // the view name can either be a jsp file name or a redirect to another controller method
        ModelAndView response = new ModelAndView();
        response.setViewName("redirect:/customer/edit/" + c.getId() + "?success=Customer Saved Successfully");

        return response;
    }

    @GetMapping("/customer/edit/{id}")
   // public ModelAndView editCustomer(@PathVariable int id)
   //Added to display success message
    public ModelAndView editCustomer(@PathVariable int id, @RequestParam(required = false) String success)
    {
        log.info("######################### In /customer/edit #########################");

        ModelAndView response = new ModelAndView("customer/create");
        Customer customer=customerDao.findById(id);
        //Added to display success message
        if (!StringUtils.isEmpty(success)) {
            response.addObject("success", success);
        }
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
        response.addObject("form",form);
        return response;
    }

//    @GetMapping("/customer/delete/{customerId}")
//    public ModelAndView deleteCustomer(@PathVariable int customerId) {
//        ModelAndView response = new ModelAndView("customer/search");
//
//        Customer customer = customerDao.findById(customerId);
//
//        if ( customer != null ) {
//            customerDao.delete(customer);
//        } else {
//            log.warn("Customer with id " + customerId + " was not found") ;
//        }
//
//        return response;
//    }
//public ModelAndView createCustomer()
// The requestparams refers to the name attribute in form
    /*public ModelAndView createCustomer(@RequestParam(required = false)String firstName,
                                        @RequestParam(required = false)String lastName,
                                        @RequestParam(required = false)String phone,
                                        @RequestParam(required = false)String city)
    {
        //This points to the customer folder path
        ModelAndView response = new ModelAndView("customer/create");

        System.out.println("firstName:"+firstName);
        System.out.println("lastName:"+lastName);
        System.out.println("phone:"+phone);
        System.out.println("city:"+city);



        return response;
    }*/
}