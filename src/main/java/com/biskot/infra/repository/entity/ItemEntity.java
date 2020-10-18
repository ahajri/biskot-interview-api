package com.biskot.infra.repository.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "item")
@Getter
@Setter
@EqualsAndHashCode
public class ItemEntity {
    @Id
    @GeneratedValue
    private Long productId;
    @ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private CartEntity cart;
    private String productLabel;
    private Integer quantity;
    private Double unitPrice;
    private Double linePrice;
}
