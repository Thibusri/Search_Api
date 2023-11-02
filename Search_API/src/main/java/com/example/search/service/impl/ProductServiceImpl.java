package com.example.search.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.search.entity.Product;
import com.example.search.repository.ProductRepository;
import com.example.search.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	private ProductRepository productRepository;	


	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> searchProductsSQL(String query) {
		List<Product> products = productRepository.searchProductsSQL(query);
		return products;
	}

	@Override
	public Product createProduct(Product product) {
		
		return productRepository.save(product);
	}

}
