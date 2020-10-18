package com.biskot.infra.gateway;

import com.biskot.app.exception.ProductNotFoundException;
import com.biskot.domain.mapper.ProductMapper;
import com.biskot.domain.model.Product;
import com.biskot.domain.spi.ProductPort;
import com.biskot.infra.gateway.payload.ProductResponse;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductGateway implements ProductPort {

    private RestTemplate productRestTemplate;

    final String productRootUri = "http://localhost9001/products";

    @Autowired
    public ProductGateway(RestTemplate productRestTemplate) {
        this.productRestTemplate = productRestTemplate;
    }

    public Product getProduct(long productId) {
        if (productId > 4 || productId < 0) {
            throw new ProductNotFoundException(String.format("Product with Id %d not found", productId));
        }
        ResponseEntity<ProductResponse> responseEntity = productRestTemplate.exchange(productRootUri + "/" + productId,
                HttpMethod.GET, null, ProductResponse.class);
        ProductMapper productMapper = Mappers.getMapper(ProductMapper.class);
        return productMapper.toModel(responseEntity.getBody());
    }

}
