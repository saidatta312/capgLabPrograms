package com.capg.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.product.model.Product;
import com.capg.product.service.ProductService;

@RestController

public class ProductController {

	@Autowired
	ProductService  productService;
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getAllProduct(){
		List<Product> allProducts=productService.getAllProducts();
		
		return new ResponseEntity<List<Product>>(allProducts,HttpStatus.OK);
	}
	
	@PostMapping("/product")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		productService.createProduct(product);
		return new ResponseEntity<Product>(product,HttpStatus.CREATED);
	}
=======
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.product.model.Product;
import com.capg.product.service.ProductService;

@RestController

public class ProductController {

	@Autowired
	ProductService  productService;
	
	@GetMapping("/product")
	public List<Product>  getAllProducts()
	{
		  return productService.getAllProducts();
	}
	
	@PostMapping("/product")
	public Product  createProduct(@RequestBody Product product)
	{
		return  productService.createProduct(product);
	}
	
>>>>>>> branch 'master' of https://github.com/NivedChowdary/capg-virtual-classes
	
}
