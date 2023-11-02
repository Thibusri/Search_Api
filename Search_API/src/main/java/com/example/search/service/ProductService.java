package com.example.search.service;

import java.util.List;

import com.example.search.entity.Product;

public interface ProductService {

	List<Product> searchProductsSQL(String query);

	Product createProduct(Product product);
}
