package com.ecommerce.springBootEcommerce.repositories;

import com.ecommerce.springBootEcommerce.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    @Query("SELECT ci FROM CartItem ci where ci.cart.id = ?1 and ci.product.id = ?2")
    CartItem findCartItemByProductIdAndCartId(Long cartId, Long productId);

    @Modifying
    @Query("delete  from CartItem c where c.cart.id = ?1 and c.product.id = ?2")
    void deleteCartItemByProductIdAndCartId(Long cartId, Long productId);
}
