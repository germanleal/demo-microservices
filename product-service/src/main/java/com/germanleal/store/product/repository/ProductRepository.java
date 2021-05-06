package com.germanleal.store.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.germanleal.store.product.entity.Category;
import com.germanleal.store.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	public List<Product> findByCategory(Category category);
}
