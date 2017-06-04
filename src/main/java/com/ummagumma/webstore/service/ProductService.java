package com.ummagumma.webstore.service;

import java.util.List;

import com.ummagumma.webstore.model.Product;

public interface ProductService {
	List<Product> getProductByCategory(String category);
	List<Product> getAllProducts();
}
