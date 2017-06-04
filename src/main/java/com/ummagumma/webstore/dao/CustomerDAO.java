package com.ummagumma.webstore.dao;

import java.util.List;

import com.ummagumma.webstore.model.Customer;

public interface CustomerDAO {
	List<Customer> getAllCustomers();
	Customer getCustomerById(String customerId);
}
