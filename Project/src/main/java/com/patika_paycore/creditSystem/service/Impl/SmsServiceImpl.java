package com.patika_paycore.creditSystem.service.Impl;

import com.patika_paycore.creditSystem.service.ResultService;

import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements ResultService {

    @Override
    public String smsResult(String phoneNumber) {
        return phoneNumber + " Nolu Numara Bilgilendirme Mesajı Gönderildi...";
    }
}
