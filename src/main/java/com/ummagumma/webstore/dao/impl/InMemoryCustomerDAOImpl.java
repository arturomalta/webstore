package com.ummagumma.webstore.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.ummagumma.webstore.dao.CustomerDAO;
import com.ummagumma.webstore.model.Customer;

//@Repository
public class InMemoryCustomerDAOImpl implements CustomerDAO {
	
	private List<Customer> listOfCustomers = new ArrayList<Customer>();
	
	public InMemoryCustomerDAOImpl() {
		Customer customer1 = new Customer(1000, "Arturo", "Vista a la Campina");
		Customer customer2 = new Customer(1001, "Ivonne", "General San Martin");
		Customer customer3 = new Customer(1002, "Consuelo", "Blas Galindo");
		
		listOfCustomers.add(customer1);
		listOfCustomers.add(customer2);
		listOfCustomers.add(customer3);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}

	@Override
	public Customer getCustomerById(String customerId) {
		Customer customerById = null;
		
		for(Customer customer : listOfCustomers){
			if(customer!=null && customer.getCustomerId() != null && customer.getCustomerId().equals(customerId)){
				customerById = customer;
				break;
			}
		}
		
		if(customerById == null){
			throw new IllegalArgumentException("No products found with the product id: " + customerId);
		}
		
		return customerById;
	}
}
