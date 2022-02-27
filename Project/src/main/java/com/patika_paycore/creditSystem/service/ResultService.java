package com.patika_paycore.creditSystem.service;

public interface ResultService {
    String smsResult(String phoneNumber);
    // İlerde Müşteri bilgilendirme şeklinin değişme durumu için base olarak oluşturuldu. (Email gönderilmesi veya birden fazla yönetemin birlikte kullanılması)
}
