package com.ummagumma.webstore.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ummagumma.webstore.dao.CustomerDAO;
import com.ummagumma.webstore.model.Customer;

@Repository
public class HibernateCustomerDAOImpl implements CustomerDAO {
	
	private SessionFactory sessionFactory;
	
	public HibernateCustomerDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	
	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		List<Customer> customerList = new ArrayList<Customer>();
		Session session = sessionFactory.getCurrentSession();
		customerList = (List<Customer>)session.createQuery("FROM Customer").list();
		
		return customerList;
	}

	@Override
	public Customer getCustomerById(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
