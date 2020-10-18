package com.biskot.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Product implements Serializable {
    private Long id;
    private String label;
    private Double unitPrice;
    private Integer quantityInStock;
}
