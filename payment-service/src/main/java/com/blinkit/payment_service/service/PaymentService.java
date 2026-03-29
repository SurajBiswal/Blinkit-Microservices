package com.blinkit.payment_service.service;

import com.blinkit.payment_service.entity.Payment;
import com.blinkit.payment_service.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentRepository repository;

    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public Payment processPayment(Payment payment){

        payment.setStatus("SUCCESS");

        return repository.save(payment);
    }

}
