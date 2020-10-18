package com.biskot.domain.mapper;

import com.biskot.domain.model.Product;
import com.biskot.infra.gateway.payload.ProductResponse;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {

    Product toModel(ProductResponse productResponse);
}
