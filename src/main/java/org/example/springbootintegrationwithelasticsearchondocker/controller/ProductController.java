package org.example.springbootintegrationwithelasticsearchondocker.controller;

import org.example.springbootintegrationwithelasticsearchondocker.entity.Product;
import org.example.springbootintegrationwithelasticsearchondocker.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public Iterable<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/insert")
    public Product insertProduct(@RequestBody Product product) {
        return productService.insertProduct(product);
    }

}
