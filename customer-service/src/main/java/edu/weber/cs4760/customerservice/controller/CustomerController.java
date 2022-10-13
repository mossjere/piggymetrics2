package edu.weber.cs4760.customerservice.controller;

import edu.weber.cs4760.customerservice.model.Customer;
import edu.weber.cs4760.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/secured")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customer")
    public Customer getCustomer(
        @RequestParam(value="firstname") String firstname,
        @RequestParam(value="lastname") String lastname,
        @RequestParam(value="username") String username
    )
    {
        Customer customer = new Customer();
        customer.setFirstName(firstname);
        customer.setLastName(lastname);
        customer.setUserName(username);
        return customer;
    }

    @PostMapping("/customer")
    public Customer postCustomer(
        @RequestParam(value="firstname") String firstname,
        @RequestParam(value="lastname") String lastname,
        @RequestParam(value="username") String username)
    {
        Customer customer = new Customer();
        customer.setFirstName(firstname);
        customer.setLastName(lastname);
        customer.setUserName(username);
        customerRepository.save(customer);
        return customer;
    }

}
