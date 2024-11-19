package com.ecommerce.springBootEcommerce.payload;

public class CartItemDto {
    private Long cartItemId;
    private CartDto cartDto;
    private ProductDto productDto;
    private Integer quantity;
    private Double discount;
    private Double productPrice;
}
