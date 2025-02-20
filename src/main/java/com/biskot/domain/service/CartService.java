package com.biskot.domain.service;

import com.biskot.domain.model.Cart;
import org.springframework.stereotype.Service;


public interface CartService {

    void createCart(Cart cart);

    Cart getCart(long cartId);

    void addItemToCart(long cartId, long productId, int quantityToAdd);
}
