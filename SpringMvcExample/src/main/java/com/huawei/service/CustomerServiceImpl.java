package com.huawei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huawei.dao.CustomerDAO;
import com.huawei.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO dao;

	@Transactional
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		dao.saveCustomer(customer);

	}

	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return dao.getCustomers();
	}

	@Transactional
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return dao.getCustomer(theId);
	}

	@Transactional
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		dao.deleteCustomer(theId);
	}

}
