package com.patika_paycore.creditSystem.service;

import com.patika_paycore.creditSystem.model.Customer;

public interface ScoreSevice {
    int calculationScore(String identityNumber);
    void creditResult(Customer customer);
}
