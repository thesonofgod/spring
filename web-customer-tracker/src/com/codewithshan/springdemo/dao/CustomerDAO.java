package com.codewithshan.springdemo.dao;

import java.util.List;

import com.codewithshan.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);
	
}
