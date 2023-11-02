package com.example.search.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.search.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query(value="SELECT * FROM detail p WHERE " +
	       "p.name LIKE CONCAT('%',:query,'%')"+
	       "Or p.department LIKE CONCAT('%',:query,'%')", nativeQuery = true)
	
	List<Product> searchProductsSQL(String query);
}
