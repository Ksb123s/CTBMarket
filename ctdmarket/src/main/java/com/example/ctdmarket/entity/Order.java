package com.example.ctdmarket.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;

public class Order extends Basic {

    @SequenceGenerator(name = "Order_seq_gen", sequenceName = "Order_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Order_seq_gen")
    @Id
    private Long orderId;

    @Enumerated
    private OrderState orderState;

}
