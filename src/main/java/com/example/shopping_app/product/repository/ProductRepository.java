package com.example.shopping_app.account.repository;

import com.example.shopping_app.account.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
