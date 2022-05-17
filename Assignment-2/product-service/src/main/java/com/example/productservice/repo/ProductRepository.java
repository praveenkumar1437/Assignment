package com.example.productservice.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.productservice.entity.ProductDetails;

@Repository
public interface ProductRepository extends MongoRepository<ProductDetails, Integer>{

	public Optional<ProductDetails> getProductByName(String name);
}
