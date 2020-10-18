package com.biskot.app.rest;

import com.biskot.app.contract.api.CartApi;
import com.biskot.app.contract.model.AddItemRequest;
import com.biskot.app.contract.model.CartResponse;
import com.biskot.domain.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
@RestController
public class CartController implements CartApi {

    private CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @Override
    public ResponseEntity<Void> addItemToCart(Long cartId, @Valid AddItemRequest addItemRequest) {
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> createCart() {
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<CartResponse> getCart(Long cartId) {
        return ResponseEntity.notFound().build();
    }
    // TODO: to be implemented
}
