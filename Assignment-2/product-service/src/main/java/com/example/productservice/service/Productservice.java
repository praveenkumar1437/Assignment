package com.example.productservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productservice.entity.ProductDetails;
import com.example.productservice.repo.ProductRepository;

@Service
public class Productservice {

	@Autowired
	private ProductRepository productRepository;

	public ProductDetails saveProduct(ProductDetails productDetails) {
		return productRepository.save(productDetails);
	}

	public List<ProductDetails> fetchAllProducts() {
		return productRepository.findAll();
	}

	public ProductDetails getProductById(Integer id) {
		Optional<ProductDetails> findById = productRepository.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	public ProductDetails getProductByName(String name) {
		Optional<ProductDetails> findById = productRepository.getProductByName(name);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}
}
