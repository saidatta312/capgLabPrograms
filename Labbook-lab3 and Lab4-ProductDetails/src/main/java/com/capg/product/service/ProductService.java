package com.capg.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.product.model.Product;
import com.capg.product.repo.ProductRepo;
@Service
public class ProductService {
	@Autowired
	private  ProductRepo  repo;
	
	public List<Product> getAllProducts() {
		 
		return repo.findAll();
	}

	public Product createProduct(Product product) {
		
		return repo.save(product);
	}
 
}
