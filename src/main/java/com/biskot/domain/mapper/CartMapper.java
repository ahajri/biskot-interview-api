package com.biskot.domain.mapper;

import com.biskot.app.contract.model.CartResponse;
import com.biskot.domain.model.Cart;
import com.biskot.domain.model.Product;
import com.biskot.infra.gateway.payload.ProductResponse;
import org.mapstruct.Mapper;

@Mapper
public interface CartMapper {

    CartResponse toResponse(Cart cart);
}
