package com.example.search.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.search.entity.Product;
import com.example.search.service.ProductService;

@RestController
@RequestMapping("api/details")
public class ProductController {

	private ProductService productService;

	
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<Product>> searchProductsSQL(@RequestParam("query")String query)
	{
		return ResponseEntity.ok(productService.searchProductsSQL(query));
	}
	
	@PostMapping
	public Product createProduct(@RequestBody Product product)
	{
		return productService.createProduct(product);
	}
	
}
