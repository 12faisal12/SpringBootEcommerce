package com.ecommerce.springBootEcommerce.repositories;

import com.ecommerce.springBootEcommerce.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
