package com.patika_paycore.creditSystem.service;

import java.util.List;

import com.patika_paycore.creditSystem.model.Customer;
import org.springframework.data.domain.Page;


public interface CustomerService {
	List<Customer> getAllCustomers();
	void saveCustomer(Customer customer);
	Customer getCustomerById(long id);
	void deleteCustomerById(long id);
	Page<Customer> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
	Customer findByIndentityNumber(String identityNumber);
}
