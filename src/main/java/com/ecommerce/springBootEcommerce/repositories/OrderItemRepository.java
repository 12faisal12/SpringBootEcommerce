package com.ecommerce.springBootEcommerce.repositories;

import com.ecommerce.springBootEcommerce.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
