package org.example.springbootintegrationwithelasticsearchondocker.repo;

import org.example.springbootintegrationwithelasticsearchondocker.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepo extends ElasticsearchRepository<Product, Integer> {
}
