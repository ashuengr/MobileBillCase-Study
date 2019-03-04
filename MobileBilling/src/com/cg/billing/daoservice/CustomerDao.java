package com.cg.billing.daoservice;

import java.util.List;

import com.cg.billing.beans.Customer;

public interface CustomerDao {
	Customer saveCustomer(Customer customer) ;
	boolean updateCustomer(Customer customer);
	Customer findOne(int customerId);
	List<Customer> findAll();

}
