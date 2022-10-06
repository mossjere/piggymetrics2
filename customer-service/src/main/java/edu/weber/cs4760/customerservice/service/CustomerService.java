package edu.weber.cs4760.customerservice.service;

import edu.weber.cs4760.customerservice.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);
    Customer addCustomer(Customer customer);
    List<Customer> findAll();

}
