package edu.weber.cs4760.customerservice.service;

import edu.weber.cs4760.customerservice.model.Product;
import edu.weber.cs4760.customerservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
