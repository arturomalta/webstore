package com.ummagumma.webstore.dao;

import java.util.List;

import com.ummagumma.webstore.model.Product;

public interface ProductDAO {
	List<Product> getAllProducts();
	List<Product> getProductsByCategory(String category);
	Product getProductById(String productId);
}
