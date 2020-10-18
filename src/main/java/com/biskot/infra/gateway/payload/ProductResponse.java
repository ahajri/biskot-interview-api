package com.biskot.infra.gateway.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponse {

    @JsonProperty("id")
    private long id;

    @JsonProperty("label")
    private String label;

    @JsonProperty("unit_price")
    private double unitPrice;

    @JsonProperty("quantity_in_stock")
    private int quantityInStock;


}
