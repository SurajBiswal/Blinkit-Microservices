package com.blinkit.product_service.service;

import com.blinkit.product_service.entity.Product;
import com.blinkit.product_service.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product create(Product product) {
        return repository.save(product);
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public Product getById(Long id){ return repository.findById(id).orElseThrow(()->new RuntimeException("Product not found with id: " + id)); }

}

