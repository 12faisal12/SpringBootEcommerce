package com.ecommerce.springBootEcommerce.repositories;

import com.ecommerce.springBootEcommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
