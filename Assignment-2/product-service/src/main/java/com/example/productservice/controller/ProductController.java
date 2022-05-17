package com.example.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productservice.entity.ProductDetails;
import com.example.productservice.service.Productservice;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private Productservice productservice;

	@PostMapping("/create")
	public ProductDetails createProduct(@RequestBody ProductDetails productDetails) {
		return productservice.saveProduct(productDetails);
	}

	@GetMapping("/allProducts")
	public List<ProductDetails> getAllProduct(@RequestBody ProductDetails productDetails) {
		return productservice.fetchAllProducts();
	}
	
	@GetMapping("/productById/{id}")
	public ProductDetails getProductById(@PathVariable("id") Integer id) {
		return productservice.getProductById(id);
	}
	
	@GetMapping("/productByName/{name}")
	public ProductDetails getProductById(@PathVariable("name") String name) {
		return productservice.getProductByName(name);
	}
}
