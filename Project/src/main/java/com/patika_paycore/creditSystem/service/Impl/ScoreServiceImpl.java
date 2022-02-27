package com.patika_paycore.creditSystem.service.Impl;

import com.patika_paycore.creditSystem.model.Customer;
import com.patika_paycore.creditSystem.repository.CustomerRepository;
import com.patika_paycore.creditSystem.service.ScoreSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements ScoreSevice {

    CustomerRepository customerRepository;

    @Autowired
    public void ScoreManager(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public int calculationScore(String identityNumber) {
        String firstThree = identityNumber.substring(0, 3);
        String nextThree = identityNumber.substring(3, 6);
        return Integer.parseInt(firstThree) + Integer.parseInt(nextThree);
    }

    @Override
    public void creditResult(Customer customer) {
        if (customer.getScorePoint() < 500) {
            customer.setCreditResult("Red");
        }
        if (customer.getScorePoint() < 1000 && customer.getScorePoint() > 500 && customer.getMonthlyIncome() < 5000) {
            customer.setCreditResult("Onay");
            customer.setCreditQuantity(1000);

        }
        if (customer.getScorePoint() < 1000 && customer.getScorePoint() > 500 && customer.getMonthlyIncome() > 5000) {
            customer.setCreditResult("Onay");
            customer.setCreditQuantity(20000);

        }
        if (customer.getScorePoint() > 1000) {
            customer.setCreditResult("Onay");
            customer.setCreditQuantity(customer.getMonthlyIncome() * 4);
        }
    }

}
