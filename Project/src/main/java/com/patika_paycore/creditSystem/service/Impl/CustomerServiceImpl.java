package com.patika_paycore.creditSystem.service.Impl;

import java.util.List;
import java.util.Optional;

import com.patika_paycore.creditSystem.model.Customer;
import com.patika_paycore.creditSystem.service.CustomerService;
import com.patika_paycore.creditSystem.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.patika_paycore.creditSystem.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

    private ScoreServiceImpl scoreManager;
    private CustomerRepository customerRepository;
    private ResultService resultService;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Autowired
    public void setScoreManager(ScoreServiceImpl scoreManager) {
        this.scoreManager = scoreManager;
    }

    @Autowired
    public void ResultService(ResultService resultService) {
        this.resultService = resultService;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customer.setScorePoint(scoreManager.calculationScore(customer.getIdentityNumber()));
        scoreManager.creditResult(customer);
        this.customerRepository.save(customer);
        resultService.smsResult(customer.getPhoneNumber());
    }


    @Override
    public Customer getCustomerById(long id) {
        Optional<Customer> optional = customerRepository.findById(id);
        Customer customer = null;
        if (optional.isPresent()) {
            customer = optional.get();
        } else {
            throw new RuntimeException(" Customer not found for id :: " + id);
        }
        return customer;
    }

    @Override
    public void deleteCustomerById(long id) {
        this.customerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                Sort.by(sortField).descending();

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.customerRepository.findAll(pageable);
    }

    @Override
    public Customer findByIndentityNumber(String identityNumber) {
        return customerRepository.findByIdentityNumber(identityNumber);
    }

}