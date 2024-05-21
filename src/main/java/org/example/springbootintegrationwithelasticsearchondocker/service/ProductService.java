package org.example.springbootintegrationwithelasticsearchondocker.service;

import org.example.springbootintegrationwithelasticsearchondocker.entity.Product;
import org.example.springbootintegrationwithelasticsearchondocker.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Iterable<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product insertProduct(Product product) {
        return productRepo.save(product);
    }
}
