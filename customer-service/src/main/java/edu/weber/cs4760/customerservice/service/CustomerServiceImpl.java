package edu.weber.cs4760.customerservice.service;

import edu.weber.cs4760.customerservice.model.Customer;
import edu.weber.cs4760.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    @Transactional
    public Customer addCustomer(Customer customer) {
        customer = customerRepository.save(customer);
        return customer;
    }

    @Override
    public List<Customer> findAll() { return customerRepository.findAll(); }
}
