package edu.weber.cs4760.customerservice.service;

import edu.weber.cs4760.customerservice.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
}
