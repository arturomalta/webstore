package com.ummagumma.webstore.dao.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ummagumma.webstore.dao.ProductDAO;
import com.ummagumma.webstore.model.Product;

@Repository
public class InMemoryProductDAOImpl implements ProductDAO {
	private List<Product> listOfProducts = new ArrayList<Product>();
	
	public InMemoryProductDAOImpl() {
		Product iPhone = new Product("P1234", "iPhone 5s", new BigDecimal(500));
		iPhone.setDescription("Apple iPhone 5s smarthphone with 4.00-inch 640x1136 display and 8-megapixel rear camera");
		iPhone.setCategory("Smart Phone");
		iPhone.setManufacturer("Apple");
		iPhone.setUnitsInStock(1000);
		
		Product laptopDell = new Product("P1235", "Dell Inspiron", new BigDecimal(700));
		laptopDell.setDescription("Dell Inspiron 14-inch laptop (Black) with 3rd Generation Intel Core processors");
		laptopDell.setCategory("Laptop");
		laptopDell.setManufacturer("Dell");
		laptopDell.setUnitsInStock(1000);
		
		Product tabletNexus = new Product("P1236", "Nexus 7", new BigDecimal(300));
		tabletNexus.setDescription("Google Nexus 7 is the lightest 7 inch tablet with a quad-core Qualcom Snapdragon S4 Pro processor");
		tabletNexus.setCategory("Tablet");
		tabletNexus.setManufacturer("Google");
		tabletNexus.setUnitsInStock(1000);
		
		listOfProducts.add(iPhone);
		listOfProducts.add(laptopDell);
		listOfProducts.add(tabletNexus);
	}
	
	public List<Product> getAllProducts() {
		return listOfProducts;
	}
	
	public List<Product> getProductsByCategory(String category) {
		List<Product> productsByCategory = new ArrayList<Product>();
		
		for(Product product : listOfProducts) {
			if(category.equalsIgnoreCase(product.getCategory())) {
				productsByCategory.add(product);
			}
 		}
		
		return productsByCategory;
	}
	
	public Product getProductById(String productId) {
		Product productById = null;
		
		for(Product product : listOfProducts){
			if(product!=null && product.getProductId() != null && product.getProductId().equals(productId)){
				productById = product;
				break;
			}
		}
		
		if(productById == null){
			throw new IllegalArgumentException("No products found with the product id: " + productId);
		}
		
		return productById;
	}
}
