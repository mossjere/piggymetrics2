package edu.weber.cs4760.customerservice.repository;

import edu.weber.cs4760.customerservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Basic CRUD operations
    public Customer findCustomerByUserName(String userName);

}
