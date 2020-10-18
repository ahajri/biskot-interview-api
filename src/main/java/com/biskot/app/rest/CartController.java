package com.biskot.app.rest;

import com.biskot.app.contract.api.CartApi;
import com.biskot.app.contract.model.AddItemRequest;
import com.biskot.app.contract.model.CartResponse;
import com.biskot.app.exception.CarNotFoundException;
import com.biskot.app.exception.ProductNotFoundException;
import com.biskot.domain.mapper.CartMapper;
import com.biskot.domain.model.Cart;
import com.biskot.domain.service.CartService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CartController implements CartApi {

    private CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @ExceptionHandler({ProductNotFoundException.class, CarNotFoundException.class})
    public ResponseEntity handleNotFoundException() {
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Void> addItemToCart(Long cartId, @Valid AddItemRequest addItemRequest) {
      //  cartService.addItemToCart();
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> createCart(@RequestBody Cart cart) {
        cartService.createCart(cart);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<CartResponse> getCart(Long cartId) {
        Cart cart =  cartService.getCart(cartId);
        return ResponseEntity.ok(Mappers.getMapper(CartMapper.class).toResponse(cart));
    }
}
