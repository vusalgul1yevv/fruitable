package com.example.fruitables.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "order-items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(precision = 12,scale = 2)
    private BigDecimal price;

    @Column(precision = 12,scale = 2)
    private BigDecimal discount;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Order order;

    private int quantity;
}
