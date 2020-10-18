package com.biskot.infra.repository.entity;

import com.biskot.domain.model.Item;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.List;

@Entity
@Table(name = "cart")
public class CartEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @OneToMany(mappedBy="cart")
    private List<ItemEntity> items;

    private Double totalPrice;
}
