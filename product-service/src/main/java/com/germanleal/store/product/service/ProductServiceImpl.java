package com.germanleal.store.product.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.germanleal.store.product.entity.Category;
import com.germanleal.store.product.entity.Product;
import com.germanleal.store.product.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	@Autowired
	private final ProductRepository productRepository;
	
	@Override
	public List<Product> listAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product getProduct(Long id) {
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public Product createProduct(Product product) {
		product.setStatus("Created");
		product.setCreateAt(new Date());
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		Product productdb = getProduct(product.getId());
		if(null == productdb)
		{
			return null;
		}
		productdb.setName(product.getName());
		productdb.setDescription(product.getDescription());
		productdb.setCategory(product.getCategory());
		productdb.setPrice(product.getPrice());
		return productRepository.save(productdb);
	}

	@Override
	public Product deleteProduct(Long id) {
		Product productdb = getProduct(id);
		if(null == productdb)
		{
			return null;
		}
		productdb.setStatus("Deleted");
		return productRepository.save(productdb);
	}

	@Override
	public List<Product> findByCategory(Category category) {
		return productRepository.findByCategory(category);
	}

	@Override
	public Product updateStock(Long id, Double quantity) {
		Product productdb = getProduct(id);
		if(null == productdb)
		{
			return null;
		}
		Double stock = productdb.getStock() + quantity;
		productdb.setStock(stock);
		return productRepository.save(productdb);
	}

}
