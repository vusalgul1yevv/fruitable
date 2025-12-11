package com.example.fruitables.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "cashbacks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cashback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(precision = 12,scale = 2)
    private BigDecimal amount;

    @Column(precision = 12,scale = 2)
    private BigDecimal percent;

    private LocalDateTime createdDate;

    @ManyToOne
    private User user;
}
