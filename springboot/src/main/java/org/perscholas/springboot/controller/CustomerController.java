package org.perscholas.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.perscholas.springboot.database.dao.CustomerDAO;
import org.perscholas.springboot.database.entity.Customer;
import org.perscholas.springboot.formbean.CreateCustomerFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
// add a label to the existing form input for first name
// add a 2nd form input for last name
// change the controller to accept the new form input for last name as well as first name
// change the query to search by first name OR last name
// change the query to use like for both first name and last name
// make both search fields populate the user input if it was given
@Slf4j
@Controller
public class CustomerController {
    //This points to the website url

    @Autowired
    private CustomerDAO customerDao;

    @GetMapping("/customer/create")
    public ModelAndView createCustomer() {
        ModelAndView response = new ModelAndView("customer/create");
        log.debug("In create customer with no args ");
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
    public ModelAndView createCustomerSubmit(CreateCustomerFormBean form) {
        ModelAndView response = new ModelAndView("customer/create");

        System.out.println("firstName:" + form.getFirstName());
        System.out.println("lastName:" + form.getLastName());
        System.out.println("phone:" + form.getPhone());
        System.out.println("city:" + form.getCity());

        Customer customer = new Customer();
        customer.setFirstName(form.getFirstName());
        customer.setLastName(form.getLastName());
        customer.setPhone(form.getPhone());
        customer.setCity(form.getCity());
         customerDao.save(customer);
        log.debug("In create customer with incoming args ");
        return response;
    }
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