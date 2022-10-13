package edu.weber.cs4760.customerservice.repository;

import edu.weber.cs4760.customerservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
