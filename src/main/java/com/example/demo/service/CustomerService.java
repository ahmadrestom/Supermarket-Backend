package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.Model.customer;

public interface CustomerService {
	public String createCustomer(customer customer);
	public String updateCustomer(customer customer);
	public String deleteCustomer(Integer customer_id);
	public customer getCustomer(Integer customer_id);
	public List<customer> getAllCustomers();
	public customer getCustomerByName(String name);
	public Page<customer> getAllCustomers(Pageable pageable);
}
