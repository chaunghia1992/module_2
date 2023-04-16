package com.codegym.product1.services;

import com.codegym.product1.model.Payment;

import java.util.List;

public interface IPaymentService {
    List<Payment> getPayment();
    void add(List <Payment> list);
    void recheck(int id, Payment updatePayment);

}