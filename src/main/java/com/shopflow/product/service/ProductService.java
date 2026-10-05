package com.shopflow.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shopflow.product.entity.Product;
import com.shopflow.product.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found: " + id));
    }

    public Product create(Product entity) {
        return repository.save(entity);
    }

    public Product update(String id, Product entity) {
        findById(id);
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(String id) {
        findById(id);
        repository.deleteById(id);
    }
}