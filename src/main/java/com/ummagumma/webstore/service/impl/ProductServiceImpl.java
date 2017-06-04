package com.ummagumma.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ummagumma.webstore.dao.ProductDAO;
import com.ummagumma.webstore.model.Product;
import com.ummagumma.webstore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO productRepository;
	
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}
	
	public List<Product> getProductByCategory(String category) {
		return productRepository.getProductsByCategory(category);
	}
}
