package com.example.shopcatalog.data;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.shopcatalog.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

//	@Query("{category: ?1}")
	Page<Product> findByCategory(String category, Pageable pageRequest);
}
